package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class console_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/admin/header.jsp");
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

String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 

      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${system_config['url']}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${system_config['webname']}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" - 后台管理系统</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resource/easyui/themes/cupertino/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resource/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resource/admin/css.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resource/admin/easyui_update.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/easyui/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<link href=\"resource/plugin/loadmask/jquery.loadmask.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/plugins_js/loadmask/jquery.loadmask.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 图片插件 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resource/plugins_js/fancybox/jquery.fancybox-1.3.4.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/plugins_js/fancybox/jquery.mousewheel-3.0.4.pack.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/plugins_js/fancybox/jquery.fancybox-1.3.4.pack.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/admin/global.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/admin/top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/index.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"bodycontainer\" class=\"easyui-layout\" >\r\n");
      out.write("\t<SCRIPT>document.oncontextmenu = function(){return false;};</SCRIPT>\r\n");
      out.write("\t<div region=\"north\" style=\"height: 85px; overflow: hidden;\">\r\n");
      out.write("\t\t<a class=\"logo\"></a>\r\n");
      out.write("\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t<li><a>修改密码</a></li>\r\n");
      out.write("\t\t\t<li><a>修改资料</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"admin/webmaster/loginout\">退出</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div id=\"navMenu\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a id=\"nav_framework\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:menuList('admin/webmaster/framework')\"><span>组织结构</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a id=\"nav_role\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:menuList('admin/webmaster/role')\"><span>角色设置</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a id=\"nav_system\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:menuList('admin/webmaster/system')\"><span>系统设置</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a id=\"nav_log\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:menuList('admin/webmaster/log')\"><span>日志管理</span></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div region=\"south\"\r\n");
      out.write("\t\tstyle=\"height: 30px; background: #efefef; text-align: center; padding-top: 5px;\">\r\n");
      out.write("\t\t凤凰卫士 - 后台管理系统</div>\r\n");
      out.write("\t<div region=\"west\" split=\"false\"  style=\"width: 200px; overflow: hidden;\">\r\n");
      out.write("\t\t<div id=\"lefttree\" fit=\"true\" class=\"easyui-panel\" border=\"false\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div region=\"center\" style=\"overflow: hidden;\">\r\n");
      out.write("\t\t<div id=\"tabs\" tools=\"#tab-tools\" fit=\"true\" border=\"false\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"tab-tools\">\r\n");
      out.write("\t\t<a class=\"easyui-linkbutton\" plain=\"true\" title=\"页面重载\"\r\n");
      out.write("\t\t\ticonCls=\"icon-reload\" onclick=\"javascript:reloadTab()\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"mm\" class=\"easyui-menu\" style=\"width: 150px;\">\r\n");
      out.write("\t\t<div id=\"mm-tabclose\">关闭</div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseall\">全部关闭</div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseother\">除此之外全部关闭</div>\r\n");
      out.write("\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseright\">当前页右侧全部关闭</div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseleft\">当前页左侧全部关闭</div>\r\n");
      out.write("\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t<div id=\"mm-exit\">退出</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
