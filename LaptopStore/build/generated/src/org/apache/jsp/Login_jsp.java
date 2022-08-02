package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Laptop Gaming Store</title>\n");
      out.write("        <!-- FAVICON -->\n");
      out.write("        <link href=\"images/logoshop1.png\" sizes=\"180x180\" rel=\"shortcut icon\">\n");
      out.write("        <!-- Bootstrap icons-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navigation-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("            <section class=\"login py-5 border-top-1\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-lg-5 col-md-8 align-item-center\">\n");
      out.write("                            <div class=\"border\">\n");
      out.write("                                <h3 class=\"bg-gray p-4\">Login Now</h3>\n");
      out.write("                                <div class=\"text-danger\" role=\"alert\" style=\"margin-left: 20px; margin-right: 20px; font-size: 20px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                <form action=\"login\" method=\"post\">\n");
      out.write("                                <fieldset class=\"p-4\">\n");
      out.write("                                    <input type=\"text\" name=\"user\" placeholder=\"Username\" class=\"border p-3 w-100 my-2\">\n");
      out.write("                                    <input type=\"password\" name=\"pass\"  placeholder=\"Password\" class=\"border p-3 w-100 my-2\">\n");
      out.write("                                    <div class=\"loggedin-forgot\">\n");
      out.write("                                        <input type=\"checkbox\" id=\"keep-me-logged-in\">\n");
      out.write("                                        <label for=\"keep-me-logged-in\" class=\"pt-3 pb-2\">Remember</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" class=\"d-block py-3 px-5 bg-dark text-white border-0 rounded font-weight-bold mt-3\">Log in</button>\n");
      out.write("                                    <a class=\"mt-3 d-block  text-dark\" href=\"#\">Forget Password?</a>\n");
      out.write("                                    <a class=\"mt-3 d-inline-block text-dark\" href=\"Register.jsp\">Register Now</a>\n");
      out.write("                                </fieldset>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!--============================\n");
      out.write("        =            Footer            =\n");
      out.write("        =============================-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- JAVASCRIPTS -->\n");
      out.write("        <script src=\"plugins/jQuery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"plugins/bootstrap/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"plugins/bootstrap/js/bootstrap-slider.js\"></script>\n");
      out.write("        <!-- tether js -->\n");
      out.write("        <script src=\"plugins/tether/js/tether.min.js\"></script>\n");
      out.write("        <script src=\"plugins/raty/jquery.raty-fa.js\"></script>\n");
      out.write("        <script src=\"plugins/slick-carousel/slick/slick.min.js\"></script>\n");
      out.write("        <script src=\"plugins/jquery-nice-select/js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <script src=\"plugins/fancybox/jquery.fancybox.pack.js\"></script>\n");
      out.write("        <script src=\"plugins/smoothscroll/SmoothScroll.min.js\"></script>\n");
      out.write("        <!-- google map -->\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCcABaamniA6OL5YvYSpB3pFMNrXwXnLwU&libraries=places\"></script>\n");
      out.write("        <script src=\"plugins/google-map/gmap.js\"></script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
