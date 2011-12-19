function modifyUser(userid)
{
	// Ext.Msg.alert('Msg','add user');
	var form = new Ext.form.FormPanel(
	{
		labelWidth : 90,
		labelAlign : 'right',
		id : 'modify-user-form',
		buttonAlign : 'center',
		frame : true,
		// title : 'User',
		items : [
		{
			xtype : 'textfield',
			name : 'name',
			allowBlank: false,
			emptyText: 'Please input name.',
			fieldLabel : 'User name',
			width : 210
		},
		{
			xtype : 'textfield',
			name : 'password',
			fieldLabel : 'Password',
			width : 210
		},
		{
			xtype : 'textarea',
			fieldLabel : 'Note',
			id : 'modify-user-note',
			name : 'note',
			height : 145,
			width : 210
		} ],
		buttons : [
		{
			text : 'Ok',
			handler : function()
			{
				postManagerUser();
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
	
	if (userid != "")
	{
		form.getForm().load(
		{
			url : 'GetManagerUserData',
			params :
			{
				userid : userid
			},
			method : 'GET',
			success : function(form, action)
			{
				/**
				 * TextArea中的换行，在返回json数据含有\n时会出错，所以在返回时把\n替换成<br/>， 返回后把<br/>替换成\n
				 */
				var p = Ext.getCmp("modify-user-note");
				var s = p.getValue();
				// var re = new RegExp(s,"gm");
				s = s.replace(/<br\/>/g, "\r\n");
				p.setValue(s);
			},
			failure : function(form, action)
			{
				Ext.Msg.alert('Message', 'Load data  unsuccess!');
			}
		
		});
	}
	var win = new Ext.Window(
	{
		layout : 'fit',
		id : 'modify-user-win',
		width : 350,
		title : 'User Edit',
		height : 280,
		resizable : false,
		modal : true,
		closable : true,
		items : [ form ]
	
	});
	
	win.show();
}

function postManagerUser()
{
	var form = Ext.getCmp('modify-user-form');
	if (form)
	{
		if (!form.getForm().isValid())
			return;
		form.getForm().submit(
		{
			url : 'GetManagerUserData',
			method : 'POST',
			success : function(form, action)
			{
				//
				var grid = Ext.getCmp('manager-user-grid');
				if (grid)
					grid.getStore().load();
				
				var win = Ext.getCmp('modify-user-win');
				if (win)
					win.close();
				// win.close();
				//Ext.Msg.alert('Message', 'Save data success!');
			},
			failure : function(form, action)
			{
				Ext.Msg.alert('Message', action.result.errors.info);
			}
		
		});
	}
}

function createManagerUserGrid()
{
	var grid = new Ext.grid.GridPanel(
	{
		frame : true,
		id : 'manager-user-grid',
		cm : new Ext.grid.ColumnModel([
		{
			header : 'User',
			dataIndex : 'name',
			width : 180
		},
		{
			header : 'Password',
			dataIndex : 'password'
		},
		{
			header : 'Note',
			dataIndex : 'note',
			id : 'note'
		} ]),// cm
		autoExpandColumn : 'note',
		
		store : new Ext.data.Store(
		{
			proxy : new Ext.data.HttpProxy(
			{
				url : 'GetManagerUser'
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
				name : 'password'
			},
			{
				name : 'note'
			} ])
		}), // store
		
		tbar : new Ext.Toolbar([
		{
			// /text : 'New',
			icon : 'images/add2.png',
			handler : function()
			{
				
				modifyUser('');
			}
		}, '-',
		{
			// text : 'Edit',
			icon : 'images/edit.png',
			handler : function()
			{
				var g = Ext.getCmp('manager-user-grid');
				var sel = g.getSelectionModel();
				var row = sel.getSelected();
				if (!row)
				{
					Ext.Msg.alert('Information', 'No user selected!');
					return;
				}
				modifyUser(row.data.name);
			}
		}, '-',
		{
			icon : 'images/delete2.png',
			handler : function()
			{
				var g = Ext.getCmp('manager-user-grid');
				var sel = g.getSelectionModel();
				var row = sel.getSelected();
				if (!row)
				{
					Ext.Msg.alert('MSG','No user selected!');
					return;
				}
				
				Ext.Ajax.request(
				{
					url : 'UserService?Method=DeleteUser',
					params :
					{
						user : row.data.name
					},
					success : function(response)
					{
						g.getStore().load();
						
					},
					failure : function(response)
					{
						Ext.Msg.alert('Information', response.responseText.error);
					}
				});
			}
		}, '-',
		{
			icon : 'images/refresh.png',
			handler : function()
			{
				var g = Ext.getCmp('manager-user-grid');
				if (g)
					g.getStore().load();
			}
		} ])
	// tbar
	
	});
	
	grid.getStore().load();
	
	return grid;
	
}