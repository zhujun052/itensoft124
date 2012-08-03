$(function(){
    
    $('#soft_office').datagrid({
	url : 'admin/controlprogram/getControlProgramByParent',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'code',
	rownumbers : true,
	method:'get',
	height:250,
	queryParams:{page:1,rows:10000,pid:1},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100
	}] ]
    });
    
    $('#soft_desig').datagrid({
	url : 'admin/controlprogram/getControlProgramByParent',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'code',
	rownumbers : true,
	method:'get',
	height:250,
	queryParams:{page:1,rows:10000,pid:2},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100
	}] ]
    });
    
    
    $('#soft_dev').datagrid({
	url : 'admin/controlprogram/getControlProgramByParent',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'code',
	rownumbers : true,
	method:'get',
	height:250,
	queryParams:{page:1,rows:10000,pid:3},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100
	}] ]
    });
    
    
    $('#soft_img').datagrid({
	url : 'admin/controlprogram/getControlProgramByParent',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'code',
	rownumbers : true,
	method:'get',
	height:250,
	queryParams:{page:1,rows:10000,pid:4},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100
	}] ]
    });
    
    
    $('#soft_medio').datagrid({
	url : 'admin/controlprogram/getControlProgramByParent',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'code',
	rownumbers : true,
	method:'get',
	height:250,
	queryParams:{page:1,rows:10000,pid:5},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100
	}] ]
    });
    
    $('#soft_spec').datagrid({
	url : 'admin/controlprogram/getControlProgramByParent',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'code',
	rownumbers : true,
	method:'get',
	height:250,
	queryParams:{page:1,rows:10000,pid:8},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100
	}] ]
    });
    
    $('#soft_custom').datagrid({
	url : 'admin/controlprogram/getControlProgramByParent',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'code',
	rownumbers : true,
	method:'get',
	height:250,
	queryParams:{page:1,rows:10000,pid:9},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100
	}] ]
    });
    
    //
    
});

function propset(){
    $("#propset_win").window({
	onOpen:function(){
	    $(this).window("resize");
	}
    });
    
    var node = $('#framework').tree('getSelected');
    var frame_id = node.id; 
	
    //审批人员设置
    $('#vm_select').datagrid({
	url : 'admin/virtualmanager/getVirtualManagerSel',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'name',
	rownumbers : true,
	height:250,
	queryParams:{page:1,rows:10000,code:frame_id},
	columns : [ [ {
	    field : 'name',
	    title : '审批人',
	    width : 100
	}] ]
    });
    
    $('#vm_all').datagrid({
	url : 'admin/virtualmanager/getVirtualManagerAll',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'name',
	rownumbers : true,
	height:250,
	queryParams:{page:1,rows:10000,code:frame_id},
	columns : [ [ {
	    field : 'name',
	    title : '审批人',
	    width : 100
	}] ]
    });
    
    $("#propset_win").window("open");
}
function auth(){
    var node = $('#framework').tree('getSelected');
    $.post('admin/group/auth',{id:node.id},function(data){
	
	if(data.type == "false"){
	    error(data.message);
	}
	var pid = $('#framework').tree('getParent',node.target);
	$('#framework').tree('reload',pid.target);
	
    },'json');
}
function deleteGroup(){
    var node = $('#framework').tree('getSelected');
 
    $.post('admin/group/delete',{id:node.id},function(data){
	
	if(data.type == "false"){
	    error(data.message);
	}else{
	    var pid = $('#framework').tree('getParent',node.target);
	    $('#framework').tree('reload',pid.target);
	}
	
    },'json');
}

