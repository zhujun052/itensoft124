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
	<div onclick="append()" iconCls="icon-add">Append</div>
	<div onclick="remove()" iconCls="icon-remove">Remove</div>
	<div class="menu-sep"></div>
	<div onclick="expand()">Expand</div>
	<div onclick="collapse()">Collapse</div>
</div>
