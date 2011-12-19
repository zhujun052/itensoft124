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

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.itensoft.ItensoftSession;
import com.itensoft.Role;
import com.itensoft.RoleUser;
import com.itensoft.RoleUserId;
import com.itensoft.User;

public class RoleService extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public RoleService()
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

	private String getPropertyBoolString(String value)
	{
		return "T".equals(value) ? "true" : "false";
	}

	private String getPropertyModifyData(String roleid)
	{
		String result = "";
		Session s = ItensoftSession.getSession();
		roleid = getRealRoleid(roleid);
		Role role = (Role) s.get(Role.class, roleid);
		if (role == null)
			return "{success:false,info:{error:'Role is not exitsts!'}}";

		result = "{roleid:'"+ role.getName().trim()
				+ "',logonserver:" + getPropertyBoolString(role.getLogonServer())
				+ ",logonmanager:" + getPropertyBoolString(role.getLogonManage())
				+ ",logonalone:" + getPropertyBoolString(role.getLogonAlone())
				+ ",logondocer:" + getPropertyBoolString(role.getLogonDocer())
				+ ",managecret:" + getPropertyBoolString(role.getManageCert())
				+ ",auditclient:" + getPropertyBoolString(role.getAuditClient())
				+ ",uninstallclient:" + getPropertyBoolString(role.getUninstallClient())
				+ ",scanencryption:" + getPropertyBoolString(role.getScanEncryption())
				+ ",scandecryption:" + getPropertyBoolString(role.getScanDecryption())
				+ ",updatesignaturelibrary:" + getPropertyBoolString(role.getUpdateSignatureLib())
				+ ",responsedecrypt:" + getPropertyBoolString(role.getResponseDecrypt())
				+ ",responseadjuest:" + getPropertyBoolString(role.getResponseAdjuest())
				+ ",responsedeploy:" + getPropertyBoolString(role.getResponseDeploy())
				+ ",responsedeployreadonly:" + getPropertyBoolString(role.getResponseDeployReadonly())
				+ ",responsedeploydisableprint:" + getPropertyBoolString(role.getResponseDeployDisablePrint())
				+ ",responsedeploydisablesnapshot:" + getPropertyBoolString(role.getResponseDeployDisableSnapshot())
				+ ",responsedeploydeleteself:" + getPropertyBoolString(role.getResponseDeployDeleteSelf())
				+ ",alonedecrypt:" + getPropertyBoolString(role.getAloneDecrypt())
				+ ",alonedeploy:" + getPropertyBoolString(role.getAloneDeploy())
				+ ",aloneadjuest:" + getPropertyBoolString(role.getAloneAdjuest())
				+ ",docdecrypt:" + getPropertyBoolString(role.getDocPack())
				+ ",docchangegrant:" + getPropertyBoolString(role.getDocChangeGrant())
				+ ",docpack:" + getPropertyBoolString(role.getDocPack())
				+ "}";

		result = "{success:true,data:" + result + "}";

		
		return result;
	}

	private String getSelectedUser(String roleid)
	{
		String result = "";
		roleid = getRealRoleid(roleid);

		Session s = ItensoftSession.getSession();
		String hsql = "from RoleUser where RoleName=?";
		List<RoleUser> list = s.createQuery(hsql).setString(0, roleid.trim())
				.list();

		for (Iterator<RoleUser> it = list.iterator(); it.hasNext();)
		{
			RoleUser user = it.next();
			String temp = "{name:'" + user.getId().getUserName() + "'}";
			if ("".equals(result))
				result = temp;
			else
				result += "," + temp;
		}

		result = "{root:[" + result + "]}";

		
		return result;
	}

	private String getAvailableUser(String roleid)
	{
		String result = "";
		Session s = ItensoftSession.getSession();
		String hsql = "from RoleUser where RoleName=?";

		roleid = getRealRoleid(roleid);

		List<RoleUser> selectedList = s.createQuery(hsql)
				.setString(0, roleid.trim()).list();
		List<String> selected = new ArrayList<String>();
		
		for(RoleUser user: selectedList)
			selected.add(user.getId().getUserName());

		List<User> list = s.createQuery("from User").list();
		
		for(User user : list)
		{
			if (!selected.contains(user.getName()))
			{
				String temp = "{name:'" + user.getName() + "'}";
				if ("".equals(result))
					result = temp;
				else
					result += "," + temp;
			}
		}

		result = "{root:[" + result + "]}";
		

		return result;
	}

	private String getRealRoleid(String roleid)
	{
		if (roleid.contains("role-"))
			roleid = String.copyValueOf(roleid.toCharArray(), 5,
					roleid.length() - 5);
		return roleid;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String method = request.getParameter("Method");
		String roleid = request.getParameter("roleid");//new String(request.getParameter("roleid").getBytes("ISO-8859-1"),"UTF-8");
		if ((method == null) | ("".equals(method)))
		{
			out.print("{success:false, info:{error:'Method not supplyed!'}}");
			out.flush();
			out.close();
			return;
		}
		if ((roleid == null) | ("".equals(roleid)))
		{
			out.print("{success:false, info:{error:'Roleid is empty!'}}");
			out.flush();
			out.close();
			return;
		}
		if ("getPropertyModifyData".equals(method))
		{
			out.print(getPropertyModifyData(roleid));
			out.flush();
			out.close();
			return;
		}

	}

	private String getPropertyValue(String srcValue)
	{
		return "on".equals(srcValue) ? "T" : "F";
	}

	private String postRoleProperty(HttpServletRequest request)
	{
		String result = "";
		String roleid = request.getParameter("roleid");
		Session s = ItensoftSession.getSession();
		Role role = (Role) s.get(Role.class, roleid);
		boolean newRole = false;
		if (role == null)
		{
			newRole = true;
			role = new Role(roleid);
		}
		role.setLogonServer(getPropertyValue(request
				.getParameter("logonserver")));
		role.setLogonManage(getPropertyValue(request
				.getParameter("logonmanager")));
		role.setLogonAlone(getPropertyValue(request.getParameter("logonalone")));
		role.setLogonDocer(getPropertyValue(request.getParameter("logondocer")));
		role.setManageCert(getPropertyValue(request.getParameter("managecret")));
		role.setAuditClient(getPropertyValue(request
				.getParameter("auditclient")));
		role.setUninstallClient(getPropertyValue(request
				.getParameter("uninstallclient")));
		role.setScanEncryption(getPropertyValue(request
				.getParameter("scanencryption")));
		role.setScanDecryption(getPropertyValue(request
				.getParameter("scandecryption")));
		role.setUpdateSignatureLib(getPropertyValue(request
				.getParameter("updatesignaturelibrary")));
		role.setResponseDecrypt(getPropertyValue(request
				.getParameter("responsedecrypt")));
		role.setResponseAdjuest(getPropertyValue(request
				.getParameter("responseadjuest")));
		role.setResponseDeploy(getPropertyValue(request
				.getParameter("responsedeploy")));
		role.setResponseDeployReadonly(getPropertyValue(request
				.getParameter("responsedeployreadonly")));
		role.setResponseDeployDisablePrint(getPropertyValue(request
				.getParameter("responsedeploydisableprint")));
		role.setResponseDeployDisableSnapshot(getPropertyValue(request
				.getParameter("responsedeploydisablesnapshot")));
		role.setResponseDeployDeleteSelf(getPropertyValue(request
				.getParameter("responsedeploydeleteself")));
		role.setAloneDecrypt(getPropertyValue(request
				.getParameter("alonedecrypt")));
		role.setAloneDeploy(getPropertyValue(request
				.getParameter("alonedeploy")));
		role.setAloneAdjuest(getPropertyValue(request
				.getParameter("aloneadjuest")));
		role.setDocChangeGrant(getPropertyValue(request.getParameter("docchangegrant")));
		role.setDocDecrypt(getPropertyValue(request.getParameter("docdecrypt")));
		role.setDocPack(getPropertyValue(request.getParameter("docpack")));

		Transaction tx = s.beginTransaction();
		try
		{
			if (newRole)
				s.save(role);
			else
				s.update(role);
			s.flush();
			tx.commit();
			result = "{success:true,info:{}}";
		} catch (Exception e)
		{
			tx.rollback();
			result = "{success:false,info:{error:'" + e.getMessage() + "'}}";
		}

		
		return result;
	}

	private String postRoleUser(HttpServletRequest request)
			throws JSONException
	{
		String result = "";
		final String roleid = getRealRoleid(request.getParameter("roleid"));
		// final roleid = getRealRoleid(roleid);

		String userlist = request.getParameter("selectuserlist");

		System.out.println(userlist);
		if ((userlist == null) | ("".equals(userlist.trim())))
		{
			// 没有用户被选择，需要删除该角色下的所有用户
			Session s = ItensoftSession.getSession();
			Transaction tx = s.beginTransaction();
			try
			{
				s.doWork(new Work() 
				{
					public void execute(Connection conn) throws SQLException
					{
						String sql = "{delete from RoleUser where RoleName=?}";
						CallableStatement p = conn.prepareCall(sql);
						p.setString(1, roleid);
						p.execute();
					}
				});
				tx.commit();
				result = "{success:true,info:{}}";
			} catch (Exception e)
			{
				tx.rollback();
				return "{success:false,info:{message:'" + e.getMessage()
						+ "'}}";
			}
			
		} else
		{
			// 取得客户选择列表
			JSONArray array = new JSONArray(userlist);
			List<String> selectList = new ArrayList<String>();
			for (int i = 0; i < array.length(); i++)
			{
				JSONObject obj = array.getJSONObject(i);
				selectList.add(obj.getString("name").trim());
			}

			// 有选择用户，先从数据库中取得已经存在的用户列表

			Session s = ItensoftSession.getSession();
			Transaction tx = s.beginTransaction();
			try
			{
				List<RoleUser> list = s
						.createQuery("from RoleUser where RoleName=?")
						.setString(0, roleid).list();
				Map<String, RoleUser> map = new HashMap<String, RoleUser>();
				for (Iterator<RoleUser> it = list.iterator(); it.hasNext();)
				{
					RoleUser u = it.next();
					// 如果选择的用户中没有，那么删除
					if (!(selectList.contains(u.getId().getUserName().trim())))
						s.delete(u);
					else
						map.put(u.getId().getUserName().trim(), u);
				}

				// 檢查选择的用户是否包含在map中，如果不在，那么新增
				for (Iterator<String> it = selectList.iterator(); it.hasNext();)
				{
					String userName = it.next();
					if (!map.containsKey(userName))
					{
						RoleUserId id = new RoleUserId(roleid, userName);
						RoleUser user = new RoleUser(id);
						s.save(user);
					}
				}
				s.flush();
				tx.commit();
				result = "{success:true,info:{}}";
			} catch (Exception e)
			{
				tx.rollback();
				result = "{success:false,info:{error:'" + e.getMessage()
						+ "'}}";
			}
			
		}

		return result;
	}

	private String deleteRole(HttpServletRequest request,
			HttpServletResponse response)
	{
		String result = "";
		final String roleid = getRealRoleid(request.getParameter("roleid"));
		Session s = ItensoftSession.getSession();
		Transaction tx = s.beginTransaction();
		try
		{
			s.doWork(new Work()
			{
				@Override
				public void execute(Connection conn) throws SQLException
				{
					String sql = "delete from RoleUser where RoleName=?;delete from [Role] where [Name]=? ";
					CallableStatement p = conn.prepareCall(sql);
					p.setString(1, roleid);
					p.setString(2, roleid);
					p.execute();
				}
			});

			tx.commit();
			result = "{success:true,info:'Role deleted!}";
		} catch (Exception e)
		{
			tx.rollback();
			return "{success:false, info:'" + e.getMessage() + "'}";
		}

		return result;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String method = request.getParameter("Method");
		if ((method == null) | ("".equals(method)))
		{
			out.print("{success:false, info:{error:'Method not supplyed!'}}");
			out.flush();
			out.close();
			return;
		}

		String roleid = request.getParameter("roleid");//.getBytes("ISO-8859-1"), "UTF-8");
		if ((roleid == null) | ("".equals(roleid)))
		{
			out.print("{success:false, info:{error:'Roleid is empty'}}");
			out.flush();
			out.close();
			return;
		}
		if ("getSelectedUser".equals(method))
		{
			out.print(getSelectedUser(roleid));
			out.flush();
			out.close();
			return;
		}

		if ("getAvailableUser".equals(method))
		{
			out.print(getAvailableUser(roleid));
			out.flush();
			out.close();
			return;
		}

		if ("postRoleProperty".equals(method))
		{
			out.print(postRoleProperty(request));

			out.flush();
			out.close();
			return;
		}

		if ("postRoleUser".equals(method))
		{
			try
			{
				out.print(postRoleUser(request));
			} catch (JSONException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.flush();
			out.close();
			return;
		}

		if ("deleteRole".equals(method))
		{
			out.print(deleteRole(request, response));
			out.flush();
			out.close();
		}
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
