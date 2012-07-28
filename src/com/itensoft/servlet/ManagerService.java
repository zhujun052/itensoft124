package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.itensoft.ItensoftSession;
import com.itensoft.VirtualManagerDocer;
import com.itensoft.VirtualManagerDocerId;
import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.UTF8String;

public class ManagerService extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public ManagerService()
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

	private String getSelectManagerGroup(String virtualManager)
	{

		return "";
	}

	private String getSelectManagerDocer(String virtualManager)
	{
		Session s = ItensoftSession.getSession();

		String hsql = "from VirtualManagerDocer where VitrualManagerName=?";
		Query query = s.createQuery(hsql);
		query.setParameter(0, virtualManager);

		List<VirtualManagerDocer> list = query.list();

		String r = "";

		for (Iterator<VirtualManagerDocer> it = list.iterator(); it.hasNext();)
		{
			VirtualManagerDocer docer = it.next();

			String temp = "{name:'" + docer.getId().getDocer() + "'}";
			if ("".equals(r))
				r = temp;
			else
				r += "," + temp;
		}

		r = "{root:[" + r + "]}";

		return r;
	}

	private String getAvailableDocer(String virtualManager)
	{
		Session s = ItensoftSession.getSession();
		List<String> selectedDocer = new ArrayList<String>();

		Query sel_query = s
				.createQuery("from VirtualManagerDocer where VitrualManagerName=?");
		sel_query.setParameter(0, virtualManager);
		List<VirtualManagerDocer> sel_list = sel_query.list();
		for (Iterator<VirtualManagerDocer> it = sel_list.iterator(); it
				.hasNext();)
		{
			selectedDocer.add(it.next().getId().getDocer());
		}

		SQLQuery all_query = s
				.createSQLQuery("SELECT a.Name,c.LogonDocer FROM [User] a "
						+ "join [RoleUser] b on a.Name=b.UserName join [Role] c on c.Name=b.RoleName "
						+ "where c.LogonDocer=?");
		all_query.setParameter(0, "T");

		List<Object[]> all_list = all_query.list();
		String r = "";
		for (Iterator<Object[]> it = all_list.iterator(); it.hasNext();)
		{
			Object[] docer = it.next();
			if (!selectedDocer.contains(docer[0].toString()))
			{
				String temp = "{name:'" + docer[0].toString() + "'}";
				if ("".equals(r))
					r = temp;
				else
					r += "," + temp;

			}
		}

		r = "{root:[" + r + "]}";
		return r;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String vm = request.getParameter("vm");
		//if(vm != null)
		//	vm = UTF8String.toString(vm);
		if ("".equals(vm))
		{
			out.print("Virtual manager is empty");
			out.flush();
			out.close();
			return;
		}

		String method = request.getParameter("Method");
		if ("".equals(method))
		{
			out.print("Method is empty!");
			out.flush();
			out.close();
		}

		String r = "";

		out.print(r);
		out.flush();
		out.close();
	}

	private String postDocers(String virtualManager, String userlist)
			throws JSONException
	{
		if ((userlist == null) | "".equals(userlist))
		{
			Session s = ItensoftSession.getSession();
			Transaction tx = s.beginTransaction();
			try
			{
				final String vm = virtualManager;
				s.doWork(new Work()
				{

					@Override
					public void execute(Connection conn) throws SQLException
					{
						String sql = "delete from VirtualManagerDocer where VitrualManagerName=?";
						CallableStatement p = conn.prepareCall(sql);
						p.setString(1, vm);
						p.execute();
					}
				});

				tx.commit();
				
				ItensoftEnv.reloadOnlineVirtualManagers();
				return "{success:true,info:{}}";
			} catch (Exception e)
			{
				tx.rollback();
				return "{success:false,info:{message:'" + e.getMessage()
						+ "'}}";
			}
		} else
		{
			JSONArray array = new JSONArray(userlist);
			List<String> selectList = new ArrayList<String>();

			for (int i = 0; i < array.length(); i++)
			{
				JSONObject obj = array.getJSONObject(i);
				selectList.add(obj.getString("name").trim());
			}

			Session s = ItensoftSession.getSession();
			Transaction tx = s.beginTransaction();
			try
			{
				List<VirtualManagerDocer> list = s
						.createQuery(
								"from VirtualManagerDocer where "
										+ "VitrualManagerName=?")
						.setParameter(0, virtualManager).list();
				Map<String, VirtualManagerDocer> map = new HashMap<String, VirtualManagerDocer>();
				for (Iterator<VirtualManagerDocer> it = list.iterator(); it
						.hasNext();)
				{
					VirtualManagerDocer docer = it.next();
					if (!(selectList.contains(docer.getId().getDocer())))
						s.delete(docer);
					else
						map.put(docer.getId().getDocer().trim(), docer);
				}

				for (Iterator<String> it = selectList.iterator(); it.hasNext();)
				{
					String docerName = it.next();
					if (!map.containsKey(docerName))
					{
						VirtualManagerDocerId id = new VirtualManagerDocerId(
								virtualManager, docerName);
						VirtualManagerDocer docer = new VirtualManagerDocer(id);
						s.save(docer);
					}
				}

				s.flush();
				tx.commit();
				
				ItensoftEnv.reloadOnlineVirtualManagers();
				return "{success:true,info:{}}";

			} catch (Exception e)
			{
				tx.rollback();
				return "{success:false,info:{error:'" + e.getMessage() + "'}}";
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String vm = request.getParameter("vm");
		if(vm != null)
			vm = UTF8String.toString(vm);
		if ("".equals(vm))
		{
			out.print("Virtual manager is empty");
			out.flush();
			out.close();
			return;
		}

		String method = request.getParameter("Method");
		if ("".equals(method))
		{
			out.print("Method is empty!");
			out.flush();
			out.close();
			return;
		}

		String r = "";
		if ("GetSelectManagerGroup".equals(method))
			r = getSelectManagerGroup(vm);
		else if ("GetSelectManagerDocer".equals(method))
			r = getSelectManagerDocer(vm);
		else if ("GetAvailableDocer".equals(method))
			r = getAvailableDocer(vm);
		else if ("PostDocers".equals(method))
		{
			String docers = request.getParameter("selectuserlist");
			try
			{
				r = postDocers(vm, docers);
			} catch (Exception e)
			{
				r = e.getMessage();
			}
		}
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
	public void init() throws ServletException
	{
		// Put your code here
	}

}
