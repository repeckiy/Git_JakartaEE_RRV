<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template title="Error">
    <div class="form-card" style="max-width:500px; margin: 40px auto 0 auto; text-align: center;">
        <h2>Error Occurred</h2>
        <div class="error-details" style="margin-bottom: 1.3rem;">
            <c:choose>
                <c:when test="${not empty pageContext.exception}">
                    <p>We're sorry, but an error occurred while processing your request.</p>
                    <p><strong>Error Type:</strong> ${pageContext.exception.class.name}</p>
                    <p><strong>Message:</strong> ${pageContext.exception.message}</p>
                </c:when>
                <c:when test="${not empty requestScope.error}">
                    <p>${requestScope.error}</p>
                </c:when>
                <c:otherwise>
                    <p>We're sorry, but an unexpected error occurred while processing your request.</p>
                </c:otherwise>
            </c:choose>
        </div>
        <div class="error-actions">
            <a href="${pageContext.request.contextPath}/lots" class="button">Return to Home</a>
        </div>
    </div>
</t:template>