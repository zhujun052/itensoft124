package org.apache.jsp.WEB_002dINF.admin.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class framework_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("    \r\n");
      out.write("\t$('#framework').tree({\r\n");
      out.write("\t    method:'get',\r\n");
      out.write("\t\tcheckbox: false,\r\n");
      out.write("\t\tlines:true,\r\n");
      out.write("\t\turl: 'admin/group/getTree?id=-1',\r\n");
      out.write("\t\tonClick:function(node){\r\n");
      out.write("\t\t\t$(this).tree('toggle', node.target);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tonBeforeLoad:function(node,param){\r\n");
      out.write("\t\t    if(node!=null){\r\n");
      out.write("\t\t\t\t$('#framework').tree(\"options\").url = \"admin/group/getTree\";\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tonClick:function(node){\r\n");
      out.write("\t\t\ttop.tabupdate('后台首页',{href:'admin/group/getGroupInfo?id='+node.id});\r\n");
      out.write("\t\t},\t\t\r\n");
      out.write("\t\tonContextMenu: function(e, node){\r\n");
      out.write("\t\t\t$('#framework').tree('select', node.target);\r\n");
      out.write("\t\t\t$('#framemenu').menu('show', {\r\n");
      out.write("\t\t\t\tleft: e.pageX,\r\n");
      out.write("\t\t\t\ttop: e.pageY\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<ul id=\"framework\"></ul>\r\n");
      out.write("<div id=\"framemenu\" class=\"easyui-menu\" style=\"width:120px;\">\r\n");
      out.write("\t<div onclick=\"append()\" iconCls=\"icon-add\">新增组</div>\r\n");
      out.write("\t<div onclick=\"remove()\" iconCls=\"icon-auth\">认证通过</div>\r\n");
      out.write("\t<div onclick=\"remove()\" iconCls=\"icon-reload\">刷新客户端策略</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div onclick=\"expand()\">扫描</div>\r\n");
      out.write("\t<div onclick=\"collapse()\">卸载客户端</div>\r\n");
      out.write("\t<div onclick=\"collapse()\">中止客户端</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div onclick=\"append()\" iconCls=\"icon-remove\">删除</div>\r\n");
      out.write("\t<div onclick=\"remove()\" iconCls=\"icon-edit\">重命名</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div onclick=\"collapse()\" >属性</div>\r\n");
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
