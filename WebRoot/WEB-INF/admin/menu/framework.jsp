<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<script>
$(function(){
    
	$('#framework').tree({
	    method:'get',
		checkbox: false,
		url: 'admin/group/getTree?id=-1',
		onClick:function(node){
			$(this).tree('toggle', node.target);
		},
		onBeforeLoad:function(node,param){
		    if(node!=null){
				$('#framework').tree("options").url = "admin/group/getTree";
		    }
		},
		onContextMenu: function(e, node){
			$('#framework').tree('select', node.target);
			$('#framemenu').menu('show', {
				left: e.pageX,
				top: e.pageY
			});
		}
	});
});
</script>
<ul id="framework"></ul>
<div id="framemenu" class="easyui-menu" style="width:120px;">
	<div onclick="append()" iconCls="icon-add">新增组</div>
	<div onclick="remove()" iconCls="icon-auth">认证通过</div>
	<div onclick="remove()" iconCls="icon-reload">刷新客户端策略</div>
	<div class="menu-sep"></div>
	<div onclick="expand()">扫描</div>
	<div onclick="collapse()">卸载客户端</div>
	<div onclick="collapse()">中止客户端</div>
	<div class="menu-sep"></div>
	<div onclick="append()" iconCls="icon-remove">删除</div>
	<div onclick="remove()" iconCls="icon-edit">重命名</div>
	<div class="menu-sep"></div>
	<div onclick="collapse()" >属性</div>
</div>
