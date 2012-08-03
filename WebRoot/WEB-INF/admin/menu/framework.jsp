<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript" src="resource/admin/js/menu/framework.js"></script>
<script>
    $(function() {

	$('#framework')
		.tree(
			{
			    method : 'get',
			    checkbox : false,
			    lines : true,
			    url : 'admin/group/getTree?id=-1',
			    onClick : function(node) {
				$(this).tree('toggle', node.target);
			    },
			    onBeforeLoad : function(node, param) {
				if (node != null) {
				    $('#framework').tree("options").url = "admin/group/getTree";
				}
			    },
			    onClick : function(node) {
				frame_id = node.id;
				top.tabupdate('后台首页', {
				    href : 'admin/group/getGroupInfo?id='
					    + node.id
				});
			    },
			    onContextMenu : function(e, node) {
				$('#framework').tree('select', node.target);
				$('#framemenu').menu('show', {
				    left : e.pageX,
				    top : e.pageY
				});
			    },
			    onLoadSuccess:function(node, data){
					var node = $('#framework').tree('getRoot');
					$('#framework').tree('expand',node.target);
			    }
			});
    });
    function refresh() {
		var node = $('#framework').tree('getRoot');
		$('#framework').tree('reload',node.target);
    }
</script>
<div class="datagrid-toolbar">
	<a href="javascript:void(0)" style="float: left;"
		class="l-btn l-btn-plain" id="btnadd"><span class="l-btn-left"><span
			class="l-btn-text icon-reload" style="padding-left: 20px;"
			onclick="refresh()">刷新</span></span></a>
</div>
<div class="hidden">
	<div id="propset_win" iconCls="icon-save"
		style="width: 500px; height: 450px;" class="easyui-window"
		<%=win_topbar %> title="属性编辑">
		<div class="easyui-tabs" style="height: 375px;">
			<div title="常规 " class="p10">
				<input type="checkbox" />从上层继承
				<div class="easyui-tabs">
					<div title="一般" class="p10">
						<input type="checkbox" />U盘日志&nbsp;&nbsp; <input type="checkbox" />打印日志&nbsp;&nbsp;
						<input type="checkbox" />使用黑名单&nbsp;&nbsp;
						<fieldset>
							<legend>离线使用:</legend>
							<input type="radio" />在线使用（极进模式）<br> <input type="radio" />在线使用（温和模式）<br>
							<input type="radio" />允许离线使用<br> 有效时间：<input type="text" /><br>
							<input type="checkbox" />需要离线加密狗
						</fieldset>
						Explorer需预览的文件：
						<textarea class="textborder" style="height: 60px; width: 435px;">
           			</textarea>
					</div>
					<div title="设备控制" class="p10">
						<input type="checkbox" />禁止打印
						<fieldset>
							<legend>移动存储设备控制:</legend>
							<table style="width: 100%;">
								<tr>
									<td align="left" valign="top">
										<fieldset>
											<legend>入：</legend>
											<input type="radio" />允许<br> <input type="radio" />禁止<br>
											<input type="radio" />加密<br> <input type="radio" />解密<br>
										</fieldset>
									</td>
									<td align="left" valign="top">
										<fieldset>
											<legend>出：</legend>
											<input type="radio" />允许<br> <input type="radio" />禁止<br>
											<input type="radio" />加密<br>
										</fieldset>
									</td>
								</tr>
							</table>
						</fieldset>
					</div>
				</div>
			</div>
			<div title="受控软件" class="p10">
				<div class="easyui-tabs">
					<div title="办公文档" class="p10">
						<table id="soft_office"></table>
					</div>
					<div title="图纸设计" class="p10">
						<table id="soft_desig"></table>
					</div>
					<div title="程序开发" class="p10">
						<table id="soft_dev"></table>
					</div>
					<div title="图像处理" class="p10">
						<table id="soft_img"></table>
					</div>
					<div title="多媒体处理" class="p10">
						<table id="soft_medio"></table>
					</div>
					<div title="专有软件" class="p10">
						<table id="soft_spec"></table>
					</div>
					<div title="自定义" class="p10">
						<table id="soft_custom"></table>
					</div>

				</div>
			</div>
			<div title="身份" class="p10">
				<table style="width: 100%;">
					<tr>
					<td style="width: 50%;">
					<table id="id_select"></table>
					</td>
					<td style="width: 50%;">
					<table id="id_all"></table>
					</td>
					</tr>
				</table>
			</div>
			<div title="接收者" class="p10">
				<table style="width: 100%;">
					<tr>
					<td style="width: 50%;">
					<table id="receive_select"></table>
					</td>
					<td style="width: 50%;">
					<table id="receive_all"></table>
					</td>
					</tr>
				</table>
			</div>
			<div title="审批人" class="p10">
				<table style="width: 100%;">
					<tr>
					<td style="width: 50%;">
					<table id="vm_select"></table>
					</td>
					<td style="width: 50%;">
					<table id="vm_all"></table>
					</td>
					</tr>
				</table>
			</div>
		</div>
		<div region="south" class="btnbar" border="false">
			<a class="easyui-linkbutton" iconCls="icon-ok"
				href="javascript:void(0)" onclick="addUser()">编辑</a> <a
				class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="closeWin('user_add')">取消</a>
		</div>
	</div>
</div>
<ul id="framework"></ul>
<div id="framemenu" class="easyui-menu" style="width: 120px;">
	<div onclick="append()" iconCls="icon-add">新增组</div>
	<div onclick="auth()" iconCls="icon-auth">认证通过</div>
	<div onclick="remove()" iconCls="icon-reload">刷新客户端策略</div>
	<div class="menu-sep"></div>
	<div onclick="expand()">扫描</div>
	<div onclick="collapse()">卸载客户端</div>
	<div onclick="collapse()">中止客户端</div>
	<div class="menu-sep"></div>
	<div onclick="deleteGroup()" iconCls="icon-remove">删除</div>
	<div onclick="remove()" iconCls="icon-edit">重命名</div>
	<div class="menu-sep"></div>
	<div onclick="propset()">属性</div>
</div>
