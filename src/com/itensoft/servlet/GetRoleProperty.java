package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.Role;

public class GetRoleProperty extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public GetRoleProperty()
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


	private String getRoleProperty(String roleCode)
	{
		String json = "";
		Session s = ItensoftSession.getSession();
		
		if(!roleCode.contains("role-"))
			return "";
		roleCode = String.copyValueOf(roleCode.toCharArray(), 5, roleCode.length() - 5);
		String temp = "";
		
		//System.out.println(roleCode);
		
		Role role = (Role)s.get(Role.class, roleCode);
		
		json = "{text:'Logon Server:" + ("T".equals(role.getLogonServer()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'Logon Manager:" +("T".equals(role.getLogonManage()) ?"true":"false") + "',leaf:true}";
		json += ",{text:'Logon Alone:" + ("T".equals(role.getLogonAlone()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'Logon Docer:" + ("T".equals(role.getLogonDocer()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'ManageCret:" + ("T".equals(role.getManageCert()) ?"true":"false") + "',leaf:true}";
		json += ",{text:'Audit Client:" + ("T".equals(role.getAuditClient()) ?"true":"false") + "',leaf:true}";
		json += ",{text:'Uninstall client:" + ("T".equals(role.getUninstallClient()) ?"true":"false") + "',leaf:true}";
		json += ",{text:'Scan encryption:" + ("T".equals(role.getScanEncryption()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'Scan decryption:" + ("T".equals(role.getScanDecryption()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'Update signature library:" + ("T".equals(role.getUpdateSignatureLib()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'Response decrypt:" + ("T".equals(role.getResponseDecrypt()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'Response adjuest:" + ("T".equals(role.getResponseAdjuest()) ?"true":"false") + "',leaf:true}";
		json += ",{text:'Resopnse deploy:" + ("T".equals(role.getResponseDeploy()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'Response deploy readonly:" + ("T".equals(role.getResponseDeployReadonly()) ?"true":"false") + "',leaf:true}";
		json += ",{text:'Response deploy disable print:" + ("T".equals(role.getResponseDeployDisablePrint()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'Response deploy disable snapshot:" + ("T".equals(role.getResponseDeployDisableSnapshot()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'Response deploy delete self:" + ("T".equals(role.getResponseDeployDeleteSelf()) ? "true":"false") + "',leaf:true}";
		json += ",{text:'Alone decrypt:" + ("T".equals(role.getAloneDecrypt()) ?"true":"false") + "',leaf:true}";
		json += ",{text:'Alone deploy:" + ("T".equals(role.getAloneDeploy()) ?"true":"false") + "',leaf:true}";
		json += ",{text:'Alone adjuest:" + ("T".equals(role.getAloneAdjuest()) ?"true":"false") + "',leaf:true}";
		json += ",{text:'Doc decrypt:" + ("T".equals(role.getDocDecrypt()) ? "true":"false") + "', leaf:true}";
		json += ",{text:'Doc change grang:" + ("T".equals(role.getDocChangeGrant()) ? "true":"false") + "', leaf:true}";
		json += ",{text:'Doc pack:" + ("T".equals(role.getDocPack()) ?"true":"false") + "', leaf:true}";
		
		json = "[" + json + "]";
		return json;
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String role = new String(request.getParameter("role").getBytes("ISO-8859-1"),"UTF-8");
		System.out.print(role);
		if((role == null) |(role == ""))
			out.print("");
		else
		{
			out.print(getRoleProperty(role));
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
