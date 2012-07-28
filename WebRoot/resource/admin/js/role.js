$(function() {
    $('#role_list').datagrid({
	url : 'admin/role/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	toolbar : [{
	    text : '添加',
	    iconCls:'icon-add',
	    handler : function() {

	    }
	},{
	    text : '修改',
	    iconCls:'icon-edit',
	    handler : function() {

	    }
	},{
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {

	    }
	}, {
	    text : '配置',
	    iconCls:'icon-edit',
	    handler : function() {
		var selected = $('#role_list').datagrid('getSelected');
		if(selected){	
		    $("#role_config").window("open");
		}else{
		    message("请选择一行记录！");
		}
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ [ {
	    field : 'name',
	    title : '角色',
	    width : 200
	},
	{
	    field : 'id',
	    title : '操作',
	    width : 200,
	    formatter : function(val, rowdata, rowindex) {
		return "<span class=\"iconsp icon-edit\" title=\"编辑\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }
	}] ],
    });
});