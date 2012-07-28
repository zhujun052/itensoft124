package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itensoft.common.LogFactory;

@SuppressWarnings("serial")
public class LogManager extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LogManager() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String logtype = request.getParameter("logtype");
		String user = request.getParameter("uid");
		String startDate = request.getParameter("start");
		String endDate = request.getParameter("end");
		
		LogFactory factory = new LogFactory(logtype, user, startDate, endDate);
		String r= factory.toString();
		
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
