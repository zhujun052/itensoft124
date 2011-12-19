package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.itensoft.common.UTF8String;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import com.itensoft.common.MD5Password;
import com.itensoft.RoleUser;
import com.itensoft.User;
import com.itensoft.ItensoftSession;
import org.hibernate.Session;

public final class Dologin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String loginCode = request.getParameter("name");
	String loginPass = request.getParameter("pass");
	loginCode = UTF8String.toString(loginCode);

	Session s = ItensoftSession.getSession();
	try {
		User user = (User) s.get(User.class, loginCode);
		if (user == null) {
			response.sendRedirect("Login.jsp?errormsg=Login name not exists");
			return;
		}

		loginPass = MD5Password.getMD5Password(loginPass);
		if (!user.getPassword().equals(loginPass)) {
			response.sendRedirect("Login.jsp?errormsg=Password is wrong");
			return;
		}

		String Sql = "select b.Name,b.LogonServer from RoleUser a "
				+ ", Role b where a.RoleName=b.Name and a.UserName=?";
		Query query = s.createSQLQuery(Sql).setParameter(0, loginCode);
		List<Object[]> roleList = query.list();
		
		boolean acceptOnServer = false;
		for(Iterator<Object[]> it = roleList.iterator();it.hasNext();){
		    Object[] r = it.next();
			if("T".equals(r[1].toString())){
				acceptOnServer = true;
				break;
			}
		}
		
		if(acceptOnServer){
		    request.getSession().setAttribute("loginAdmin", user);
			response.sendRedirect("index.jsp");
		}else{
			response.sendRedirect("Login.jsp?errormsg=Login user has no right");
		}
		

	} finally {
		if (s != null)
			s.close();
	}

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
