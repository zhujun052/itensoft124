$(function() {
    
	$('#form_user_add').form({
		url : "admin/user/edit",
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
					$('#user_list').datagrid("reload");
					
				}else{
					error(data.message);
				}
			}catch(e){
				error('系统异常！');
			}
		}
	});
    
    $('#user_list').datagrid({
	url : 'admin/user/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	toolbar : [ {
	    iconCls:'icon-add',
	    text : '添加',
	    handler : function() {
		$("#user_add").window({
		    onBeforeOpen:function(){
			
			$("#form_user_add").find("input[name=name]").removeAttr("readonly");
			
			$("#form_user_add").find("input[name=name]").val("");
			$("#form_user_add").find("input[name=password]").val("");
			$("#form_user_add").find("textarea[name=note]").html("");
		    }
		});
		$("#user_add").window("open");
		$("#form_user_add").find("input[name=action]").val("add");
	    }
	}, {
	    iconCls:'icon-edit',
	    text : '修改',
	    handler : function() {
		
		var selected = $('#user_list').datagrid('getSelected');
		if(selected){
    		    $("#form_user_add").find("input[name=action]").val("update");
			$("#user_add").window({
			    onBeforeOpen:function(){
				
				$("#form_user_add").find("input[name=name]").attr("readonly","readonly");
				
				$("#form_user_add").find("input[name=name]").val(selected.name);
				$("#form_user_add").find("input[name=password]").val(selected.password);
				$("#form_user_add").find("textarea[name=note]").html(selected.note);
			    }
			});
			$("#user_add").window("open");
		}else{
		    message("请选择一行记录！");
		}
		
	    }
	}, {
	    iconCls:'icon-remove',
	    text : '删除',
	    handler : function() {
		var selected = $('#user_list').datagrid('getSelected');
		if(selected){	
		    
		    confirm('确认删除该用户？',function(r){
			if(r){
			    $.post('admin/user/delete',{name:selected.name},function(data){
				
				if(data.type == "false"){
				    error(data.message);
				}else{
				    $('#user_list').datagrid('reload');
				}
			    },'json');
			}
		    });
		    

		}else{
		    message("请选择一行记录！");
		}
	    }
	} ],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ [ {
	    field : 'name',
	    title : '用户名',
	    width : 200
	}, {
	    field : 'note',
	    title : '描述',
	    width :300
	} ] ],
    });
});
function addUser(){
	var action = $("#form_user_add").find("input[name=action]").val();
    	if(action == "add"){
    	    	//验证用户是否存在
	    	var name = $("#user_add").find("input[name=name]").val();
	    	$.post('admin/user/existUser',{name:name},function(data){
	    	    if(data.type == true){
	    		message('用户名已经存在，请重新输入！');
	    		return false
	    	    }else{
	    		formsubmit('form_user_add');
	    	    }
	    	},'json');
    	}
}