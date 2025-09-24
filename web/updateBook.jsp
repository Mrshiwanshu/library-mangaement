<%-- 
    Document   : updateBook
    Created on : 24 Sep, 2025, 10:27:44 PM
    Author     : Mr shiwanshu
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.library.utils.DBConnection" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Book - Library Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f1f1f1;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-box {
            background: #fff;
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
            width: 400px;
            text-align: center;
        }
        h2 {
            margin-bottom: 25px;
            color: #333;
        }
        input[type="text"], input[type="number"] {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 8px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            width: 95%;
            padding: 12px;
            background: #4facfe;
            color: white;
            border: none;
            border-radius: 8px;
            font-weight: bold;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background: #007bbf;
        }
        .back-link {
            display: block;
            margin-top: 20px;
            text-decoration: none;
            color: #4facfe;
        }
    </style>
</head>
<body>

<div class="form-box">
    <h2>Update Book Details</h2>
    <%
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String publisher = request.getParameter("publisher");
        int year = Integer.parseInt(request.getParameter("year"));
    %>
    <form action="UpdateBookServlet1" method="post">
        <input type="hidden" name="id" value="<%= id %>">
        <input type="text" name="title" value="<%= title %>" placeholder="Book Title" required><br>
        <input type="text" name="author" value="<%= author %>" placeholder="Author" required><br>
        <input type="text" name="publisher" value="<%= publisher %>" placeholder="Publisher" required><br>
        <input type="number" name="year" value="<%= year %>" placeholder="Year of Publication" required><br>
        <input type="submit" value="Update Book">
    </form>

    <a href="adminDashboard.jsp" class="back-link">⬅ Back to Dashboard</a>
</div>

</body>
</html>
