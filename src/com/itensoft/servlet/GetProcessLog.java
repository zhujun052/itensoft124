package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.itensoft.ItensoftSession;
import com.itensoft.Log;

public class GetProcessLog extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public GetProcessLog() {
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

		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();

		String clientId = request.getParameter("ClientId");
		if(!(clientId == null))
			clientId = new String(clientId.getBytes("ISO-8859-1"),"UTF-8");
		String sessionId = request.getParameter("SessionId");

		if (("".equals(clientId)) && ("".equals(sessionId))) {
			out.print("Query parameters is required!");
			out.flush();
			out.close();
			return;
		}

		Session s = ItensoftSession.getSession();
		try {
			Criteria criteria = s.createCriteria(Log.class);

			if (!("".equals(clientId)))
				criteria.add(Restrictions.eq("ClientId", clientId));
			if (!("".equals(sessionId)))
				criteria.add(Restrictions.eq("SessionId", sessionId));

			Document doc = DocumentHelper.createDocument();
			doc.setXMLEncoding("utf-8");
			Element logs = doc.addElement("Logs");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			for (Iterator<Log> it = criteria.list().iterator(); it.hasNext();) {
				Log log = it.next();
				Element logNode = logs.addElement("Log");
				logNode.addElement("Code").setText(log.getCode().toString());
				logNode.addElement("ClientId").setText(log.getClientId() == null?"":log.getClientId());
				logNode.addElement("SessionId").setText(log.getSessionId());
				logNode.addElement("DateTime1").setText(
						sdf.format(log.getRQ1()));
				logNode.addElement("Action").setText(log.getAction());
				logNode.addElement("Reason1").setText(
						log.getReason1() == null ? "" : log.getReason1());
				logNode.addElement("VirtualManager").setText(
						log.getVM() == null ? "" : log
								.getVM());
				logNode.addElement("DateTime2").setText(
						log.getRQ2() == null ? "" : sdf.format(log.getRQ2()));
				logNode.addElement("Result1").setText(
						log.getResult1() == null ? "" : log.getResult1());
				logNode.addElement("Reason2").setText(
						log.getReason2() == null ? "" : log.getReason2());
				logNode.addElement("ProcessCode").setText(
						log.getDocerMessage() == null ? "" : log
								.getDocerMessage().getCode().toString());
				logNode.addElement("Docer").setText(
						log.getDC() == null ? "" : log.getDC());
				logNode.addElement("DateTime3").setText(
						log.getRQ3() == null ? "" : sdf.format(log.getRQ3()));
				logNode.addElement("Result2").setText(
						log.getResult2() == null ? "" : log.getResult2());
				logNode.addElement("Reason3").setText(
						log.getReason3() == null ? "" : log.getReason3());

			}
		} catch (Exception ex) {
			ex.printStackTrace();
			out.print(ex.getMessage());
			out.flush();
			out.close();
		}
		ItensoftSession.closeSession();

		out.flush();
		out.close();
	}

	private String getLogData(String userName, String startDate,
			String endDate, String manager, String docer) {
		Session s = ItensoftSession.getSession();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d HH:mm:ss");
		try {
			Date start = null;
			Date end = null;
			if (startDate != "")
				start = sdf.parse(startDate);

			if (endDate != "")
				end = sdf.parse(endDate);

			Criteria criteria = s.createCriteria(Log.class);

			if (!"".equals(userName))
				criteria.add(Restrictions.eq("XM", userName));
			if (!"".equals(manager))
				criteria.add(Restrictions.eq("VM", manager));
			if (!"".equals(docer))            
				criteria.add(Restrictions.eq("DC", docer));
			if (!"".equals(start))
				criteria.add(Restrictions.gt("RQ1", start));
			if (!"".equals(end))
				criteria.add(Restrictions.lt("RQ1", end));

			String r = "";
			String tmp;
			for (Iterator<Log> it = criteria.list().iterator(); it.hasNext();) {
				Log log = it.next();
				tmp = "{username:'" + log.getXM() + "',";
				if (r == "")
					r = tmp;
				else
					r += "," + tmp;

				tmp = "sessionid:'" + (log.getSessionId() == null ?"":log.getSessionId()) + "',";
				r += tmp;
				tmp = "datetime1:'" + (log.getRQ1() == null?"": sdf.format(log.getRQ1())) + "',";
				r += tmp;
				tmp = "action:'" + (log.getAction() == null ?"":log.getAction()) + "',";
				r += tmp;
				tmp = "reason1:'" + (log.getReason1() == null ?"": log.getReason1()) + "',";
				r += tmp;
				tmp = "virtualmanager:'" + (log.getVM() == null ?"":log.getVM() )+ "',";
				r += tmp;
				tmp = "datetime2:'" + (log.getRQ2() == null ?"": sdf.format(log.getRQ2())) + "',";
				r += tmp;
				tmp = "result1:'" + (log.getResult1() == null ?"":log.getResult1()) + "',";
				r += tmp;
				tmp = "reason2:'" + (log.getReason2() == null ? "":log.getReason2()) + "',";
				r += tmp;
				tmp = "docer:'" + (log.getDC() == null ?"": log.getDC() )+ "',";
				r += tmp;
				tmp = "datetime3:'" + (log.getRQ3() == null ?"":sdf.format(log.getRQ3())) + "',";
				r += tmp;
				tmp = "result2:'" + (log.getResult2() == null ?"":log.getResult2()) + "',";
				r += tmp;
				tmp = "reason3:'" + (log.getReason3()== null ?"": log.getReason3()) + "'}";
				r += tmp;
			}

			r = "{root:[" + r + "]}";
			System.out.println(r);
			ItensoftSession.closeSession();
			return r;

		} catch (Exception e) {
			e.printStackTrace();
		}
		ItensoftSession.closeSession();
		return "";

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("username");
		if(!(userName == null))
			userName = new String(userName.getBytes("ISO-8859-1"),"UTF-8");
		
		String manager = request.getParameter("manager");
		if(!(manager == null))
			manager = new String(manager.getBytes("ISO-8859-1"),"UTF-8");
		String docer = request.getParameter("docer");
		
		if(!(docer == null))
			docer = new String(docer.getBytes("ISO-8859-1"),"UTF-8");
		
		String startDate = request.getParameter("startdate");
		String endDate = request.getParameter("enddate");

		String r = getLogData(userName, startDate, endDate, manager, docer);

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
