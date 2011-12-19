package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itensoft.ItensoftSession;
import com.itensoft.User;

public class GetManagerUserData extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public GetManagerUserData()
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

	public String getUser(String userid)
	{
		String json = "";

		User user = (User) (ItensoftSession.getSession()
				.get(User.class, userid));
		if (user == null)
			return "{success:false}";

		json = "{\"name\":'"
				+ user.getName()
				+ "',\"password\":'"
				+ (user.getPassword() == null ? "" : user.getPassword().trim())
				+ "',"
				+ "\"note\":'"
				+ (user.getNote() == null ? "" : user.getNote().replace("\r\n",
						"<br/>")) + "'}";

		json = "{success:true,data:" + json + "}";
		// System.out.println(json);
		return json;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String userid = request.getParameter("userid");
		if ((userid == null) | (userid == ""))
			out.print("");
		else
			out.print(getUser(userid));
		out.flush();
		out.close();
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		Enumeration<String> paramNames = request.getParameterNames();
		Session s = ItensoftSession.getSession();
		byte[] md5pass;
		try
		{
			md5pass = MessageDigest.getInstance("MD5").digest(
					request.getParameter("password").trim().getBytes());
		} catch (NoSuchAlgorithmException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.print("{success:true,errors:{info:'" + e.getMessage()
					+ "'}}");	
			out.flush();
			out.close();				
			return;
		}

		String pass = "";
		for (int i = 0; i < md5pass.length; i++)
		{
			String tmp = Integer.toHexString(md5pass[i] & 0xff);
			if(tmp.length() == 1)
				tmp = "0" + tmp;
			
			if("".equals(pass))
				pass = tmp;
			else
				pass += tmp;
		}


		User user = (User) s.get(User.class, request.getParameter("name")
				.trim());
		if (user == null)
		{
			user = new User();
			user.setName(request.getParameter("name").trim());

			user.setPassword(pass);
			user.setNote(request.getParameter("note").trim());
			Transaction tx = s.beginTransaction();
			try
			{
				s.save(user);
				s.flush();
				tx.commit();
				out.print("{success:true,errors:{}}");
			} catch (Exception ex)
			{
				tx.rollback();
				ex.printStackTrace();
				out.print("{success:true,errors:{info:'" + ex.getMessage()
						+ "'}}");
			}

		} else
		{
			user.setName(request.getParameter("name").trim());
			user.setPassword(pass);
			user.setNote(request.getParameter("note").trim());
			Transaction tx = s.beginTransaction();
			try
			{
				s.update(user);
				s.flush();
				tx.commit();
				out.print("{success:true,errors:{}}");
			} catch (Exception ex)
			{
				tx.rollback();
				ex.printStackTrace();
				out.print("{success:true,errors:{info:'" + ex.getMessage()
						+ "'}}");
			}

		}

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
