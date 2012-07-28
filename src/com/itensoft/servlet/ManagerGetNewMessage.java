package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.common.UTF8String;

public class ManagerGetNewMessage extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ManagerGetNewMessage() {
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
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("UserName");
		if (userName!=null){
			userName=UTF8String.toString(userName);
		}
		String sql = "select a.SessionId, a.ClientId, a.Reason,a.Action,b.Name,a.Code,a.Status "
				+ "from ManagerMessage a left join [Group] b on a.ClientId=b.Hardid "
				+ "where a.ManagerName=? and a.Status=0 order by a.Code";

		Session s = ItensoftSession.getSession();

		List<Object[]> list = s.createSQLQuery(sql).setParameter(0, userName).list();

		Document doc = DocumentHelper.createDocument();
		doc.setXMLEncoding("utf-8");
		Element msgs = doc.addElement("ManagerMessage");
		for (Iterator<Object[]> it = list.iterator(); it.hasNext();) {
			Object[] mmsg = it.next();
			Element msg = msgs.addElement("Message");
			Integer code = Integer.parseInt(mmsg[5].toString());
			msg.addElement("Code").setText(code.toString());
			msg.addElement("ClientId").setText( mmsg[1].toString());
			msg.addElement("ClientName").setText(mmsg[4].toString());
			msg.addElement("SessionId").setText(mmsg[0].toString());
			msg.addElement("Type").setText( mmsg[3].toString());
			msg.addElement("Note").setText( mmsg[2].toString());
			msg.addElement("Status").setText(mmsg[6].toString());
		}
		out.print(doc.asXML());
		
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
