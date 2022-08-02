package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class right_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <div id=\"icon-fixed-right\">\n");
      out.write("  <a href=\"javascript:void(0)\" onclick=\"showPopup('popup-facebook');\"><i class=\"icons fab fa-facebook-f\"></i></a>\n");
      out.write("  <a href=\"javascript:void(0)\" onclick=\"showPopup('popup-youtube');\"><i class=\"icons fab fa-youtube\"></i></a>-->\n");
      out.write("  <a href=\"https://www.facebook.com/www.hacom.vn\" target=\"_blank\"><i class=\"icons fab fa-facebook-f\"></i></a>\n");
      out.write("  <a href=\"https://www.youtube.com/channel/UCIoWNINN5sJcx1zboLXZmeA\" target=\"_blank\"><i class=\"icons fab fa-youtube\"></i></a>\n");
      out.write("  <a href=\"javascript:void(0)\" onclick=\"showPopup('popup-lien-he');\"><i class=\"icons fas fa-envelope\"></i></a>\n");
      out.write("  <a href=\"javascript:void(0)\" onclick=\"showPopup('popup-address');\"><i class=\"icons fas fa-phone fa-flip-horizontal\"></i></a>\n");
      out.write("  <a href=\"/buildpc\" ><i class=\"icons fa fa-wrench\"></i></a>-->\n");
      out.write("  <a href=\"https://www.messenger.com/t/www.hacom.vn\" target=\"_blank\"><i class=\"icons fab fa-facebook-messenger\"></i></a>\n");
      out.write("  <a href=\"https://chat.zalo.me/?c=7526908786425944876\" target=\"_blank\" class=\"zalo-icon\"><img alt=\"url\" src=\"https://media.metu.vn/fillcolor?url=https%3A%2F%2Fmedia.metu.vn%2Fimages%2Ficon_zalo_01.svg&color=%23ffffff\"></a>\n");
      out.write("  <a href=\"javascript:void(0)\"  id=\"toTop\" style=\"display:none;\" class=\"active\"><i class=\"icons far fa-arrow-up\"></i></a>\n");
      out.write("</div>\n");
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
