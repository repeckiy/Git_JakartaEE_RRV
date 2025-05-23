package org.apache.jsp.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class login_jsp extends org.glassfish.wasp.runtime.HttpJspBase
    implements org.glassfish.wasp.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.wasp.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.glassfish.wasp.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      response.setHeader("X-Powered-By", "JSP/3.0");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Login - Auction System</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"login-outer-container\">\n");
      out.write("    <div class=\"login-card\">\n");
      out.write("        <h1 class=\"login-title\">Auction System</h1>\n");
      out.write("        <h2 class=\"login-subtitle\">Login</h2>\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"username\">Username:</label>\n");
      out.write("                <input type=\"text\" id=\"username\" name=\"username\" required autocomplete=\"username\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"password\">Password:</label>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" required autocomplete=\"current-password\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"main-btn\">Login</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.glassfish.wasp.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.glassfish.wasp.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.glassfish.wasp.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${not empty error}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"error-message\">");
        out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
