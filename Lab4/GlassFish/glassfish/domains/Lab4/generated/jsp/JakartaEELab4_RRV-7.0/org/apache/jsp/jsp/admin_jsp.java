package org.apache.jsp.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class admin_jsp extends org.glassfish.wasp.runtime.HttpJspBase
    implements org.glassfish.wasp.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/template.tag");
  }

  private org.glassfish.wasp.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.glassfish.wasp.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
      response.setContentType("text/html; charset=UTF-8");
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
    _jspx_th_t_template_0.setTitle("Administrative user");
    _jspx_th_t_template_0.setJspBody(new admin_jspHelper( 0, _jspx_page_context, _jspx_th_t_template_0, null));
    _jspx_th_t_template_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(jakarta.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.glassfish.wasp.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.glassfish.wasp.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.glassfish.wasp.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(new jakarta.servlet.jsp.tagext.TagAdapter((jakarta.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_forEach_0.setVar("u");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${users}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${u.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${u.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                        <!-- change password -->\n");
          out.write("                        <td>\n");
          out.write("                            <form class=\"inline-form\" method=\"post\">\n");
          out.write("                                <input type=\"hidden\" name=\"action\" value=\"setPassword\">\n");
          out.write("                                <input type=\"hidden\" name=\"userId\" value=\"");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${u.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                <input class=\"admin-input-small\" type=\"password\"\n");
          out.write("                                       name=\"password\" placeholder=\"New password\" required>\n");
          out.write("                                <button class=\"admin-table-btn change\"\n");
          out.write("                                        title=\"Change password\">\n");
          out.write("                                    <i class=\"fa-solid fa-key\"></i>\n");
          out.write("                                </button>\n");
          out.write("                            </form>\n");
          out.write("                        </td>\n");
          out.write("\n");
          out.write("                        <!-- change role -->\n");
          out.write("                        <td>\n");
          out.write("                            <form class=\"inline-form\" method=\"post\">\n");
          out.write("                                <input type=\"hidden\" name=\"action\" value=\"setRole\">\n");
          out.write("                                <input type=\"hidden\" name=\"userId\" value=\"");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${u.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                <select name=\"role\" class=\"admin-select\">\n");
          out.write("                                    <option value=\"User\"\n");
          out.write("                                            ");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${u.role=='User'?'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">User</option>\n");
          out.write("                                    <option value=\"Administrator\"\n");
          out.write("                                            ");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${u.role=='Administrator'?'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">Administrator</option>\n");
          out.write("                                </select>\n");
          out.write("                                <button class=\"admin-table-btn save\" title=\"Save role\">\n");
          out.write("                                    <i class=\"fa-solid fa-floppy-disk\"></i>\n");
          out.write("                                </button>\n");
          out.write("                            </form>\n");
          out.write("                        </td>\n");
          out.write("\n");
          out.write("                        <td style=\"text-align:center;\">");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${u.ownedLots.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                        <!-- delete -->\n");
          out.write("                        <td>\n");
          out.write("                            <form method=\"post\"\n");
          out.write("                                  onsubmit=\"return confirm('Delete user?');\">\n");
          out.write("                                <input type=\"hidden\" name=\"action\" value=\"delete\">\n");
          out.write("                                <input type=\"hidden\" name=\"userId\" value=\"");
          out.write((java.lang.String) org.glassfish.wasp.runtime.PageContextImpl.evaluateExpression("${u.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                <button class=\"admin-table-btn delete\"\n");
          out.write("                                        title=\"Delete user\">\n");
          out.write("                                    <i class=\"fa-solid fa-trash\"></i>\n");
          out.write("                                </button>\n");
          out.write("                            </form>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
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

  private class admin_jspHelper
      extends org.glassfish.wasp.runtime.JspFragmentHelper
  {
    private jakarta.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public admin_jspHelper( int discriminator, JspContext jspContext, jakarta.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n");
      out.write("    <div class=\"admin-card\">\n");
      out.write("\n");
      out.write("        <h2 class=\"admin-title\">Administration Panel</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form class=\"create-user-inline\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"create\">\n");
      out.write("\n");
      out.write("            <input  type=\"text\"     name=\"username\" placeholder=\"Username\"  required>\n");
      out.write("            <input  type=\"email\"    name=\"email\"    placeholder=\"Email\"     required>\n");
      out.write("            <input  type=\"password\" name=\"password\" placeholder=\"Password\"  required>\n");
      out.write("\n");
      out.write("            <select name=\"role\">\n");
      out.write("                <option value=\"User\">User</option>\n");
      out.write("                <option value=\"Administrator\">Administrator</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <button class=\"admin-table-btn create-btn\" title=\"Create user\">\n");
      out.write("                <i class=\"fa-solid fa-user-plus\"></i>\n");
      out.write("            </button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"admin-table-container\">\n");
      out.write("            <table class=\"admin-table\">\n");
      out.write("                <colgroup>\n");
      out.write("                    <col style=\"width:24%;\">\n");
      out.write("                    <col style=\"width:28%;\">  \n");
      out.write("                    <col style=\"width:12%;\"> \n");
      out.write("                    <col style=\"width:18%;\">\n");
      out.write("                    <col style=\"width:9%;\">   \n");
      out.write("                    <col style=\"width:9%;\"> \n");
      out.write("                </colgroup>\n");
      out.write("\n");
      out.write("                <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Username</th><th>Email</th><th>Password</th>\n");
      out.write("                    <th>Role</th><th>Lots</th><th>Actions</th>\n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0((jakarta.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
