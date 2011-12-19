<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>	
<script type="text/javascript" src="resource/admin/js/virtualmanager.js"></script>
<div class="container">
<div class="hidden">
<div id="virtualmanager_edit" style="width:500px;height:385px" iconCls="icon-save" class="easyui-window" <%=win_topbar %> title="审批员添加">
			<div region="center" border="false" class="bdcenter">
				<form method="post" id="form_virtualmanager_add" >
					<table class="tab_form">
							<tr>
								<td class="edittd">审批名称：</td>
								<td><input type="text" class="text easyui-validatebox"
									name="name" required="true" validType="length[1,50]"  /></td>
							</tr>
							<tr>
								<td colspan="2">
									<table style="width:100%;">
										<tr>
											<td width="50%" valign="top">
											<table id="tab_vmselect_add"></table>
											</td>
											<td  valign="top">
											<table id="tab_vmall_add"></table>
											</td>
										</tr>
									</table>
								</td>
							</tr>
					</table>
				</form>
			</div>
			<div region="south" class="btnbar" border="false">
				<a class="easyui-linkbutton" iconCls="icon-ok"
					href="javascript:void(0)" onclick="virtualmanager_add()">添加</a> <a
					class="easyui-linkbutton" iconCls="icon-cancel"
					href="javascript:void(0)" onclick="closeWin('virtualmanager_edit')">取消</a>
			</div>
		</div>
</div>
<table id="virtualmanager_list" fit="true"></table>

</div>