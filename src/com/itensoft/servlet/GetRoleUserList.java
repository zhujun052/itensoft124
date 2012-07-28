package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.Role;
import com.itensoft.RoleUser;

public class GetRoleUserList extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public GetRoleUserList()
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

	private String getRoleUserList(String roleCode)
	{
		String json = "";
		Session s = ItensoftSession.getSession();
		
		if(!roleCode.contains("role-"))
			return "";
		roleCode = String.copyValueOf(roleCode.toCharArray(), 5, roleCode.length() - 5);
		String temp = "";
		
		String sql = "select b.Name,b.Note from RoleUser a join [User] b on "
				+"b.Name=a.UserName where a.RoleName=?";
		SQLQuery query = s.createSQLQuery(sql);
		query.setParameter(0, roleCode);
		List<Object[]> list = query.list();
		for(Iterator<Object[]>it = list.iterator(); it.hasNext(); ){
			Object[] user = it.next();
			temp = "{name:'" + user[0] + "',note:'" + (user[1] == null?"":((String)user[1]).replaceAll("\r\n", "<br/>"))+ "'}";
			if (json == "")
				json = temp;
			else
				json += "," + temp;
		}
		
		json = "{root:[" + json + "]}";
		
		return json;
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String role = new String(request.getParameter("role").getBytes("ISO-8859-1"), "UTF-8");
		if((role == null) | (role == ""))
			out.print("");
		else
		{
			out.print(getRoleUserList(role));
		}
		
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
