package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itensoft.Group;
import com.itensoft.ItensoftSession;
import com.itensoft.Log;
import com.itensoft.ManagerMessage;
import com.itensoft.common.UTF8String;
import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.OnlineVirtualManager;
import com.itensoft.common.OnlineVirtualManagers;

public class ClientRequest extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ClientRequest() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		// ClientRequest.jsp?HardId=%s&UserName=%s&SessionId=%s&RequestType=%d&Reason=%s&Manager=%s
		/*
		 * RequestType表示请求的类型， Reason理由 Manager所选择的管理者（VirtualManager）
		 * 服务器在收到此请求后
		 * ，根据VirtualManager，分拆至具体的实体Manager上，然后将所请求的信息存入ManagerMessage中
		 * 。并记录下当时的时间
		 */
		request.setCharacterEncoding("utf-8");
		String clientId = request.getParameter("ClientId");
		if (clientId != null){
			clientId = UTF8String.toString(clientId);
		}			
		// String userName = request.getParameter("UserName");
		String sessionId = request.getParameter("SessionId");
		String requestType = request.getParameter("RequestType");
		String reason = new String(request.getParameter("Reason").getBytes(
				"ISO-8859-1"), "UTF-8");
		String manager = request.getParameter("Manager");
		if (manager != null){
			manager = UTF8String.toString(manager);
		}

		/*
		 * if (request.getSession().getAttribute("clientid") == null) {
		 * out.print("1");// 用户没有登录 out.flush(); out.close(); return; }
		 */
		// if (request.getSession().getAttribute("clientid").equals(clientId))
		// {
		Session s = ItensoftSession.getSession();

		Transaction tx = s.beginTransaction();
		try {

			// 处理Logs
			// Query queryLog = ""
			String logSql = "from Log where ClientId=? and SessionId=?";
			Query logQ = s.createQuery(logSql);
			logQ.setParameter(0, clientId);
			logQ.setParameter(1, sessionId);

			List<Log> logList = logQ.list();
			// Log log ;
			if (logList.isEmpty()) {
				Log log = new Log();
				log.setClientId(clientId);
				log.setSessionId(sessionId);
				//Action:0解密、1打包、2调整权限、3消息（未用）
				if("0".equals(requestType))
					log.setAction("解密");
				else if ("1".equals(requestType))
					log.setAction("打包");
				else if ("2".equals(requestType))
					log.setAction("调整权限");
				else if ("3".equals(requestType))
					log.setAction("消息");
				else
					log.setAction("未定义");
				
				log.setReason1(reason);
				
//				log.setAction(requestType);
				log.setRQ1(new Date());

				Group g = (Group) (s.createQuery("from Group where Id = ?")
						.setParameter(0, clientId).uniqueResult());

				if (!(g == null))
					log.setXM(g.getName());
				s.save(log);
				s.flush();
			}

			// 分解Message
			OnlineVirtualManagers vmgrs = ItensoftEnv.getOnlineManagers().get(manager);
			int iPrePriority=0;
			for (Iterator<OnlineVirtualManager> it = vmgrs.getManagers().values().iterator(); it.hasNext();) {
				OnlineVirtualManager vmgr = it.next();
				if (!(vmgr.getUser() == null) && (vmgr.getPriority()==iPrePriority)) {
					ManagerMessage msg;// = new ManagerMessage();
					String sql = "from ManagerMessage as m where m.MName=? and m.VManager=? and m.SId=? and m.CId=?";// "from ManagerMessage as m where m.MName=:managerName and m.VM=:virtualManager and m.SId=:sessionId and m.CId=:clientId";
					Query query = s.createQuery(sql);// "from ManagerMessage where (ManagerName=?) and (VirtualManager=?) and (SessionId=?) and (ClientId=?)");
					query.setParameter(0, vmgr.getUser());
					query.setParameter(1, vmgrs.getManagerName());
					query.setParameter(2, sessionId);
					query.setParameter(3, clientId);

					List<ManagerMessage> list = query.list();
					if (list.isEmpty())
						msg = new ManagerMessage();
					else
						msg = list.get(0);

					msg.setAccept("F");
					msg.setMName(vmgr.getUser());
					msg.setVManager(vmgrs.getManagerName());
					msg.setReason(reason);
					msg.setAction(requestType);
					msg.setSId(sessionId);
					msg.setCId(clientId);
					msg.setRQ(new Date());
					msg.setStatus(0);

					if (list.isEmpty())
						s.save(msg);
					else
						s.update(msg);

					s.flush();
				}
			}

			tx.commit();
			out.print(0);// 成功
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			out.print(e.getMessage());// 出错

		}
		ItensoftSession.closeSession();

		// }

		out.flush();
		out.close();
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
