package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp ", out, false);
      out.write("\n");
      out.write("            <section class=\"py-5\">\n");
      out.write("                <div class=\"container px-4 px-lg-5 my-5\">\n");
      out.write("                    <div class=\"row gx-4 gx-lg-5 align-items-center\">\n");
      out.write("                        <div class=\"col-md-6\"><img class=\"card-img-top mb-5 mb-md-0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"...\" /></div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <h2 class=\"display-5 fw-bolder\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                            <h7 class=\"display-15\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h7>\n");
      out.write("                            <div class=\"fs-5 mb-5\">\n");
      out.write("                                <span class=\"text-decoration-line-through\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.price + 350 }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$</span>\n");
      out.write("                                <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$</span>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"lead\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <div class=\"d-flex\">\n");
      out.write("                                <input class=\"form-control text-center me-3\" id=\"inputQuantity\" type=\"num\" value=\"1\" style=\"max-width: 3rem\" />\n");
      out.write("                                <button class=\"btn btn-outline-dark flex-shrink-0\" type=\"button\">\n");
      out.write("                                    <i class=\"bi-cart-fill me-1\"></i>\n");
      out.write("                                    Add to cart\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- Related items section-->\n");
      out.write("            <section class=\"py-5 bg-light\">\n");
      out.write("                <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("                    <h2 class=\"fw-bolder mb-4\">Related products</h2>\n");
      out.write("                    <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\n");
      out.write("                        <div class=\"col mb-5\">\n");
      out.write("                            <div class=\"card h-100\">\n");
      out.write("                                <!-- Product image-->\n");
      out.write("                                <img class=\"card-img-top\" src=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\n");
      out.write("                                <!-- Product details-->\n");
      out.write("                                <div class=\"card-body p-4\">\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <!-- Product name-->\n");
      out.write("                                        <h5 class=\"fw-bolder\">Fancy Product</h5>\n");
      out.write("                                        <!-- Product price-->\n");
      out.write("                                        $40.00 - $80.00\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Product actions-->\n");
      out.write("                                <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                    <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">View options</a></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col mb-5\">\n");
      out.write("                            <div class=\"card h-100\">\n");
      out.write("                                <!-- Sale badge-->\n");
      out.write("                                <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
      out.write("                                <!-- Product image-->\n");
      out.write("                                <img class=\"card-img-top\" src=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\n");
      out.write("                                <!-- Product details-->\n");
      out.write("                                <div class=\"card-body p-4\">\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <!-- Product name-->\n");
      out.write("                                        <h5 class=\"fw-bolder\">Special Item</h5>\n");
      out.write("                                        <!-- Product reviews-->\n");
      out.write("                                        <div class=\"d-flex justify-content-center small text-warning mb-2\">\n");
      out.write("                                            <div class=\"bi-star-fill\"></div>\n");
      out.write("                                            <div class=\"bi-star-fill\"></div>\n");
      out.write("                                            <div class=\"bi-star-fill\"></div>\n");
      out.write("                                            <div class=\"bi-star-fill\"></div>\n");
      out.write("                                            <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- Product price-->\n");
      out.write("                                        <span class=\"text-muted text-decoration-line-through\">$20.00</span>\n");
      out.write("                                        $18.00\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Product actions-->\n");
      out.write("                                <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                    <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col mb-5\">\n");
      out.write("                            <div class=\"card h-100\">\n");
      out.write("                                <!-- Sale badge-->\n");
      out.write("                                <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
      out.write("                                <!-- Product image-->\n");
      out.write("                                <img class=\"card-img-top\" src=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\n");
      out.write("                                <!-- Product details-->\n");
      out.write("                                <div class=\"card-body p-4\">\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <!-- Product name-->\n");
      out.write("                                        <h5 class=\"fw-bolder\">Sale Item</h5>\n");
      out.write("                                        <!-- Product price-->\n");
      out.write("                                        <span class=\"text-muted text-decoration-line-through\">$50.00</span>\n");
      out.write("                                        $25.00\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Product actions-->\n");
      out.write("                                <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                    <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col mb-5\">\n");
      out.write("                            <div class=\"card h-100\">\n");
      out.write("                                <!-- Product image-->\n");
      out.write("                                <img class=\"card-img-top\" src=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\n");
      out.write("                                <!-- Product details-->\n");
      out.write("                                <div class=\"card-body p-4\">\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <!-- Product name-->\n");
      out.write("                                        <h5 class=\"fw-bolder\">Popular Item</h5>\n");
      out.write("                                        <!-- Product reviews-->\n");
      out.write("                                        <div class=\"d-flex justify-content-center small text-warning mb-2\">\n");
      out.write("                                            <div class=\"bi-star-fill\"></div>\n");
      out.write("                                            <div class=\"bi-star-fill\"></div>\n");
      out.write("                                            <div class=\"bi-star-fill\"></div>\n");
      out.write("                                            <div class=\"bi-star-fill\"></div>\n");
      out.write("                                            <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- Product price-->\n");
      out.write("                                        $40.00\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Product actions-->\n");
      out.write("                                <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                    <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!--============================\n");
      out.write("            =            Footer            =\n");
      out.write("            =============================-->\n");
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
      out.write("\n");
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
