/**
 * 用于角色跟虚拟管理员选择用户的记录结构
 */
var UserRecord = Ext.data.Record.create([
{
	name : 'name',
	type : 'string'
} ]);

function getSelectedTreeNode(treeName){
	var tree = Ext.getCmp(treeName);
	if(!tree) return;
	
	var sel = tree.getSelectionModel();
	var node = sel.getSelectedNode();
	
	return node;
}