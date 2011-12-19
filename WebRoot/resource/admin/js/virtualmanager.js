$(function() {
    $('#virtualmanager_list').datagrid({
	url : 'admin/virtualmanager/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'name',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	toolbar : [ {
	    text : '添加',
	    iconCls:'icon-add',
	    handler : function() {
		
		$("#virtualmanager_edit").window({
		    onOpen:function(){
			$(this).window('resize');
		    }
		})
		$("#virtualmanager_edit").window("open");
		
		
	    }
	}, {
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {

	    }
	}, {
	    text : '修改',
	    iconCls:'icon-edit',
	    handler : function() {
		$("#virtualmanager_edit").window({
		    onOpen:function(){
			$(this).window('resize');
		    }
		});
		$("#virtualmanager_edit").window("open");
		
		
		
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ [ {
	    field : 'name',
	    title : '审批名称',
	    width : 150
	},{
	    field : 'user1',
	    title : '用户1',
	    width : 100
	},{
	    field : 'user2',
	    title : '用户2',
	    width : 100
	},{
	    field : 'user3',
	    title : '用户3',
	    width : 100
	},{
	    field : 'user4',
	    title : '用户4',
	    width : 100
	},{
	    field : 'user5',
	    title : '用户5',
	    width : 100
	},{
	    field : 'user6',
	    title : '用户6',
	    width : 100
	},{
	    field : 'user7',
	    title : '用户7',
	    width : 100
	},{
	    field : 'user8',
	    title : '用户8',
	    width : 100
	}] ],
    });
    
   
    
    

    $('#tab_vmselect_add').datagrid({
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	rownumbers : true,
	height:250,
	singleSelect:false,
	toolbar : [ {
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {
		var rows = $('#tab_vmselect_add').datagrid("getSelections");
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ [ {
	    field : 'name',
	    title : '用户名',
	    width : 150
	} ] ]
    }); 
    
    $('#tab_vmall_add').datagrid({
	url : 'admin/user/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'name',
	rownumbers : true,
	height:250,
	queryParams:{page:1,rows:10000},
	toolbar : [ {
	    text : '添加',
	    iconCls:'icon-add',
	    handler : function() {
		var rows = $('#tab_vmall_add').datagrid("getSelections");
		var selects = $('#tab_vmall_add').datagrid("getSelections");
		for(var i=0;i<rows.length;i++){
		    $('#tab_vmselect_add').datagrid("appendRow",rows[i]);
		}
		
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ [ {
	    field : 'name',
	    title : '用户名',
	    width : 150
	} ] ]
    }); 
    
});
function virtualmanager_add(){
    
}
function virtualmanager_edit(){
    
}