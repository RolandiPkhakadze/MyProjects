/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-09-10 19:15:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link href=\"css/registration.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\t<title>shmacse</title>\r\n");
      out.write("\t<span name=\"span-homepage\" id=\"span-homepage\">\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/homepage\" class=\"btn\" role=\"button\" id=\"homepage-button\" name=\"homepage-button\">\r\n");
      out.write("            <span>Shmacse Store</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </span>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"registration-form\">\r\n");
      out.write("\t<img src=\"images/bags.png\"  alt=\".\" style=\"width:100px;height:auto;\">\r\n");
      out.write("\t<h1> Create account </h1>\r\n");
      out.write("\t<form action=\"register\" method=\"post\">\r\n");
      out.write("\t\t<div class = \"form-group\">\r\n");
      out.write("\t\t\t<input type=\"text\" class=\"input-box\" placeholder=\"First name\" name=\"firstname\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"text\" class=\"input-box\" placeholder=\"Last name\" name=\"lastname\">\r\n");
      out.write("\t\t<input type=\"text\" class=\"input-box\" placeholder=\"Username \" name=\"username\">\r\n");
      out.write("\t\t<input type=\"text\" class=\"input-box\" placeholder=\"Phone No.\" name=\"contact\">\r\n");
      out.write("\t\t<input type=\"password\" class=\"input-box\" placeholder=\"Password\" name=\"pass\">\r\n");
      out.write("\t\t<input type=\"password\" class=\"input-box\" placeholder=\"Repeat Password\" name=\"re_pass\"> <br>\r\n");
      out.write("\t\t");
 if (request.getAttribute("status") != null){ 
      out.write("\r\n");
      out.write("\t\t");
  if (request.getAttribute("status").equals("failed, passwords do not match")) {
      out.write("\r\n");
      out.write("\t\t<label form=\"registration-form\"> Passwords do not match </label>\r\n");
      out.write("\t\t");
 }else if(request.getAttribute("status").equals("failed, username is already taken")) { 
      out.write("\r\n");
      out.write("\t\t<label form=\"registration-form\"> Username is already taken </label>\r\n");
      out.write("\t\t");
 }else if (request.getAttribute("status").equals("failed, invalid number")) {
      out.write("\r\n");
      out.write("\t\t<label form=\"registration-form\"> Please enter valid contact number </label>\r\n");
      out.write("\t\t");
 }else if (request.getAttribute("status").equals("failed, empty field(s)")) {
      out.write("\r\n");
      out.write("\t\t<label form=\"registration-form\"> All fields must be filled </label>\r\n");
      out.write("\t\t");
 }else if (request.getAttribute("status").equals("failed, phone number is taken")) {
      out.write("\r\n");
      out.write("\t\t<label form=\"registration-form\"> Contact number is already taken </label>\r\n");
      out.write("\t\t");
 }}
      out.write("\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<button type=\"submit\" class=\"register\">Sign up</button>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<a style=\"font-size: smaller;color: rgb(40, 65, 24)\" class=\"registered-link\" href=\"login.jsp\">Already registered? Log in</a>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
