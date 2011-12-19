package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itensoft.ItensoftSession;
import com.itensoft.User;
import com.itensoft.common.UTF8String;

public class UserChangePassword extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public UserChangePassword()
	{
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy()
	{
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
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("UserName");
		if(!"".equals(userName))
			userName = UTF8String.toString(userName);
		
		String oldPassword = request.getParameter("OldPassword");
		String newPassword = request.getParameter("NewPassword");

		String r;
		try
		{
			r = doChangePassword(userName, oldPassword, newPassword);
		} catch (NoSuchAlgorithmException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			r = e.getMessage();
		}

		out.print(r);
		out.flush();
		out.close();
	}

	private String doChangePassword(String userName, String oldPassword,
			String newPassword) throws NoSuchAlgorithmException
	{
		Session s = ItensoftSession.getSession();
		User u = (User) s.get(User.class, userName);
		if (u == null)
		{
			return "4";
		}

		if (!(oldPassword.equals(u.getPassword())))
		{
			return "3";
		}

		u.setPassword(newPassword);

		Transaction tx = s.beginTransaction();
		try
		{
			s.update(u);
			s.flush();
			tx.commit();
			
			return "OK";
		} catch (Exception ex)
		{
			tx.rollback();
			ex.printStackTrace();
			
			return ex.getMessage();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException
	{
		// Put your code here
	}

}
