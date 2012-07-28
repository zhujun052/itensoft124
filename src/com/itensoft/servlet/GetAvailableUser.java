package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.VirtualManager;
import com.itensoft.common.UTF8String;

public class GetAvailableUser extends HttpServlet
{

	private List<String> vmUsers = new ArrayList<String>();

	private void addvmUser(String user)
	{
		if (user == null)
			return;
		if ("".equals(user.trim()))
			return;
		if (vmUsers.contains(user.trim()))
			return;

		vmUsers.add(user.trim());
	}

	private void getvmUsers(String vmName, Session s)
	{
		vmUsers.clear();

		VirtualManager vm = (VirtualManager) s
				.get(VirtualManager.class, vmName);
		if (vm == null)
			return;

		addvmUser(vm.getUser1());
		addvmUser(vm.getUser2());
		addvmUser(vm.getUser3());
		addvmUser(vm.getUser4());
		addvmUser(vm.getUser5());
		addvmUser(vm.getUser6());
		addvmUser(vm.getUser7());
		addvmUser(vm.getUser8());

	}

	public String jsonString(String json, String userName)
	{
		String r = json;
		String temp = "";
		if (userName == null)
			return json;

		if ("".equals(userName))
			return json;

		temp = "{name:'" + userName + "'}";
		if (r == "")
			r = temp;
		else
			r += "," + temp;

		return r;
	}

	/**
	 * Constructor of the object.
	 */
	public GetAvailableUser()
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

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Session s = ItensoftSession.getSession();
		String vmName = request.getParameter("vm");
//		if(vmName != null)
//			vmName = UTF8String.toString(vmName);
		if (!((vmName == null) | ("".equals(vmName))))
			getvmUsers(vmName, s);

		//TODO 没有根据登录许可选择数据
		// String sql =
		// "select a.Name,b.UserName from [User] a join RoleUser b on b.UserName=a.Name "
		// + "join [Role] c on c.Name=b.RoleName where c.LogonManage='T'";
		String sql = "select a.Name, a.Note from [User] a";
		List<Object[]> list = s.createSQLQuery(sql).list();
		String json = "";
		for (Iterator<Object[]> it = list.iterator(); it.hasNext();)
		{
			Object[] record = it.next();
			if (!vmUsers.contains(record[0]))
			{
				json = jsonString(json, (String) record[0]);
			}
		}

		json = "{root:[" + json + "]}";

		out.print(json);
		out.flush();
		out.close();
		ItensoftSession.closeSession();
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
