package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/logs.js\"></script>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("<form name=\"form_logexcel\" id=\"form_logexcel\" method=\"post\" target=\"_blank\" action=\"admin/logs/excel\">\r\n");
      out.write("<input type=\"hidden\" name=\"startdate\" />\r\n");
      out.write("<input type=\"hidden\" name=\"enddate\" />\r\n");
      out.write("<input type=\"hidden\" name=\"username\" />\r\n");
      out.write("<input type=\"hidden\" name=\"manager\" />\r\n");
      out.write("<input type=\"hidden\" name=\"docer\" />\r\n");
      out.write("<input type=\"hidden\" name=\"page\" />\r\n");
      out.write("<input type=\"hidden\" name=\"rows\" />\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<table id=\"logs_list\" fit=\"true\" toolbar=\"#logs_tb\" ></table>\r\n");
      out.write("\r\n");
      out.write("<div id=\"logs_tb\" class=\"gtb\" >  \r\n");
      out.write("    <span>开始时间：</span>  \r\n");
      out.write("    <input class=\"easyui-datebox\" name=\"startdate\" class=\"tipt\" >  \r\n");
      out.write("    <span>结束时间：</span>  \r\n");
      out.write("   \t<input class=\"easyui-datebox\" name=\"enddate\" class=\"tipt\" >  \r\n");
      out.write("   \t<span>用户：</span>  \r\n");
      out.write("   \t<input class=\"tipt\" name=\"username\" >  \r\n");
      out.write("    <span>管理员：</span>  \r\n");
      out.write("   \t<input class=\"tipt\" name=\"manager\" >  \r\n");
      out.write("    <span>解密员：</span>  \r\n");
      out.write("   \t<input class=\"tipt\" name=\"docer\" >  \r\n");
      out.write("    <a class=\"easyui-linkbutton\" title=\"查询\" iconCls=\"icon-search\" plain=\"true\" onclick=\"doSearch()\" ></a>\r\n");
      out.write("    <a class=\"easyui-linkbutton\" title=\"导出\" iconCls=\"icon-excel\" plain=\"true\" onclick=\"exportExcel()\"></a>  \r\n");
      out.write("</div>  \r\n");
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
