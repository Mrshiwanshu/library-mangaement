package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>User Dashboard - Library Management System</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background: #eef2f3;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            background: #00b894;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            padding: 30px;\n");
      out.write("        }\n");
      out.write("        .search-box {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            padding: 10px;\n");
      out.write("            width: 300px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background: #00b894;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background: #019874;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("        table, th, td {\n");
      out.write("            border: 1px solid #aaa;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 12px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background: #00b894;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .logout {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .logout a {\n");
      out.write("            background: #d63031;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .logout a:hover {\n");
      out.write("            background: #b71c1c;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("    <h1>User Dashboard</h1>\n");
      out.write("    <p>Welcome! Search for your favorite books below</p>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    <!-- Search Form -->\n");
      out.write("    <div class=\"search-box\">\n");
      out.write("        <form action=\"SearchBookServlet\" method=\"get\">\n");
      out.write("            <input type=\"text\" name=\"query\" placeholder=\"Enter book title or author\" required>\n");
      out.write("            <input type=\"submit\" value=\"Search\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Results Table -->\n");
      out.write("    ");

        java.util.List<com.library.model.Book> books = 
            (java.util.List<com.library.model.Book>) request.getAttribute("books");

        if (books != null && !books.isEmpty()) {
    
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Title</th>\n");
      out.write("                <th>Author</th>\n");
      out.write("                <th>Publisher</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for (com.library.model.Book book : books) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( book.getId() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( book.getTitle() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( book.getAuthor() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( book.getPublisher() );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </table>\n");
      out.write("    ");

        } else if (request.getAttribute("books") != null) {
    
      out.write("\n");
      out.write("        <p style=\"text-align:center; color:red;\">No books found!</p>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Logout -->\n");
      out.write("    <div class=\"logout\">\n");
      out.write("        <a href=\"index.jsp\">Logout</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
