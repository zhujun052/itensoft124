package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itensoft.ItensoftSession;
import com.itensoft.User;

public class UserService extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserService() {
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

	private String deleteUser(String user) {
		Session s = ItensoftSession.getSession();
		Transaction tx = s.beginTransaction();
		try {
			User u = (User) s.get(User.class, user);
			if (u == null)
				return "{success:false, error:'" + user + " not exist!'}";

			s.delete(u);
			s.flush();
			tx.commit();
			return "{success:true}";

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return e.getMessage();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String method = request.getParameter("Method");
		String userName = request.getParameter("user");

		String result = "";
		if ("DeleteUser".equals(method))
			result = deleteUser(userName);

		out.print(result);

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
