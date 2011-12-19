$(function() {
    $('#tabs').tabs({
	onClose : function() {
	    // 消除多余的window
	    $("#fancybox-wrap").nextAll("div").remove();
	},
	onOpen : function() {
	    // 消除多余的window
	    $("#fancybox-wrap").nextAll("div").remove();
	}
    });
    tab('后台首页', 'admin/webmaster/myhomepage');
    menuList('admin/webmaster/framework');
});