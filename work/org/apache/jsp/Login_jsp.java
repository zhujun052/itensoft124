package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.hibernate.Session;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML >\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>凤凰卫士.Web</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("#loading {\n");
      out.write("\theight: 373px;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("\tmargin-bottom: auto;\n");
      out.write("\tmargin-left: auto;\n");
      out.write("\tmargin-right: auto;\n");
      out.write("\twidth: 665px;\n");
      out.write("\tbackground: url(images/login.png);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginform {\n");
      out.write("\theight: 203px;\n");
      out.write("\twidth: 186px;\n");
      out.write("\tposition: relative;\n");
      out.write("\tleft: 78px;\n");
      out.write("\ttop: 120px;\n");
      out.write("\tmargin-top: 300px;\n");
      out.write("\tborder-top-width: 2px;\n");
      out.write("\tborder-right-width: 2px;\n");
      out.write("\tborder-bottom-width: 2px;\n");
      out.write("\tborder-left-width: 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginbox {\n");
      out.write("\tposition: relative !important;\n");
      out.write("\twidth: 120px;\n");
      out.write("\tborder-top-width: 1px;\n");
      out.write("\tborder-right-width: 1px;\n");
      out.write("\tborder-bottom-width: 1px;\n");
      out.write("\tborder-left-width: 1px;\n");
      out.write("\tmargin-left: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginbox #name {\n");
      out.write("\tposition: relative !important;\n");
      out.write("\ttop: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginbox #pass {\n");
      out.write("\tposition: relative !important;\n");
      out.write("\ttop: 45px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginlabel {\n");
      out.write("\tfont-family: Tahoma, Geneva, sans-serif;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".buttonstyle {\n");
      out.write("\tbackground-color: #A8D6F0;\n");
      out.write("\tpadding: 5px;\n");
      out.write("\tborder-top-width: 0px;\n");
      out.write("\tborder-right-width: 0px;\n");
      out.write("\tborder-bottom-width: 0px;\n");
      out.write("\tborder-left-width: 0px;\n");
      out.write("\tborder-top-style: dotted;\n");
      out.write("\tborder-right-style: dotted;\n");
      out.write("\tborder-bottom-style: dotted;\n");
      out.write("\tborder-left-style: dotted;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div id=\"loading\">\n");
      out.write("\t\t<div id=\"loginform\" class=\"loginform\" align=\"center\">\n");
      out.write("\t\t\t<form action=\"Dologin.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t<label class=\"loginlabel\" id=\"name\" for=\"name\">用户\n");
      out.write("\t\t\t\t</label> <input type=\"text\" name=\"name\" class=\"loginbox\" id=\"name\"><br>\n");
      out.write("\t\t\t\t<br> <label class=\"loginlabel\" id=\"name\" for=\"name\">密码 </label> <input type=\"password\" name=\"pass\"\n");
      out.write("\t\t\t\t\tclass=\"loginbox\" id=\"pass\"> <br>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<br> <input type=\"submit\" class=\"buttonstyle\" value=\"确定\">&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<input type=\"reset\" class=\"buttonstyle\" value=\"重置\">\n");
      out.write("\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
