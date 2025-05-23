<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<t:template title="All Lots">
    <h2 class="centered-title">All Lots</h2>
    <c:choose>
        <c:when test="${empty lots}">
            <div class="centered-title" style="font-size: 18px;">No lots available.</div>
        </c:when>
        <c:otherwise>
            <div class="lots-grid">
                <c:forEach var="lot" items="${lots}">
                    <div class="lot-card ${lot.active ? 'active' : 'inactive'}">
                        <h3 class="lot-title">${lot.title}</h3>
                        <div class="lot-description">
                            <c:choose>
                                <c:when test="${fn:length(lot.description) > 60}">
                                    ${fn:substring(lot.description, 0, 60)}...
                                </c:when>
                                <c:otherwise>
                                    ${lot.description}
                                </c:otherwise>
                            </c:choose>
                        </div>
                        <div class="lot-status-row">
                            <span class="status ${lot.active ? 'active' : 'inactive'}">
                                ${lot.active ? 'ACTIVE' : 'INACTIVE'}
                            </span>
                        </div>
                        <div class="lot-info">
                            <span>Current Price: <fmt:formatNumber value="${lot.currentPrice}" type="currency" currencySymbol="$"/></span>
                        </div>
                        <div class="lot-info">
                            <span>Bids: ${lot.bids.size()}</span>
                        </div>
                        <a href="${pageContext.request.contextPath}/lot?id=${lot.id}" class="button blue wide">View Details</a>
                    </div>
                </c:forEach>
            </div>
        </c:otherwise>
    </c:choose>
</t:template>