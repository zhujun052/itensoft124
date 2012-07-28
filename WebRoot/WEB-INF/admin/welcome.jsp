<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="${system_config['url']}">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${system_config['webname']} - 后台管理系统</title>
<script type="text/javascript" src="resource/easyui/jquery-1.7.2.min.js"></script>
<link href="resource/admin/login/css/login.css" rel="stylesheet" type="text/css" />
<script language="JavaScript">
function fleshVerify(){ 
	$('#verifyImg').attr('src', 'kaptcha.jpg?' + Math.floor(Math.random()*100) ); 
}
</script>
</head>
<body>
<div id="login">
    <div id="login_content">
    <div class="loginForm">
            	<form method="post" action="admin/webmaster/login" >
				<p>
					<input type="text" name="name" autocomplete="false" size="20" class="login_input" />
				</p>
				<p>
					<input type="password" name="pass" autocomplete="false" size="20" class="login_input" />
				</p>
				<p>
					<input type="text" name="verify"  autocomplete="false" size="20" class="login_input" />
				</p>
				<div class="login_bar" >
					<img src="kaptcha.jpg" id="verifyImg" onclick="fleshVerify()" title="看不清楚，换一张！" width="70" style="margin-top:-10px;float:left;cursor: pointer; "/>
					<input class="login_btn sub" type="submit" name="form_submit" style="margin-top:-10px;"  value=" " />
				</div>
			</form>
		</div>
    </div>
</div>
</body>
</html>