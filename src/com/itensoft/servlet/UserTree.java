package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itensoft.common.UserData;

@SuppressWarnings("serial")
public class UserTree extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserTree() {
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
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String parent = request.getParameter("node");
		ServletContext application = request.getSession().getServletContext();
		
		Map<String ,Object> onlineUserList = (Map<String, Object>) application.getAttribute("onlineuserlist");
		if (onlineUserList == null)
		{
			onlineUserList = new HashMap<String, Object>();
			application.setAttribute("onlineuserlist", onlineUserList);
		}
		
		Set<String> onlineUser = onlineUserList.keySet();
		
		UserData userData = new UserData();
		
		String result = userData.getUserTree(parent, onlineUser);
		out.print(result);		
		
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
