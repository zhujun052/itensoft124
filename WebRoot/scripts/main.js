/// <reference path="f:\vswd-ext_2.0.2.js" />
Ext.onReady(function() {
	var viewport = new Ext.Viewport({
		layout : 'border',
		items : [ tb, new Ext.Panel({
			region : 'center',
			frame : true,
			///html : 'hello',
			layout : 'fit',
			padding : '0 0 0 0',
			id : 'main_view',
			items : [ new Ext.Panel({
				layout : 'border',
				padding : '0 0 0 0',
				items : [ createMenuPanel(), createMainPanel() ]
			}) ]
		}) ]
	});

	viewport.doLayout();

});