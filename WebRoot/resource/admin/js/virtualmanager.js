$(function() {
    
    var lastIndex;
    var ids = [
                {id:0},
		{id:1},
		{id:2},
		{id:3},
		{id:4},
		{id:5},
		{id:6},
		{id:7},
   ];
    
    $('#virtualmanager_list').datagrid({
	url : 'admin/virtualmanager/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
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
			$('#form_virtualmanager_add').find("input[name=action]").val("add");
			$('#form_virtualmanager_add').find("input[name=name]").val();
			$('#form_virtualmanager_add').find("input[name=id]").val(0);
		    }
		})
		$("#virtualmanager_edit").window("open");
	    }
	}, {
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {
		
		var selected = $('#virtualmanager_list').datagrid('getSelected');
		if(selected){
		    
		    //删除一行virtualmanager
		    $.post('admin/virtualmanager/delete',{id:selected.id},function(data){
			if(data.type == 'false'){
			    error(data.message);
			}else{
			    $('#virtualmanager_list').datagrid("reload");
			}
			
		    },'json');
		    
		}else{
		    message("请选择一行记录！");
		}
		
	    }
	}, {
	    text : '修改',
	    iconCls:'icon-edit',
	    handler : function() {
		var selected = $('#virtualmanager_list').datagrid('getSelected');
		if(selected){
		    $("#virtualmanager_edit").window({
			    onOpen:function(){
				$(this).window('resize');
				$('#form_virtualmanager_add').find("input[name=action]").val("update");
				$('#tab_vmall_add').datagrid("unselectAll");
				
				$('#form_virtualmanager_add').find("input[name=name]").val(selected.name);
				
				//Jsonlist
				var jsondata = [];
				if(selected.user1!=""){
				    
				}
				
				$('#tab_vmselect_add').datagrid('loadData',jsondata);
				
				
				
			    }
			});
			$("#virtualmanager_edit").window("open");
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
		
		$('#tab_vmselect_add').datagrid('endEdit', lastIndex);
		
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
	}] ]
    }); 
    
});
function virtualmanager_edit(){
   
    var action = $('#form_virtualmanager_add').find("input[name=action]").val();
    var valid = $('#form_virtualmanager_add').find("input[name=name]").validatebox("validate");
    var id =  $('#form_virtualmanager_add').find("input[name=id]").val();
    if(!valid){
	message("审批名称不能为空！");
	return;
    }
    
    var selects = $('#tab_vmselect_add').datagrid("getRows");

    if(selects.length<1){
	message("审批人员不能为空！");
	return;
    }
    
    var items = [];
    //判断序号是否正确
    for(var i=0;i<selects.length;i++){
	var item = {user:selects[i].name,sno:selects[i].sno};
	items.push(item);
    }
    var havesno = true;
    for(var j=0;j<items.length;j++){
	if(items[j].sno == null || items[j].sno == undefined){
	    havesno = false;
	}
    }
    
    if(!havesno){
	message("排列序号不能为空！");
	return;
    }
   
    var name = $('#form_virtualmanager_add').find("input[name=name]").val();
    var itemstr = obj2str(items);

    //提交ajax
    $.post('admin/virtualmanager/edit',{action:action,users:itemstr,name:name,id:id},function(data){
	if(data.type=="true"){
	    $("#virtualmanager_edit").window("close");
	    $('#virtualmanager_list').datagrid("reload");
	}else{
	    message(data.message);
	}
    },'json');
    
}
