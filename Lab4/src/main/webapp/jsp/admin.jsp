<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:template title="Administrative user">
    <div class="admin-card">

        <h2 class="admin-title">Administration Panel</h2>


        <form class="create-user-inline" method="post">
            <input type="hidden" name="action" value="create">

            <input  type="text"     name="username" placeholder="Username"  required>
            <input  type="email"    name="email"    placeholder="Email"     required>
            <input  type="password" name="password" placeholder="Password"  required>

            <select name="role">
                <option value="User">User</option>
                <option value="Administrator">Administrator</option>
            </select>

            <button class="admin-table-btn create-btn" title="Create user">
                <i class="fa-solid fa-user-plus"></i>
            </button>
        </form>


        <div class="admin-table-container">
            <table class="admin-table">
                <colgroup>
                    <col style="width:24%;">
                    <col style="width:28%;">  
                    <col style="width:12%;"> 
                    <col style="width:18%;">
                    <col style="width:9%;">   
                    <col style="width:9%;"> 
                </colgroup>

                <thead>
                <tr>
                    <th>Username</th><th>Email</th><th>Password</th>
                    <th>Role</th><th>Lots</th><th>Actions</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="u" items="${users}">
                    <tr>
                        <td>${u.username}</td>
                        <td>${u.email}</td>

                        <!-- change password -->
                        <td>
                            <form class="inline-form" method="post">
                                <input type="hidden" name="action" value="setPassword">
                                <input type="hidden" name="userId" value="${u.id}">
                                <input class="admin-input-small" type="password"
                                       name="password" placeholder="New password" required>
                                <button class="admin-table-btn change"
                                        title="Change password">
                                    <i class="fa-solid fa-key"></i>
                                </button>
                            </form>
                        </td>

                        <!-- change role -->
                        <td>
                            <form class="inline-form" method="post">
                                <input type="hidden" name="action" value="setRole">
                                <input type="hidden" name="userId" value="${u.id}">
                                <select name="role" class="admin-select">
                                    <option value="User"
                                            ${u.role=='User'?'selected':''}>User</option>
                                    <option value="Administrator"
                                            ${u.role=='Administrator'?'selected':''}>Administrator</option>
                                </select>
                                <button class="admin-table-btn save" title="Save role">
                                    <i class="fa-solid fa-floppy-disk"></i>
                                </button>
                            </form>
                        </td>

                        <td style="text-align:center;">${u.ownedLots.size()}</td>

                        <!-- delete -->
                        <td>
                            <form method="post"
                                  onsubmit="return confirm('Delete user?');">
                                <input type="hidden" name="action" value="delete">
                                <input type="hidden" name="userId" value="${u.id}">
                                <button class="admin-table-btn delete"
                                        title="Delete user">
                                    <i class="fa-solid fa-trash"></i>
                                </button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</t:template>