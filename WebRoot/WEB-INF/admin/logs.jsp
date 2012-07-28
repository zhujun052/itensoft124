<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/logs.js"></script>
<div class="container">

<form name="form_logexcel" id="form_logexcel" method="post" target="_blank" action="admin/logs/excel">
<input type="hidden" name="startdate" />
<input type="hidden" name="enddate" />
<input type="hidden" name="username" />
<input type="hidden" name="manager" />
<input type="hidden" name="docer" />
<input type="hidden" name="page" />
<input type="hidden" name="rows" />
</form>

<table id="logs_list" fit="true" toolbar="#logs_tb" ></table>

<div id="logs_tb" class="gtb" >  
    <span>开始时间：</span>  
    <input class="easyui-datebox" name="startdate" class="tipt" >  
    <span>结束时间：</span>  
   	<input class="easyui-datebox" name="enddate" class="tipt" >  
   	<span>用户：</span>  
   	<input class="tipt" name="username" >  
    <span>管理员：</span>  
   	<input class="tipt" name="manager" >  
    <span>解密员：</span>  
   	<input class="tipt" name="docer" >  
    <a class="easyui-linkbutton" title="查询" iconCls="icon-search" plain="true" onclick="doSearch()" ></a>
    <a class="easyui-linkbutton" title="导出" iconCls="icon-excel" plain="true" onclick="exportExcel()"></a>  
</div>  

</div>