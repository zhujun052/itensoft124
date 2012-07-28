<%@ page import="com.itensoft.User" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	User loginAdmin = (User)request.getSession().getAttribute("loginAdmin");
	if(loginAdmin == null)
	  response.sendRedirect("Login.jsp");
	
%>
