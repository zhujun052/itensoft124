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
		    
		    if(selected.groupcode == "T"){
			$("#role_GroupCode").attr("checked","checked");
		    }
		    
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
    
    
    $('#form_role_edit').form({
    	url : "admin/role/edit",
    	onSubmit : function() {
    		if($('#form_user_add').form("validate")){
    		    return true;
    		}else{
    		    return false;
    		}
    	},
    	success : function(data) {
    		try{
    			data = $.parseJSON(data);
    			if(data.type=="true"){
    				success(data.message);
    				closeWin('user_add');
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
    
	$("#role_LogonServer").removeAttr("checked");
    
	$("#role_GroupCode").removeAttr("checked");
    
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