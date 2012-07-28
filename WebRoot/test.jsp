<%@page import="com.itensoft.common.OnlineVirtualManager"%>
<%@page import="com.itensoft.common.ItensoftEnv"%>
<%@page import="com.itensoft.common.OnlineVirtualManagers"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.itensoft.Group"%>
<%@page import="com.itensoft.ItensoftSession"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'test.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	This is my JSP page.
	<br>

	<%
		Session s = ItensoftSession.getSession();

		List<Group> list = s.createCriteria(Group.class).list();
		out.print("<table border=1><tr><td>Hardid</td><td>Name</td></tr>");
		for (Iterator<Group> it = list.iterator(); it.hasNext();) {
			Group g = it.next();
			out.print("<tr><td>" + g.getHardId() + "</td><td>"
					+ g.getName() + "</td></tr>");
		}

		out.print("</table>");
		
		
		OnlineVirtualManagers vmgrs = ItensoftEnv.getOnlineManagers()
						.get("manager1");
		out.print("<table border=1><tr><td>ManagerName</td></tr>");
		for(Iterator<OnlineVirtualManager> it = vmgrs.getManagers().values().iterator();it.hasNext();){
			OnlineVirtualManager vm = it.next();
			out.print("<tr><td>" + vm.getUser() + "</td></tr>");
			}
		out.print("</table>");
	%>
</body>
</html>
