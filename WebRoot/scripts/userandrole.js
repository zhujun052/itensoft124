/**
 * 角色树
 */
function createRoleTree()
{
	var tree = new Ext.tree.TreePanel(
	{
		id : 'role-tree',
		region : 'west',
		header : false,
		width : 280,
		minSize : 175,
		maxSize : 500,
		collapsible : false,
		margins : '0 0 0 0',
		cmargins : '0 0 0 0',
		rootVisible : false,
		animCollapse : false,
		animate : false,
		collapseMode : 'mini',
		dataUrl : 'GetRoleList',
		// autoLoad:true,
		root : new Ext.tree.AsyncTreeNode(
		{
			text : 'Roles',
			id : 'role-root',
			icon : 'images/group_user16.png',
			expanded : true
		}),
		tbar : [
				{
					icon : 'images/add2.png',
					handler : function()
					{
						modifyRoleProperty('');
						var tree = Ext.getCmp('role-tree');
						var root = tree.getRootNode();
						if (root)
						{
							root.reload();
						}
						
					}
				},
				{
					icon : 'images/edit.png',
					handler : function()
					{
						var tree = Ext.getCmp('role-tree');
						var sel = tree.getSelectionModel();
						var node = sel.getSelectedNode();
						if (node)
						{
							modifyRoleProperty(node.id);
						} else
						{
							Ext.Msg.alert('Information', 'No role selected!');
						}
					}
				},
				{
					icon : 'images/user_male16.png',
					handler : function()
					{
						var tree = Ext.getCmp('role-tree');
						var sel = tree.getSelectionModel();
						var node = sel.getSelectedNode();
						if (node)
						{
							modifyRoleUser(node.id);
						} else
						{
							Ext.Msg.alert('Information', 'No role selected!');
						}
					}
				},
				{
					icon : 'images/delete2.png',
					handler : function()
					{
						var tree = Ext.getCmp('role-tree');
						var sel = tree.getSelectionModel();
						var node = sel.getSelectedNode();
						
						if (node)
						{
							Ext.Ajax.request(
							{
								url : 'RoleService?Method=deleteRole',
								params :
								{
									roleid : node.id
								},
								success : function(response)
								{
									Ext.Msg.alert('Information',
											'Role deleted!');
									var tree = Ext.getCmp('role-tree');
									var root = tree.getRootNode();
									if (root)
									{
										root.reload();
									}
									
								},
								failure : function(response)
								{
									Ext.Msg.alert('Information',
											response.responseText.info);
								}
							});
						} else
						{
							Ext.Msg.alert('Information', 'No role selected!');
						}
					}
				}, '-',
				
				{
					xtype : 'tbfill'
				}, '-',
				{
					icon : 'images/refresh.png',
					handler : function()
					{
						var tree = Ext.getCmp('role-tree');
						var root = tree.getRootNode();
						if (root)
						{
							root.reload();
						}
					}
				} ],
		contextMenu : new Ext.menu.Menu(
		{
			items : [
			{
				id : 'mi-role-new',
				text : 'New ',
				icon : 'images/add2.png'
			},
			{
				id : 'mi-role-edit',
				text : 'Edit',
				icon : 'images/edit.png'
			},
			{
				id : 'mi-role-delete',
				text : 'Delete',
				icon : 'images/delete2.png'
			}, '-',
			{
				id : 'mi-role-property',
				text : 'Property',
				icon : 'images/preferences.png'
			} ],
			listeners :
			{
				itemclick : function(item)
				{
					var n = item.parentMenu.contextNode;
					if (n)
					{
						switch (item.id)
						{
							case 'mi-role-new':
								break;
							case 'mi-role-edit':
								break;
							case 'mi-role-delete':
								break;
							case 'mi-role-property':
								break;
						}
					}
				}// end itemclick
			}
		
		}),
		listeners :
		{
			contextmenu : function(node, e)
			{
				node.select();
				var c = node.getOwnerTree().contextMenu;
				c.contextNode = node;
				c.showAt(e.getXY());
			},
			click : function(node, e)
			{
				if (node)
				{
					e.stopEvent();
					var prop = Ext.getCmp('role-property');
					prop.loadRoleProperty(node.id);
				}
			}
		}
	
	});
	
	return tree;
}
/**
 * 建立角色属性树和拥有的用户列表
 * 
 * @returns {Ext.Panel}
 */
function createRolePropertyPanel()
{
	
	var panel = new Ext.Panel(
	{
		id : 'role-property',
		region : 'center',
		layout : 'fit',
		loadRoleProperty : function(roleId)
		{
			this.removeAll(true);
			
			var tree = new Ext.tree.TreePanel(
			{
				id : 'role-properties-tree',
				region : 'north',
				title : 'Role Properties',
				margins : '0 0 5 5',
				cmargins : '0 0 0 0',
				rootVisible : false,
				lines : true,
				autoScroll : true,
				animCollapse : false,
				animate : false,
				collapseMode : 'mini',
				dataUrl : 'GetRoleProperty?role=' + roleId,
				height : 400,
				root : new Ext.tree.AsyncTreeNode(
				{
					text : 'Properties',
					expanded : true
				})
			
			});
			tree.getRootNode().expand(true);
			
			var grid = new Ext.grid.GridPanel(
			{
				title : 'User list',
				id : 'role-user-list-grid',
				margins : '0 0 0 5',
				region : 'center',
				cm : new Ext.grid.ColumnModel([
				{
					header : 'User Name',
					dataIndex : 'name',
					width : 180
				},
				{
					header : ' Note',
					dataIndex : 'note',
					id : 'note'
				} ]),
				autoExpandColumn : 'note',
				store : new Ext.data.Store(
				{
					proxy : new Ext.data.HttpProxy(
					{
						url : 'GetRoleUserList?role=' + roleId,
					}),
					reader : new Ext.data.JsonReader(
					{
						totalProperty : 'totalProperty',
						root : 'root'
					}, [
					{
						name : 'name'
					},
					{
						name : 'note'
					} ])
				
				})
			});
			
			grid.getStore().load();
			
			var p = new Ext.Panel(
			{
				layout : 'border',
				items : [ tree, grid ]
			});
			
			p.doLayout();
			
			this.add(p);
			this.doLayout();
		}
	
	});
	panel.loadRoleProperty('');
	return panel;
}

/**
 * 属性数组
 */
var roleProperty = [
{
	boxLabel : 'Logon server',
	name : 'logonserver'
},
{
	boxLabel : 'Logon manager',
	name : 'logonmanager'
},
{
	boxLabel : 'Logon alone',
	name : 'logonalone'
},
{
	boxLabel : 'Logon docer',
	name : 'logondocer'
},
{
	boxLabel : 'Manage cert',
	name : 'managecret'
},
{
	boxLabel : 'Audit client',
	name : 'auditclient'
},
{
	boxLabel : 'Uninstall client',
	name : 'uninstallclient'
},
{
	boxLabel : 'Scan encryption',
	name : 'scanencryption'
},
{
	boxLabel : 'Scan decryption',
	name : 'scandecryption'
},
{
	boxLabel : 'Update signature library',
	name : 'updatesignaturelibrary'
},
{
	boxLabel : 'Response decrypt',
	name : 'responsedecrypt'
},
{
	boxLabel : 'Response adjuest',
	name : 'responseadjuest'
},
{
	boxLabel : 'Response deploy',
	name : 'responsedeploy'
},
{
	boxLabel : 'Response deploy readonly',
	name : 'responsedeployreadonly'
},
{
	boxLabel : 'Response deploy disable print',
	name : 'responsedeploydisableprint'
},
{
	boxLabel : 'Response deploy disable snapshot',
	name : 'responsedeploydisablesnapshot'
},
{
	boxLabel : 'Response deploy delete self',
	name : 'responsedeploydeleteself'
},
{
	boxLabel : 'Alone decrypt',
	name : 'alonedecrypt'
},
{
	boxLabel : 'Alone deploy',
	name : 'alonedeploy'
},
{
	boxLabel : 'Alone adjuest',
	name : 'aloneadjuest'
},
{
	boxLabel : 'Doc decrypt',
	name : 'docdecrypt'
},
{
	boxLabel : 'Doc change grant',
	name : 'docchangegrant'
},
{
	boxLabel : 'Doc pack',
	name : 'docpack'
} ];

/**
 * 修改角色属性
 * 
 * @param roleid
 */
function modifyRoleProperty(roleid)
{
	var form = new Ext.form.FormPanel(
	{
		id : 'modify-role-form',
		buttonAlign : 'center',
		frame : true,
		labelAlign : 'right',
		labelWidth : 70,
		items : [
		{
			xtype : 'textfield',
			name : 'roleid',
			allowBlank: false,
			emptyText:'Please input name.',
			fieldLabel : 'Role name'
		},
		{
			frame : true,
			// title:'Role properties',
			bodyStyle : 'padding:5px 5px 5px 15px;',
			items :
			{
				
				xtype : 'checkboxgroup',
				columns : 2,
				items : roleProperty
			}
		} ],
		buttons : [
		{
			text : 'Ok',
			handler : function()
			{
				postRoleProperty();
			}
		},
		{
			text : 'Cancel',
			handler : function()
			{
				win.close();
			}
		} ]
	
	});
	
	if (roleid != '')
	{
		form.getForm().load(
		{
			url : 'RoleService?Method=getPropertyModifyData',
			params :
			{
				roleid : roleid
			},
			method : 'GET',
			success : function(form, action)
			{
			},
			failure : function(form, action)
			{
				Ext.Msg.alert('Message', action.result.info.error);
			}
		});
	}
	
	var win = new Ext.Window(
	{
		layout : 'fit',
		id : 'modify-role-win',
		width : 550,
		title : 'Role Edit',
		height : 400,
		resizable : false,
		modal : true,
		closable : true,
		items : [ form ]
	
	});
	
	win.show();
}

/**
 * 递交角色属性
 */
function postRoleProperty()
{
	var form = Ext.getCmp('modify-role-form');
	if (form)
	{
		if (!form.getForm().isValid())
			return;
		form.getForm().submit(
		{
			url : 'RoleService?Method=postRoleProperty',
			method : 'POST',
			success : function(form, action)
			{
				var tree = Ext.getCmp('role-properties-tree');
				if (tree)
				{
					var root = tree.getRootNode();
					if (root)
					{
						root.reload();
					}
				}
				
				var win = Ext.getCmp('modify-role-win');
				if (win)
					win.close();
			},
			failure : function(form, action)
			{
				Ext.Msg.alert('Message', action.result.info.error);
			}
		});
	}
}

function moveRoleUser(srcGridName, destGridName)
{
	var srcGrid = Ext.getCmp(srcGridName);
	var srcStore = srcGrid.getStore();
	if (srcStore.getCount() == 0)
		return;
	
	var row = srcGrid.getSelectionModel().getSelected();
	if (!row)
	{
		Ext.Msg.alert('MSG', 'No user selected!');
		return;
	}
	
	var destStore = Ext.getCmp(destGridName).getStore();
	destStore.add(new UserRecord(
	{
		name : row.data.name
	}));
	
	var index = srcStore.find('name', row.data.name);
	
	srcStore.remove(srcStore.getAt(index));
}

function moveRoleAllUser(srcGridName, destGridName)
{
	var srcGrid = Ext.getCmp(srcGridName);
	var srcStore = srcGrid.getStore();
	
	if (srcStore.getCount() == 0)
		return;
	
	var destStore = Ext.getCmp(destGridName).getStore();
	
	srcStore.each(function(record)
	{
		destStore.add(new UserRecord(
		{
			name : record.get('name')
		}));
	});
	
	srcStore.removeAll();
}
/**
 * 修改角色拥有到用户
 * 
 * @param roleid
 */
function modifyRoleUser(roleid)
{
	
	var selectUserGrid = new Ext.grid.GridPanel(
	{
		id : 'select-user-grid',
		region : 'west',
		width : 203,
		title : 'Selected User',
		header : true,
		cm : new Ext.grid.ColumnModel([
		{
			header : 'User',
			dataIndex : 'name',
			id : 'name'
		} ]),
		autoExpandColumn : 'name',
		store : new Ext.data.Store(
		{
			proxy : new Ext.data.HttpProxy(
			{
				url : 'RoleService?Method=getSelectedUser'
			}),
			reader : new Ext.data.JsonReader(
			{
				totalProperty : 'totalProperty',
				root : 'root'
			}, [
			{
				name : 'name'
			} ])
		
		}),
		bbar : new Ext.Toolbar([
		{
			xtype : 'tbfill'
		}, '-',
		{
			text : '>',
			handler : function()
			{
				moveRoleUser('select-user-grid', 'available-user-grid');
			}
		}, '-',
		{
			text : '>>',
			handler : function()
			{
				moveRoleAllUser('select-user-grid', 'available-user-grid');
			}
		}, '-' ])
	
	});
	
	selectUserGrid.getStore().load(
	{
		params :
		{
			roleid : roleid
		},
		method : 'GET'
	});
	
	var availableUserGrid = new Ext.grid.GridPanel(
	{
		id : 'available-user-grid',
		region : 'center',
		width : 210,
		title : 'Available User',
		header : true,
		cm : new Ext.grid.ColumnModel([
		{
			header : 'User',
			dataIndex : 'name',
			id : 'name'
		} ]),
		autoExpandColumn : 'name',
		store : new Ext.data.Store(
		{
			proxy : new Ext.data.HttpProxy(
			{
				url : 'RoleService?Method=getAvailableUser'
			}),
			reader : new Ext.data.JsonReader(
			{
				totalProperty : 'totalProperty',
				root : 'root'
			}, [
			{
				name : 'name'
			} ])
		
		}),
		bbar : new Ext.Toolbar([ '-',
		{
			text : '<<',
			handler : function()
			{
				moveRoleAllUser('available-user-grid', 'select-user-grid');
			}
		}, '-',
		{
			text : '<',
			handler : function()
			{
				moveRoleUser('available-user-grid', 'select-user-grid');
			}
		}, '-',
		{
			xtype : 'tbfill'
		} ])
	
	});
	
	availableUserGrid.getStore().load(
	{
		params :
		{
			roleid : roleid
		}
	});
	
	var form = new Ext.form.FormPanel(
	{
		id : 'modify-role-user-form',
		layout : 'border',
		buttonAlign : 'center',
		frame : true,
		items : [
		{
			xtype : 'hidden',
			name : 'selectuserlist',
			id : 'selectuserlist'
		},
		{
			region : 'center',
			layout : 'border',
			frame : true,
			items : [ selectUserGrid,
			{
				region : 'center',
				layout : 'border',
				items : [
				{
					region : 'west',
					width : 8
				}, availableUserGrid ]
			} ]
		} ],
		buttons : [
		{
			text : 'Ok',
			handler : function()
			{
				var store = Ext.getCmp('select-user-grid').getStore();
				var form = Ext.getCmp('modify-role-user-form').getForm();
				
				var vRecords = store.data.items; // 得到grid中所有的記錄
				// grid中的記錄轉為json格式的資料
				var vCount = vRecords.length;
				if (vCount > 0)
				{
					var vDatas = '[';
					for ( var i = 0; i < vCount; i++)
					{
						vDatas += Ext.util.JSON.encode(vRecords[i].data) + ',';
					}
					vDatas = vDatas.substr(0, vDatas.length - 1) + ']';
					Ext.getCmp('selectuserlist').setValue(vDatas);
					// Ext.Msg.alert(vDatas);
				}
				
				if (!form.isValid())
					return;
				
				form.submit(
				{
					url : 'RoleService?Method=postRoleUser',
					params :
					{
						roleid : roleid
					},
					method : 'POST',
					success : function(form, action)
					{
						//
						var grid = Ext.getCmp('role-user-list-grid');
						if (grid)
							grid.getStore().load();
						
						var win = Ext.getCmp('modify-role-user-win');
						if (win)
							win.close();
						
					},
					failure : function(form, action)
					{
						Ext.Msg.alert('Message', action.result.info.message);
					}
				});
				
			}
		},
		{
			text : 'Cancel',
			handler : function()
			{
				win.close();
			}
		} ]
	});
	
	var win = new Ext.Window(
	{
		layout : 'fit',
		id : 'modify-role-user-win',
		width : 450,
		title : 'User select',
		height : 400,
		resizable : false,
		modal : true,
		closable : true,
		items : [ form ]
	});
	
	win.show();
}
