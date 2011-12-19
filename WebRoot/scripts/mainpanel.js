/**
 * 用户或组的属性显示
 * 
 * @returns {UserInfoPanel}
 */
/*
 * UserInfoPanel = function() { UserInfoPanel.superclass.constructor.call(this, {
 * layout : 'fit', id : 'userinfopanel' }); };
 */



function createUserInfoPanel() {
	var UserInfoPanel = new Ext.Panel({
		id : 'userinfo',
		layout:'fit',
		loadUserInfo : function(uid) {
			// alert(uid);
			this.removeAll();

			var tree = new Ext.tree.TreePanel({
				header : false,
				margins : '0 0 5 5',
				cmargins : '0 0 0 0',
				rootVisible : false,
				lines : true,
				autoScroll : true,
				animCollapse : false,
				animate : false,
				collapseMode : 'mini',
				dataUrl : 'getUserInfo?uid=' + uid,
				root : new Ext.tree.AsyncTreeNode({
					text : '常规',
					expanded : true
				})
			});
			tree.getRootNode().expand(true);
			this.add(tree);
			this.doLayout();
		}
	});
	
	return UserInfoPanel;
}

function createMainPanel() {
	var panel = new Ext.TabPanel({
		activeTab : 0,
		region : 'center',
		items : [ {
			title : 'Group properties',
			layout : 'fit',
			items : [ createUserInfoPanel() ]
		}]
	});
	return panel;
};