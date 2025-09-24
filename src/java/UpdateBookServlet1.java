

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.library.utils.DBConnection;

public class UpdateBookServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        
        // Retrieve form values
        int id = Integer.parseInt(req.getParameter("id"));
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String publisher = req.getParameter("publisher");
        int year = Integer.parseInt(req.getParameter("year"));
        
        try {
            Connection con = DBConnection.getConnection();
            
            String sql = "UPDATE books SET title=?, author=?, publisher=?, year=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, publisher);
            ps.setInt(4, year);
            ps.setInt(5, id);
            
            int rowsUpdated = ps.executeUpdate();
            
            if (rowsUpdated > 0) {
                res.sendRedirect("adminDashboard.jsp?msg=Book Updated Successfully");
            } else {
                res.sendRedirect("adminDashboard.jsp?msg=Update Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("adminDashboard.jsp?msg=Error Occurred");
        }
    }
}
