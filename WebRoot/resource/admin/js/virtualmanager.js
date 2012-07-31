$(function() {
    
    var lastIndex;
    var ids = [
		{id:1},
		{id:2},
		{id:3},
		{id:4},
		{id:5},
		{id:6},
		{id:7},
		{id:8}
   ];
    
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
			$('#tab_vmall_add').datagrid("unselectAll");
			
			$('#tab_vmselect_add').datagrid('loadData',[]);
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
	idField : 'name',
	rownumbers : true,
	height:250,
	singleSelect:true,
	toolbar : [ {
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {
		var row = $('#tab_vmselect_add').datagrid("getSelected");
		if(row){
		    $('#tab_vmselect_add').datagrid("deleteRow",row);
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
	    title : '用户名',
	    width : 80
	},{
	    field : 'sno',
	    title : '序号',
	    width : 50,
	    editor:{type:'combobox',options:{valueField:'id',textField:'id',data:ids,required:true,onSelect:function(record){
		var cbovalue = $(this).combo('getValue');
		var rowall = $('#tab_vmselect_add').datagrid("getRows");
		var exist = false;
		for(var i=0;i<rowall.length;i++){
		    if(rowall[i].sno == cbovalue){
			exist = true;
		    }
		}
		
		if(exist){
		    message("序号不能重复！");
		    $(this).combo('clear');
		}
		
	    }}}
	} ] ],
	onClickRow:function(rowIndex){
		if (lastIndex != rowIndex){
			$('#tab_vmselect_add').datagrid('endEdit', lastIndex);
			$('#tab_vmselect_add').datagrid('beginEdit', rowIndex);
		}
		lastIndex = rowIndex;
	}
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
		var selects = $('#tab_vmselect_add').datagrid("getRows");
		for(var i=0;i<rows.length;i++){
		    if(selects.length>=1){
			var exist = false;
			for(var j=0;j<selects.length;j++){
			    if(rows[i].name == selects[j].name){
				exist = true;
			    }
			}
			if(!exist){
			    $('#tab_vmselect_add').datagrid("appendRow",rows[i]);
			}
		    }else{
			$('#tab_vmselect_add').datagrid("appendRow",rows[i]);
		    }
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
    var valid = $('#form_virtualmanager_add').find("input[name=name]").validatebox("validate");
    if(!valid){
	message("审批名称不能为空！");
	return;
    }
    
    var selects = $('#tab_vmselect_add').datagrid("getRows");
    if(selects.length<1){
	message("审批人员不能为空！");
	return;
    }
    
    //提交ajax
    alert(Obj2str(selects));
    
}
function virtualmanager_edit(){
    
}