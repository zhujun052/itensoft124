package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class virtualmanager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/admin/common/config.jsp");
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
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/virtualmanager.js\"></script>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"hidden\">\r\n");
      out.write("<div id=\"virtualmanager_edit\" style=\"width:500px;height:385px\" iconCls=\"icon-save\" class=\"easyui-window\" ");
      out.print(win_topbar );
      out.write(" title=\"审批员添加\">\r\n");
      out.write("\t\t\t<div region=\"center\" border=\"false\" class=\"bdcenter\">\r\n");
      out.write("\t\t\t\t<form method=\"post\" id=\"form_virtualmanager_add\" >\r\n");
      out.write("\t\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"edittd\">审批名称：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"name\" required=\"true\" validType=\"length[1,50]\"  /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table style=\"width:100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"50%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table id=\"tab_vmselect_add\"></table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td  valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table id=\"tab_vmall_add\"></table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"virtualmanager_add()\">添加</a> <a\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"closeWin('virtualmanager_edit')\">取消</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<table id=\"virtualmanager_list\" fit=\"true\"></table>\r\n");
      out.write("\r\n");
      out.write("</div>");
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
