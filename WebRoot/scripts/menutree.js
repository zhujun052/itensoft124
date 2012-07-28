function createMenuPanel() {
	var panel = new Ext.tree.TreePanel({
		id : 'group-tree',
		title : '客户端', 
		region : 'west',
		// split : true,
		header : false,
		width : 280,
		minSize : 175,
		maxSize : 500,
		collapsible : false,
		margins : '0 5 0 0',
		cmargins : '0 5 0 0',
		rootVisible : true,
		autoScroll:true,
		enableDD: true,
		animCollapse : false,
		animate : false,
		// frame : true,
		collapseMode : 'mini',
		dataUrl : 'getUserTree', 
		root : new Ext.tree.AsyncTreeNode({
			text : 'Root',
			id : '0',
			icon : 'images/group_user16.png',
			expanded : false
		}),
		tbar : [
				{
					icon : 'images/preferences.png',
					handler : function() {
						var node = getSelectedTreeNode('group-tree');
						if (node)
							ShowUserPropertyWin(node.id, node.text);
						else
							Ext.Msg.alert('Information', 'No group selected!');
					}
				},
				{
					icon : 'images/form_blue.png',
					handler : function() {
						var node = getSelectedTreeNode('group-tree');
						if (node)
							createControlSoftwareWin(node.id, node.text);
						else
							Ext.Msg.alert('Information', 'No group selected!');
					}
				},
				{
					icon : 'images/group_user16.png',
					handler : function() {
						var node = getSelectedTreeNode('group-tree');
						if (node)
							modifyGroupManager(node.id, node.text);
						else
							Ext.Msg.alert('Information', 'No group selected!');
					}
				},{
					icon:'images/group_user16.png',
					handler:function(){
						var node = getSelectedTreeNode('group-tree');
						if(node)
							createRecver(node.id);
						else
							Ext.Msg.alert('Information', 'No group selected!');
							
					}
				},{
					icon:'images/group_user16.png',
					handler:function(){
						var node = getSelectedTreeNode('group-tree');
						if(node)
							createIdentity(node.id);
						else
							Ext.Msg.alert('Information', 'No group selected!');						
					}
					
				},
				'-',
				{
					icon : 'images/check2.png',
					handler : function() {
						var node = getSelectedTreeNode('group-tree');
						if (node) {
							Ext.Ajax.request({
								url : 'GroupService?Method=AuditedGroup',
								params : {
									gc : node.id
								},
								success : function(response) {
									// Ext.Msg.alert('Information', 'Check');
									var tree = Ext.getCmp('group-tree');
									var root = tree.getRootNode();
									if (root) {
										root.reload();
									}
								},
								failure : function(response) {
									Ext.Msg.alert('Information',
											response.responseText.error);
								}
							});

						} else
							Ext.Msg.alert('Information', 'No group selected!');

					}
				}, '-', {
					icon : 'images/user_drop16.png',
					handler : function() {
						var node = getSelectedTreeNode('group-tree');
						if (node) {
							Ext.Ajax.request({
								url : 'GroupService?Method=deleteGroup',
								params : {
									gc : node.id
								},
								success : function(response) {
									// Ext.Msg.alert('Information', 'Check');
									var tree = Ext.getCmp('group-tree');
									var root = tree.getRootNode();
									if (root) {
										root.reload();
									}
								},
								failure : function(response) {
									Ext.Msg.alert('Information',
											response.responseText.error);
								}
							});

						} else
							Ext.Msg.alert('Information', 'No group selected!');
					}
				}, '-', {
					xtype : 'tbfill'
				}, '-', {
					icon : 'images/refresh.png',
					handler : function() {
						var tree = Ext.getCmp('group-tree');
						var root = tree.getRootNode();
						if (root) {
							root.reload();
						}
					}
				} ],

		collapseFirst : false,
		listeners : {

			click : function(node, e) {
				if (node) {
					e.stopEvent();
					var userInfo = Ext.getCmp('userinfo');
					userInfo.loadUserInfo(node.id);
				}
			},
			nodedrop:function(e){
				//Ext.Msg.alert('Info', '我们的节点' + e.dropNode.id + '掉到了'
				//		+ e.target.id + '上，掉落方式是' + e.point);
				var item = {
					dropNode : e.dropNode.id,
					targetNode: e.target.id,
					dropType: e.point
				};
				
				Ext.Ajax.request({
						url:'GroupService?Method=ChangeGroup',
						params:{
							gc : e.dropNode.id,
							targetNode: e.target.id,
							dropType: e.point							
						},
						success:function(response){
							
						},
						failure: function(response){
							Ext.Msg.alert('Error', response.responseText);
						}
				});
			}
		}
	});// new MenuPanel();

	return panel;
}

function modifyGroupManager(groupCode, caption) {
	// virtualmanager.js
	modifyVirtualManagerGroup(groupCode, caption);
}