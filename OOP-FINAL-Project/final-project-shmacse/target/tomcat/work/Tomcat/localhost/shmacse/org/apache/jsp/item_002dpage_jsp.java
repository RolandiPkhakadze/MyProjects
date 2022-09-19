/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-09-10 19:24:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import schmacse.model.Item;
import schmacse.model.User;
import schmacse.model.Category;
import java.io.OutputStream;
import java.sql.Connection;

public final class item_002dpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Item Page</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/item-page.css\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

        Item item = (Item) request.getAttribute("item");
        User owner = (User) request.getAttribute("user");
    
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <span name=\"span-homepage\" id=\"span-homepage\">\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/homepage\" class=\"btn\" role=\"button\" id=\"homepage-button\" name=\"homepage-button\">\r\n");
      out.write("            <span>Shmacse Store</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </span>\r\n");
      out.write("        <div class=\"Description-header\">\r\n");
      out.write("            <div class=\"fs-3\" id=\"description-header\"> Description </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Description\">\r\n");
      out.write("            <div class=\"fs-5 text-muted\" id=\"description\"> ");
      out.print(item.getDescription());
      out.write(" </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Price\">\r\n");
      out.write("            <div class=\"text-center bg-light border\" id=\"price\">\r\n");
      out.write("                Price: ");
      out.print( Integer.toString(item.getPrice()) );
      out.write(" ₾\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Add-To-Wishlist\">\r\n");
      out.write("            ");

                if(request.getSession().getAttribute("username") != null){
                    if(!(((String)request.getSession().getAttribute("username")).equals(owner.getUsername()))){
            
      out.write("\r\n");
      out.write("            <div class=\"text-start py-2\" id=\"wishlist-div\">\r\n");
      out.write("                <form action=\"add-to-wishlist\" method=\"post\" id=\"wishlist-form\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print(item.getId());
      out.write("\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"ownerId\" value=\"");
      out.print(item.getUserId());
      out.write("\">\r\n");
      out.write("                    <button class=\"btn btn-success\" id=\"wishlist-button\">Add to WishList</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

                    }
                }
            
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Image\">\r\n");
      out.write("           <img src=\"getImage.jsp?item_id=");
      out.print(item.getId());
      out.write("\" id=\"image\" style=\"width: 800px; height: 520px; white-space: nowrap;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Owner\">\r\n");
      out.write("            <span id=\"owner-info\">\r\n");
      out.write("                <label id=\"owner-name\">Owner: ");
      out.print( owner.getFirstName() );
      out.write("</label>\r\n");
      out.write("                <label id=\"owner-phone\">Phone Number: ");
      out.print( owner.getPhoneNumber() );
      out.write("</label>\r\n");
      out.write("            </span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Title\">\r\n");
      out.write("            <h1 class=\"display-3 text-center text-bold\">");
      out.print(item.getName());
      out.write("</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Category\">\r\n");
      out.write("            <h2 class=\"fs-4 text-center text-muted\">");
      out.print(item.getCategory().toString());
      out.write("</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\" crossorigin=\"anonymous\"></script>\r\n");
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