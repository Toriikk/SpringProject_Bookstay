/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-08-28 07:05:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1658627457877L));
    _jspx_dependants.put("jar:file:/Users/gimjaehui/Desktop/git/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/geniebook/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	function chk() {\n");
      out.write("		window.open(\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3173.4440781240314!2d126.8488105155832!3d37.30830734663155!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x4b5f72df9e8f8dd9!2z7JWI7IKwIOydtOygoOyVhOy5tOuNsOuvuOy7tO2TqO2EsO2VmeybkA!5e0!3m2!1sko!2skr!4v1660698810649!5m2!1sko!2skr\", \"\", \"width=500 height=500\");\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("<footer id=\"footer\">\n");
      out.write("	<!--Footer-->\n");
      out.write("	");
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"footer-widget\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<div class=\"logo pull-center\" align=\"center\">\n");
      out.write("				<a href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"><img width=\"300\" height=\"\"\n");
      out.write("					src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" alt=\"\" /></a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<!-- <div class=\"col-sm-2\">\n");
      out.write("						<div class=\"single-widget\">\n");
      out.write("							<h2>?????? ??????</h2>\n");
      out.write("							<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("								<li><a href=\"#\">Online Help</a></li>\n");
      out.write("								<li><a href=\"#\">Contact Us</a></li>\n");
      out.write("								<li><a href=\"#\">Order Status</a></li>\n");
      out.write("								<li><a href=\"#\">Change Location</a></li>\n");
      out.write("								<li><a href=\"#\">FAQ???s</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-2\">\n");
      out.write("						<div class=\"single-widget\">\n");
      out.write("							<h2>?????? ??????</h2>\n");
      out.write("							<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("								<li><a href=\"#\">T-Shirt</a></li>\n");
      out.write("								<li><a href=\"#\">Mens</a></li>\n");
      out.write("								<li><a href=\"#\">Womens</a></li>\n");
      out.write("								<li><a href=\"#\">Gift Cards</a></li>\n");
      out.write("								<li><a href=\"#\">Shoes</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-2\">\n");
      out.write("						<div class=\"single-widget\">\n");
      out.write("							<h2>???????????? ????????????</h2>\n");
      out.write("							<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("								<li><a href=\"#\">Terms of Use</a></li>\n");
      out.write("								<li><a href=\"#\">Privecy Policy</a></li>\n");
      out.write("								<li><a href=\"#\">Refund Policy</a></li>\n");
      out.write("								<li><a href=\"#\">Billing System</a></li>\n");
      out.write("								<li><a href=\"#\">Ticket System</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-2\">\n");
      out.write("						<div class=\"single-widget\">\n");
      out.write("							<h2>??????????????????</h2>\n");
      out.write("							<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("								<li><a href=\"#\">??????</a></li>\n");
      out.write("								<li><a href=\"#\">Careers</a></li>\n");
      out.write("								<li><a href=\"#\">Store Location</a></li>\n");
      out.write("								<li><a href=\"#\">Affillate Program</a></li>\n");
      out.write("								<li><a href=\"#\">Copyright</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-3 col-sm-offset-1\">\n");
      out.write("						<div class=\"single-widget\">\n");
      out.write("							<h2>About Shopper</h2>\n");
      out.write("							<form action=\"#\" class=\"searchform\">\n");
      out.write("								<input type=\"text\" placeholder=\"Your email address\" />\n");
      out.write("								<button type=\"submit\" class=\"btn btn-default\"><i class=\"fa fa-arrow-circle-o-right\"></i></button>\n");
      out.write("								<p>Get the most recent updates from <br />our site and be updated your self...</p>\n");
      out.write("							</form>\n");
      out.write("						</div>\n");
      out.write("					</div> -->\n");
      out.write("				<div align=\"center\">\n");
      out.write("					<br>??????????????? <br>????????????????????? : 220-90-07535 <br>???????????? :\n");
      out.write("					02-561-1911 / ?????? : 02-538-2613 <br>email: BOOKSTAY.book@gmail.com <br>??????\n");
      out.write("					: ?????? ????????? ???????????? 7??? 7(????????? ??????????????? 6???)\n");
      out.write("					<button onclick=\"chk()\">?????? ??????</button><p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<div class=\"footer-bottom\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<p class=\"pull-left\">Copyright ?? 2022 BOOKSTAY Inc. All rights\n");
      out.write("					reserved.</p>\n");
      out.write("				<p class=\"pull-right\">\n");
      out.write("					Designed by <span><a target=\"_blank\"\n");
      out.write("						href=\"http://www.themeum.com\">Themeum</a></span>\n");
      out.write("				</p>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("<!--/Footer-->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/templates/footer.jsp(94,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/templates/footer.jsp(95,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/resources/images/home/logo_logo.png");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }
}
