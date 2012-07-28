function createLogGridPanel() {
	var logGrid = new Ext.grid.GridPanel({
		id : 'process_log_grid',
		cm : new Ext.grid.ColumnModel([ {
			header : 'User',
			dataIndex : 'username',
			width : 100
		}, {
			header : 'Session ID',
			dataIndex : 'sessionid',
			width : 150
		}, {
			header : 'Date',
			dateIndex : 'datetime1',
			width : 150
		}, {
			header : 'Action',
			dataIndex : 'action',
			width : 50
		}, {
			header : 'Reason',
			dataIndex : 'reason1',
			width : 120
		}, {
			header : 'Manager',
			dataIndex : 'virtualmanager',
			width : 100
		}, {
			header : 'Date',
			dataIndex : 'datetime2',
			width : 150
		}, {
			header : 'Result',
			dataIndex : 'result1',
			width : 50
		}, {
			header : 'Reason',
			dataIndex : 'reason2',
			width : 120
		}, {
			header : 'Docer',
			dataIndex : 'docer',
			width : 100
		}, {
			header : 'Date',
			dataIndex : 'datetime3',
			width : 150
		}, {
			header : 'Result',
			dataIndex : 'result2',
			width : 50
		}, {
			header : 'Reason',
			dataIndex : 'reason3',
			width : 120
		} ]),
		store : new Ext.data.Store({
			proxy : new Ext.data.HttpProxy({
				url : 'GetProcessLog'
			}),
			reader : new Ext.data.JsonReader({
				totalProperty : 'totalProperty',
				root : 'root'
			}, [ {
				name : 'username'
			}, {
				name : 'sessionid'
			}, {
				name : 'datetime1'
			}, {
				name : 'action'
			}, {
				name : 'reason1'
			}, {
				name : 'virtualmanager'
			}, {
				name : 'datetime2'
			}, {
				name : 'result1'
			}, {
				name : 'reason2'
			}, {
				name : 'docer'
			}, {
				name : 'datetime3'
			}, {
				name : 'result2'
			}, {
				name : 'reason3'
			} ])
		}),// store
		tbar : new Ext.Toolbar(
				[
						'-',
						'Start date:',
						new Ext.form.DateField({
							id : 'log_start_date',
							emptyText : 'Select start date.',
							format : 'Y-m-d'
						}),
						'End date:',
						new Ext.form.DateField({
							id : 'log_end_date',
							emptyText : 'Selec end date.',
							format : 'Y-m-d',
							value : new Date()
						}),
						'User:',
						new Ext.form.TextField({
							id : 'log_username'
						}),
						'Manager:',
						new Ext.form.TextField({
							id : 'log_manager'
						}),
						'Docer:',
						new Ext.form.TextField({
							id : 'log_docer'
						}),
						'-',
						{

							icon : 'images/find.png',
							handler : function() {
								var username = Ext.getCmp('log_username')
										.getValue();
								var manager = Ext.getCmp('log_manager')
										.getValue();
								var docer = Ext.getCmp('log_docer').getValue();
								var startdate = Ext.getCmp('log_start_date')
										.getValue();
								var enddate = Ext.getCmp('log_end_date')
										.getValue();

								var _start, _end;
								if (startdate == '')
									_start = '';
								else
									_start = (new Date(startdate)
											.format('Y-m-d'))
											+ " 00:00:00";

								if (enddate == '')
									_end = '';
								else
									_end = (new Date(enddate).format('Y-m-d'))
											+ " 23:59:59";

								Ext.getCmp('process_log_grid').getStore().load(
										{
											params : {
												username : username,
												manager : manager,
												docer : docer,
												startdate : _start,
												enddate : _end
											}
										});

							}
						},
						'-',
						{
							//下载查询结果
							icon : 'images/export1.png',
							handler : function() {
								var username = Ext.getCmp('log_username')
										.getValue();
								var manager = Ext.getCmp('log_manager')
										.getValue();
								var docer = Ext.getCmp('log_docer').getValue();
								var startdate = Ext.getCmp('log_start_date')
										.getValue();
								var enddate = Ext.getCmp('log_end_date')
										.getValue();

								var _start, _end;
								if (startdate == '')
									_start = '';
								else
									_start = (new Date(startdate)
											.format('Y-m-d'))
											+ " 00:00:00";

								if (enddate == '')
									_end = '';
								else
									_end = (new Date(enddate).format('Y-m-d'))
											+ " 23:59:59";
								
								window.open('DownloadProcessLog?username=' + username 
										+ '&manager=' + manager 
										+ '&docer=' + docer
										+ '&startdate=' + _start
										+ '&enddate=' + _end);

							}
						} ])

	});

	var startDateField = Ext.getCmp('log_start_date');
	if (startDateField) {
		var now = new Date();
		now.setDate(now.getDate() - 30);
		startDateField.setValue(now);
	}
	return logGrid;
}