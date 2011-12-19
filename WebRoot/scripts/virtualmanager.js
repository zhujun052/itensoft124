function createModifyVirtualManagerAvaibleUserBar() {
	return new Ext.Toolbar([ '-', {
		// text : '<<',
		icon : 'images/navigate_left2.png',
		handler : function() {
			var store2 = Ext.getCmp('select-user-grid').getStore();
			if (store2.getCount() >= 8) {
				Ext.Msg.alert('Msg', '一个管理角色最多只能设置8个用户！');
				return;
			}
			var grid1 = Ext.getCmp('available-user-grid');
			var store1 = grid1.getStore();
			if (store1.getCount() == 0)
				return;
			/*
			 * var UserRecord = Ext.data.Record.create([ { name : 'name', type :
			 * 'string' } ]);
			 */
			for ( var i = 0; i < store1.getCount(); i++) {
				var rec1 = store1.getAt(i);
				store2.add(new UserRecord({
					name : rec1.get('name')
				}));

				// /如果选择的用户达到8人,那么从store1中删除store2有的数据
				if (store2.getCount() >= 8) {
					store2.each(function(record) {
						var name = record.get('name');
						var idx = store1.find('name', name);
						store1.remove(store1.getAt(idx));
					});

					return;
				}
			}

			// store1.removeAll();

		}
	}, '-', {
		// text : '<',
		icon : 'images/navigate_left.png',
		handler : function() {
			var store2 = Ext.getCmp('select-user-grid').getStore();
			if (store2.getCount() == 8) {
				Ext.Msg.alert('Msg', '一个管理角色最多只能设置8个用户！');
				return;
			}

			var grid1 = Ext.getCmp('available-user-grid');
			var store1 = grid1.getStore();
			if (store1.getCount() == 0)
				return;

			var row = grid1.getSelectionModel().getSelected();
			if (!row) {
				Ext.Msg.alert('MSG', 'No user selected!');
				return;
			}

			/*
			 * var UserRecord = Ext.data.Record.create([ { name : 'name', type :
			 * 'string' } ]);
			 */
			store2.add(new UserRecord({
				name : row.data.name
			}));

			var index = store1.find('name', row.data.name);

			store1.remove(store1.getAt(index));

		}
	}, '-', {
		xtype : 'tbfill'
	} ]);

}
function createVirtualManagerGridBar_RightToLeft(srcGridId, destGridId) {
	var bar = new Ext.Toolbar([ '-', {
		// text : "<<",
		icon : 'images/navigate_left2.png',
		handler : function() {
			var grid1 = Ext.getCmp(srcGridId);
			var store1 = grid1.getStore();
			if (store1.getCount() == 0)
				return;

			var store2 = Ext.getCmp(destGridId).getStore();

			store1.each(function(record) {
				store2.add(new UserRecord({
					name : record.get('name')
				}));
			});

			store1.removeAll();
		}
	}, '-', {
		// text : '<',
		icon : 'images/navigate_left.png',
		handler : function() {
			var grid1 = Ext.getCmp(srcGridId);
			var store1 = grid1.getStore();
			if (store1.getCount() == 0)
				return;

			var row = grid1.getSelectionModel().getSelected();
			if (!row) {
				Ext.Msg.alert('MSG', 'No user selected!');
				return;
			}

			var store2 = Ext.getCmp(destGridId).getStore();
			store2.add(new UserRecord({
				name : row.data.name
			}));

			var index = store1.find('name', row.data.name);

			store1.remove(store1.getAt(index));
		}
	}, '-', {
		xtype : 'tbfill'
	} ]);

	return bar;
}

function createVirtualManagerGridBar_LeftToRight(srcGridId, destGridId) {
	var bar = new Ext.Toolbar([ {
		xtype : 'tbfill'
	}, '-', {
		// text : '>',
		icon : 'images/navigate_right.png',
		handler : function() {
			var grid1 = Ext.getCmp(srcGridId);
			var store1 = grid1.getStore();
			if (store1.getCount() == 0)
				return;

			var row = grid1.getSelectionModel().getSelected();
			if (!row) {
				Ext.Msg.alert('MSG', 'No user selected!');
				return;
			}

			var store2 = Ext.getCmp(destGridId).getStore();
			store2.add(new UserRecord({
				name : row.data.name
			}));

			var index = store1.find('name', row.data.name);

			store1.remove(store1.getAt(index));
		}
	}, '-', {
		// text : '>>',
		icon : 'images/navigate_right2.png',
		handler : function() {
			var grid1 = Ext.getCmp(srcGridId);
			var store1 = grid1.getStore();
			if (store1.getCount() == 0)
				return;

			var store2 = Ext.getCmp(destGridId).getStore();

			store1.each(function(record) {
				store2.add(new UserRecord({
					name : record.get('name')
				}));
			});

			store1.removeAll();

		}
	}, '-' ]);
	return bar;
}

function createVirtualManager_Priority_GridBar_LeftToRight(srcGridId,
		destGridId) {
	var bar = new Ext.Toolbar([ {
		xtype : 'tbfill'
	}, '-', {
		// text : '>',
		icon : 'images/navigate_right.png',
		handler : function() {
			var grid1 = Ext.getCmp(srcGridId);
			var store1 = grid1.getStore();
			if (store1.getCount() == 0)
				return;

			var selectionModel = grid1.getSelectionModel();

			if (!selectionModel.hasSelection()) {
				Ext.Msg.alert('MSG', 'No user selected!');
				return;
			}

			var selectedCell = selectionModel.getSelectedCell();
			if (selectedCell) {
				var index = selectedCell[0];

				var row = store1.getAt(index);

				var store2 = Ext.getCmp(destGridId).getStore();
				store2.add(new UserRecord({
					name : row.data.name
				}));

				store1.remove(store1.getAt(index));
			}
		}
	}, '-', {
		// text : '>>',
		icon : 'images/navigate_right2.png',
		handler : function() {
			var grid1 = Ext.getCmp(srcGridId);
			var store1 = grid1.getStore();
			if (store1.getCount() == 0)
				return;

			var store2 = Ext.getCmp(destGridId).getStore();

			store1.each(function(record) {
				store2.add(new UserRecord({
					name : record.get('name')
				}));
			});

			store1.removeAll();

		}
	}, '-' ]);
	return bar;
}

function createGrid(id, title, region, url, vm, bar) {
	var store = new Ext.data.Store({
		proxy : new Ext.data.HttpProxy({
			url : url
		}),
		reader : new Ext.data.JsonReader({
			totalProperty : 'totalProperty',
			root : 'root'
		}, [ {
			name : 'name'
		} ])

	});
	store.load({
		params : {
			vm : vm
		}
	});

	var grid = new Ext.grid.GridPanel({
		id : id,
		region : region,
		width : 203,
		title : title,
		header : true,
		cm : new Ext.grid.ColumnModel([ {
			header : 'Name',
			dataIndex : 'name',
			id : 'name'
		} ]),
		autoExpandColumn : 'name',
		store : store,
		bbar : bar

	});

	return grid;
}

function createPriorityGrid(id, title, region, url, vm, bar) {
	var store = new Ext.data.Store({
		proxy : new Ext.data.HttpProxy({
			url : url
		}),
		reader : new Ext.data.JsonReader({
			totalProperty : 'totalProperty',
			root : 'root'
		}, [ {
			name : 'name'
		}, {
			name : 'priority'
		} ])

	});
	store.load({
		params : {
			vm : vm
		}
	});

	var grid = new Ext.grid.EditorGridPanel({
		id : id,
		region : region,
		width : 203,
		title : title,
		header : true,
		cm : new Ext.grid.ColumnModel([ {
			header : 'Name',
			dataIndex : 'name',
			id : 'name',
			width : 200
		}, {
			header : 'Priority',
			dataIndex : 'priority',
			width : 50,
			editor : new Ext.grid.GridEditor(new Ext.form.TextField())
		} ]),
		autoExpandColumn : 'name',
		store : store,
		bbar : bar

	});

	return grid;
}

function modifyVirtualManager(virtualManager) {
	var selectUserGrid = createPriorityGrid('select-user-grid',
			'Selected User', 'west', 'GetSelectManagerUser', virtualManager,
			createVirtualManager_Priority_GridBar_LeftToRight(
					'select-user-grid', 'available-user-grid'));

	var availableUserGrid = createGrid('available-user-grid', 'Available User',
			'center', 'GetAvailableUser', virtualManager,
			createModifyVirtualManagerAvaibleUserBar());

	var form = new Ext.form.FormPanel({
		buttonAlign : 'center',
		id : 'virtual-manager-modify',
		frame : true,
		layout : 'border',
		items : [ {
			region : 'north',
			layout : 'form',
			height : 30,
			items : [ {
				xtype : 'hidden',
				id : 'vm-user1',
				name : 'user1'

			}, {
				xtype : 'hidden',
				id : 'vm-user2',
				name : 'user2'

			}, {
				xtype : 'hidden',
				id : 'vm-user3',
				name : 'user3'

			}, {
				xtype : 'hidden',
				id : 'vm-user4',
				name : 'user4'

			}, {
				xtype : 'hidden',
				id : 'vm-user5',
				name : 'user5'

			}, {
				xtype : 'hidden',
				id : 'vm-user6',
				name : 'user6'

			}, {
				xtype : 'hidden',
				id : 'vm-user7',
				name : 'user7'

			}, {
				xtype : 'hidden',
				id : 'vm-user8',
				name : 'user8'

			}, {
				xtype : 'hidden',
				id : 'vm-priority1',
				name : 'priority1'
			}, {
				xtype : 'hidden',
				id : 'vm-priority2',
				name : 'priority2'
			}, {
				xtype : 'hidden',
				id : 'vm-priority3',
				name : 'priority3'
			}, {
				xtype : 'hidden',
				id : 'vm-priority4',
				name : 'priority4'
			}, {
				xtype : 'hidden',
				id : 'vm-priority5',
				name : 'priority5'
			}, {
				xtype : 'hidden',
				id : 'vm-priority6',
				name : 'priority6'
			}, {
				xtype : 'hidden',
				id : 'vm-priority7',
				name : 'priority7'
			}, {
				xtype : 'hidden',
				id : 'vm-priority8',
				name : 'priority8'
			}, {
				xtype : 'textfield',
				name : 'name',
				allowBlank : false,
				emptyText : 'Please input name',
				fieldLabel : 'Manager Name'
			} ]
		}, {
			region : 'center',
			layout : 'border',
			frame : true,
			items : [

			selectUserGrid, {
				region : 'center',
				layout : 'border',
				items : [ {
					region : 'west',
					width : 8
				}, availableUserGrid ]
			} ]

		} ],
		buttons : [
				{
					text : 'Ok',
					handler : function() {
						var store = Ext.getCmp('select-user-grid').getStore();
						var count = store.getCount();
						if (count > 8)
							count = 8;

						for ( var i = 1; i <= count; i++) {
							var cmpname = "vm-user" + i;
							var userComp = Ext.getCmp(cmpname);

							if (userComp)
								userComp.setValue(store.getAt(i - 1)
										.get('name'));

							var priorityName = "vm-priority" + i;
							var priorityComp = Ext.getCmp(priorityName);
							if (priorityComp)
								priorityComp.setValue(store.getAt(i - 1).get(
										'priority'));
						}

						var form = Ext.getCmp('virtual-manager-modify')
								.getForm();
						if (!form.isValid())
							return;
						form.submit({
							url : 'ModifyVirtualManager',
							method : 'POST',
							success : function(form, action) {
								//
								var grid = Ext.getCmp('virtual-manager-grid');
								if (grid)
									grid.getStore().load();

								var win = Ext
										.getCmp('modify-virtual-manager-win');
								if (win)
									win.close();

							},
							failure : function(form, action) {
								Ext.Msg.alert('Message',
										action.result.errors.info);
							}
						});
						// Ext.Msg.alert('Msg', store.getCount());
					}
				}, {
					text : 'Cancel',
					handler : function() {
						win.close();
					}
				} ]

	});

	if (virtualManager != "") {
		form.getForm().load({
			url : 'ModifyVirtualManager',
			params : {
				name : virtualManager
			},
			method : 'GET',
		});
	}

	var win = createVirtualManagerModifyWin('modify-virtual-manager-win',
			'Virtual Manager Edit', form);

	win.show();
}

function createVirtualManagerModifyWin(id, title, form) {
	var win = new Ext.Window({
		layout : 'fit',
		id : id,
		width : 450,
		height : 430,
		title : title,
		resizable : false,
		modal : true,
		closable : true,
		items : [ form ]
	});

	return win;
}

function modifyVirtualManagerGroup(groupCode, caption) {
	var selectGroupGrid = createGrid('select-manager-grid', 'Selected Manager',
			'west', 'GroupService?Method=GetSelectManager', groupCode,
			createVirtualManagerGridBar_LeftToRight('select-manager-grid',
					'available-manager-grid'));

	var availableGroupGrid = createGrid('available-manager-grid',
			'Available Manager', 'center',
			'GroupService?Method=GetAvailableManager', groupCode,
			createVirtualManagerGridBar_RightToLeft('available-manager-grid',
					'select-manager-grid'));

	var form = new Ext.form.FormPanel(
			{
				buttonAlign : 'center',
				id : 'virtual-manager-group-modify',
				frame : true,
				layout : 'border',
				items : [ {
					region : 'north',
					layout : 'form',
					height : 30,
					items : [ {
						xtype : 'hidden',
						id : 'selectuserlist',
						name : 'selectuserlist'
					}
					/*
					 * { xtype : 'textfield', name : 'name',
					 * 
					 * fieldLabel : 'Manager Name' }
					 */]
				}, {
					region : 'center',
					layout : 'border',
					frame : true,
					items : [ selectGroupGrid, {
						region : 'center',
						layout : 'border',
						items : [ {
							region : 'west',
							width : 8
						}, availableGroupGrid ]
					} ]

				} ],
				buttons : [
						{
							text : 'Ok',
							handler : function() {
								var store = Ext.getCmp('select-manager-grid')
										.getStore();
								var form = Ext.getCmp(
										'virtual-manager-group-modify')
										.getForm();

								var vRecords = store.data.items; // 得到grid中所有的記錄
								// grid中的記錄轉為json格式的資料
								var vCount = vRecords.length;
								if (vCount > 0) {
									var vDatas = '[';
									for ( var i = 0; i < vCount; i++) {
										vDatas += Ext.util.JSON
												.encode(vRecords[i].data)
												+ ',';
									}
									vDatas = vDatas
											.substr(0, vDatas.length - 1)
											+ ']';
									Ext.getCmp('selectuserlist').setValue(
											vDatas);
									// Ext.Msg.alert(vDatas);
								}

								if (!form.isValid())
									return;

								form
										.submit({
											url : 'GroupService?Method=postGroupManager',
											params : {
												gc : groupCode
											},
											method : 'POST',
											success : function(form, action) {
												var win = Ext
														.getCmp('modify-virtual-manager-group-win');
												if (win)
													win.close();

											},
											failure : function(form, action) {
												Ext.Msg
														.alert(
																'Message',
																action.result.info.error);
											}
										});

							}
						}, {
							text : 'Cancel',
							handler : function() {
								win.close();
							}
						} ]
			});

	var win = createVirtualManagerModifyWin('modify-virtual-manager-group-win',
			'Virtual Manager group Edit', form);

	win.show();
}

function modifyVirtualManagerDocer(virtualManager) {
	var selectGroupGrid = createGrid('select-docer-grid', 'Selected Docer',
			'west', 'ManagerService?Method=GetSelectManagerDocer',
			virtualManager, createVirtualManagerGridBar_LeftToRight(
					'select-docer-grid', 'available-docer-grid'));

	var availableGroupGrid = createGrid('available-docer-grid',
			'Available Docer', 'center',
			'ManagerService?Method=GetAvailableDocer', virtualManager,
			createVirtualManagerGridBar_RightToLeft('available-docer-grid',
					'select-docer-grid'));

	var form = new Ext.form.FormPanel(
			{
				buttonAlign : 'center',
				id : 'virtual-manager-docer-modify',
				frame : true,
				layout : 'border',
				items : [ {
					region : 'north',
					layout : 'form',
					height : 30,
					items : [ {
						xtype : 'hidden',
						id : 'selectuserlist',
						name : 'selectuserlist'
					}, {
						xtype : 'textfield',
						name : 'name',
						fieldLabel : 'Manager Name'
					} ]
				}, {
					region : 'center',
					layout : 'border',
					frame : true,
					items : [ selectGroupGrid, {
						region : 'center',
						layout : 'border',
						items : [ {
							region : 'west',
							width : 8
						}, availableGroupGrid ]
					} ]

				} ],
				buttons : [
						{
							text : 'Ok',
							handler : function() {
								var store = Ext.getCmp('select-docer-grid')
										.getStore();
								var form = Ext.getCmp(
										'virtual-manager-docer-modify')
										.getForm();

								var vRecords = store.data.items; // 得到grid中所有的記錄
								// grid中的記錄轉為json格式的資料
								var vCount = vRecords.length;
								if (vCount > 0) {
									var vDatas = '[';
									for ( var i = 0; i < vCount; i++) {
										vDatas += Ext.util.JSON
												.encode(vRecords[i].data)
												+ ',';
									}
									vDatas = vDatas
											.substr(0, vDatas.length - 1)
											+ ']';
									Ext.getCmp('selectuserlist').setValue(
											vDatas);
									// Ext.Msg.alert(vDatas);
								}

								if (!form.isValid())
									return;

								form
										.submit({
											url : 'ManagerService?Method=PostDocers',
											params : {
												vm : virtualManager
											},
											method : 'POST',
											success : function(form, action) {
												var win = Ext
														.getCmp('modify-virtual-manager-docer-win');
												if (win)
													win.close();

											},
											failure : function(form, action) {
												Ext.Msg
														.alert(
																'Message',
																action.result.info.message);
											}
										});

							}
						}, {
							text : 'Cancel',
							handler : function() {
								win.close();
							}
						} ]

			});

	if (virtualManager != "") {
		form.getForm().load({
			url : 'ModifyVirtualManager',
			params : {
				name : virtualManager
			},
			method : 'GET',
		});
	}

	var win = createVirtualManagerModifyWin('modify-virtual-manager-docer-win',
			'Virtual Manager Docer Edit', form);

	win.show();

}

function createVirtualManagerGrid() {
	var grid = new Ext.grid.GridPanel({
		frame : true,
		id : 'virtual-manager-grid',
		cm : new Ext.grid.ColumnModel([ {
			header : 'Virtual Manager',
			dataIndex : 'name',
			width : 180
		}, {
			header : 'User1',
			dataIndex : 'user1'
		}, {
			header : 'Priority1',
			dataIndex : 'priority1'
		}, {
			header : 'User2',
			dataIndex : 'user2'
		},  {
			header : 'Priority2',
			dataIndex : 'priority2'
		},{
			header : 'User3',
			dataIndex : 'user3'
		},  {
			header : 'Priority3',
			dataIndex : 'priority3'
		},{
			header : 'User4',
			dataIndex : 'user4'
		}, {
			header : 'Priority4',
			dataIndex : 'priority4'
		}, {
			header : 'User5',
			dataIndex : 'user5'
		},  {
			header : 'Priority5',
			dataIndex : 'priority5'
		},{
			header : 'User6',
			dataIndex : 'user6'
		}, {
			header : 'Priority6',
			dataIndex : 'priority6'
		}, {
			header : 'User7',
			dataIndex : 'user7'
		},  {
			header : 'Priority7',
			dataIndex : 'priority7'
		},{
			header : 'User8',
			dataIndex : 'user8'
		}, {
			header : 'Priority8',
			dataIndex : 'priority8'
		} ]),// cm

		store : new Ext.data.Store({
			proxy : new Ext.data.HttpProxy({
				url : 'GetVirtualManagers'
			}),
			reader : new Ext.data.JsonReader({
				totalProperty : 'totalProperty',
				root : 'root'
			}, [ {
				name : 'name'
			}, {
				name : 'user1'
			}, {
				name : 'priority1'
			},{
				name : 'user2'
			},{
				name : 'priority2'
			}, {
				name : 'user3'
			}, {
				name : 'priority3'
			} ,{
				name : 'user4'
			},{
				name : 'priority4'
			} ,{
				name : 'user5'
			},{
				name : 'priority5'
			} ,{
				name : 'user6'
			}, {
				name : 'priority6'
			},{
				name : 'user7'
			}, {
				name : 'priority7'
			},{
				name : 'user8'
			}, {
				name : 'priority8'
			} ])
		}), // store

		tbar : new Ext.Toolbar([
				{
					// /text : 'New',
					icon : 'images/add2.png',
					handler : function() {
						modifyVirtualManager('');
					}
				},
				'-',
				{
					// text : 'Edit',
					icon : 'images/edit.png',
					handler : function() {
						var g = Ext.getCmp('virtual-manager-grid');
						var sel = g.getSelectionModel();
						var row = sel.getSelected();
						if (!row) {
							Ext.Msg.alert('Information',
									'No virtual manager selected!');
							return;
						}
						// Ext.Msg.alert(row.data.name);

						modifyVirtualManager(row.data.name);
					}
				},
				{
					// docers
					icon : 'images/preferences.png',
					handler : function() {
						var g = Ext.getCmp('virtual-manager-grid');
						var sel = g.getSelectionModel();
						var row = sel.getSelected();
						if (!row) {
							Ext.Msg.alert('Information',
									'No virtual manager selected!');
							return;
						}

						modifyVirtualManagerDocer(row.data.name);
					}
				},
				'-',
				{
					// /text : 'Delete',
					icon : 'images/delete2.png',
					handler : function() {
						var g = Ext.getCmp('virtual-manager-grid');
						var sel = g.getSelectionModel();
						var row = sel.getSelected();
						if (!row) {
							Ext.Msg
									.alert('MSG',
											'No virtual manager selected!');
							return;
						}

						Ext.Ajax.request({
							url : 'DeleteManagerUser',
							params : {
								user : row.data.name
							},
							success : function(response) {
								g.getStore().load();
								// Ext.Msg.alert('Information',
								// response.responseText.info);
							},
							failure : function(response) {
								Ext.Msg.alert('Information',
										response.responseText.error);
							}
						});

					}
				}, '-', {
					icon : 'images/refresh.png',
					handler : function() {
						Ext.getCmp('virtual-manager-grid').getStore().load();
					}
				} ])
	// tbar
	});

	grid.getStore().load();

	return grid;
}