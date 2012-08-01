$(function() {
    
    
    $('#roleuserlist').datagrid({
	url : 'admin/user/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	height:205,
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ [ {
	    field : 'name',
	    title : '用户',
	    width : 100
	}, {
	    field : 'note',
	    title : '描述',
	    width : 100
	}] ]
    });
    
    
    $('#role_userlist').datagrid({
	fit : 'true',
	nowrap : true,
	method:'post',
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	height:265,
	toolbar : [
	    {
		    text : '添加',
		    iconCls:'icon-add',
		    handler : function() {
			$("#roleuser_add").window({
			    onOpen:function(){
				$(this).window("resize");
			    }
			});
			$("#roleuser_add").window("open");
		    }
	    },
	    {
		    text : '删除',
		    iconCls:'icon-remove',
		    handler : function() {
			var selected = $('#role_userlist').datagrid('getSelected');
			if(selected){
			    
			    var rolename  = $('#role_list').datagrid('getSelected').name;
			    confirm('确认删除该用户？',function(r){
				if(r){
				    $.post('admin/roleuser/delete',{rolename:rolename,username:selected.username},function(data){
					if(data.type == "false"){
					    message(data.message);
					}else{
					    $("#role_userlist").datagrid('reload');
					}
				    },'json');
				}
			    });
			    
			    
			}else{
			    message("请选择一行记录！");
			}
		    }
	    },
	],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ [ {
	    field : 'username',
	    title : '用户',
	    width : 100
	}, {
	    field : 'note',
	    title : '描述',
	    width : 100
	}] ]
    });
    
    
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
		$("#form_role_edit").find("input[name=action]").val("add");
		
		    $("#role_edit").window({
			onOpen:function(){
			    cleanCk();
			}
		    });
		    
		    $("#role_edit").window("open");
		
	    }
	},{
	    text : '修改',
	    iconCls:'icon-edit',
	    handler : function() {
		
		
		var selected = $('#role_list').datagrid('getSelected');
		if(selected){	
		    
		    $("#form_role_edit").find("input[name=name]").val(selected.name);
		    
		    cleanCk();
		    
		    if(selected.logonserver == "T"){
			$("#role_LogonServer").attr("checked","checked");
		    }
		    
//		    if(selected.groupcode == "T"){
//			$("#role_GroupCode").attr("checked","checked");
//		    }
		    
		    if(selected.auditclient == "T"){
			$("#role_AuditClient").attr("checked","checked");
		    }
		    
		    if(selected.uninstallclient == "T"){
			$("#role_UnInstallClient").attr("checked","checked");
		    }
		    
		    if(selected.managecert == "T"){
			$("#role_ManageCert").attr("checked","checked");
		    }
		    
		    if(selected.scanencryption == "T"){
			$("#role_ScanEncryption").attr("checked","checked");
		    }
		    
		    if(selected.scandecryption == "T"){
			$("#role_ScanDecryption").attr("checked","checked");
		    }
		    
		    if(selected.updatesignaturelib == "T"){
			$("#role_UpdateSignatureLib").attr("checked","checked");
		    }
		    
		    if(selected.logonmanage == "T"){
			$("#role_LogonMange").attr("checked","checked");
		    }
		    
		    if(selected.responsedecrypt == "T"){
			$("#role_ResponeseDecryt").attr("checked","checked");
		    }
		    
		    if(selected.responsedeploy == "T"){
			$("#role_ResponseDeploy").attr("checked","checked");
		    }
		    
		    if(selected.responseadjuest == "T"){
			$("#role_ResponseAdjuest").attr("checked","checked");
		    }
		    
		    if(selected.logondocer == "T"){
			$("#role_LogonDocer").attr("checked","checked");
		    }
		    
		    if(selected.docdecrypt == "T"){
			$("#role_DocDecrypt").attr("checked","checked");
		    }
		    
		    if(selected.docchangegrant == "T"){
			$("#role_DocChangeGrant").attr("checked","checked");
		    }
		    
		    if(selected.docpack == "T"){
			$("#role_DocPack").attr("checked","checked");
		    }
		    
		    $("#form_role_edit").find("input[name=action]").val("update");
		    
		    $("#role_edit").window("open");
		}else{
		    message("请选择一行记录！");
		}
	    }
	},{
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {
		var selected = $('#role_list').datagrid('getSelected');
		if(selected){
		    
		    confirm('确认删除该用户？',function(r){
			if(r){
			    $.post('admin/role/delete',{name:selected.name},function(data){
				if(data.type == "false"){
				    error(data.message);
				}else{
				    $('#role_list').datagrid('reload');
				}
			    },'json');
			}
		    });
		    
		}else{
		    message("请选择一行记录！");
		}
		
	    }
	},{
	    text : '关联用户',
	    iconCls:'icon-remove',
	    handler : function() {
		var selected = $('#role_list').datagrid('getSelected');
		if(selected){
		    
		    $('#role_userlist').datagrid('options').url = "admin/roleuser/list";
		    $('#role_userlist').datagrid('options').queryParams = {rolename:selected.name};
		    $('#role_userlist').datagrid('reload');
		    
		    $("#role_user").window("open");
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
	    width : 100
	}] ],
    });
    
    
    $('#form_role_edit').form({
    	url : "admin/role/edit",
    	onSubmit : function() {
    		if($('#form_role_edit').form("validate")){
    		    return true;
    		}else{
    		    return false;
    		}
    	},
    	success : function(data) {
    		try{
    			data = $.parseJSON(data);
    			if(data.type=="true"){
    				closeWin('role_edit');
    				$('#role_list').datagrid("reload");
    			}else{
    				error(data.message);
    			}
    		}catch(e){
    			error('系统异常！');
    		}
    	}
    });
    
});
function cleanCk(){
    
    	$("#form_role_edit").find("input[name=name]").val("");
    
	$("#role_LogonServer").removeAttr("checked");
    
//	$("#role_GroupCode").removeAttr("checked");
    
	$("#role_AuditClient").removeAttr("checked");
    
	$("#role_UnInstallClient").removeAttr("checked");
    
	$("#role_ManageCert").removeAttr("checked");
    
	$("#role_ScanEncryption").removeAttr("checked");
    
	$("#role_ScanDecryption").removeAttr("checked");
    
	$("#role_UpdateSignatureLib").removeAttr("checked");
    
	$("#role_LogonMange").removeAttr("checked");
    
	$("#role_ResponeseDecryt").removeAttr("checked");
    
	$("#role_ResponseDeploy").removeAttr("checked");
    
	$("#role_ResponseAdjuest").removeAttr("checked");
    
	$("#role_LogonDocer").removeAttr("checked");
    
	$("#role_DocDecrypt").removeAttr("checked");
    
	$("#role_DocChangeGrant").removeAttr("checked");
    
	$("#role_DocPack").removeAttr("checked");
    
}
function roleuseradd(){
	var roleuserselected = $('#roleuserlist').datagrid('getSelected');
	if(!roleuserselected){	
	    message("请选择用户！");
	    return;
	}
	
	var rolename  = $('#role_list').datagrid('getSelected').name;
	
	//添加用户
	$.post('admin/roleuser/exist',{rolename:rolename,username:roleuserselected.name},function(data){
	    if(data.type == "true"){
		 message("该角色下已经存在对应帐号！");
	    }else{
		
		$.post('admin/roleuser/add',{rolename:rolename,username:roleuserselected.username},function(data){
		    if(data.type == "false"){
			error(data.message);
		    }else{
			$("#roleuser_add").window("close");
			$("#role_userlist").datagrid('reload');
		    }
		},'json');

	    }
	},'json');
}