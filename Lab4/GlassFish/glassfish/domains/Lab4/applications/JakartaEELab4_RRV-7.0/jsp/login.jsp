<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login - Auction System</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="login-outer-container">
    <div class="login-card">
        <h1 class="login-title">Auction System</h1>
        <h2 class="login-subtitle">Login</h2>
        <c:if test="${not empty error}">
            <div class="error-message">${error}</div>
        </c:if>
        <form action="${pageContext.request.contextPath}/login" method="post">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required autocomplete="username">
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required autocomplete="current-password">
            </div>
            <button type="submit" class="main-btn">Login</button>
        </form>
    </div>
</div>
</body>
</html>