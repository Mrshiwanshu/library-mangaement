<%-- 
    Document   : searchBook
    Created on : 24 Sep, 2025, 10:29:24 PM
    Author     : Mr shiwanshu
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.library.model.Book" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Books - Library Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #eef2f3;
            margin: 0;
            padding: 0;
        }
        header {
            background: #00b894;
            color: white;
            padding: 15px;
            text-align: center;
        }
        h1 {
            margin: 0;
        }
        .container {
            padding: 30px;
        }
        .search-box {
            margin-bottom: 20px;
            text-align: center;
        }
        input[type="text"] {
            padding: 10px;
            width: 300px;
            border-radius: 8px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            padding: 10px 20px;
            background: #00b894;
            color: white;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-weight: bold;
        }
        input[type="submit"]:hover {
            background: #019874;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 30px;
        }
        table, th, td {
            border: 1px solid #aaa;
        }
        th, td {
            padding: 12px;
            text-align: center;
        }
        th {
            background: #00b894;
            color: white;
        }
        .back-link {
            display: block;
            margin-top: 20px;
            text-align: center;
        }
        .back-link a {
            background: #4facfe;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 8px;
            font-weight: bold;
        }
        .back-link a:hover {
            background: #007bbf;
        }
    </style>
</head>
<body>

<header>
    <h1>Search Books</h1>
</header>

<div class="container">

    <!-- Search Form -->
    <div class="search-box">
        <form action="SearchBookServlet1" method="get">
            <input type="text" name="query" placeholder="Enter book title or author" required>
            <input type="submit" value="Search">
        </form>
    </div>

    <!-- Search Results -->
    <%
        List<Book> books = (List<Book>) request.getAttribute("books");

        if (books != null && !books.isEmpty()) {
    %>
        <table>
            <tr>
                <th>ID</th><th>Title</th><th>Author</th><th>Publisher</th><th>Year</th>
            </tr>
            <%
                for (Book book : books) {
            %>
            <tr>
                <td><%= book.getId() %></td>
                <td><%= book.getTitle() %></td>
                <td><%= book.getAuthor() %></td>
                <td><%= book.getPublisher() %></td>
                <td><%= book.getYear() %></td>
            </tr>
            <% } %>
        </table>
    <%
        } else if (request.getAttribute("books") != null) {
    %>
        <p style="text-align:center; color:red;">No books found!</p>
    <%
        }
    %>

    <div class="back-link">
        <a href="userDashboard.jsp">⬅ Back to Dashboard</a>
    </div>

</div>

</body>
</html>
