/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-09-14 09:13:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import schmacse.model.Category;
import java.util.List;
import schmacse.model.Item;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Shmacse store</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" >\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/homepage.css\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js\"\r\n");
      out.write("            integrity=\"sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background: rgb(250,248,223);\r\n");
      out.write("background: radial-gradient(circle, rgba(250,248,223,1) 50%, rgba(222,218,173,1) 100%);\">\r\n");
      out.write("<form id=\"search-form\" action=\"search-servlet\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("    <label for=\"categories\" id=\"categories-label\"> Categories: </label>\r\n");
      out.write("    <select name=\"categories\" id=\"categories\" style=\"background-color: #dde2eb; border-radius: 10px; padding: 0px 5px; font-size: 15px;\">\r\n");
      out.write("        <option value=\"ALL\"> ALL </option>\r\n");
      out.write("        ");

            List<Category> categories = (List<Category>) request.getAttribute("categoryList");

            for (Category c: categories) {
                out.println("<option value=\"" + c + "\">" + c + "</option>");
            }
        
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("    <input name=\"textfield\" id=textfield\" type=\"text\" placeholder=\"Search..\" style=\"border-radius: 8px; border-color: darkblue; border-width: 2px; background-color: #dde2eb; padding: 0px 5px;\">\r\n");
      out.write("    <button type=\"submit\" form=\"search-form\" value=\"Submit\" id=\"search-button\" name=\"search-button\">Search</button>\r\n");
      out.write("\r\n");
      out.write("    <label for=\"button\" id=\"price-order\"> Sort by price:  </label>\r\n");
      out.write("    <span id=\"button\">\r\n");
      out.write("        <input type=\"checkbox\" id=\"invert\" name=\"invert\"\r\n");
      out.write("            ");
if (request.getParameterValues("invert") != null){
      out.write(" checked ");
 } 
      out.write("\r\n");
      out.write("        />\r\n");
      out.write("        <span class=\"knobs\"></span>\r\n");
      out.write("    </span>\r\n");
      out.write("\r\n");
      out.write("    <span id=\"top-right-corner\" name=\"top-right-corer\">\r\n");
      out.write("    ");

        if(request.getSession().getAttribute("username") != null){
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <button type=\"submit\" formaction=\"my-items\" formmethod=\"get\" id=\"to-my-items\" name=\"to-my-items\"> My Items </button>\r\n");
      out.write("        <button type=\"submit\" formaction=\"log-out\" formmethod=\"post\" id=\"log-out\" name=\"log-out\"> Log Out </button>\r\n");
      out.write("\r\n");
      out.write("    ");

        }else{
    
      out.write("\r\n");
      out.write("    <input type=\"submit\" formaction=\"login.jsp\" value=\"Log In\" id=\"log-in\" name=\"log-in\">\r\n");
      out.write("    <input type=\"submit\" formaction=\"registration.jsp\" value=\"Register\" id=\"register\" name=\"register\">\r\n");
      out.write("    ");

        }
    
      out.write("\r\n");
      out.write("    </span>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    ");

        if (request.getAttribute("itemsList") != null){
            List<Item> items = (List<Item>) request.getAttribute("itemsList");

            for (Item item: items) {
    
      out.write("\r\n");
      out.write("        <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-12 my-3\" style=\"text-align: center; margin: 0 auto;\">\r\n");
      out.write("            <div class=\"card\" style=\"width: 19rem; text-align: center; margin: 0 auto; border-radius: 15px; border-color: HoneyDew; border-width: medium\">\r\n");
      out.write("                <div class=\"card-body\" style=\"background: rgb(167, 190, 130); border-radius: 15px\">\r\n");
      out.write("\r\n");
      out.write("                    ");

                        String nameToDisplay = item.getName();
                        if(nameToDisplay.length() >= 15){
                            nameToDisplay = nameToDisplay.substring(0,15) + "...";
                        }
                    
      out.write("\r\n");
      out.write("                    <h3 class=\"text-center fw-bold\">");
      out.print(nameToDisplay);
      out.write("</h3>\r\n");
      out.write("                    <h5 class=\"text-center\" style=\"opacity: 0.5; font-size: 18px;\">");
      out.print(item.getPrice()+" ₾");
      out.write("</h5>\r\n");
      out.write("\r\n");
      out.write("                    <img src=\"getImage.jsp?item_id=");
      out.print(item.getId());
      out.write("\" style=\"width: 242px; height: 133px; white-space: nowrap; object-fit: contain;\">\r\n");
      out.write("                    <div class=\"text-center my-3\">\r\n");
      out.write("                        <form>\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print(item.getId());
      out.write("\">\r\n");
      out.write("                            <button formaction=\"item-page\" formmethod=\"get\" id=\"visit-button\" name=\"visit-button\">Visit</button>\r\n");
      out.write("                            ");

                                if(request.getSession().getAttribute("isAdmin") != null && (Boolean) request.getSession().getAttribute("isAdmin")) {
                                    request.getSession().setAttribute("byAdmin", Boolean.TRUE);
                            
      out.write("\r\n");
      out.write("                                <button formaction=\"delete-item\" formmethod=\"post\" class=\"bton delete\" style=\"background-color: #ff6961; border-radius: 10px\">Delete</button>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    ");

            }
        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<form action=\"homepage\" method=\"get\" style=\"text-align: center\" id=\"south-form\">\r\n");
      out.write("    <input type=\"hidden\" value=\"");
      out.print((String) request.getAttribute("pageNumber"));
      out.write("\" id=\"pageNumber\" name=\"pageNumber\">\r\n");
      out.write("\r\n");
      out.write("    ");
 if(request.getParameterValues("invert") != null){ 
      out.write("\r\n");
      out.write("        <input type=\"hidden\" value=\"");
      out.print(request.getParameterValues("invert")[0]);
      out.write("\"  name=\"invert\">\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <input\r\n");
      out.write("            type=\"submit\" value=\"Previous Page\" id=\"previous-page\" onclick=\"changePage('previous')\"\r\n");
      out.write("            ");
 if( (((String)request.getAttribute("pageNumber")).equals("1"))){ 
      out.write("\r\n");
      out.write("                style=\"opacity: 0.4; cursor: not-allowed; transition-duration: 1000s;\" disabled\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        >\r\n");
      out.write("\r\n");
      out.write("        <label id=\"pageNumber-label\" style=\"font-size: 17px;\"> ");
      out.print((String) request.getAttribute("pageNumber"));
      out.write(" </label>\r\n");
      out.write("\r\n");
      out.write("        <input\r\n");
      out.write("                type=\"submit\" value=\"Next Page\" id=\"next-page\" onclick=\"changePage('next')\"\r\n");
      out.write("            ");
 if(((Boolean) request.getAttribute("isLastPage"))){ 
      out.write("\r\n");
      out.write("                style=\"opacity: 0.4; cursor: not-allowed; transition-duration: 1000s;\" disabled\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        >\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function changePage(direction){\r\n");
      out.write("        let hiddenParameter = document.getElementById('pageNumber');\r\n");
      out.write("        let oldValue = parseInt(hiddenParameter.getAttribute('value'));\r\n");
      out.write("        if(direction === 'next'){\r\n");
      out.write("            oldValue = oldValue + 1;\r\n");
      out.write("        }\r\n");
      out.write("        if(direction === 'previous'){\r\n");
      out.write("            oldValue = oldValue - 1;\r\n");
      out.write("        }\r\n");
      out.write("        hiddenParameter.setAttribute('value', oldValue.toString())\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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
