var IdentityRecord = Ext.data.Record.create([{
	name:'code',
	type:'string'
},{
	name:'name',
	type:'string'
}]);

function createRecver(groupCode){
	var availableStore = new Ext.data.ArrayStore({
		url:'servlet/CertService?Method=getAvailableRecverList&groupcode=' + groupCode,
		fields:['code','name' ]
	});
	
	availableStore.load();
	
	var selectedStore = new Ext.data.ArrayStore({
		url:'servlet/CertService?Method=getSelectedRecverList&groupcode=' + groupCode,
		fields:['code','name']
	});
	
	selectedStore.load();
	
	var availableCm = new Ext.grid.ColumnModel([{
		header:'code',
		dataIndex:'code',
		hidden: true
	},{
		header:'Identity',
		dataIndex:'name'			
	}]);
	
	var availableGrid = new Ext.grid.GridPanel({
		store: availableStore,
		width:203,
		cm: availableCm,
		id: 'recver_avaliablegrid',
		bbar:new Ext.Toolbar([{
			//<
			icon:'images/navigate_left.png',
			handler:function(){
				if(availableStore.getCount() == 0)
					return ;
				
				var row = availableGrid.getSelectionModel().getSelected();
				if (!row) {
					Ext.Msg.alert('MSG', 'No record selected!');
					return;
				}
				
				selectedStore.add(new IdentityRecord({
					code:row.data.code,
					name:row.data.name
				}));
				
				var index = availableStore.find('code', row.data.code);
				availableStore.remove(availableStore.getAt(index));
				
			}
		},{
			//<<
			icon:'images/navigate_left2.png',
			handler:function(){
				if(availableStore.getCount() == 0)
					return ;
				
				availableStore.each(function(rec){
					selectedStore.add(new IdentityRecord({
						code:rec.get('code'),
						name:rec.get('name')
					}));
				});
				
				
				availableStore.removeAll();
								
			} 
		},{
			xtype:'tbfill'
		}])
	});
	
	var selectedcm = new Ext.grid.ColumnModel([{
		header:'code',
		dataIndex:'code',
		hidden:true
	},{
		header:'Identity',
		dataIndex:'name'
	}]);
	
	var selectedGrid = new Ext.grid.GridPanel({
		store:selectedStore,
		width:203,
		cm:selectedcm,
		id:'recver_selectedgrid',
		bbar:new Ext.Toolbar([{
			xtype:'tbfill',
		},{
			//>>
			icon:'images/navigate_right2.png',
			handler:function(){
				if(selectedStore.getCount == 0)
					return;
				
				selectedStore.each(function(record){
					availableStore.add(new IdentityRecord({
						code:record.get('code'),
						name:record.get('name')
					}));					
				});
				
				selectedStore.removeAll();
				
			}
		},{
			//>
			icon:'images/navigate_right.png',
			handler:function(){
				if(selectedStore.getCount == 0)
					return;
				
				var row = selectedGrid.getSelectionModel().getSelected();
				if (!row) {
					Ext.Msg.alert('MSG', 'No record selected!');
					return;
				}
				
				availableStore.add(new IdentityRecord({
					code:row.data.code,
					name:row.data.name
				}));
				
				var index = selectedStore.find('code',row.data.code);
				selectedStore.remove(selectedStore.getAt(index));
				
			}
		}])
	});
	
	var pnl = new Ext.Panel({
		layout:'border',
		frame:true,
		region:'center',
		items:[{
			region:'west',
			title:'Selected',
			width: 203,
			margins:'0 5 0 0',
			layout:'fit',
			items:[selectedGrid]
		},{
			region:'center',
			title:'Available',
			layout:'fit',
			margins:'0 0 0 5',
			items:[availableGrid]
		}]
	});
	
	var form = new Ext.form.FormPanel({
		buttonAlign:'center',
		layout:'border',
		id:'recverform',
		frame: true,
		items:[{
			region:'north',
			items:[{
						xtype:'hidden',
						name:'selectedlist',
						id:'selectedlist'
					}]
				}, pnl],
		buttons:[{
			text:'OK',
			handler:function(){
				var vRecords = selectedStore.data.items;
				var vCount = vRecords.length;
				if(vCount > 0){
					var vDatas = '[';
					for(var i = 0 ; i < vCount; i++){
						vDatas += Ext.util.JSON.encode(vRecords[i].data) +',';
					}
				
					vDatas = vDatas.substr(0, vDatas.length - 1)+ ']';
					Ext.getCmp('selectedlist').setValue(vDatas);
				}
				var form = Ext.getCmp('recverform').getForm();
				if(!form.isValid())
					return;
				
				form.submit({
					url : 'servlet/CertService?Method=PostRecver',
					params:{
						groupcode : groupCode
					},
					method : 'POST',
					success : function(form, action) {
						win.close();
					},
					failure : function(form, action) {
						Ext.Msg.alert('Message',action.result.msg);
					}
				});			
			}
		},{
			text:'Cancel',
			handler:function(){
				win.close();				
			}
		}]
	});
	
	var win = new Ext.Window({
		layout : 'fit',
		//id : id,
		width : 450,
		height : 430,
		title : 'Recver',
		resizable : false,
		modal : true,
		closable : true,
		items:[form]
		
	});
	
	win.show();
}

function createIdentity(groupCode){
	var availableStore = new Ext.data.ArrayStore({
		url:'servlet/CertService?Method=getAvailableIdentityList&groupcode=' + groupCode,
		fields:['code','name' ]
	});
	
	availableStore.load();
	
	var selectedStore = new Ext.data.ArrayStore({
		url:'servlet/CertService?Method=getSelectedIdentityList&groupcode=' + groupCode,
		fields:['code','name']
	});
	
	selectedStore.load();
	
	var availableCm = new Ext.grid.ColumnModel([{
		header:'code',
		dataIndex:'code',
		hidden: true
	},{
		header:'Identity',
		dataIndex:'name'			
	}]);
	
	var availableGrid = new Ext.grid.GridPanel({
		store: availableStore,
		cm: availableCm,
		id: 'identity_avaliablegrid',
		bbar:new Ext.Toolbar([{
			//<
			icon:'images/navigate_left.png',
			handler:function(){
				if(availableStore.getCount() == 0)
					return ;
				
				var row = availableGrid.getSelectionModel().getSelected();
				if (!row) {
					Ext.Msg.alert('MSG', 'No record selected!');
					return;
				}
				
				selectedStore.add(new IdentityRecord({
					code:row.data.code,
					name:row.data.name
				}));
				
				var index = availableStore.find('code', row.data.code);
				availableStore.remove(availableStore.getAt(index));
				
			}
		},{
			//<<
			icon:'images/navigate_left2.png',
			handler:function(){
				if(availableStore.getCount() == 0)
					return ;
				
				availableStore.each(function(rec){
					selectedStore.add(new IdentityRecord({
						code:rec.get('code'),
						name:rec.get('name')
					}));
				});
				
				availableStore.removeAll();
								
			} 
		},{
			xtype:'tbfill'
		}])
	});
	
	var selectedcm = new Ext.grid.ColumnModel([{
		header:'code',
		dataIndex:'code',
		hidden:true
	},{
		header:'Identity',
		dataIndex:'name'
	}]);
	
	var selectedGrid = new Ext.grid.GridPanel({
		store:selectedStore,
		cm:selectedcm,
		id:'identity_selectedgrid',
		bbar:new Ext.Toolbar([{
			xtype:'tbfill',
		},{
			//>>
			icon:'images/navigate_right2.png',
			handler:function(){
				if(selectedStore.getCount == 0)
					return;
				
				selectedStore.each(function(record){
					availableStore.add(new IdentityRecord({
						code:record.get('code'),
						name:record.get('name')
					}));					
				});
				
				selectedStore.removeAll();
				
			}
		},{
			//>
			icon:'images/navigate_right.png',
			handler:function(){
				if(selectedStore.getCount == 0)
					return;
				
				var row = selectedGrid.getSelectionModel().getSelected();
				if (!row) {
					Ext.Msg.alert('MSG', 'No record selected!');
					return;
				}
				
				availableStore.add(new IdentityRecord({
					code:row.data.code,
					name:row.data.name
				}));
				
				var index = selectedStore.find('code',row.data.code);
				selectedStore.remove(selectedStore.getAt(index));
				
			}
		}])
	});
	
	var pnl = new Ext.Panel({
		layout:'border',
		frame:true,
		region:'center',
		items:[{
			region:'west',
			title:'Selected',
			width: 203,
			margins:'0 5 0 0',
			layout:'fit',
			items:[selectedGrid]
		},{
			region:'center',
			title:'Available',
			layout:'fit',
			margins:'0 0 0 5',
			items:[availableGrid]
		}]
	});
	
	var form = new Ext.form.FormPanel({
		buttonAlign:'center',
		layout:'border',
		frame: true,
		items:[{
			region:'north',
			items:[{
						xtype:'hidden',
						name:'selectedlist',
						id:'selectedlist'
					}]
				}, pnl],
		buttons:[{
			text:'OK',
			handler:function(){
				var vRecords = selectedStore.data.items;
				var vCount = vRecords.length;
				if(vCount > 0){
					var vDatas = '[';
					for(var i = 0 ; i < vCount; i++){
						vDatas += Ext.util.JSON.encode(vRecords[i].data) +',';
					}
				
					vDatas = vDatas.substr(0, vDatas.length - 1)+ ']';
					Ext.getCmp('selectedlist').setValue(vDatas);
				}
				
				if(!form.getForm().isValid())
					return;
				
				form.getForm().submit({
					url:'servlet/CertService?Method=PostIdentity',
					params:{
						groupcode : groupCode
					},
					method:'POST',
					success:function(form, action){
						win.close();
					},
					failure: function(form, action){
						Ext.Msg.alert('Error',action.result.msg);
					}
				});
			}
		},{
			text:'Cancel',
			handler:function(){
				win.close();				
			}
		}]
	});
	
	
	var win = new Ext.Window({
		layout : 'fit',
		//id : '',
		width : 450,
		height : 430,
		title : 'Identity',
		resizable : false,
		modal : true,
		closable : true,
		items:[form]
		
	});
	
	win.show();	
}