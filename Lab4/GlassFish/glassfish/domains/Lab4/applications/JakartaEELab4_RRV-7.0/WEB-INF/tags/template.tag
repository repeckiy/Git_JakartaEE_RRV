<%@ tag description="Page template" pageEncoding="UTF-8" %>
<%@ attribute name="title" required="true" %>
<%@ attribute name="head" fragment="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title} - Auction System</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <style>
        
    a.button-nav { text-decoration:none; } 
    </style>
    <jsp:invoke fragment="head"/>
</head>
<body>
<header>
    <div class="centered-header">
        <h1 style="text-align:center; font-size:2.4rem; margin:32px 0 10px 0; color:#374151;">Auction System</h1>
        <nav class="navbar">
            <a href="${pageContext.request.contextPath}/lots"
               class="button-nav ${empty param.action || param.action ne 'all' ? 'selected' : ''}">Active Lots</a>
            <a href="${pageContext.request.contextPath}/lots?action=all"
               class="button-nav ${param.action eq 'all' ? 'selected' : ''}">All Lots</a>
            <a href="${pageContext.request.contextPath}/lot?action=create"
               class="button-nav ${title eq 'Create Lot' ? 'selected' : ''}">Create Lot</a>
            <form action="${pageContext.request.contextPath}/search" method="get" class="searchbar">
                <input type="text" name="keyword" placeholder="Search..." class="search-input"/>
                <button type="submit" class="button-nav">Search</button>
            </form>
            <c:if test="${not empty sessionScope.user and sessionScope.user.role eq 'Administrator'}">
                <a href="${pageContext.request.contextPath}/admin"
                   class="button-nav ${title eq 'Administrative user' ? 'selected' : ''}">Admin Panel</a>
            </c:if>
            <c:if test="${not empty sessionScope.user}">
                <span class="navbar-user">${sessionScope.user.username}</span>
                <a href="${pageContext.request.contextPath}/logout" class="button-nav logout">Logout</a>
            </c:if>
        </nav>
    </div>
</header>
<main>
    <jsp:doBody/>
</main>
<footer>
    <div style="background:#2c3e50; color:#fff; padding:16px 0; text-align:center; margin-top:40px;">
        &copy; Auction System
    </div>
</footer>
</body>
</html>