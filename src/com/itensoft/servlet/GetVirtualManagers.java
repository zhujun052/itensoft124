package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.VirtualManager;

public class GetVirtualManagers extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public GetVirtualManagers() {
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
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
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
		Session s = ItensoftSession.getSession();
		List<VirtualManager> list = s.createCriteria(VirtualManager.class)
				.list();

		String json = "";

		for (VirtualManager mgr : list) {
			
			String strmgr = "{name:'" + mgr.getName() + "',user1:'"
					+ (mgr.getUser1() == null ? "" : mgr.getUser1())
					+ "',priority1:'" + (mgr.getPriority1() == null ? "" : mgr.getPriority1().toString())
					+ "',user2:'"
					+ (mgr.getUser2() == null ? "" : mgr.getUser2())
					+ "',priority2:'" + (mgr.getPriority2() == null ? "" : mgr.getPriority2().toString())
					+ "',user3:'"
					+ (mgr.getUser3() == null ? "" : mgr.getUser3())
					+ "',priority3:'" + (mgr.getPriority3() == null ? "" : mgr.getPriority3().toString())					
					+ "',user4:'"
					+ (mgr.getUser4() == null ? "" : mgr.getUser4())
					+ "',priority4:'" + (mgr.getPriority4() == null ? "" : mgr.getPriority4().toString())
					+ "',user5:'"
					+ (mgr.getUser5() == null ? "" : mgr.getUser5())
					+ "',priority5:'" + (mgr.getPriority5() == null ? "" : mgr.getPriority5().toString())
					+ "',user6:'"
					+ (mgr.getUser6() == null ? "" : mgr.getUser6())
					+ "',priority6:'" + (mgr.getPriority6() == null ? "" : mgr.getPriority6().toString())
					+ "',user7:'"
					+ (mgr.getUser7() == null ? "" : mgr.getUser7())
					+ "',priority7:'" + (mgr.getPriority7() == null ? "" : mgr.getPriority7().toString())
					+ "',user8:'"
					+ (mgr.getUser8() == null ? "" : mgr.getUser8())
					+ "',priority8:'" + (mgr.getPriority8() == null ? "" : mgr.getPriority8().toString())					
					+ "'}";
			if (json == "")
				json = strmgr;
			else
				json += "," + strmgr;
		}

		json = "{root:[" + json + "]}";
		out.print(json);
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
