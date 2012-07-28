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

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.itensoft.ClientMessage;
import com.itensoft.DocerMessage;
import com.itensoft.ItensoftSession;
import com.itensoft.Log;
import com.itensoft.ManagerMessage;
import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.OnlineVirtualManager;
import com.itensoft.common.OnlineVirtualManagers;

public class ManagerResponseRequestion extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ManagerResponseRequestion() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	private int getActionId(String actionName) {
		try {
			return Integer.parseInt(actionName);

		} catch (Exception ex) {
			ex.printStackTrace();
			return -1;
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String clientId = request.getParameter("ClientId");
		String sessionId = request.getParameter("SessionId");
		String result = request.getParameter("Result");
		String docer = request.getParameter("Docer");
		if ((!(docer == null)) && (!"".equals(docer))) {
			docer = new String(docer.getBytes("ISO-8859-1"), "UTF-8");
		}
//		String type = request.getParameter("Type");
		String note = request.getParameter("Note");
		if ((!(note == null)) && (!"".equals(note))) {
			note = new String(note.getBytes("ISO-8859-1"), "UTF-8");
		}
		String userName = request.getParameter("ManagerName");
		if (!"".equals(userName))
			userName = new String(userName.getBytes("ISO-8859-1"), "UTF-8");

		Session s = ItensoftSession.getSession();
		String r = "";
		Transaction tx = s.beginTransaction();
		try {
			String hsql = "from ManagerMessage where CId=? and SId=? and MName=?";
			Query query = s.createQuery(hsql);
			query.setParameter(0, clientId);
			query.setParameter(1, sessionId);
			query.setParameter(2, userName);

			// 拒绝
			List<ManagerMessage> list = query.list();
			if (list.isEmpty()) {
				return;
			}
			ManagerMessage msg = (ManagerMessage) list.get(0);
			if ("0".equals(result)) {
				msg.setAccept("F");

				ClientMessage cmsg = new ClientMessage();
				cmsg.setCId(clientId);
				cmsg.setSessionId(sessionId);
				cmsg.setFrom(msg.getMName());
				cmsg.setFromRole(0);
				cmsg.setAction(getActionId(msg.getAction()));

				// cmsg.setAction(msg.getAction());
				cmsg.setResult(0);
				cmsg.setRD("F");
				cmsg.setRQ(new Date());
				cmsg.setNote("你的请求被拒绝了！");

				s.update(msg);
				s.save(cmsg);
				s.flush();

				Query logQ = s
						.createQuery(
								"from Log where ClientId=? and SessionId=?")
						.setParameter(0, clientId).setParameter(1, sessionId);
				List<Log> logList = logQ.list();
				Log log;
				if (logList.isEmpty()) {
					log = new Log();
					log.setClientId(clientId);
					log.setSessionId(sessionId);
					log.setVM(userName);
					log.setResult1("请求拒绝");
					log.setRQ2(new Date());
					log.setReason2(note);
					s.save(log);
				} else {
					log = logList.get(0);

					log.setClientId(clientId);
					log.setSessionId(sessionId);
					log.setReason2(note);
					log.setVM(userName);
					log.setResult1("请求拒绝");
					log.setRQ2(new Date());
					s.update(log);
				}
				s.flush();
				tx.commit();
				r = "OK";
				return;
			}

			// 同意
			if ("1".equals(result)) {

				msg.setAccept("T");
				s.update(msg);
				s.flush();

				// 向下一个审批者发送消息

				// 首先查询得到virtualManager,reason,requestType
				String virtualManager = msg.getVManager();
				String reason = msg.getReason();
				String requestType = msg.getAction();

				// 得到此审批员的级别号
				int iPrePriority = 1;
				OnlineVirtualManagers vmgrs = ItensoftEnv.getOnlineManagers()
						.get(virtualManager);
				for (Iterator<OnlineVirtualManager> it = vmgrs.getManagers()
						.values().iterator(); it.hasNext();) {
					OnlineVirtualManager vmgr = it.next();
					if (vmgr.getUser().equals(userName)) {
						iPrePriority = vmgr.getPriority();
					}
				}
				
				boolean bNextManager=false;
				// 向下一个审批员提交信息
				for (Iterator<OnlineVirtualManager> it = vmgrs.getManagers().values().iterator(); it.hasNext();) {
					OnlineVirtualManager vmgr = it.next();
					if (!(vmgr.getUser() == null) && (vmgr.getPriority() == iPrePriority + 1)) {
						ManagerMessage managerMsg;
						String sql = "from ManagerMessage as m where m.MName=? and m.VManager=? and m.SId=? and m.CId=?";// "from ManagerMessage as m where m.MName=:managerName and m.VM=:virtualManager and m.SId=:sessionId and m.CId=:clientId";
						Query qry = s.createQuery(sql);// "from ManagerMessage where (ManagerName=?) and (VirtualManager=?) and (SessionId=?) and (ClientId=?)");
						qry.setParameter(0, vmgr.getUser());
						qry.setParameter(1, vmgrs.getManagerName());
						qry.setParameter(2, sessionId);
						qry.setParameter(3, clientId);

						List<ManagerMessage> lst = qry.list();
						if (lst.isEmpty())
							managerMsg = new ManagerMessage();
						else
							managerMsg = lst.get(0);

						managerMsg.setAccept("F");
						managerMsg.setMName(vmgr.getUser());
						managerMsg.setVManager(vmgrs.getManagerName());
						managerMsg.setReason(reason);
						managerMsg.setAction(requestType);
						managerMsg.setSId(sessionId);
						managerMsg.setCId(clientId);
						managerMsg.setRQ(new Date());
						managerMsg.setStatus(0);

						if (lst.isEmpty())
							s.save(managerMsg);
						else
							s.update(managerMsg);

						s.flush();
						bNextManager=true;
					}
				}

				//如果消息传递到下一个审批者，则肯定不会存在所有人都同意的情况，此时可以退出
				if (bNextManager){
					tx.commit();
					r = "OK";					
					return;
				}
				
				// 检查同组中还有未同意的记录
				Criteria criteria = s.createCriteria(ManagerMessage.class);
				criteria.add(Restrictions.eq("CId", clientId));
				criteria.add(Restrictions.eq("SId", sessionId));
				List<ManagerMessage> msglist = criteria.list();

				boolean accept = true;
				for (Iterator<ManagerMessage> it = msglist.iterator(); it
						.hasNext();) {
					ManagerMessage message = it.next();
					accept = accept && ("T".equals(message.getAccept()));
					if (!accept)
						break;
				}

				// 全票通过
				if (accept) {
					DocerMessage docerMsg=null;
					if ((docer != null) && (!docer.equals(""))) {
						docerMsg = new DocerMessage();
						docerMsg.setDocer(docer);
						docerMsg.setClientId(clientId);
						docerMsg.setSessionId(sessionId);
						docerMsg.setDateTime(new Date());
						docerMsg.setAction(Integer.parseInt(requestType));
						docerMsg.setNote(note);
						docerMsg.setReaded("0");
						docerMsg.setResult(0);
						docerMsg.setVirtualManager(ItensoftEnv
								.getVirtualManagerName(userName));
						s.save(docerMsg);
					}
					ClientMessage cmsg = new ClientMessage();
					cmsg.setCId(clientId);
					cmsg.setSessionId(sessionId);
					cmsg.setFrom(msg.getMName());
					cmsg.setFromRole(0);
					cmsg.setAction(getActionId(msg.getAction()));
					if ((docer != null) && (!docer.equals(""))) {
						cmsg.setNext(docer);
					}
					cmsg.setResult(1);
					cmsg.setRD("F");
					cmsg.setRQ(new Date());
					cmsg.setNote("你的请求通过了！");
					s.save(cmsg);

					Query logQ = s
							.createQuery(
									"from Log where ClientId=? and SessionId=?")
							.setParameter(0, clientId)
							.setParameter(1, sessionId);
					List<Log> logList = logQ.list();
					Log log;
					if (logList.isEmpty()) {
						log = new Log();
						log.setClientId(clientId);
						log.setSessionId(sessionId);
						if ((docer != null) && (!docer.equals(""))) {
							log.setDC(docer);
						}
						log.setVM(virtualManager);
						log.setResult1("同意");
						log.setReason2(note);
						log.setRQ2(new Date());
						if ((docer != null) && (!docer.equals(""))) {
							log.setDocerMessage(docerMsg);
						}
						s.save(log);
					} else {
						log = logList.get(0);

						log.setClientId(clientId);
						log.setSessionId(sessionId);
						if ((docer != null) && (!docer.equals(""))) {
							log.setDC(docer);
						}
						log.setVM(virtualManager);
						log.setResult1("同意");
						log.setRQ2(new Date());
						if ((docer != null) && (!docer.equals(""))) {
							log.setDocerMessage(docerMsg);
						}
						log.setReason2(note);
						s.update(log);
					}

					s.flush();
				}

				r = "OK";
			}
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			r = e.getMessage();
		}// end try

		out.print(r);
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
