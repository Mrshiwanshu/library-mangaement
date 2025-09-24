

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.library.utils.DBConnection;

public class DeleteBookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(req.getParameter("id")); // book ID passed in URL
        
        try {
            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM books WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int rowsDeleted = ps.executeUpdate();
            
            if (rowsDeleted > 0) {
                res.sendRedirect("adminDashboard.jsp?msg=Book Deleted Successfully");
            } else {
                res.sendRedirect("adminDashboard.jsp?msg=Delete Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("adminDashboard.jsp?msg=Error Occurred");
        }
    }
}
