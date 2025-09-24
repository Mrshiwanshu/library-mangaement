
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.library.utils.DBConnection;

public class SearchBookServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String keyword = req.getParameter("keyword");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM books WHERE title LIKE ? OR author LIKE ?");
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            
            out.println("<h2>Search Results</h2>");
            while (rs.next()) {
                out.println("<p>" + rs.getString("title") + " by " + rs.getString("author") + "</p>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
