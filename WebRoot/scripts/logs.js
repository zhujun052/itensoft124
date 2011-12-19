function createCliengLogGrid()
{
	var clientLogGrid = new Ext.grid.GridPanel(
	{
		id : 'client-log-grid',
		cm : new Ext.grid.ColumnModel([
		{
			header : '时间',
			dataIndex : 'DateTime',
			width : 180
		},
		{
			header : '用户',
			dataIndex : 'UserName'
		},
		{
			header : '动作',
			dataIndex : 'Action'
		},
		{
			header : '文件名',
			dateIndex : 'FileName',
			id : 'Note'
		} ]),// cm

		// sm: new Ext.grid.CheckboxSelectionModel(),
		autoExpandColumn : 'Note',

		store : new Ext.data.Store(
		{
			proxy : new Ext.data.HttpProxy(
			{
				url : 'getLog?logtype=client'
			}),
			reader : new Ext.data.JsonReader(
			{
				totalProperty : 'totalProperty',
				root : 'root'
			}, [
			{
				name : 'DateTime'
			},
			{
				name : 'UserName'
			},
			{
				name : 'Action'
			},
			{
				name : 'Note'
			} ])
		}), // store

		tbar : createQueryToolbar('client-log-user', 'client-start-date',
				'client-end-date', 'client-log-grid')

	});

	return clientLogGrid;

}

function createManagerLogGrid()
{
	var managerLogGrid = new Ext.grid.GridPanel(
	{
		id : 'manager-log-grid',
		cm : new Ext.grid.ColumnModel([
		{
			header : '时间',
			dataIndex : 'DateTime',
			width : 180
		},
		{
			header : '管理者',
			dataIndex : 'Manager'
		},
		{
			header : '用户',
			dataIndex : 'UserName'
		},
		{
			header : '动作',
			dataIndex : 'Action'
		},
		{
			header : '文件名',
			dataIndex : 'FileName',
			width : 250
		},
		{
			header : '理由',
			dateIndex : 'Reason',
			id : 'Reason'
		} ]),
		autoExpandColumn : 'Reason',

		store : new Ext.data.Store(
		{
			proxy : new Ext.data.HttpProxy(
			{
				// url : 'getManagerLog.jsp'
				url : 'getLog?logtype=manager'
			}),
			reader : new Ext.data.JsonReader(
			{
				// totalProperty : 'totalProperty',
				root : 'root'
			}, [
			{
				name : 'DateTime'
			},
			{
				name : 'Manager'
			},
			{
				name : 'UserName'
			},
			{
				name : 'Action'
			},
			{
				name : 'FileName'
			},
			{
				name : 'Reason'
			} ])
		}), // store

		tbar : createQueryToolbar('manager-log-user', 'manager-start-date',
				'manager-end-date', 'manager-log-grid')
	// tbar
	});

	return managerLogGrid;
}

function createServerLogGrid()
{
	var serverLogGrid = new Ext.grid.GridPanel(
	{
		id : 'server-log-grid',
		cm : new Ext.grid.ColumnModel([
		{
			header : '时间',
			width : 180,
			dataIndex : 'DateTime'
		},
		{
			header : '用户',
			dataIndex : 'UserName'
		},
		{
			header : '事件',
			dataIndex : 'Event'
		},
		{
			header : '备注',
			dateIndex : 'Note',
			id : 'Note'
		} ]),// cm
		autoExpandColumn : 'Note',
		store : new Ext.data.Store(
		{
			proxy : new Ext.data.HttpProxy(
			{
				// url : 'getServerLog.jsp'
				url : 'getLog?logtype=server'
			}),
			reader : new Ext.data.JsonReader(
			{
				root : 'root'
			}, [
			{
				name : 'DateTime'
			},
			{
				name : 'UserName'
			},
			{
				name : 'Event'
			},
			{
				name : 'Note'
			} ])
		}), // store

		tbar : createQueryToolbar('server-log-user', 'server-start-date',
				'server-end-date', 'server-log-grid')
	});

	return serverLogGrid;
}
function createQueryToolbar(userComp, startDateComp, endDateComp, grid)
{
	var toolbar = new Ext.Toolbar([
			'-',
			'Start date：',
			new Ext.form.DateField(
			{
				id : startDateComp,
				//fieldLabel : '开始日期',
				emptyText : 'Select start date',
				format : 'Y-m-d'
			}),
			'End date：',
			new Ext.form.DateField(
			{
				id : endDateComp,
				//fieldLabel : '截止日期',
				emptyText : 'Select end date',
				format : 'Y-m-d'
			}),
			'-',
			'User name：',
			new Ext.form.TextField(
			{
				id : userComp
			}),
			'-',
			{
				// text : '查询',
				icon : 'images/find.png',
				handler : function()
				{
					queryLog('server-log-user', 'server-start-date',
							'server-end-date', 'server-log-grid');
				}
			}, '-' ]);

	return toolbar;
}

function queryLog(userComp, startDateComp, endDateComp, grid)
{
	var user = Ext.getCmp(userComp).getValue();
	var startDate = Ext.getCmp(startDateComp).getValue();
	var endDate = Ext.getCmp(endDateComp).getValue();

	var _start, _end;
	if (startDate == '')
		_start = '';
	else
		_start = (new Date(startDate).format('Y-m-d')) + " 00:00:00";

	if (endDate == '')
		_end = '';
	else
		_end = (new Date(endDate).format('Y-m-d')) + " 23:59:59";

	Ext.getCmp(grid).getStore().load(
	{
		params :
		{
			uid : user,
			start : _start,
			end : _end
		}
	});
}

function createLogPanel()
{
	var panel = new Ext.TabPanel(
	{
		activeTab : 0,
		region : 'center',
		items : [
		{
			title : 'Client logs',
			layout : 'fit',
			items : [ createCliengLogGrid() ]
		},
		{
			title : 'Manager logs',
			layout : 'fit',
			items : [ createManagerLogGrid() ]
		},
		{
			title : 'Server logs',
			layout : 'fit',
			items : [ createServerLogGrid() ]
		} ]
	});
	return panel;
}