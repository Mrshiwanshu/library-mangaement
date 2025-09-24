<%-- 
    Document   : adminDashboard
    Created on : 24 Sep, 2025, 10:24:44 PM
    Author     : Mr shiwanshu
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.library.utils.DBConnection" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard - Library Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f0f4f7;
            padding: 20px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .msg {
            text-align: center;
            color: green;
            font-weight: bold;
        }
        .add-form {
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            margin: 20px auto;
            width: 400px;
            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
        }
        input[type="text"], input[type="number"] {
            width: 90%;
            padding: 8px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
        }
        input[type="submit"] {
            padding: 10px 20px;
            background: #4facfe;
            border: none;
            color: white;
            font-weight: bold;
            border-radius: 8px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background: #007bbf;
        }
        table {
            width: 90%;
            margin: 30px auto;
            border-collapse: collapse;
            background: #fff;
            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
        }
        th, td {
            border: 1px solid #ddd;
            padding: 12px;
            text-align: center;
        }
        th {
            background: #4facfe;
            color: white;
        }
        a {
            text-decoration: none;
            color: #007bbf;
            font-weight: bold;
        }
        a:hover {
            color: red;
        }
    </style>
</head>
<body>
    <h1>Welcome, Admin</h1>

    <!-- Success/Error Messages -->
    <div class="msg">
        <%
            String msg = request.getParameter("msg");
            if (msg != null) {
                out.print(msg);
            }
        %>
    </div>

    <!-- Add Book Form -->
    <div class="add-form">
        <h2>Add New Book</h2>
        <form action="AddBookServlet" method="post">
            <input type="text" name="title" placeholder="Book Title" required><br>
            <input type="text" name="author" placeholder="Author" required><br>
            <input type="text" name="publisher" placeholder="Publisher" required><br>
            <input type="number" name="year" placeholder="Year" required><br>
            <input type="submit" value="Add Book">
        </form>
    </div>

    <!-- Book List -->
    <h2 style="text-align:center;">Book List</h2>
    <table>
        <tr>
            <th>ID</th><th>Title</th><th>Author</th>
            <th>Publisher</th><th>Year</th><th>Actions</th>
        </tr>
        <%
            try {
                Connection con = DBConnection.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM books");
                while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("title") %></td>
            <td><%= rs.getString("author") %></td>
            <td><%= rs.getString("publisher") %></td>
            <td><%= rs.getInt("year") %></td>
            <td>
                <a href="updateBook.jsp?id=<%=rs.getInt("id")%>&title=<%=rs.getString("title")%>&author=<%=rs.getString("author")%>&publisher=<%=rs.getString("publisher")%>&year=<%=rs.getInt("year")%>">Edit</a> | 
                <a href="DeleteBookServlet?id=<%=rs.getInt("id")%>" onclick="return confirm('Are you sure you want to delete this book?');">Delete</a>
            </td>
        </tr>
        <%
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        %>
    </table>
</body>
</html>
