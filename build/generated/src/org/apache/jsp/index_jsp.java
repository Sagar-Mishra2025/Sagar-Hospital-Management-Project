package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/C1.jsp");
    _jspx_dependants.add("/C2.jsp");
  }

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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"image, nav/bootstrap.min.css\"/>\n");
      out.write("            <script src=\"image, nav/popper.min.js\"></script>\n");
      out.write("            <script src=\"image, nav/boot/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-light\" data-bs-theme=\"light\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarColor03\" aria-controls=\"navbarColor03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarColor03\">\n");
      out.write("      <ul class=\"navbar-nav me-auto\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" href=\"#\">Home\n");
      out.write("            <span class=\"visually-hidden\">(current)</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Features</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Pricing</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">About</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown</a>\n");
      out.write("          <div class=\"dropdown-menu\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Separated link</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\">\n");
      out.write("        <input class=\"form-control me-sm-2\" type=\"search\" placeholder=\"Search\">\n");
      out.write("        <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\" fdprocessedid=\"ojjp4\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .w\n");
      out.write("    {\n");
      out.write("        color: red;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    a\n");
      out.write("    {\n");
      out.write("        color: white; \n");
      out.write("        text-shadow: 15px;\n");
      out.write("        text-decoration: none;\n");
      out.write("        font-size: 25px;\n");
      out.write("    }\n");
      out.write("    a:hover\n");
      out.write("    {\n");
      out.write("        color: aqua;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<h1>\n");
      out.write("    <span>Welcome</span>\n");
      out.write("    <span>Sagar</span>\n");
      out.write("    <span class=\"w\">Hospital</span>\n");
      out.write("</h1>\n");
      out.write("<hr>\n");
      out.write("<div>\n");
      out.write("    \n");
      out.write("<h3>\n");
      out.write("   \n");
      out.write("    <button class=\"btn btn-info\"  type=\"button\" fdprocessedid=\"a8n4qh\"><a href=\"Loginform.jsp\">Login</a></button>\n");
      out.write("    <button class=\"btn btn-info\" style=\"margin-left: 20px;\" type=\"button\" fdprocessedid=\"a8n4qh\"><a href=\"HospitalReg.jsp\">Hospital Registration</a></button>\n");
      out.write("</h3>\n");
      out.write("    <div style=\"float: right; margin-right: 30px;\">\n");
      out.write("        <img src=\"image, nav/home.jpeg\" width=\"500px;\" height=\"320px;\" style=\"margin-top:  -78px; border-radius: 15px; border: 3px solid red;\"/>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container-fluid bg-lighty copyright text-center bg-light\" data-bs-theme=\"light\" style=\"height: 251px; margin-top: 250px\">\n");
      out.write(" \n");
      out.write("    <p style=\"font-size: 50; color: springgreen\">&copy <span>Copyright By </span></p<strong class=\"px-1 sitename\">SAGAR MISHRA</strong>\n");
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
}
