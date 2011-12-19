/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var myToolbar = Ext.extend(Ext.Panel,
{
	region : 'north',
	autoScroll : true
});

var tb = new myToolbar(
{
	tbar : [
	{
		text : ' Group',
		scale : 'large',
		iconCls : 'add',
		iconAlign : 'top',
		handler : function()
		{

			var main_view = Ext.getCmp('main_view');
			main_view.removeAll(true);
			main_view.doLayout();
			var panel = new Ext.Panel(
			{
				layout : 'border',
				padding : '0 0 0 0',
				items : [ createMenuPanel(), createMainPanel() ]
			});
			main_view.add(panel);
			main_view.doLayout();
		}
	},
	{
		text : 'Manager',
		scale : 'large',
		iconCls : 'add',
		iconAlign : 'top',
		handler : function()
		{
			var main_view = Ext.getCmp('main_view');
			main_view.removeAll(true);
			main_view.add(new Ext.Panel(
			{
				layout : 'fit',
				padding : '0 0 0 0',
				items : [ createVirtualManagerGrid() ]
			}));
			main_view.doLayout();
		}
	},
	{
		text : 'Roles',
		scale : 'large',
		iconCls : 'add',
		iconAlign : 'top',
		handler : function()
		{
			var main_view = Ext.getCmp('main_view');
			main_view.removeAll(true);
			main_view.add(new Ext.Panel(
			{
				layout : 'border',
				padding : '0 0 0 0',
				items : [ createRoleTree(), createRolePropertyPanel() ]
			}));
			main_view.doLayout();
		}
	},
	{
		text : 'User',
		scale : 'large',
		iconCls : 'add',
		iconAlign : 'top',
		handler : function()
		{
			var main_view = Ext.getCmp('main_view');
			main_view.removeAll(true);
			main_view.add(new Ext.Panel(
			{
				layout : 'fit',
				padding : '0 0 0 0',
				items : [ createManagerUserGrid() ]
			}));
			main_view.doLayout();
		}
	},'-',
	{
		text : 'Logs',
		scale : 'large',
		iconCls : 'add',
		iconAlign : 'top',
		handler : function()
		{
			var main_view = Ext.getCmp('main_view');
			main_view.removeAll(true);
			main_view.add(new Ext.Panel(
			{
				layout : 'fit',
				padding : '0 0 0 0',
				items : [ createLogGridPanel() ]
			}));
			main_view.doLayout();
		}
	}  ]
});
