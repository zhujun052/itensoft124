<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="org.hibernate.Session"%>
<!DOCTYPE HTML >
<html>
<head>

<title>凤凰卫士.Web</title>
<style type="text/css">
#loading {
	height: 373px;
	margin-top: 10px;
	margin-bottom: auto;
	margin-left: auto;
	margin-right: auto;
	width: 665px;
	background: url(images/login.png);
}

.loginform {
	height: 203px;
	width: 186px;
	position: relative;
	left: 78px;
	top: 120px;
	margin-top: 300px;
	border-top-width: 2px;
	border-right-width: 2px;
	border-bottom-width: 2px;
	border-left-width: 2px;
}

.loginbox {
	position: relative !important;
	width: 120px;
	border-top-width: 1px;
	border-right-width: 1px;
	border-bottom-width: 1px;
	border-left-width: 1px;
	margin-left: 15px;
}

.loginbox #name {
	position: relative !important;
	top: 25px;
}

.loginbox #pass {
	position: relative !important;
	top: 45px;
}

.loginlabel {
	font-family: Tahoma, Geneva, sans-serif;
	font-size: 12px;
}

.buttonstyle {
	background-color: #A8D6F0;
	padding: 5px;
	border-top-width: 0px;
	border-right-width: 0px;
	border-bottom-width: 0px;
	border-left-width: 0px;
	border-top-style: dotted;
	border-right-style: dotted;
	border-bottom-style: dotted;
	border-left-style: dotted;
}
</style>

</head>

<body>
	<div id="loading">
		<div id="loginform" class="loginform" align="center">
			<form action="Dologin.jsp" method="post">
				<label class="loginlabel" id="name" for="name">用户
				</label> <input type="text" name="name" class="loginbox" id="name"><br>
				<br> <label class="loginlabel" id="name" for="name">密码 </label> <input type="password" name="pass"
					class="loginbox" id="pass"> <br>
				<br>
				<br>
				<br> <input type="submit" class="buttonstyle" value="确定">&nbsp;&nbsp;&nbsp;
				<input type="reset" class="buttonstyle" value="重置">

			</form>
		</div>
	</div>
</body>
</html>
