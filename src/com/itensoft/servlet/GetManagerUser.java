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
import com.itensoft.User;

public class GetManagerUser extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public GetManagerUser()
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

	private String strToPass(String pass)
	{
		if(pass == null)
			return "";
		if(pass == "")
			return "";
		
		String r = "";
		for(int i = 0; i < pass.length(); i ++)
			r += "*";
		return r;
	}

	private String getUsers()
	{
		String json = "";
		Session s = ItensoftSession.getSession();
		
		List<User> list = s.createCriteria(User.class).list();
		
		for(Iterator<User> it = list.iterator(); it.hasNext();)
		{
			User u = it.next();
			String temp = "{name:'" + u.getName() + "',password:'" + strToPass(u.getPassword().trim()) + "',note:'" +(u.getNote() == null? "":u.getNote().replace("\r\n", "<br/>")) + "'}";
			if(json == "")
				json = temp;
			else
				json += "," + temp;
		}
		
		json = "{root:[" + json + "]}";
		//System.out.println(json);
		return json;
	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print(getUsers());
		
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException
	{
		// Put your code here
	}

}
