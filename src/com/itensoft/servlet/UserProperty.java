package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itensoft.common.UserData;

@SuppressWarnings("serial")
public class UserProperty extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserProperty() {
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

		//取得递交过来的参数列表
		Enumeration<String> paramNames = request.getParameterNames();
		//参数值
		Map<String, String> paramValues = new HashMap<String, String>();
		int i = 0;
		System.out.print("\n");
		while(paramNames.hasMoreElements())
		{
			String name = paramNames.nextElement();
			String value = request.getParameter(name);
			if(!(value == null))
				value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
			paramValues.put(name, value);
			System.out.println(String.valueOf(i++) + "\t" + name + "\t" + value);
		}
		
		String r = (new UserData()).setUserProperty(paramValues);
		
		System.out.print(r);
		
		out.print(r);
		
		out.flush();
		out.close();
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
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
		String uid = request.getParameter("userid");
		
		Integer groupCode = Integer.parseInt(uid);
		
		String result = (new UserData()).getUserProperty(groupCode);
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
