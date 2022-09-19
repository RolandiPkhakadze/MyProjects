/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-09-11 06:56:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import schmacse.model.Item;
import java.util.List;

public final class wishlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("     <span name=\"span-my-items\" id=\"span-my-items\">\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/my-items\" class=\"btn\" role=\"button\" id=\"my-items-button\" name=\"my-items-button\">\r\n");
      out.write("            <span>My Items</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </span>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Wishlist</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" >\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js\"\r\n");
      out.write("            integrity=\"sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/wishlist.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<section id=\"my-wishlist\" class=\"container py-4\">\r\n");
      out.write("\r\n");
      out.write("    <h1 class=\"text-center\">My Wishlist</h1>\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        ");

            List<Item> itemsInWishlist = (List<Item>) request.getAttribute("itemsInWishlist");

            for (Item item: itemsInWishlist) {
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-lg-4 col-md-6 col-sm-10 my-3\">\r\n");
      out.write("            <div class=\"card\" style=\"width: 18rem; text-align: center; margin: 0 auto; border-radius: 15px; border-width: medium; border-color: HoneyDew\">\r\n");
      out.write("                <div class=\"card-body\" style=\"background: rgb(167, 190, 130); border-radius: 15px\">\r\n");
      out.write("\r\n");
      out.write("                    <h3 id=\"item-name\">");
      out.print(item.getName());
      out.write("</h3>\r\n");
      out.write("                    <p class=\"card-text\" id=\"item-category\">");
      out.print(item.getCategory().toString());
      out.write("</p>\r\n");
      out.write("                    <p class=\"card-text\" id=\"item-price\">Price: ");
      out.print(item.getPrice());
      out.write(" ₾</p>\r\n");
      out.write("\r\n");
      out.write("                    <img src=\"getImage.jsp?item_id=");
      out.print(item.getId());
      out.write("\" style=\"width: 242px; height: 133px; white-space: nowrap; object-fit: contain;\">\r\n");
      out.write("                    <div class=\"text-center my-3\">\r\n");
      out.write("                        <form>\r\n");
      out.write("                            <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print(item.getId());
      out.write("\">\r\n");
      out.write("                            <button formaction=\"item-page\" formmethod=\"get\" class=\"bton vist\" style=\"background-color: #a7c7e7; border-radius: 10px\">Visit</button>\r\n");
      out.write("                            <button formaction=\"wishlist\" formmethod=\"post\" class=\"bton delete\" style=\"background-color: #ff6961; border-radius: 10px\">Delete</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
