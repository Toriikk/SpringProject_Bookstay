/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-08-31 08:22:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class noticeForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/Users/gimjaehui/Desktop/git/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/geniebook/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\n');

	request.setCharacterEncoding("UTF-8");

      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>공지사항 글쓰기창</title>\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	 function readURL(input) {\n");
      out.write("	   if (input.files && input.files[0]) {\n");
      out.write("	      var reader = new FileReader();\n");
      out.write("	      reader.onload = function (e) {\n");
      out.write("	        $('#preview').attr('src', e.target.result);\n");
      out.write("	       }\n");
      out.write("	      reader.readAsDataURL(input.files[0]);\n");
      out.write("	   }\n");
      out.write("	}   \n");
      out.write("	function backToList(obj) {\n");
      out.write("		obj.action = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/notice/listnotices?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('=');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("		obj.submit();\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	 var cnt=1;\n");
      out.write("	function fn_addFile(){\n");
      out.write("	  $(\"#d_file\").append(\"<br>\"+\"<input type='file' name='file\"+cnt+\"' />\");\n");
      out.write("	  cnt++;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("</script>\n");
      out.write("<title>공지사항 글쓰기창</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<h1 style=\"text-align: center\">공지사항 작성</h1>\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<form name=\"noticeForm\" method=\"post\"\n");
      out.write("			action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/notice/addNotice?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('=');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" enctype=\"multipart/form-data\">\n");
      out.write("			<!-- \" -->\n");
      out.write("			<table class=\"table\" border=\"0\" align=\"center\">\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"right\">작성자</td>\n");
      out.write("					<td colspan=2 align=\"left\"><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adminId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("					<input type=\"hidden\" name=\"adminId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adminId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"right\">공지사항 글제목</td>\n");
      out.write("					<td colspan=\"2\"><input type=\"text\" size=\"67\" maxlength=\"500\"\n");
      out.write("						name=\"title\" placeholder=\"제목을 입력해주세요.\" /></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"right\" valign=\"top\"><br>공지사항 글내용</td>\n");
      out.write("					<td colspan=\"2\"><textarea name=\"content\" rows=\"10\" cols=\"65\"\n");
      out.write("							maxlength=\"4000\" placeholder=\"내용을 입력해주세요.\"></textarea></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"right\">이미지파일 첨부</td>\n");
      out.write("			  <td><input type=\"hidden\" name=\"imageFileName\" value=\"\" >\n");
      out.write("			  <input type=\"file\" name=\"uploadFile\"  onchange=\"readURL(this);\" /></td>\n");
      out.write("			  <td><img  id=\"preview\" src=\"#\"   width=200 height=200/></td>\n");
      out.write("			  \n");
      out.write("			  \n");
      out.write("			  <!-- <td >이미지파일 첨부</td>\n");
      out.write("				<td > <input type=\"button\" value=\"파일 추가\" onClick=\"fn_addFile()\"/></td> -->\n");
      out.write("				</tr>\n");
      out.write("				\n");
      out.write("				<!-- <tr>\n");
      out.write("				\n");
      out.write("				\n");
      out.write("\n");
      out.write("			</tr>\n");
      out.write("			\n");
      out.write("			<tr>\n");
      out.write("				<td colspan=\"4\"><div id=\"d_file\"></div></td>\n");
      out.write("			</tr> -->\n");
      out.write("					\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"right\"></td>\n");
      out.write("					<td colspan=\"2\"><input type=\"submit\" value=\"글쓰기\" \n");
      out.write("					style=\"background: #ca5d42; border: medium none; border-radius: 0; color: #FFFFFF; font-family: 'Roboto', sans-serif; padding: 6px 25px;\"/> <input\n");
      out.write("						type=button value=\"목록보기\" onClick=\"backToList(this.form)\" \n");
      out.write("						style=\"background: #ca5d42; border: medium none; border-radius: 0; color: #FFFFFF; font-family: 'Roboto', sans-serif; padding: 6px 25px;\"/></td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/notice/noticeForm.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/notice/noticeForm.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/notice/noticeForm.jsp(5,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
