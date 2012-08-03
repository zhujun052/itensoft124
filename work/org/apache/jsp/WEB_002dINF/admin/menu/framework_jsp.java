package org.apache.jsp.WEB_002dINF.admin.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class framework_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/admin/menu/../common/config.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

String win_topbar = "closed=\"true\" modal=\"true\" collapsible=\"false\"  draggable=\"false\" minimizable=\"false\" maximizable=\"false\" inline=\"false\" resizable=\"false\"";

      out.write("    ");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/menu/framework.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function() {\r\n");
      out.write("\r\n");
      out.write("\t$('#framework')\r\n");
      out.write("\t\t.tree(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t    method : 'get',\r\n");
      out.write("\t\t\t    checkbox : false,\r\n");
      out.write("\t\t\t    lines : true,\r\n");
      out.write("\t\t\t    url : 'admin/group/getTree?id=-1',\r\n");
      out.write("\t\t\t    onClick : function(node) {\r\n");
      out.write("\t\t\t\t$(this).tree('toggle', node.target);\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    onBeforeLoad : function(node, param) {\r\n");
      out.write("\t\t\t\tif (node != null) {\r\n");
      out.write("\t\t\t\t    $('#framework').tree(\"options\").url = \"admin/group/getTree\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    onClick : function(node) {\r\n");
      out.write("\t\t\t\tframe_id = node.id;\r\n");
      out.write("\t\t\t\ttop.tabupdate('后台首页', {\r\n");
      out.write("\t\t\t\t    href : 'admin/group/getGroupInfo?id='\r\n");
      out.write("\t\t\t\t\t    + node.id\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    onContextMenu : function(e, node) {\r\n");
      out.write("\t\t\t\t$('#framework').tree('select', node.target);\r\n");
      out.write("\t\t\t\t$('#framemenu').menu('show', {\r\n");
      out.write("\t\t\t\t    left : e.pageX,\r\n");
      out.write("\t\t\t\t    top : e.pageY\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    onLoadSuccess:function(node, data){\r\n");
      out.write("\t\t\t\t\tvar node = $('#framework').tree('getRoot');\r\n");
      out.write("\t\t\t\t\t$('#framework').tree('expand',node.target);\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t});\r\n");
      out.write("    });\r\n");
      out.write("    function refresh() {\r\n");
      out.write("\t\tvar node = $('#framework').tree('getRoot');\r\n");
      out.write("\t\t$('#framework').tree('reload',node.target);\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t<a href=\"javascript:void(0)\" style=\"float: left;\"\r\n");
      out.write("\t\tclass=\"l-btn l-btn-plain\" id=\"btnadd\"><span class=\"l-btn-left\"><span\r\n");
      out.write("\t\t\tclass=\"l-btn-text icon-reload\" style=\"padding-left: 20px;\"\r\n");
      out.write("\t\t\tonclick=\"refresh()\">刷新</span></span></a>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"hidden\">\r\n");
      out.write("\t<div id=\"propset_win\" iconCls=\"icon-save\"\r\n");
      out.write("\t\tstyle=\"width: 500px; height: 450px;\" class=\"easyui-window\"\r\n");
      out.write("\t\t");
      out.print(win_topbar );
      out.write(" title=\"属性编辑\">\r\n");
      out.write("\t\t<div class=\"easyui-tabs\" style=\"height: 375px;\">\r\n");
      out.write("\t\t\t<div title=\"常规 \" class=\"p10\">\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" />从上层继承\r\n");
      out.write("\t\t\t\t<div class=\"easyui-tabs\">\r\n");
      out.write("\t\t\t\t\t<div title=\"一般\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" />U盘日志&nbsp;&nbsp; <input type=\"checkbox\" />打印日志&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" />使用黑名单&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<legend>离线使用:</legend>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" />在线使用（极进模式）<br> <input type=\"radio\" />在线使用（温和模式）<br>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" />允许离线使用<br> 有效时间：<input type=\"text\" /><br>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" />需要离线加密狗\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\tExplorer需预览的文件：\r\n");
      out.write("\t\t\t\t\t\t<textarea class=\"textborder\" style=\"height: 60px; width: 435px;\">\r\n");
      out.write("           \t\t\t</textarea>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div title=\"设备控制\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" />禁止打印\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<legend>移动存储设备控制:</legend>\r\n");
      out.write("\t\t\t\t\t\t\t<table style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<legend>入：</legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" />允许<br> <input type=\"radio\" />禁止<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" />加密<br> <input type=\"radio\" />解密<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<legend>出：</legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" />允许<br> <input type=\"radio\" />禁止<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" />加密<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"受控软件\" class=\"p10\">\r\n");
      out.write("\t\t\t\t<div class=\"easyui-tabs\">\r\n");
      out.write("\t\t\t\t\t<div title=\"办公文档\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"soft_office\"></table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div title=\"图纸设计\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"soft_desig\"></table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div title=\"程序开发\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"soft_dev\"></table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div title=\"图像处理\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"soft_img\"></table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div title=\"多媒体处理\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"soft_medio\"></table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div title=\"专有软件\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"soft_spec\"></table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div title=\"自定义\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"soft_custom\"></table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"身份\" class=\"p10\">\r\n");
      out.write("\t\t\t\t<table style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 50%;\">\r\n");
      out.write("\t\t\t\t\t<table id=\"id_select\"></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 50%;\">\r\n");
      out.write("\t\t\t\t\t<table id=\"id_all\"></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"接收者\" class=\"p10\">\r\n");
      out.write("\t\t\t\t<table style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 50%;\">\r\n");
      out.write("\t\t\t\t\t<table id=\"receive_select\"></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 50%;\">\r\n");
      out.write("\t\t\t\t\t<table id=\"receive_all\"></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"审批人\" class=\"p10\">\r\n");
      out.write("\t\t\t\t<table style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 50%;\">\r\n");
      out.write("\t\t\t\t\t<table id=\"vm_select\"></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 50%;\">\r\n");
      out.write("\t\t\t\t\t<table id=\"vm_all\"></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\thref=\"javascript:void(0)\" onclick=\"addUser()\">编辑</a> <a\r\n");
      out.write("\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\t\thref=\"javascript:void(0)\" onclick=\"closeWin('user_add')\">取消</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<ul id=\"framework\"></ul>\r\n");
      out.write("<div id=\"framemenu\" class=\"easyui-menu\" style=\"width: 120px;\">\r\n");
      out.write("\t<div onclick=\"append()\" iconCls=\"icon-add\">新增组</div>\r\n");
      out.write("\t<div onclick=\"auth()\" iconCls=\"icon-auth\">认证通过</div>\r\n");
      out.write("\t<div onclick=\"remove()\" iconCls=\"icon-reload\">刷新客户端策略</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div onclick=\"expand()\">扫描</div>\r\n");
      out.write("\t<div onclick=\"collapse()\">卸载客户端</div>\r\n");
      out.write("\t<div onclick=\"collapse()\">中止客户端</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div onclick=\"deleteGroup()\" iconCls=\"icon-remove\">删除</div>\r\n");
      out.write("\t<div onclick=\"remove()\" iconCls=\"icon-edit\">重命名</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div onclick=\"propset()\">属性</div>\r\n");
      out.write("</div>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
