<%@page import="com.itensoft.common.UTF8String"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.itensoft.common.MD5Password"%>
<%@page import="com.itensoft.RoleUser"%>
<%@page import="com.itensoft.User"%>
<%@page import="com.itensoft.ItensoftSession"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String loginCode = request.getParameter("name");
	String loginPass = request.getParameter("pass");
	loginCode = UTF8String.toString(loginCode);

	Session s = ItensoftSession.getSession();
	try {
		User user = (User) s.get(User.class, loginCode);
		if (user == null) {
			response.sendRedirect("Login.jsp?errormsg=Login name not exists");
			return;
		}

		loginPass = MD5Password.getMD5Password(loginPass);
		if (!user.getPassword().equals(loginPass)) {
			response.sendRedirect("Login.jsp?errormsg=Password is wrong");
			return;
		}

		String Sql = "select b.Name,b.LogonServer from RoleUser a "
				+ ", Role b where a.RoleName=b.Name and a.UserName=?";
		Query query = s.createSQLQuery(Sql).setParameter(0, loginCode);
		List<Object[]> roleList = query.list();
		
		boolean acceptOnServer = false;
		for(Iterator<Object[]> it = roleList.iterator();it.hasNext();){
		    Object[] r = it.next();
			if("T".equals(r[1].toString())){
				acceptOnServer = true;
				break;
			}
		}
		
		if(acceptOnServer){
		    request.getSession().setAttribute("loginAdmin", user);
			response.sendRedirect("index.jsp");
		}else{
			response.sendRedirect("Login.jsp?errormsg=Login user has no right");
		}
		

	} finally {
		if (s != null)
			s.close();
	}
%>