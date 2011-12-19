$(function() {
    $('#logs_list').datagrid({
	url : 'admin/logs/filter',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'code',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ [ {
	    field : 'username',
	    title : '用户',
	    width : 100
	},
	{
	    field : 'sessionid',
	    title : '标识',
	    width : 150
	},{
	    field : 'datetime1',
	    title : '开始时间',
	    width : 100
	},{
	    field : 'action',
	    title : '动作',
	    width : 100
	},{
	    field : 'reason1',
	    title : '原因',
	    width : 120
	},{
	    field : 'virtualmanager',
	    title : '管理员',
	    width : 100
	},{
	    field : 'result',
	    title : '结果',
	    width : 80
	},{
	    field : 'reason2',
	    title : '原因',
	    width : 120
	}
	] ],
	onLoadSuccess:function(){
	    $("#form_logexcel").find("input[name=startdate]").val($('#logs_list').datagrid("options").queryParams.startdate)
	    $("#form_logexcel").find("input[name=enddate]").val($('#logs_list').datagrid("options").queryParams.enddate)
	    $("#form_logexcel").find("input[name=username]").val($('#logs_list').datagrid("options").queryParams.username)
	    $("#form_logexcel").find("input[name=manager]").val($('#logs_list').datagrid("options").queryParams.manager)
	    $("#form_logexcel").find("input[name=docer]").val($('#logs_list').datagrid("options").queryParams.docer)
	    $("#form_logexcel").find("input[name=page]").val($('#logs_list').datagrid("getPager").pagination("options").pageNumber)
	    $("#form_logexcel").find("input[name=rows]").val($('#logs_list').datagrid("getPager").pagination("options").pageSize)
	    
	}
    });
});

function exportExcel(){
    document.forms['form_logexcel'].submit(); 
    
}
function doSearch(){
    var startdate = $("#logs_tb").find("input[name=startdate]").val();
    var enddate = $("#logs_tb").find("input[name=enddate]").val();
    var username = $("#logs_tb").find("input[name=username]").val();
    var manager = $("#logs_tb").find("input[name=manager]").val();
    var docer = $("#logs_tb").find("input[name=docer]").val();
    
    $('#logs_list').datagrid("options").queryParams = {
	startdate:startdate,
	enddate:enddate,
	username:username,
	manager:manager,
	docer:docer
    };
    $("#logs_list").datagrid('reload');
}
