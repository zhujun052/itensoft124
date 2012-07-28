package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.json.JSONArray;
import org.json.JSONObject;

import com.itensoft.Group;
import com.itensoft.GroupIdentity;
import com.itensoft.GroupIdentityId;
import com.itensoft.GroupRecver;
import com.itensoft.GroupRecverId;
import com.itensoft.ItensoftSession;
import com.itensoft.common.JSONHelper;

public class CertService extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public CertService() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String method = request.getParameter("Method");
		String result = "";
		try {
			if ("getAvailableRecverList".equals(method))
				result = getAvailableRecverList(request);

			if ("getSelectedRecverList".equals(method))
				result = getSelectedRecverList(request);

			if ("getAvailableIdentityList".equals(method))
				result = getAvailableIdentityList(request);

			if ("getSelectedIdentityList".equals(method))
				result = getSelectedIdentityList(request);

		} catch (Exception ex) {
			ex.printStackTrace();
			result = ex.getMessage();
			response.sendError(HttpServletResponse.SC_EXPECTATION_FAILED);
		}
		out.print(result);
		out.flush();
		out.close();
	}

	private String getSelectedIdentityList(HttpServletRequest request) {
		String groupCode = request.getParameter("groupcode");

		System.out.println(groupCode);
		Session s = ItensoftSession.getSession();
		try {
			Query query = s.createQuery("from GroupIdentity where groupCode=?");
			query.setParameter(0, Integer.parseInt(groupCode));

			List<GroupIdentity> groupIdentityList = query.list();
			if (groupIdentityList.isEmpty())
				return "";
			List<String> ids = new ArrayList<String>();

			for (GroupIdentity identity : groupIdentityList) {
				ids.add(identity.getId().getCertId());
			}
			query = s
					.createQuery("select id, name from Cert where id in (:ids)");
			query.setParameterList("ids", ids);

			return JSONHelper.toJSONString(query.list());

		} finally {
			if (s != null)
				s.close();
		}
	}

	private String getAvailableIdentityList(HttpServletRequest request) {
		String groupCode = request.getParameter("groupcode");

		System.out.println(groupCode);
		Session s = ItensoftSession.getSession();
		try {
			Query query = s.createQuery("from GroupIdentity where groupCode=?");
			query.setParameter(0, Integer.parseInt(groupCode));

			List<GroupIdentity> identityList = query.list();
			if (identityList.isEmpty()) {
				query = s.createQuery("select id, name from Cert");
			} else {
				List<String> ids = new ArrayList<String>();
				for (GroupIdentity identity : identityList)
					ids.add(identity.getId().getCertId());

				query = s
						.createQuery("select id, name from Cert where not (id in (:ids))");
				query.setParameterList("ids", ids);
			}

			return JSONHelper.toJSONString(query.list());

		} finally {
			if (s != null)
				s.close();
		}
	}

	private String getSelectedRecverList(HttpServletRequest request) {
		String groupCode = request.getParameter("groupcode");

		System.out.println(groupCode);
		Session s = ItensoftSession.getSession();
		try {
			Query query = s.createQuery("from GroupRecver where groupCode=?");
			query.setParameter(0, Integer.parseInt(groupCode));
			List<GroupRecver> groupRecverList = query.list();

			if (groupRecverList.isEmpty())
				return "";
			List<String> certs = new ArrayList<String>();
			for (GroupRecver recver : groupRecverList) {
				certs.add(recver.getId().getCertId());
			}

			query = s
					.createQuery("select id, name from Cert where id in (:ids)");
			query.setParameterList("ids", certs);

			return JSONHelper.toJSONString(query.list());

		} finally {
			if (s != null)
				s.close();
		}
	}

	private String getAvailableRecverList(HttpServletRequest request) {
		String groupCode = request.getParameter("groupcode");

		System.out.println(groupCode);
		Session s = ItensoftSession.getSession();
		try {
			Query query = s.createQuery("from GroupRecver where groupCode=?");
			query.setParameter(0, Integer.parseInt(groupCode));
			List<GroupRecver> recvers = query.list();

			List<String> ids = new ArrayList<String>();
			for (GroupRecver recver : recvers) {
				ids.add(recver.getId().getCertId());
			}

			Query certQuery = null;
			if (ids.isEmpty()) {
				certQuery = s.createQuery("select id,name from Cert");
			} else {

				certQuery = s
						.createQuery("select id, name from Cert where not (id in (:ids ))");
				certQuery.setParameterList("ids", ids);
			}
			return JSONHelper.toJSONString(certQuery.list());

		} finally {
			if (s != null)
				s.close();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String method = request.getParameter("Method");
		String result = "";
		try {
			if ("PostRecver".equals(method))
				result = PostRecver(request);

			if ("PostIdentity".equals(method))
				result = PostIdentity(request);
		} catch (Exception ex) {
			ex.printStackTrace();
			result = ex.getMessage();
		}

		System.out.println(result);
		out.print(result);
		out.flush();
		out.close();
	}
	
	private void PostIdentity(final Integer groupCode, List<String> selectedId, Session s) throws Exception{
		Query query = s
				.createQuery("from GroupIdentity where GroupCode=?");
		query.setParameter(0, groupCode);
		List<GroupIdentity> groupIdentityList = query.list();
		List<String> currentIds = new ArrayList<String>();
		for (GroupIdentity gi : groupIdentityList) {
			if (!selectedId.contains(gi.getId().getCertId()))
				s.delete(gi);
			else
				currentIds.add(gi.getId().getCertId());
		}

		for (String id : selectedId) {
			if (!currentIds.contains(id)) {
				GroupIdentityId gid = new GroupIdentityId(
						groupCode, id);
				GroupIdentity gi = new GroupIdentity(gid);
				s.save(gi);
			}
		}
		
		s.flush();
		s.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				String sql = "{call dbo.sp_GenGroupFinalIdentity(?)}";
				PreparedStatement ps = arg0.prepareStatement(sql);
				ps.setInt(1, groupCode);	
				ps.execute();
			}
		});
		
		query = s.createQuery("from Group where parentCode=?").setParameter(0, groupCode);
		List<Group> groupList = query.list();
		for(Group group:groupList){
			PostIdentity(group.getCode(),selectedId, s);
		}		
		
	}
	
	private void DeleteIdentity(final Integer groupCode, Session  s) throws Exception{
		Query query = s.createQuery(
				"delete from GroupIdentity where GroupCode=?")
				.setParameter(0, groupCode);
		query.executeUpdate();	
		s.flush();
		s.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				String sql = "{call dbo.sp_GenGroupFinalIdentity(?)}";
				PreparedStatement ps = arg0.prepareStatement(sql);
				ps.setInt(1, groupCode);	
				ps.execute();
			}
		});
		
		query = s.createQuery("from Group where parentCode=?").setParameter(0, groupCode);
		List<Group> groupList = query.list();
		for(Group group:groupList){
			DeleteIdentity(group.getCode(), s);
		}			
	}
	
	private String PostIdentity(HttpServletRequest request) throws Exception {
		Session s = ItensoftSession.getSession();
		try {
			Transaction tx = s.beginTransaction();
			try {
				Integer groupCode = Integer.parseInt(request
						.getParameter("groupcode"));

				String selectedIdentityString = request
						.getParameter("selectedlist");
				System.out.println(selectedIdentityString);

				if ("".equals(selectedIdentityString.trim())) {
					DeleteIdentity(groupCode, s);
				} else {
					JSONArray jsArray = new JSONArray(selectedIdentityString);

					// 先取原有的identity,与递交过来的selectedIdentity做比较，如果不存在于selected中，那么删除，
					// 如果selected不在原有之中，那么新增
					List<String> selectedIds = new ArrayList<String>();

					for (int i = 0; i < jsArray.length(); i++) {
						JSONObject jo = jsArray.getJSONObject(i);
						selectedIds.add(jo.getString("code"));
					}
					
					PostIdentity(groupCode, selectedIds, s);

				}
				s.flush();				
				tx.commit();
				return "{success:true,msg:'ok'}";
			} catch (Exception ex) {
				tx.rollback();
				throw new Exception("{success:false,msg:'" + ex.getMessage()
						+ "'}");
			}

		} finally {
			if (s != null)
				s.close();
		}
	}
	
	private void PostRecver(final Integer groupCode, List<String> selectedId, Session s) throws Exception{
		Query query = s
				.createQuery("from GroupRecver where GroupCode=?");
		query.setParameter(0, groupCode);
		List<GroupRecver> groupRecverList = query.list();
		List<String> currentIds = new ArrayList<String>();
		for (GroupRecver gr : groupRecverList) {
			if (!selectedId.contains(gr.getId().getCertId()))
				s.delete(gr);
			else
				currentIds.add(gr.getId().getCertId());
		}

		for (String id : selectedId) {
			if (!currentIds.contains(id)) {
				GroupRecverId grid = new GroupRecverId(groupCode,
						id);
				GroupRecver gr = new GroupRecver(grid);
				s.save(gr);
			}
		}
		s.flush();
		
		s.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				String sql = "{call dbo.sp_GenGroupFinalRecver(?)}";
				PreparedStatement ps = arg0.prepareStatement(sql);
				ps.setInt(1, groupCode);	
				ps.execute();
			}
		});
				
		query = s.createQuery("from Group where parentCode=?").setParameter(0, groupCode);
		List<Group> groupList = query.list();
		for(Group group:groupList){
			PostRecver(group.getCode(), selectedId, s);
		}
		
	}
	
	private void DeleteRecver(final Integer groupCode, Session s) throws Exception{
		Query query = s.createQuery("delete from GroupRecver where GroupCode=?");
		query.setParameter(0, groupCode);
		query.executeUpdate();
		s.flush();
		s.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				String sql = "{call dbo.sp_GenGroupFinalRecver(?)}";
				PreparedStatement ps = arg0.prepareStatement(sql);
				ps.setInt(1, groupCode);	
				ps.execute();
			}
		});
				
		query = s.createQuery("from Group where parentCode=?").setParameter(0, groupCode);
		List<Group> groupList = query.list();
		for(Group group:groupList){
			DeleteRecver(group.getCode(), s);
		}
		
	}

	private String PostRecver(HttpServletRequest request) throws Exception {
		Session s = ItensoftSession.getSession();
		try {
			Transaction tx = s.beginTransaction();
			try {
				Integer groupCode = Integer.parseInt(request
						.getParameter("groupcode"));

				String selectedRecverString = request
						.getParameter("selectedlist");
				System.out.println(selectedRecverString);

				if ("".equals(selectedRecverString)) {
					DeleteRecver(groupCode, s);
				} else {

					JSONArray jsArray = new JSONArray(selectedRecverString);

					// 先取原有的recver,与递交过来的selectedRecver做比较，如果不存在于selected中，那么删除，
					// 如果selected不在原有之中，那么新增
					List<String> selectedIds = new ArrayList<String>();

					for (int i = 0; i < jsArray.length(); i++) {
						JSONObject jo = jsArray.getJSONObject(i);
						selectedIds.add(jo.getString("code"));
					}
					
					PostRecver(groupCode, selectedIds, s);

				}
				tx.commit();
				return "{success:true,msg:'ok'}";
			} catch (Exception ex) {
				tx.rollback();
				throw new Exception("{success:false,msg:'" + ex.getMessage()
						+ "'}");
			}
		} finally {
			if (s != null)
				s.close();
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
