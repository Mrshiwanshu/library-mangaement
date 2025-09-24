<%-- 
    Document   : userDashboard
    Created on : 24 Sep, 2025, 10:25:39 PM
    Author     : Mr shiwanshu
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Dashboard - Library Management System</title>
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
        .logout {
            margin-top: 20px;
            text-align: center;
        }
        .logout a {
            background: #d63031;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 8px;
            font-weight: bold;
        }
        .logout a:hover {
            background: #b71c1c;
        }
    </style>
</head>
<body>

<header>
    <h1>User Dashboard</h1>
    <p>Welcome! Search for your favorite books below</p>
</header>

<div class="container">

    <!-- Search Form -->
    <div class="search-box">
        <form action="SearchBookServlet" method="get">
            <input type="text" name="query" placeholder="Enter book title or author" required>
            <input type="submit" value="Search">
        </form>
    </div>

    <!-- Results Table -->
    <%
        java.util.List<com.library.model.Book> books = 
            (java.util.List<com.library.model.Book>) request.getAttribute("books");

        if (books != null && !books.isEmpty()) {
    %>
        <table>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Publisher</th>
            </tr>
            <%
                for (com.library.model.Book book : books) {
            %>
            <tr>
                <td><%= book.getId() %></td>
                <td><%= book.getTitle() %></td>
                <td><%= book.getAuthor() %></td>
                <td><%= book.getPublisher() %></td>
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

    <!-- Logout -->
    <div class="logout">
        <a href="index.jsp">Logout</a>
    </div>

</div>

</body>
</html>
