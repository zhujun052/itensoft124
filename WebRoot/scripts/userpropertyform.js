function ShowUserPropertyWin(userid, caption) {
	var form = createPropertyForm();

	form.getForm().load({
		waitMsg : 'Loading, please wait',
		waitTitle : 'Message',
		url : 'getUserProperty',
		params : {
			userid : userid
		},
		method : 'GET',
		success : function(form, action) {
			/**
			 * TextArea中的换行，在返回json数据含有\n时会出错，所以在返回时把\n替换成<br/>， 返回后把<br/>替换成\n
			 */
			var s = Ext.getCmp("explorerpreview").getValue();
			s = s.replace(/<br\/>/, "\n");
			p.setValue(s);
		},
		failure : function(form, action) {
			Ext.Msg.alert('Message', 'Load data  unsuccess!');
		}
	});

	var win = new Ext.Window({
		layout : 'fit',
		width : 700,
		height : 500,
		id : 'userpropertywin',
		resizable : false,
		modal : true,
		closable : true,
		items : [ form ]
	});

	win.setTitle(caption);
	win.show();
}

function createPropertyForm() {
	var logGroup = {
		bodyStyle : 'padding:5px 5px 5px 15px;',
		items : {
			xtype : 'checkboxgroup',
			columns : 2,
			items : [ {
				boxLabel : 'Log USB Storage',
				name : 'udisklog'
			}, {
				boxLabel : 'Log print',
				name : 'printlog'
			} ]
		}
	};

	var offlineModel = {
		bodyStyle : 'padding:5px 10px 5px 10px;',
		items : [ {
			xtype : 'fieldset',
			title : 'Offline',
			labelWidth : 5,
			items : [ {
				xtype : 'radiogroup',
				name : 'onlinemodel',
				columns : 1,
				items : [ {
					boxLabel : 'Online(温和)',
					name : 'onlinemodel',
					inputValue : -1
				}, {
					boxLabel : 'Online(极进)',
					name : 'onlinemodel',
					inputValue : -2
				}, {
					boxLabel : 'Offline',
					name : 'onlinemodel',
					inputValue : 0
				} ]
			}, {
				bodyStyle : 'padding:5px 0 0 30px;',
				layout : 'form',
				labelWidth : 80,
				items : [ {
					xtype : 'textfield',
					name : 'validatetime',
					fieldLabel : 'Available time'
				// width: 200
				// anchor : '80%'
				} ]
			}, {
				bodyStyle : 'padding:5px 0 0 30px;',
				items : [ {
					xtype : 'checkboxgroup',
					items : [ {
						columnWidth : .4,
						items : [
						/*
						 * { boxLabel : 'Available time', name :
						 * 'chk_availabletime' },
						 */
						{
							boxLabel : 'Need USB key',
							name : 'usbkey'
						} ]
					}
					/*
					 * , { columnWidth : .6, items : [ { xtype : 'textfield',
					 * name : 'validatetime', anchor : '80%' } ] }
					 */]
				} ]
			} ]
		} ]
	};

	var explorerPreview = {
		bodyStyle : 'padding:0 10px 10px 10px;',
		labelAlign : 'top',
		layout : 'form',
		items : [ {
			xtype : 'textarea',
			height : 165,
			fieldLabel : 'Explorer preview',
			id : 'explorerpreview',
			name : 'explorerpreview',
			anchor : '100%'
		} ]

	};

	var usbStorage = [ {
		bodyStyle : 'padding-right:5px;',
		items : {
			xtype : 'fieldset',
			title : 'Input',
			autoHeight : true,
			labelWidth : 5,
			items : [ {
				xtype : 'radiogroup',
				name : 'usbin',
				columns : 1,
				items : [ {
					boxLabel : 'Enable',
					name : 'usbin',
					inputValue : 0
				}, {
					boxLabel : 'Disable',
					name : 'usbin',
					inputValue : 2
				}, {
					boxLabel : 'Encypto',
					name : 'usbin',
					inputValue : 1
				} ]
			} ]
		}
	}, {
		bodyStyle : 'padding-left:5px;',
		items : {
			xtype : 'fieldset',
			title : 'Output',
			autoHeight : true,
			labelWidth : 5,
			items : [ {
				xtype : 'radiogroup',
				name : 'usbout',
				columns : 1,
				items : [ {
					boxLabel : 'Enable',
					name : 'usbout',
					inputValue : 0
				}, {
					boxLabel : 'Disable',
					name : 'usbout',
					inputValue : 2
				}, {
					boxLabel : 'Encypto',
					name : 'usbout',
					inputValue : 1
				} ]
			} ]
		}
	} ];

	var hardwareTab = [ {
		bodyStyle : 'padding:5px 10px 5px 10px;',
		items : [ {
			xtype : 'checkbox',
			name : 'printcontroled',
			boxLabel : 'Print disable'
		} ]
	}, {
		bodyStyle : 'padding:10px 10px 0 10px;',
		items : [ {
			xtype : 'fieldset',
			title : 'Removable storage',
			layout : 'column',
			labelWidth : 5,
			defaults : {
				columnWidth : .5
			},
			items : usbStorage
		} ]
	} ];

	var advancedTab = [ {
		bodyStyle : 'padding:5px 10px 5px 10px;',
		defaultType : 'checkbox',
		layout : 'column',
		defaults : {
			columnWidth : .5
		},
		layoutConfig : {
			columns : 2
		},
		items : [ {
			name : 'printcontroledex',
			boxLabel : 'Virtual print controled.'
		}, {
			name : 'clipboardcontroled',
			boxLabel : 'Clipboard controled.'
		}, {
			name : 'dragdropcontroled',
			boxLabel : 'Drag drop controled.'
		}, {
			name : 'snapshotcontroled',
			boxLabel : 'Snapshot controled.'
		}, {
			name : 'olecontroled',
			boxLabel : 'OLE controled.'
		}, {
			name : 'overlayicon',
			boxLabel : 'Overlay icon.'
		} ]
	} ];

	var ftpPanel = {
		bodyStyle : 'padding: 5px 10px 0 10px',
		items : [ {
			xtype : 'fieldset',
			title : 'FTP',
			labelWidth : 75,
			items : [ {
				xtype : 'textfield',
				name : 'ftpaddress',
				fieldLabel : 'Address',
				anchor : '100%'
			}, {
				xtype : 'textfield',
				name : 'ftpuser',
				fieldLabel : 'User Name',
				anchor : '100%'
			}, {
				xtype : 'textfield',
				name : 'ftppass',
				fieldLabel : 'Password',
				anchor : '100%'
			} ]
		} ]
	};

	var form = new Ext.form.FormPanel({
		buttonAlign : 'center',
		frame : true,
		id : 'userpropertyform',
		items : [ {
			xtype : 'hidden',
			name : 'code'
		}, {
			bodyStyle : 'padding:0px 0 5px 10px;',
			items : {
				xtype : 'checkbox',
				name : 'inherited-from-parent',
				boxLabel : 'Inherited from parent'
			}
		}, {
			bodyStyle : 'padding:5px 5px 5px 5px;',
			layout : 'column',
			defaults : {
				columnWidth : .5
			},
			items : [ {
				bodyStyle : 'padding-right:5px;',
				items : [ logGroup, offlineModel, explorerPreview ]
			}, {
				bodyStyle : 'padding-left:5px;',
				items : [ {
					bodyStyle : 'padding-bottom:5px;',
					items : hardwareTab
				}, {
					bodyStyle : 'padding-top:5px;',
					items : advancedTab
				}, {
					bodyStyle : 'padding-top:0px;',
					items : [ ftpPanel ]
				} ]
			} ]
		} ],
		// items
		buttons : [ {
			text : 'Save',
			handler : submitProperty
		}, {
			text : 'Cancel',
			handler : function() {
				var win = Ext.getCmp('userpropertywin');
				if (win)
					win.close();
			}
		} ]
	});
	return form;
}

function submitProperty() {
	// Ext.Msg.alert('Submit values', propertyform.getForm().getValues(true));
	var form = Ext.getCmp('userpropertyform');
	if (!form)
		return;

	if (!form.getForm().isValid())
		return;
	form.getForm().submit({
		waitMsg : 'Submit data',
		waitTitle : 'Message',
		url : 'getUserProperty',
		method : 'POST',
		success : function(form, action) {
			// Ext.Msg.alert('Message', 'Save data success!');
			var win = Ext.getCmp('userpropertywin');
			if (win)
				win.close();
		},
		failure : function(form, action) {
			Ext.Msg.alert('Message', action.result.errors.info);
		}
	});
	// Ext.Msg.alert('Message', 'Submit');
}
