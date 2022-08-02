package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" >\n");
      out.write("        <style>\n");
      out.write("            /* Code By Webdevtrick ( https://webdevtrick.com ) */\n");
      out.write("            @import url(https://fonts.googleapis.com/css?family=Open+Sans:400,700);\n");
      out.write("            @import url(https://weloveiconfonts.com/api/?family=entypo);\n");
      out.write("\n");
      out.write("            [class^=\"entypo-\"]:before {\n");
      out.write("                font-family: 'entypo', sans-serif;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                background: #e6e6e6;\n");
      out.write("            }\n");
      out.write("            #social-sidebar {\n");
      out.write("                left: 0;\n");
      out.write("                position: fixed;\n");
      out.write("                top: 30%;\n");
      out.write("            }\n");
      out.write("            #social-sidebar li:first-child a { border-top-right-radius: 5px; }\n");
      out.write("            #social-sidebar li:last-child a { border-bottom-right-radius: 5px; }\n");
      out.write("\n");
      out.write("            #social-sidebar a {\n");
      out.write("                background: rgba(0, 0, 0, .7);\n");
      out.write("                color: #fff;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                height: 50px;\n");
      out.write("                width: 50px;  \n");
      out.write("                font-size: 24px;\n");
      out.write("                line-height: 50px;\n");
      out.write("                position: relative;\n");
      out.write("                text-align: center;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            #social-sidebar a:hover span {\n");
      out.write("                left: 120%;\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            #social-sidebar a span {\n");
      out.write("                font: 12px \"Open Sans\", sans-serif;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                line-height: 24px;\n");
      out.write("                left: -100%;\n");
      out.write("                margin-top: -16px;\n");
      out.write("                opacity: 0;\n");
      out.write("                padding: 4px 8px;\n");
      out.write("                position: absolute;\n");
      out.write("                transition: opacity .3s, left .4s;\n");
      out.write("                top: 50%;\n");
      out.write("                z-index: -1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #social-sidebar a span:before {\n");
      out.write("                content: \"\";\n");
      out.write("                display: block;\n");
      out.write("                height: 8px;\n");
      out.write("                width: 8px;\n");
      out.write("                left: -4px;\n");
      out.write("                margin-top: -4px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                transform: rotate(45deg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #social-sidebar a[class*=\"twitter\"]:hover,\n");
      out.write("            #social-sidebar a[class*=\"twitter\"] span,\n");
      out.write("            #social-sidebar a[class*=\"twitter\"] span:before {background: #00aced;}\n");
      out.write("\n");
      out.write("            #social-sidebar a[class*=\"facebook\"]:hover,\n");
      out.write("            #social-sidebar a[class*=\"facebook\"] span,\n");
      out.write("            #social-sidebar a[class*=\"facebook\"] span:before {background: #3B5998;}\n");
      out.write("\n");
      out.write("            #social-sidebar a[class*=\"gplus\"]:hover,\n");
      out.write("            #social-sidebar a[class*=\"gplus\"] span,\n");
      out.write("            #social-sidebar a[class*=\"gplus\"] span:before {background: #E34429;}\n");
      out.write("\n");
      out.write("            #social-sidebar a[class*=\"dribbble\"]:hover,\n");
      out.write("            #social-sidebar a[class*=\"dribbble\"] span,\n");
      out.write("            #social-sidebar a[class*=\"dribbble\"] span:before {background: #ea4c89;}\n");
      out.write("\n");
      out.write("            #social-sidebar a[class*=\"dropbox\"]:hover,\n");
      out.write("            #social-sidebar a[class*=\"dropbox\"] span,\n");
      out.write("            #social-sidebar a[class*=\"dropbox\"] span:before {background: #8DC5F2;}\n");
      out.write("\n");
      out.write("            #social-sidebar a[class*=\"github\"]:hover,\n");
      out.write("            #social-sidebar a[class*=\"github\"] span,\n");
      out.write("            #social-sidebar a[class*=\"github\"] span:before {background: #9C7A5B;}\n");
      out.write("\n");
      out.write("            #social-sidebar a[class*=\"evernote\"]:hover,\n");
      out.write("            #social-sidebar a[class*=\"evernote\"] span,\n");
      out.write("            #social-sidebar a[class*=\"evernote\"] span:before {background: #6BB130;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navigation-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Header-->\n");
      out.write("            <header>\n");
      out.write("                <div id=\"carouselExampleInterval\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                        <div class=\"carousel-item active\" data-bs-interval=\"3000\">\n");
      out.write("                            <img src=\"images/header/header1.png\" class=\"d-block w-100\" style=\"height: 540px\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\" data-bs-interval=\"3000\">\n");
      out.write("                            <img src=\"images/header/header2.png\" class=\"d-block w-100\" style=\"height: 540px\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\" data-bs-interval=\"3000\">\n");
      out.write("                            <img src=\"images/header/header3.png\" class=\"d-block w-100\" style=\"height: 540px\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleInterval\" data-bs-slide=\"prev\">\n");
      out.write("                        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"visually-hidden\">Previous</span>\n");
      out.write("                    </button>\n");
      out.write("                    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleInterval\" data-bs-slide=\"next\">\n");
      out.write("                        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"visually-hidden\">Next</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!-- Section-->\n");
      out.write("            <section class=\"py-5\">\n");
      out.write("                <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3 mb-sm-2\">\n");
      out.write("                            <div class=\"list-group\">\n");
      out.write("                                <a href=\"#\" class=\"list-group-item list-group-item-dark \" aria-current=\"true\" style=\"background-color: black; color: white\">Category</a>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card bg-light mb-3\">\n");
      out.write("                            <div class=\"list-group-item list-group-item-dark\" style=\"background-color: black; color: white\">New product</div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                <h5 class=\"card-title\" href=\"detail?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                                <p class=\"card-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                <p class=\"bloc_left_price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" $</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-9\">\n");
      out.write("                        <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 justify-content-center\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <a href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"list-group-item list-group-item-action\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col mb-5\">\n");
          out.write("                                    <div class=\"card h-100\">\n");
          out.write("                                        <!-- Product image-->\n");
          out.write("                                        <img class=\"card-img-top\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"...\" />\n");
          out.write("                                        <!-- Product details-->\n");
          out.write("                                        <div class=\"card-body p-4\">\n");
          out.write("                                            <div class=\"text-center\">\n");
          out.write("                                                <!-- Product name-->\n");
          out.write("                                                <h5 class=\"fw-bolder\"><a class=\"text-dark\" style=\"text-decoration: none\" href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\n");
          out.write("                                                <!-- Product price-->\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("$\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <!-- Product actions-->\n");
          out.write("                                        <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
          out.write("                                            <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"cart?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Add to cart</a></div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
