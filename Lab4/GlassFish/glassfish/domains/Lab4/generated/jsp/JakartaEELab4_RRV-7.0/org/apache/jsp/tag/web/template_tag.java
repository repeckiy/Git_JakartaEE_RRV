package org.apache.jsp.tag.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class template_tag
    extends jakarta.servlet.jsp.tagext.SimpleTagSupport
    implements org.glassfish.wasp.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.glassfish.wasp.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.glassfish.wasp.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String title;
  private jakarta.servlet.jsp.tagext.JspFragment head;

  public java.lang.String getTitle() {
    return this.title;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public jakarta.servlet.jsp.tagext.JspFragment getHead() {
    return this.head;
  }

  public void setHead(jakarta.servlet.jsp.tagext.JspFragment head) {
    this.head = head;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_if_test = org.glassfish.wasp.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getTitle() != null ) {
      _jspx_page_context.setAttribute("title", getTitle());
}
    if( getHead() != null ) {
      _jspx_page_context.setAttribute("head", getHead());
}

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write(" - Auction System</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\">\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("    a.button-nav { text-decoration:none; } \n");
      out.write("    </style>\n");
      out.write("    ");
      ((org.glassfish.wasp.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getHead() != null) {
        getHead().invoke(_jspx_sout);
      }
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("    <div class=\"centered-header\">\n");
      out.write("        <h1 style=\"text-align:center; font-size:2.4rem; margin:32px 0 10px 0; color:#374151;\">Auction System</h1>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/lots\"\n");
      out.write("               class=\"button-nav ");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${empty param.action || param.action ne 'all' ? 'selected' : ''}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\">Active Lots</a>\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/lots?action=all\"\n");
      out.write("               class=\"button-nav ");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${param.action eq 'all' ? 'selected' : ''}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\">All Lots</a>\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/lot?action=create\"\n");
      out.write("               class=\"button-nav ");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${title eq 'Create Lot' ? 'selected' : ''}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\">Create Lot</a>\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/search\" method=\"get\" class=\"searchbar\">\n");
      out.write("                <input type=\"text\" name=\"keyword\" placeholder=\"Search...\" class=\"search-input\"/>\n");
      out.write("                <button type=\"submit\" class=\"button-nav\">Search</button>\n");
      out.write("            </form>\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("<main>\n");
      out.write("    ");
      ((org.glassfish.wasp.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      out.write("\n");
      out.write("</main>\n");
      out.write("<footer>\n");
      out.write("    <div style=\"background:#2c3e50; color:#fff; padding:16px 0; text-align:center; margin-top:40px;\">\n");
      out.write("        &copy; Auction System\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.glassfish.wasp.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.glassfish.wasp.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.glassfish.wasp.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.glassfish.wasp.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.user and sessionScope.user.role eq 'Administrator'}", boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <a href=\"");
        out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("/admin\"\n");
        out.write("                   class=\"button-nav ");
        out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${title eq 'Administrative user' ? 'selected' : ''}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\">Admin Panel</a>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.glassfish.wasp.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.glassfish.wasp.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.glassfish.wasp.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.user}", boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <span class=\"navbar-user\">");
        out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.username}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("</span>\n");
        out.write("                <a href=\"");
        out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("/logout\" class=\"button-nav logout\">Logout</a>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
