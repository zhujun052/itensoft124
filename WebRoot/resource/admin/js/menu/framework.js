var encrypts = [
    {value:0,text:"不加密"},
    {value:1,text:"智能加密"},
    {value:2,text:"修改加密"},
    {value:3,text:"打开加密"}
    ];
    
    function formatEncrypt(value){
	for(var i=0; i<encrypts.length; i++){
		if (encrypts[i].value == value) return encrypts[i].text;
	}
	return value;
    }
    
function formatCK(value){
	if(value == "T"){
	    return "<input type=\"checkbox\" checked=\"checked\" />";
	}
	return "<input type=\"checkbox\"  />";
}

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
	fitColumns:true,
	height:250,
	queryParams:{page:1,rows:10000,code:frame_id},
	toolbar : [ {
	    iconCls:'icon-right',
	    text : '删除',
	    handler : function() {
		var selected = $('#vm_select').datagrid("getSelections");
		if(selected.length>=1){
		    for(var i=0;i<selected.length;i++){
			$('#vm_all').datagrid("appendRow",selected[i]);
			var rowindex = $('#vm_select').datagrid("getRowIndex",selected[i]); 
			$('#vm_select').datagrid("deleteRow",rowindex);
		    }
		}
	    }
	}],
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
	fitColumns:true,
	height:250,
	queryParams:{page:1,rows:10000,code:frame_id},
	toolbar : [ {
	    iconCls:'icon-left',
	    text : '添加',
	    handler : function() {
		var selected = $('#vm_all').datagrid("getSelections");
		if(selected.length>=1){
		    for(var i=0;i<selected.length;i++){
			$('#vm_select').datagrid("appendRow",selected[i]);
			var rowindex = $('#vm_all').datagrid("getRowIndex",selected[i]); 
			$('#vm_all').datagrid("deleteRow",rowindex);
		    }
		}
	    }
	}],
	columns : [ [ {
	    field : 'name',
	    title : '审批人',
	    width : 100
	}] ]
    });
    
    $('#receive_select').datagrid({
	url : 'admin/controlprogram/getSelectedRecverList',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	rownumbers : true,
	fitColumns:true,
	height:250,
	method:'get',
	queryParams:{page:1,rows:10000,code:frame_id},
	toolbar : [ {
	    iconCls:'icon-right',
	    text : '删除',
	    handler : function() {
		var selected = $('#receive_select').datagrid("getSelections");
		if(selected.length>=1){
		    for(var i=0;i<selected.length;i++){
			$('#receive_all').datagrid("appendRow",selected[i]);
			var rowindex = $('#receive_select').datagrid("getRowIndex",selected[i]); 
			$('#receive_select').datagrid("deleteRow",rowindex);
		    }
		}
	    }
	}],
	columns : [ [ {
	    field : 'name',
	    title : '接收者',
	    width : 100
	}] ]
    });
    
    $('#receive_all').datagrid({
	url : 'admin/controlprogram/getAvailableRecverList',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	rownumbers : true,
	fitColumns:true,
	height:250,
	method:'get',
	queryParams:{page:1,rows:10000,code:frame_id},
	toolbar : [ {
	    iconCls:'icon-left',
	    text : '添加',
	    handler : function() {
		var selected = $('#receive_all').datagrid("getSelections");
		if(selected.length>=1){
		    for(var i=0;i<selected.length;i++){
			$('#receive_select').datagrid("appendRow",selected[i]);
			var rowindex = $('#receive_all').datagrid("getRowIndex",selected[i]); 
			$('#receive_all').datagrid("deleteRow",rowindex);
		    }
		}
	    }
	}],
	columns : [ [ {
	    field : 'name',
	    title : '接收者',
	    width : 100
	}] ]
    });
    
    $('#id_select').datagrid({
	url : 'admin/controlprogram/getSelectedIdentityList',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	rownumbers : true,
	fitColumns:true,
	height:250,
	method:'get',
	queryParams:{page:1,rows:10000,code:frame_id},
	toolbar : [ {
	    iconCls:'icon-right',
	    text : '删除',
	    handler : function() {
		var selected = $('#id_select').datagrid("getSelections");
		if(selected.length>=1){
		    for(var i=0;i<selected.length;i++){
			$('#id_all').datagrid("appendRow",selected[i]);
			var rowindex = $('#id_select').datagrid("getRowIndex",selected[i]); 
			$('#id_select').datagrid("deleteRow",rowindex);
		    }
		}
	    }
	}],
	columns : [ [ {
	    field : 'name',
	    title : '身份',
	    width : 100
	}] ]
    });
    
    $('#id_all').datagrid({
	url : 'admin/controlprogram/getAvailableIdentityList',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	rownumbers : true,
	fitColumns:true,
	height:250,
	method:'get',
	queryParams:{page:1,rows:10000,code:frame_id},
	toolbar : [ {
	    iconCls:'icon-left',
	    text : '添加',
	    handler : function() {
		var selected = $('#id_all').datagrid("getSelections");
		if(selected.length>=1){
		    for(var i=0;i<selected.length;i++){
			$('#id_select').datagrid("appendRow",selected[i]);
			var rowindex = $('#id_all').datagrid("getRowIndex",selected[i]); 
			$('#id_all').datagrid("deleteRow",rowindex);
		    }
		}
	    }
	}],
	columns : [ [ {
	    field : 'name',
	    title : '身份',
	    width : 100
	}] ]
    });
    
    var lastIndex_office;
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
	queryParams:{page:1,rows:10000,pid:1,code:node.id},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100,
	    formatter:formatEncrypt,
	    editor:{type:'combobox',options:{valueField:'value',textField:'text',data:encrypts,required:true,onSelect:function(record){
	    }}}
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100,
	    formatter:formatCK,
	    editor:{type:'checkbox',options:{on:'T',off:'F'}}
	}] ],
	onClickRow:function(rowIndex){
		if (lastIndex_office != rowIndex){
			$('#soft_office').datagrid('endEdit', lastIndex_office);
			$('#soft_office').datagrid('beginEdit', rowIndex);
		}
		lastIndex_office = rowIndex;
	}
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
	queryParams:{page:1,rows:10000,pid:2,code:node.id},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100,
	    formatter:formatEncrypt,
	    editor:{type:'combobox',options:{valueField:'value',textField:'text',data:encrypts,required:true,onSelect:function(record){
	    }}}
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100,
	    formatter:formatCK,
	    editor:{type:'checkbox',options:{on:1,off:0}}
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
	queryParams:{page:1,rows:10000,pid:3,code:node.id},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100,
	    formatter:formatEncrypt,
	    editor:{type:'combobox',options:{valueField:'value',textField:'text',data:encrypts,required:true,onSelect:function(record){
	    }}}
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100,
	    formatter:formatCK,
	    editor:{type:'checkbox',options:{on:'T',off:'F'}}
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
	queryParams:{page:1,rows:10000,pid:4,code:node.id},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100,
	    formatter:formatEncrypt,
	    editor:{type:'combobox',options:{valueField:'value',textField:'text',data:encrypts,required:true,onSelect:function(record){
	    }}}
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100,
	    formatter:formatCK,
	    editor:{type:'checkbox',options:{on:'T',off:'F'}}
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
	queryParams:{page:1,rows:10000,pid:5,code:node.id},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100,
	    formatter:formatEncrypt,
	    editor:{type:'combobox',options:{valueField:'value',textField:'text',data:encrypts,required:true,onSelect:function(record){
	    }}}
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100,
	    formatter:formatCK,
	    editor:{type:'checkbox',options:{on:'T',off:'F'}}
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
	queryParams:{page:1,rows:10000,pid:8,code:node.id},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100,
	    formatter:formatEncrypt,
	    editor:{type:'combobox',options:{valueField:'value',textField:'text',data:encrypts,required:true,onSelect:function(record){
	    }}}
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100,
	    formatter:formatCK,
	    editor:{type:'checkbox',options:{on:'T',off:'F'}}
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
	queryParams:{page:1,rows:10000,pid:9,code:node.id},
	columns : [ [ {
	    field : 'name',
	    title : '软件',
	    width : 100
	},{
	    field : 'encryptMode',
	    title : '加密方式',
	    width : 100,
	    formatter:formatEncrypt,
	    editor:{type:'combobox',options:{valueField:'value',textField:'text',data:encrypts,required:true,onSelect:function(record){
	    }}}
	},{
	    field : 'printControled',
	    title : '是否打印',
	    width : 100,
	    formatter:formatCK,
	    editor:{type:'checkbox',options:{on:'T',off:'F'}}
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

//修改身份操作
function updateIden(){
    var node = $('#framework').tree('getSelected');
    var selected = $('#id_select').datagrid("getRows");

    var items = [];
    for(var i=0;i<selected.length;i++){
	var item = {code:selected[i].id,name:selected[i].name};
	items.push(item);
    }
    var itemstr = obj2str(items);
    $.post('admin/controlprogram/postIdentity',{groupcode:node.id,selectedlist:itemstr},function(data){
	if(data.type == "false"){
	    error(data.message);
	}else{
	    $('#id_select').datagrid("reload");
	    $('#id_all').datagrid("reload");
	}
    },'json');
}
//接收者
function updateRece(){
    var node = $('#framework').tree('getSelected');
    var selected = $('#receive_select').datagrid("getRows");

    var items = [];
    for(var i=0;i<selected.length;i++){
	var item = {code:selected[i].id,name:selected[i].name};
	items.push(item);
    }
    var itemstr = obj2str(items);
    $.post('admin/controlprogram/PostRecver',{groupcode:node.id,selectedlist:itemstr},function(data){
	if(data.type == "false"){
	    error(data.message);
	}else{
	    $('#receive_select').datagrid("reload");
	    $('#receive_all').datagrid("reload");
	}
    },'json');
}
//审批人修改
function updateVm(){
    var node = $('#framework').tree('getSelected');
    var selected = $('#vm_all').datagrid("getRows");
    var items = [];
    for(var i=0;i<selected.length;i++){
	var item = {name:selected[i].name};
	items.push(item);
    }
    var itemstr = obj2str(items);
    $.post('admin/controlprogram/postGroupManager',{groupCode:node.id,userlist:itemstr},function(data){
	if(data.type == "false"){
	    error(data.message);
	}else{
	    $('#vm_select').datagrid("reload");
	    $('#vm_all').datagrid("reload");
	}
    },'json');
}
function updateControlSoft(){
    var node = $('#framework').tree('getSelected');
    
    var prog_1 = $('#soft_office').datagrid("getRows");
    var i_1 = [];
    for(var i=0;i<prog_1.length;i++){
	var ptb = prog_1[i].printControled == "F"?false:true;
	var item = {softwarecode:prog_1[i].code,softwarename:prog_1[i].name,encryptomode:Number(prog_1[i].encryptMode),printable:ptb};
	i_1.push(item);
    }
    
    var prog_2 = $('#soft_desig').datagrid("getRows");
    var i_2 = [];;
    for(var i=0;i<prog_2.length;i++){
	var ptb = prog_2[i].printControled == "F"?false:true;
	var item = {softwarecode:prog_2[i].code,softwarename:prog_2[i].name,encryptomode:Number(prog_2[i].encryptMode),printable:ptb};
	i_2.push(item);
    }
    
    var prog_3 = $('#soft_dev').datagrid("getRows");
    var i_3 = [];
    for(var i=0;i<prog_3.length;i++){
	var ptb = prog_3[i].printControled == "F"?false:true;
	var item = {softwarecode:prog_3[i].code,softwarename:prog_3[i].name,encryptomode:Number(prog_3[i].encryptMode),printable:ptb};
	i_3.push(item);
    }
    
    var prog_4 = $('#soft_img').datagrid("getRows");
    var i_4 = [];
    for(var i=0;i<prog_4.length;i++){
	var ptb = prog_4[i].printControled == "F"?false:true;
	var item = {softwarecode:prog_4[i].code,softwarename:prog_4[i].name,encryptomode:Number(prog_4[i].encryptMode),printable:ptb};
	i_4.push(item);
    }
    
    var prog_5 = $('#soft_medio').datagrid("getRows");
    var i_5 = [];
    for(var i=0;i<prog_5.length;i++){
	var ptb = prog_5[i].printControled == "F"?false:true;
	var item = {softwarecode:prog_5[i].code,softwarename:prog_5[i].name,encryptomode:Number(prog_5[i].encryptMode),printable:ptb};
	i_5.push(item);
    }
    
    var prog_6 = $('#soft_spec').datagrid("getRows");
    var i_6 = [];
    for(var i=0;i<prog_6.length;i++){
	var ptb = prog_6[i].printControled == "F"?false:true;
	var item = {softwarecode:prog_6[i].code,softwarename:prog_6[i].name,encryptomode:Number(prog_6[i].encryptMode),printable:ptb};
	i_6.push(item);
    }
    
    var prog_7 = $('#soft_custom').datagrid("getRows");
    var i_7 = [];
    for(var i=0;i<prog_7.length;i++){
	var ptb = prog_7[i].printControled == "F"?false:true;
	var item = {softwarecode:prog_7[i].code,softwarename:prog_7[i].name,encryptomode:Number(prog_7[i].encryptMode),printable:ptb};
	i_7.push(item);
    }
    
    var item = {
	    1:i_1,
	    2:i_2,
	    3:i_3,
	    4:i_4,
	    5:i_5,
	    8:i_6,
	    9:i_7,
    };
    
    $.post('admin/controlprogram/postControlSoftware',{controlJsonString:obj2str(item),code:node.id},function(data){
	if(data.type == "false"){
	    error(data.message);
	}else{
	    $('#soft_office').datagrid("reload");
	    $('#soft_desig').datagrid("reload");
	    $('#soft_dev').datagrid("reload");
	    $('#soft_img').datagrid("reload");
	    $('#soft_medio').datagrid("reload");
	    $('#soft_spec').datagrid("reload");
	    $('#soft_custom').datagrid("reload");
	}
    },'json');
    
}
//修改属性。
function updateinfo(){
    
}