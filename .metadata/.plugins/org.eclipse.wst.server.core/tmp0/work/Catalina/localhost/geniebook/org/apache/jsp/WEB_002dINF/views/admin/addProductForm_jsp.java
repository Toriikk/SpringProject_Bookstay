/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-08-31 08:19:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProductForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("button, .button {\n");
      out.write("   border-radius: 10px;\n");
      out.write("   background: ##ca5d42;\n");
      out.write("   border: medium none;\n");
      out.write("   color: #FFFFFF;\n");
      out.write("   font-family: 'Roboto', sans-serif;\n");
      out.write("   font-size: 20px;\n");
      out.write("   padding: 4px 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th {\n");
      out.write("   font-size: 17px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("   function readURL(input) {\n");
      out.write("      if (input.files && input.files[0]) {\n");
      out.write("         var reader = new FileReader();\n");
      out.write("         reader.onload = function(e) {\n");
      out.write("            $('#preview').attr('src', e.target.result);\n");
      out.write("         }\n");
      out.write("         reader.readAsDataURL(input.files[0]);\n");
      out.write("      }\n");
      out.write("   }\n");
      out.write("\n");
      out.write("   var cnt = 1;\n");
      out.write("   function fn_addFile() {\n");
      out.write("      $(\"#d_file\")\n");
      out.write("            .append(\"<br>\" + \"<input type='file' name='file\"+cnt+\"' />\");\n");
      out.write("      cnt++;\n");
      out.write("   }\n");
      out.write("</script>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <div class=\"container\">\n");
      out.write("      <h2>\n");
      out.write("         <b>상품 추가</b>\n");
      out.write("      </h2>\n");
      out.write("      <div class=\"col-sm-16\">\n");
      out.write("         <form\n");
      out.write("            action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/addProduct?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('=');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("            enctype=\"multipart/form-data\" method=\"post\">\n");
      out.write("            <table width=\"80%\" style=\"padding: 10px 0 10px 0; font-size:17px;\">\n");
      out.write("               <tr height=\"2\" bgcolor=\"##ca5d42\">\n");
      out.write("                  <td colspan=\"3\"></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                  <td rowspan=\"9\">\n");
      out.write("                     <input type=\"hidden\" name=\"imageFileName\" value=\"\"> \n");
      out.write("                     <img  id=\"preview\" src=\"#\" width=350 height=500 />\n");
      out.write("                     <input type=\"file\" name=\"uploadFile\" onchange=\"readURL(this);\" /> \n");
      out.write("                  </td>\n");
      out.write("               <tr>\n");
      out.write("               <tr>\n");
      out.write("                  <th>카테고리</th>\n");
      out.write("                  <td colspan=\"2\"><select name=\"category\" id=\"category\">\n");
      out.write("                        <optgroup label=\"소설\">\n");
      out.write("                           <option value=\"novel1\">나라별 소설</option>\n");
      out.write("                           <option value=\"novel2\">고전/문학</option>\n");
      out.write("                           <option value=\"novel3\">장르소설</option>\n");
      out.write("                        </optgroup>\n");
      out.write("                        <optgroup label=\"시/에세이\">\n");
      out.write("                           <option value=\"poem1\">한국시</option>\n");
      out.write("                           <option value=\"poem2\">외국시</option>\n");
      out.write("                           <option value=\"poem3\">여행 에세이</option>\n");
      out.write("                        </optgroup>\n");
      out.write("                        <optgroup label=\"자기계발\">\n");
      out.write("                           <option value=\"selfDevelopment1\">대화/협상</option>\n");
      out.write("                           <option value=\"selfDevelopment2\">자기능력계발</option>\n");
      out.write("                        </optgroup>\n");
      out.write("                        <optgroup label=\"인문\">\n");
      out.write("                           <option value=\"liberal1\">인문일반</option>\n");
      out.write("                           <option value=\"liberal2\">심리</option>\n");
      out.write("                           <option value=\"liberal3\">철학</option>\n");
      out.write("                        </optgroup>\n");
      out.write("                        <optgroup label=\"어린이\">\n");
      out.write("                           <option value=\"child1\">어린이(공통)</option>\n");
      out.write("                           <option value=\"child2\">초등</option>\n");
      out.write("                        </optgroup>\n");
      out.write("                  </select>\n");
      out.write("                     <p></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                  <th><p>책 이름</th>\n");
      out.write("                  <td colspan=\"2\"><p>\n");
      out.write("                        <input type=\"text\" name=\"bookName\" id=\"bookName\" style=\"width:350px\"></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                  <th><p>작가</th>\n");
      out.write("                  <td colspan=\"2\"><p>\n");
      out.write("                        <input type=\"text\" name=\"writer\" id=\"writer\" style=\"width:350px\"></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                  <th><p>출판사</th>\n");
      out.write("                  <td colspan=\"2\"><p>\n");
      out.write("                        <input type=\"text\" name=\"publisher\" id=\"publisher\" style=\"width:350px\"></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                  <th><p>출판날짜</th>\n");
      out.write("                  <td colspan=\"2\"><p>\n");
      out.write("                        <input type=\"date\" name=\"pubYear\" id=\"pubYear\"></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                  <th><p>가격</th>\n");
      out.write("                  <td colspan=\"2\"><p>\n");
      out.write("                        <input type=\"number\" name=\"price\" id=\"price\"></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                  <th><p>재고</th>\n");
      out.write("                  <td colspan=\"2\"><p>\n");
      out.write("                        <input type=\"number\" name=\"stock\" id=\"stock\"></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                  <td></td>\n");
      out.write("                  <th><p>설명</th>\n");
      out.write("                  <td><p>\n");
      out.write("                        <textarea rows=\"10\" cols=\"45\" name=\"description\">책에 대해 간단히 소개해보세요!</textarea></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                  <td colspan=\"3\" align=\"center\"><p>\n");
      out.write("                        <!-- <button type=\"button\" class=\"button\" onclick=\"history.go(-1)\">뒤로가기</button> -->\n");
      out.write("                        <input type=\"reset\" class=\"button\" value=\"다시입력\" /> <input\n");
      out.write("                           type=\"submit\" value=\"상품 추가\" class=\"button\" />\n");
      out.write("                     <p>\n");
      out.write("                     <p></td>\n");
      out.write("\n");
      out.write("               </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("         </form>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<!--/form-->");
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
      // /WEB-INF/views/admin/addProductForm.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/admin/addProductForm.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/admin/addProductForm.jsp(4,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
