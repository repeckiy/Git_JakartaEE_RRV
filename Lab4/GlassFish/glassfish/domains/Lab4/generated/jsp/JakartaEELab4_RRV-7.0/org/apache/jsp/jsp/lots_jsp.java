package org.apache.jsp.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class lots_jsp extends org.glassfish.wasp.runtime.HttpJspBase
    implements org.glassfish.wasp.runtime.JspSourceDependent {

static private org.glassfish.wasp.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.glassfish.wasp.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.glassfish.wasp.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
  _jspx_fnmap_1= org.glassfish.wasp.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substring", org.apache.taglibs.standard.functions.Functions.class, "substring", new Class[] {java.lang.String.class, int.class, int.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/template.tag");
  }

  private org.glassfish.wasp.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.glassfish.wasp.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody;
  private org.glassfish.wasp.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.glassfish.wasp.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.glassfish.wasp.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.glassfish.wasp.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody = org.glassfish.wasp.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.glassfish.wasp.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.glassfish.wasp.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.glassfish.wasp.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_t_template_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_t_template_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:template
    org.apache.jsp.tag.web.template_tag _jspx_th_t_template_0 = new org.apache.jsp.tag.web.template_tag();
    _jspx_th_t_template_0.setJspContext(_jspx_page_context);
    _jspx_th_t_template_0.setTitle("All Lots");
    _jspx_th_t_template_0.setJspBody(new lots_jspHelper( 0, _jspx_page_context, _jspx_th_t_template_0, null));
    _jspx_th_t_template_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_choose_0(jakarta.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.glassfish.wasp.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.glassfish.wasp.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.glassfish.wasp.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(new jakarta.servlet.jsp.tagext.TagAdapter((jakarta.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_when_0((jakarta.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_otherwise_0((jakarta.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.glassfish.wasp.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.glassfish.wasp.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.glassfish.wasp.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${empty lots}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"centered-title\" style=\"font-size: 18px;\">No lots available.</div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.glassfish.wasp.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.glassfish.wasp.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.glassfish.wasp.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"lots-grid\">\n");
        out.write("                ");
        if (_jspx_meth_c_forEach_0((jakarta.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.glassfish.wasp.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.glassfish.wasp.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.glassfish.wasp.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_0.setVar("lot");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${lots}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"lot-card ");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${lot.active ? 'active' : 'inactive'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                        <h3 class=\"lot-title\">");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${lot.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                        <div class=\"lot-description\">\n");
          out.write("                            ");
          if (_jspx_meth_c_choose_1((jakarta.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"lot-status-row\">\n");
          out.write("                            <span class=\"status ");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${lot.active ? 'active' : 'inactive'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                ");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${lot.active ? 'ACTIVE' : 'INACTIVE'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                            </span>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"lot-info\">\n");
          out.write("                            <span>Current Price: ");
          if (_jspx_meth_fmt_formatNumber_0((jakarta.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</span>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"lot-info\">\n");
          out.write("                            <span>Bids: ");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${lot.bids.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                        </div>\n");
          out.write("                        <a href=\"");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/lot?id=");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${lot.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"button blue wide\">View Details</a>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
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

  private boolean _jspx_meth_c_choose_1(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.glassfish.wasp.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.glassfish.wasp.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.glassfish.wasp.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_1((jakarta.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_otherwise_1((jakarta.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.glassfish.wasp.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.glassfish.wasp.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.glassfish.wasp.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${fn:length(lot.description) > 60}", boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${fn:substring(lot.description, 0, 60)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
        out.write("...\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.glassfish.wasp.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.glassfish.wasp.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.glassfish.wasp.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${lot.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${lot.currentPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_0.setType("currency");
    _jspx_th_fmt_formatNumber_0.setCurrencySymbol("$");
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private class lots_jspHelper
      extends org.glassfish.wasp.runtime.JspFragmentHelper
  {
    private jakarta.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public lots_jspHelper( int discriminator, JspContext jspContext, jakarta.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n");
      out.write("    <h2 class=\"centered-title\">All Lots</h2>\n");
      out.write("    ");
      if (_jspx_meth_c_choose_0((jakarta.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write('\n');
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
