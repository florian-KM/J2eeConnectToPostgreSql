package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<body>\n");
      out.write("<section id=\"container\">\n");
      out.write("<!--header start-->\n");
      out.write("<!--main content start-->\n");
      out.write("<section id=\"main-content\">\n");
      out.write("\t<section class=\"wrapper\">\n");
      out.write("\t\t\t\n");
      out.write("            <!-- page start-->\n");
      out.write("            <div class=\"row\" >\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <section class=\"panel\">\n");
      out.write("                        <header class=\"panel-heading\">\n");
      out.write("                            Formulaire Enregistrement\n");
      out.write("                            <span class=\"tools pull-right\">\n");
      out.write("                                <a class=\"fa fa-chevron-down\" href=\"javascript:;\"></a>\n");
      out.write("                                <a class=\"fa fa-cog\" href=\"javascript:;\"></a>\n");
      out.write("                                <a class=\"fa fa-times\" href=\"javascript:;\"></a>\n");
      out.write("                             </span>\n");
      out.write("                        </header>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <form role=\"form\" class=\"form-horizontal\" method=\"post\" action=\"SymptomeController\">\n");
      out.write("                            \t<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mode=='editer'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            \t\t<div class=\"form-group has-primary\">\n");
      out.write("\t                                    <div class=\"col-lg-6\">\n");
      out.write("                                        <input type=\"hidden\" placeholder=\"\" id=\"f-name\"  value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" name=\"id\">\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                  </div>\n");
      out.write("                            \t</c:if>\n");
      out.write("                            \t \n");
      out.write("                                <div class=\"form-group has-primary\">\n");
      out.write("                                    <label class=\"col-lg-3 control-label\">Nom</label>\n");
      out.write("                                    <div class=\"col-lg-6\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"\" id=\"f-name\" value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nom }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" name=\"nom\">\n");
      out.write("                                        <p class=\"help-block\">entrer le nom </p>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                               <div class=\"form-group has-primary\">\n");
      out.write("                                    <label class=\"col-lg-3 control-label\">Description</label>\n");
      out.write("                                    <div class=\"col-lg-6\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"\" id=\"f-name\" class=\"form-control\" value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${description }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"description\">\n");
      out.write("                                        <p class=\"help-block\">entrer la description</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-lg-offset-3 col-lg-6\">\n");
      out.write("                                       <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mode=='ajouter'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                       \t\t<button class=\"btn btn-primary\" type=\"submit\" value=\"ajouter\" name=\"action\">Ajouter</button>\n");
      out.write("                                       </c:if>\n");
      out.write("                                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mode=='editer'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                       \t\t<button class=\"btn btn-primary\" type=\"submit\" value=\"editer\" name=\"action\">Modifier</button>\n");
      out.write("                                       </c:if>\n");
      out.write("                                       \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"table-agile-info\">\n");
      out.write("\t\t<a href=\"SymptomeController?mode=ajouter\" class=\"btn btn-success\">Nouveau Symptome</a>\n");
      out.write("   <div class=\"panel panel-default\">\n");
      out.write("    <div class=\"panel-heading\">\n");
      out.write("     Affichage Des symptomes\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("      <table class=\"table table-hover\" ui-jq=\"footable\" ui-options='{\n");
      out.write("        \"paging\": {\n");
      out.write("          \"enabled\": true\n");
      out.write("        },\n");
      out.write("        \"filtering\": {\n");
      out.write("          \"enabled\": true\n");
      out.write("        },\n");
      out.write("        \"sorting\": {\n");
      out.write("          \"enabled\": true\n");
      out.write("        }}'>\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("            <th data-breakpoints=\"xs\" width=\"20%\">ID</th>\n");
      out.write("            <th width=\"30%\">Nom</th>\n");
      out.write("            <th width=\"30%\">Description</th>\n");
      out.write("            <th width=\"20%\">Action</th>\n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("        \t<c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"symp\" varStatus=\"status\">\n");
      out.write("        \t\t<tr>\n");
      out.write("        \t\t\t<td> <c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ symp.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("        \t\t\t<td align=\"justify\"> <c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ symp.nom }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("        \t\t\t<td> <c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ symp.description }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("        \t\t\t<td> <a href=\"SymptomeController?action=delete&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${symp.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-danger btn-sm\">Supprimer</a></td>\n");
      out.write("        \t\t\t<td> <a href=\"SymptomeController?mode=editer&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${symp.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&nom=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${symp.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&description=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${symp.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-info btn-sm\">Modifier</a></td>\n");
      out.write("        \t\t</tr>\n");
      out.write("\t\t\t</c:forEach>\n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!--main content end-->\n");
      out.write("</section>\n");
      out.write("</body>\n");
      out.write("\n");
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
