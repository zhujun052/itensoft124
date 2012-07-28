package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.itensoft.User;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/CheckLogin.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

	User loginAdmin = (User)request.getSession().getAttribute("loginAdmin");
	if(loginAdmin == null)
	  response.sendRedirect("Login.jsp");
	

      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>凤凰卫士.Web</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"scripts/ext-js/resources/css/ext-all.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"scripts/forum.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"scripts/itensoft.css\" />\n");
      out.write("\n");
      out.write("<!-- GC -->\n");
      out.write("<!-- LIBS -->\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"scripts/ext-js/adapter/ext/ext-base.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/ext-js/ext-all.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/ext-js/ux/CheckColumn.js\"></script>\n");
      out.write("<!-- ENDLIBS -->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/userpropertyform.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src= \"scripts/logs.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/maintoolbar.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/controlsoftwaregrid.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/menutree.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/mainpanel.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/virtualmanager.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/userandrole.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/manageruser.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src =\"scripts/vartypes.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/processlog.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/cert.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/main.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
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
