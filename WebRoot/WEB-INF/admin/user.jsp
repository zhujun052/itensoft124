<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>	
<div class="container">
	<script type="text/javascript" src="resource/admin/js/user.js"></script>
	<div class="hidden">
		<div id="user_add" iconCls="icon-save" class="easyui-window" <%=win_topbar %>
			title="用户编辑">
			<div region="center" border="false" class="bdcenter">
				<form method="post" id="form_user_add" >
					<input type="hidden" name="action" />
					<table class="tab_form">
						<tr>
							<td class="edittd">用户名：</td>
							<td><input type="text" class="text easyui-validatebox"
								name="name" required="true" validType="length[1,50]"  /></td>
						</tr>
						<tr class="hid">
							<td class="edittd">密码： </td>
							<td><input type="password"  class="text easyui-validatebox"
								name="password" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd" valign="top" >描述：</td>
							<td>
								<textarea name="note" class="textborder" required="true" validType="length[1,50]"  ></textarea>
							</td>
						</tr>
					</table>
				</form>
			</div>
			<div region="south" class="btnbar" border="false">
				<a class="easyui-linkbutton" iconCls="icon-ok"
					href="javascript:void(0)" onclick="addUser()">编辑</a> <a
					class="easyui-linkbutton" iconCls="icon-cancel"
					href="javascript:void(0)" onclick="closeWin('user_add')">取消</a>
			</div>
		</div>
	</div>
	<table id="user_list" fit="true"></table>
</div>
