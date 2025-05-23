<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<%@ taglib prefix="t"   tagdir="/WEB-INF/tags" %>

<t:template title="${lot.title}">
    <!-- Current user helpers -->
    <c:set var="cur"     value="${sessionScope.user}" />
    <c:set var="isOwner" value="${not empty cur and cur.id   == lot.owner.id}" />
    <c:set var="isAdmin" value="${not empty cur and cur.role == 'Administrator'}" />

    <div class="lot-details-card">
        <!-- ----------- header ----------- -->
        <h2 class="lot-title">${lot.title}</h2>
        <span class="status ${lot.active ? 'active' : 'inactive'}">
            ${lot.active ? 'ACTIVE' : 'INACTIVE'}
        </span>

        <!-- ----------- info ----------- -->
        <p>${lot.description}</p>
        <p><b>Start Price:</b>   <fmt:formatNumber value="${lot.startPrice}"   minFractionDigits="2"/></p>
        <p><b>Current Price:</b> <fmt:formatNumber value="${lot.currentPrice}" minFractionDigits="2"/></p>
        <p><b>Created:</b>       <fmt:formatDate   value="${lot.createdAtDate}" pattern="dd.MM.yyyy HH:mm"/></p>

        <c:if test="${not empty lot.startedAt}">
            <p><b>Auction Started:</b>
               <fmt:formatDate value="${lot.startedAtDate}" pattern="dd.MM.yyyy HH:mm"/></p>
        </c:if>
        <c:if test="${not empty lot.endedAt}">
            <p><b>Auction Ended:</b>
               <fmt:formatDate value="${lot.endedAtDate}" pattern="dd.MM.yyyy HH:mm"/></p>
        </c:if>

        <p><b>Owner:</b> <b>${lot.owner.username}</b> (${lot.owner.email})</p>

        <!-- ----------- ADMIN / OWNER ACTIONS ----------- -->
        <c:if test="${isOwner or isAdmin}">
            <div class="action-buttons-vertical">
                <c:choose>
                    <c:when test="${!lot.active}">
                        <form action="${pageContext.request.contextPath}/lot?id=${lot.id}" method="post">
                            <input type="hidden" name="action" value="start"/>
                            <button class="button green">Start</button>
                        </form>
                    </c:when>
                    <c:otherwise>
                        <form action="${pageContext.request.contextPath}/lot?id=${lot.id}" method="post">
                            <input type="hidden" name="action" value="stop"/>
                            <button class="button orange">Stop</button>
                        </form>
                    </c:otherwise>
                </c:choose>

                <form action="${pageContext.request.contextPath}/lot?id=${lot.id}" method="post"
                      onsubmit="return confirm('Delete this lot?');">
                    <input type="hidden" name="action" value="delete"/>
                    <button class="button red">Delete</button>
                </form>
            </div>
        </c:if>

        <!-- ----------- BID FORM (only if not owner) ----------- -->
        <c:if test="${lot.active and !isOwner}">
            <form class="bid-form"
                  action="${pageContext.request.contextPath}/lot?id=${lot.id}" method="post">
                <input type="hidden" name="action" value="bid"/>
                <label for="bidAmount">
                    Your bid
                    <small>(min&nbsp;<fmt:formatNumber value="${lot.currentPrice + 1}" minFractionDigits="2"/>)</small>:
                </label>
                <input  class="bid-input" type="number" id="bidAmount" name="bidAmount"
                        min="${lot.currentPrice + 1}" step="0.01" required>
                <button class="button blue big" style="width:180px;">Place&nbsp;Bid</button>
            </form>
        </c:if>

        <c:if test="${!lot.active}">
            <p class="auction-closed">The auction is not active ? bidding disabled.</p>
        </c:if>

        <!-- ----------- BID HISTORY ----------- -->
        <h3>Bid History</h3>
        <c:choose>
            <c:when test="${empty lot.bids}">
                <p>No bids yet.</p>
            </c:when>
            <c:otherwise>
                <table class="bids-table">
                    <tr><th>Amount</th><th>Date &amp; Time</th><th>User</th></tr>
                    <c:forEach var="b" items="${lot.bids}">
                        <tr>
                            <td><fmt:formatNumber value="${b.amount}" minFractionDigits="2"/></td>
                            <td><fmt:formatDate value="${b.createdAtDate}" pattern="dd.MM.yyyy HH:mm:ss"/></td>
                            <td>${b.user.username}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:otherwise>
        </c:choose>
    </div>
</t:template>