<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/role.js"></script>
<div class="container">
<div class="hidden">
	<div id="role_config" iconCls="icon-save" class="easyui-window" <%=win_topbar %>
			title="权限配置">
			<div region="center" border="false" class="bdcenter">
				<table class="tab_float">
					<tr>
						<td>
						服务器配置
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox"/>允许登录服务器&nbsp;&nbsp;
							<input type="checkbox"/>允许管理的组&nbsp;&nbsp;
							<input type="checkbox"/>认证客户端&nbsp;&nbsp;
							<input type="checkbox"/>卸载客户端&nbsp;&nbsp;
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox"/>管理数字证书&nbsp;&nbsp;
							<input type="checkbox"/>扫描加密&nbsp;&nbsp;
							<input type="checkbox"/>扫描解密&nbsp;&nbsp;
							<input type="checkbox"/>升级特征库&nbsp;&nbsp;
						</td>
					</tr>
					<tr>
						<td>
						登录审批端配置
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox"/>允许登录审批端&nbsp;&nbsp;
							<input type="checkbox"/>审批解密&nbsp;&nbsp;
							<input type="checkbox"/>审批外发&nbsp;&nbsp;
							<input type="checkbox"/>审批调整权限&nbsp;&nbsp;
						</td>
					</tr>
					<tr>
						<td>
						登录解密端配置
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox"/>允许登录解密端&nbsp;&nbsp;
							<input type="checkbox"/>解密&nbsp;&nbsp;
							<input type="checkbox"/>调整权限&nbsp;&nbsp;
							<input type="checkbox"/>外发文件&nbsp;&nbsp;
						</td>
					</tr>
				</table>
			</div>
			<div region="south" class="btnbar" border="false">
				<a class="easyui-linkbutton" iconCls="icon-ok"
					href="javascript:void(0)" onclick="formsubmit('role_config')">编辑</a> <a
					class="easyui-linkbutton" iconCls="icon-cancel"
					href="javascript:void(0)" onclick="closeWin('role_config')">取消</a>
			</div>
	</div>
			
</div>
<table id="role_list"  fit="true"></table>
</div>