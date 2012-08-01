package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class role_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/role.js\"></script>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"hidden\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"roleuser_add\"   iconCls=\"icon-save\" style=\"width:450px;height:300px;\" class=\"easyui-window\" ");
      out.print(win_topbar );
      out.write("\r\n");
      out.write("\t\t\ttitle=\"角色用户添加\" >\r\n");
      out.write("\t\t\t<div region=\"center\" border=\"false\" class=\"bdcenter\">\r\n");
      out.write("\t\t\t\t<table id=\"roleuserlist\" ></table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"roleuseradd()\">确定</a> <a\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"closeWin('roleuser_add')\">取消</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"role_user\"  iconCls=\"icon-save\" style=\"width:450px;height:300px;\" class=\"easyui-window\" ");
      out.print(win_topbar );
      out.write("\r\n");
      out.write("\t\t\ttitle=\"角色用户列表\">\r\n");
      out.write("\t\t\t<div region=\"center\" border=\"false\" >\r\n");
      out.write("\t\t<table id=\"role_userlist\"></table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"role_edit\" iconCls=\"icon-save\" class=\"easyui-window\" ");
      out.print(win_topbar );
      out.write("\r\n");
      out.write("\t\t\ttitle=\"权限配置\">\r\n");
      out.write("\t\t\t<div region=\"center\" border=\"false\" class=\"bdcenter\">\r\n");
      out.write("\t\t\t<form method=\"post\" id=\"form_role_edit\" >\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"action\" />\r\n");
      out.write("\t\t\t\t<table class=\"tab_float tab_form\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>角色名称：<input type=\"text\" validtype=\"length[1,50]\" required=\"true\" name=\"name\" class=\"text easyui-validatebox \"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t服务器配置\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_LogonServer\" name=\"logonserver\" />允许登录服务器&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_AuditClient\" name=\"auditclient\" />认证客户端&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_UnInstallClient\" name=\"uninstallclient\"/>卸载客户端&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_ManageCert\" name=\"managecert\"/>管理数字证书&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_ScanEncryption\" name=\"scanencryption\" />扫描加密&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_ScanDecryption\" name=\"scandecryption\"/>扫描解密&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_UpdateSignatureLib\" name=\"updatesignaturelib\"/>升级特征库&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t选择管理的组：<input value=\"0\" name=\"groupcode\" width=\"100\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t登录审批端配置\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_LogonMange\" name=\"logonmanage\"/>允许登录审批端&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_ResponeseDecryt\" name=\"responsedecrypt\"/>审批解密&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_ResponseDeploy\" name=\"responsedeploy\" />审批外发&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_ResponseAdjuest\" name=\"responseadjuest\"/>审批调整权限&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t登录解密端配置\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_LogonDocer\" name=\"logondocer\"/>允许登录解密端&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_DocDecrypt\" name=\"docdecrypt\"/>解密&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_DocChangeGrant\" name=\"docchangegrant\"/>调整权限&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"T\" id=\"role_DocPack\" name=\"docpack\" />外发文件&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"formsubmit('form_role_edit')\">编辑</a> <a\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"closeWin('role_edit')\">取消</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("<table id=\"role_list\"  fit=\"true\"></table>\r\n");
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
