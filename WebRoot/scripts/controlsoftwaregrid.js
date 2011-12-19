encryptoModeArray = [ [ 0, '不加密' ],  [ 1, '修改加密' ], [ 2, '打开加密' ], [ 3, '智能加密' ] ];

var encryptoModeStore = new Ext.data.ArrayStore(
{
	id : id,
	fields : [ 'value', 'text' ],
	data : encryptoModeArray
});

function createControlSoftwareGrid(id)
{
	var cm = new Ext.grid.ColumnModel(
	{
		columns : [
		{
			hidden : true,
			header : 'SoftwareCode',
			dataIndex : 'softwarecode',
			readOnly : true
		},
		{
			header : 'Software',
			dataIndex : 'softwarename',
			readOnly : true
		},
		{
			header : 'Encrypto Mode',
			dataIndex : 'encryptomode',
			id : 'encryptomode',
			
			renderer : function(value)
			{
				var index = encryptoModeStore.find('value', value);
				var record = encryptoModeStore.getAt(index);
				return record ? record.get('text') : value;
			},
			
			editor : new Ext.form.ComboBox(
			{
				typeAhead : true,
				mode : 'local',
				forceSelection : true,
				triggerAction : 'all',
				selectOnFocus : true,
				store : encryptoModeStore,
				mode : 'local',
				valueField : 'value',
				displayField : 'text'
			})
		
		},
		{
			// editor : new Ext.form.Checkbox(),
			xtype : 'checkcolumn',
			header : 'Printable?',
			dataIndex : 'printable',
			width : 85
		} ]
	});
	
	var gridControlSoftware = new Ext.grid.EditorGridPanel(
	{
		id : 'controlsoftware' + id,
		clicksToEdit : 1,
		cm : cm,
		autoExpandColumn : 'encryptomode',
		store : new Ext.data.Store(
		{
			proxy : new Ext.data.HttpProxy(
			{
				url : 'getControlSoftware'
			}),
			reader : new Ext.data.JsonReader(
			{
				root : 'root'
			}, [
			{
				name : 'softwarecode',
				type : 'int',
			},
			{
				name : 'softwarename',
				type : 'string'
			},
			{
				name : 'encryptomode',
				type : 'int'
			},
			{
				name : 'printable',
				type : 'bool'
			} ])
		})
	});
	
	return gridControlSoftware;
}

function createSoftwarePanel()
{
	var softwarePanel = new Ext.TabPanel(
	{
		// height : 250,
		region : 'center',
		activeTab : 0,
		enableTabScroll : true,
		defaults :
		{
			autoScroll : true
		},
		items : [
		{
			title : '办公文档',
			layout : 'fit',
			items : [ createControlSoftwareGrid('1') ]
		},
		{
			title : '图纸设计',
			layout : 'fit',
			items : [ createControlSoftwareGrid('2') ]
		},
		{
			title : '程序开发',
			layout : 'fit',
			items : [ createControlSoftwareGrid('3') ]
		},
		{
			title : '图象处理',
			layout : 'fit',
			items : [ createControlSoftwareGrid('4') ]
		},
		{
			title : '多媒体处理',
			layout : 'fit',
			items : [ createControlSoftwareGrid('5') ]
		},
		{
			title : '专有软件',
			layout : 'fit',
			items : [ createControlSoftwareGrid('8') ]
		},
		{
			title : '自定义',
			layout : 'fit',
			items : [ createControlSoftwareGrid('9') ]
		} ]
	});
	return softwarePanel;
}

function submitSoftware(groupCode)
{
	var form = Ext.getCmp('csform');
	if (!form)
		return;
	
	var allDatas = '{';
	for ( var i = 0; i < 10; i++)
	{
		var grid = Ext.getCmp('controlsoftware' + i);
		if (!grid)
			continue;
		
		var records = grid.getStore().data.items;
		var length = records.length;
		if (length == 0)
			continue;
		var datas = '[';
		for ( var j = 0; j < length; j++)
		{
			datas += Ext.util.JSON.encode(records[j].data) + ',';
		}
		datas = '\"' + i + '\":' + datas.substring(0, datas.length - 1) + '],';
		
		allDatas += datas;
	}
	allDatas = allDatas.substring(0, allDatas.length - 1) + '}';
	var hidden = Ext.getCmp('cs');
	if (!hidden)
		return;
	
	hidden.setValue(allDatas);
	form.getForm().submit(
	{
		url : 'GroupService?Method=postControlSoftware&gc=' + groupCode,
		method : 'POST',
		waitTitle : 'Information',// 标题
		waitMsg : 'Posting data, please wait...',
		success : function(form, action)
		{
			var win = Ext.getCmp('cswin');
			if (win)
				win.close();
		},
		failer : function(form, action)
		{
			Ext.Msg.alert('Message', action.result.info.error);
		}
	});
	
	// Ext.Msg.alert('Msg', allDatas);
	
}

function createControlSoftwareWin(groupCode, caption)
{
	var buttons = [
	{
		text : 'Ok',
		handler : function()
		{
			submitSoftware(groupCode);
		}
	},
	{
		text : 'Cancel',
		handler : function()
		{
			win.close();
		}
	} ];
	
	var form = new Ext.form.FormPanel(
	{
		buttonAlign : 'center',
		frame : true,
		id : 'csform',
		layout : 'border',
		buttons : buttons
	});
	
	var hiddenPanel = new Ext.Panel(
	{
		region : 'north',
		height : 0,
		items : [
		{
			xtype : 'hidden',
			name : 'cs',
			id : 'cs'
		} ]
	});
	
	form.add(hiddenPanel);
	form.add(createSoftwarePanel());
	form.doLayout();
	
	for ( var i = 1; i < 10; i++)
	{
		var gridName = 'controlsoftware' + i;
		var grid = Ext.getCmp(gridName);
		if (grid)
		{
			grid.getStore().load(
			{
				params :
				{
					gc : groupCode,
					pc : i
				}
			});
		}
	}
	
	var win = new Ext.Window(
	{
		layout : 'fit',
		width : 400,
		height : 430,
		id : 'cswin',
		resizable : false,
		modal : true,
		closable : true,
		items : [ form ]
	});
	
	win.setTitle(caption);
	win.show();
}