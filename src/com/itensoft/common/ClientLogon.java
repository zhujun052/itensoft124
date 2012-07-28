package com.itensoft.common;

import java.io.UnsupportedEncodingException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;

import com.itensoft.Group;
import com.itensoft.ItensoftSession;
import com.itensoft.Policy;

public class ClientLogon {
	private HttpServletRequest request;

	private Session s;
	private String hardid;
	private String hostName;
	private String userName;
	private String friendName;
	@SuppressWarnings("unused")
	private String version;
	private String refreshId;

	public ClientLogon(HttpServletRequest request) {
		this.request = request;

	}

	private Policy createPolicy() {
		Integer Code = (Integer) s
				.createSQLQuery("select max(Code) maxCode from Policy")
				.addScalar("maxCode", Hibernate.INTEGER).uniqueResult();
		Policy policy = new Policy(Code + 1);
		policy.setUdiskMode((short) 0);
		policy.setOnLineMode("1");
		policy.setLogUdiskOp("F");
		policy.setLogNetOp("F");
		policy.setLogPrint("F");
		policy.setUseBlackList("F");
		policy.setClipboardControled("F");
		policy.setOlecontroled("F");
		policy.setDragdropControled("F");
		policy.setSnapShotControled("F");
		policy.setPrintControled("F");
		policy.setOverlayIcon("F");
		policy.setPrintControledEx("F");
		policy.setNeedKey("F");
		policy.setBackupExcludeSpec("*\\~$*.doc;*\\~$*.vsd;*\\~$*.docx;*\\~$*.xlsx;*\\~$*.pptx");

		return policy;
	}

	private Group createGroup() {
		Integer Code = (Integer) s
				.createSQLQuery("select max(Code) maxCode from [Group]")
				.addScalar("maxCode", Hibernate.INTEGER).uniqueResult();

		final Group group = new Group(Code + 1);
		group.setParentCode(0);
		group.setLevel(1);
		switch (ItensoftEnv.getAuthType()) {
		case 0: // 硬件认证
			group.setHardId(hardid);
			group.setId(hardid);
			group.setHostName(hostName);
			group.setName(hostName);
			break;
		case 1:// 用户名认证
			group.setId(userName);
			group.setHardId(userName);
			if (!friendName.equals(""))
				group.setName(friendName);
			 else
				group.setName(userName); 
			break;
		case 2: // 混合认证
			if (userName.contains("\\")) {
				group.setId(userName);
				group.setHardId(userName);
				if (!friendName.equals(""))
					group.setName(friendName);
				 else
					group.setName(userName); 
			} else {
				group.setHardId(hardid);
				group.setId(hardid);
				group.setHostName(hostName);
				group.setName(hostName);
			}
			break;
		}

		group.setUserName(userName);
		group.setInheritSet("T");
		group.setInheritPlainProgram("T");
		group.setInheritBlackProgram("T");
		group.setInheritRcv("T");
		group.setInheritIdentity("T");
		group.setInheritVirtualManager("T");
		group.setActived("T");
		group.setAudited("F");
		group.setRefreshId(1);

		Policy policy = createPolicy();
		group.setPolicy(policy);

		Transaction tx = s.beginTransaction();
		try {
			s.save(policy);
			s.save(group);
			s.flush();
			s.doWork(new Work() {

				public void execute(Connection arg0) throws SQLException {
					String sql = "{call dbo.sp_GenGroupFinalBlackProgram(?)}";
					CallableStatement p = arg0.prepareCall(sql);
					p.setInt(1, group.getCode());
					p.execute();

					sql = "{call dbo.sp_GenGroupFinalControlProgram(?)}";
					p = arg0.prepareCall(sql);
					p.setInt(1, group.getCode());
					p.execute();

					sql = "{call dbo.sp_GenGroupFinalIdentity(?)}";
					p = arg0.prepareCall(sql);
					p.setInt(1, group.getCode());
					p.execute();

					sql = "{call dbo.sp_GenGroupFinalVirtualManager(?)}";
					p = arg0.prepareCall(sql);
					p.setInt(1, group.getCode());
					p.execute();
					
					sql = "{call dbo.sp_GenGroupFinalRecver(?)}"; 
					p = arg0.prepareCall(sql); 
					p.setInt(1,group.getCode());
					p.execute();
				}
			});

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return null;
		}

		return group;
	}

	@SuppressWarnings("unchecked")
	public String getLoginResult() throws UnsupportedEncodingException {
		hardid = request.getParameter("Hardid");
		hostName = request.getParameter("HostName");
		if( (!(hostName == null)) || (!"".equals(hostName)))
			hostName = UTF8String.toString(hostName); 
		userName = request.getParameter("UserName");
		if(!(userName == null))
			userName = UTF8String.toString(userName);
		
		friendName = request.getParameter("friendName");
		if (!(friendName == null))
			friendName = UTF8String.toString(friendName);
		version = request.getParameter("Version");
		refreshId = request.getParameter("RefreshId");

		HttpSession session = request.getSession();
		ServletContext application = session.getServletContext();
		Map<String, Object> onlineUserList = (Map<String, Object>) application.getAttribute("onlineuserlist");
		if (onlineUserList == null) {
			onlineUserList = new HashMap<String, Object>();
			application.setAttribute("onlineuserlist", onlineUserList);
		}

		s = ItensoftSession.getSession();
		List<Group> list;
		switch (ItensoftEnv.getAuthType()) {
		case 0:
			list = s.createQuery("from Group where Id=?")
					.setParameter(0, hardid).list();
			break;
		case 1:
			list = s.createQuery("from Group where Id=?")
					.setParameter(0, userName).list();
			break;
		default:
			if (userName.contains("\\")) {
				list = s.createQuery("from Group where Id=?")
						.setParameter(0, userName).list();
			} else
				list = s.createQuery("from Group where Id=?")
						.setParameter(0, hardid).list();
			break;
		}

		Group g;
		if (list.isEmpty())
			g = createGroup();
		else {
			g = list.get(0);
			if (session.getAttribute("clientid") == null)
				session.setAttribute("clientid", g.getId());
		}

		if (g == null) {
			ItensoftSession.closeSession();
			return "ERROR";
		}

		if (("F".equals(g.getAudited())) || (g.getAudited() == null))
		{
			ItensoftSession.closeSession();
			return "UnAudit";
		}
		
		if (!onlineUserList.containsKey(g.getId()))
			onlineUserList.put(g.getId(), g);

		session.setAttribute("refreshId", g.getRefreshId());
		
		if (g.getRefreshId() == Integer.parseInt(refreshId)) {
			 ItensoftSession.closeSession();
			return "OK";
		} else {
			UserPolicy userPolicy = new UserPolicy(g,s);

			String r = userPolicy.toString();
			 ItensoftSession.closeSession();
			return r;
		}

		// ItensoftSession.closeSession();

		// return r;
	}

}
