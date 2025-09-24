package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.library.utils.DBConnection;

public final class adminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Admin Dashboard - Library Management System</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background: #f0f4f7;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        .msg {\n");
      out.write("            text-align: center;\n");
      out.write("            color: green;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .add-form {\n");
      out.write("            background: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            width: 400px;\n");
      out.write("            box-shadow: 0 5px 15px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"], input[type=\"number\"] {\n");
      out.write("            width: 90%;\n");
      out.write("            padding: 8px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 8px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background: #4facfe;\n");
      out.write("            border: none;\n");
      out.write("            color: white;\n");
      out.write("            font-weight: bold;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background: #007bbf;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 90%;\n");
      out.write("            margin: 30px auto;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background: #fff;\n");
      out.write("            box-shadow: 0 5px 15px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            padding: 12px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background: #4facfe;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #007bbf;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        a:hover {\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Welcome, Admin</h1>\n");
      out.write("\n");
      out.write("    <!-- Success/Error Messages -->\n");
      out.write("    <div class=\"msg\">\n");
      out.write("        ");

            String msg = request.getParameter("msg");
            if (msg != null) {
                out.print(msg);
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Add Book Form -->\n");
      out.write("    <div class=\"add-form\">\n");
      out.write("        <h2>Add New Book</h2>\n");
      out.write("        <form action=\"AddBookServlet\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"title\" placeholder=\"Book Title\" required><br>\n");
      out.write("            <input type=\"text\" name=\"author\" placeholder=\"Author\" required><br>\n");
      out.write("            <input type=\"text\" name=\"publisher\" placeholder=\"Publisher\" required><br>\n");
      out.write("            <input type=\"number\" name=\"year\" placeholder=\"Year\" required><br>\n");
      out.write("            <input type=\"submit\" value=\"Add Book\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Book List -->\n");
      out.write("    <h2 style=\"text-align:center;\">Book List</h2>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th><th>Title</th><th>Author</th>\n");
      out.write("            <th>Publisher</th><th>Year</th><th>Actions</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            try {
                Connection con = DBConnection.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM books");
                while (rs.next()) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( rs.getInt("id") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("title") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("author") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("publisher") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getInt("year") );
      out.write("</td>\n");
      out.write("            <td>\n");
      out.write("                <a href=\"updateBook.jsp?id=");
      out.print(rs.getInt("id"));
      out.write("&title=");
      out.print(rs.getString("title"));
      out.write("&author=");
      out.print(rs.getString("author"));
      out.write("&publisher=");
      out.print(rs.getString("publisher"));
      out.write("&year=");
      out.print(rs.getInt("year"));
      out.write("\">Edit</a> | \n");
      out.write("                <a href=\"DeleteBookServlet?id=");
      out.print(rs.getInt("id"));
      out.write("\" onclick=\"return confirm('Are you sure you want to delete this book?');\">Delete</a>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        ");

                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("    </table>\n");
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
