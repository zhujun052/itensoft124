<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/role.js"></script>
<div class="container">
<div class="hidden">
	<div id="role_edit" iconCls="icon-save" class="easyui-window" <%=win_topbar %>
			title="权限配置">
			<div region="center" border="false" class="bdcenter">
			<form method="post" id="form_role_edit" >
					<input type="hidden" name="action" />
				<table class="tab_float tab_form">
					<tr>
						<td>角色名称：<input type="text" validtype="length[1,50]" required="true" name="name" class="text easyui-validatebox "></td>
					</tr>
					<tr>
						<td>
						服务器配置
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" value="T" id="role_LogonServer" name="logonserver" />允许登录服务器&nbsp;&nbsp;
							<input type="checkbox" value="T"  id="role_GroupCode" name="groupcode"/>允许管理的组&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_AuditClient" name="auditclient" />认证客户端&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_UnInstallClient" name="uninstallclient"/>卸载客户端&nbsp;&nbsp;
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" value="T" id="role_ManageCert" name="managecert"/>管理数字证书&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_ScanEncryption" name="scanencryption" />扫描加密&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_ScanDecryption" name="scandecryption"/>扫描解密&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_UpdateSignatureLib" name="updatesignaturelib"/>升级特征库&nbsp;&nbsp;
						</td>
					</tr>
					<tr>
						<td>
						登录审批端配置
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" value="T" id="role_LogonMange" name="logonmanage"/>允许登录审批端&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_ResponeseDecryt" name="responsedecrypt"/>审批解密&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_ResponseDeploy" name="responsedeploy" />审批外发&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_ResponseAdjuest" name="responseadjuest"/>审批调整权限&nbsp;&nbsp;
						</td>
					</tr>
					<tr>
						<td>
						登录解密端配置
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" value="T" id="role_LogonDocer" name="logondocer"/>允许登录解密端&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_DocDecrypt" name="docdecrypt"/>解密&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_DocChangeGrant" name="docchangegrant"/>调整权限&nbsp;&nbsp;
							<input type="checkbox" value="T" id="role_DocPack" name="docpack" />外发文件&nbsp;&nbsp;
						</td>
					</tr>
				</table>
			</form>
			</div>
			<div region="south" class="btnbar" border="false">
				<a class="easyui-linkbutton" iconCls="icon-ok"
					href="javascript:void(0)" onclick="formsubmit('form_role_edit')">编辑</a> <a
					class="easyui-linkbutton" iconCls="icon-cancel"
					href="javascript:void(0)" onclick="closeWin('role_edit')">取消</a>
			</div>
	</div>
			
</div>
<table id="role_list"  fit="true"></table>
</div>