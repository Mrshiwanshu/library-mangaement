
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.library.utils.DBConnection;

public class AddBookServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String publisher = req.getParameter("publisher");
        int year = Integer.parseInt(req.getParameter("year"));
        
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO books(title,author,publisher,year) VALUES(?,?,?,?)");
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, publisher);
            ps.setInt(4, year);
            ps.executeUpdate();
            res.sendRedirect("adminDashboard.jsp?msg=Book Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
