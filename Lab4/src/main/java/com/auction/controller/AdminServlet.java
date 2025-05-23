package com.auction.controller;

import com.auction.model.User;
import com.auction.services.UserService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdminServlet", urlPatterns = {"/admin"})
public class AdminServlet extends HttpServlet {
    @EJB
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        User currentUser = (session != null) ? (User) session.getAttribute("user") : null;
        if (currentUser == null || !"Administrator".equals(currentUser.getRole())) {
            response.sendRedirect(request.getContextPath() + "/lots?error=Access+denied");
            return;
        }
        List<User> users = userService.getAllUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher("/jsp/admin.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String userId = request.getParameter("userId");
        switch (action) {
            case "setRole" -> userService.setUserRole(userId, request.getParameter("role"));
            case "setPassword" -> userService.updateUserPassword(userId, request.getParameter("password"));
            case "delete" -> userService.deleteUser(userId);
            case "create" -> {
                String username = request.getParameter("username");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String role = request.getParameter("role");
                User user = new User(username, email, password, role);
                userService.addUser(user);
            }
        }
        response.sendRedirect(request.getContextPath() + "/admin");
    }
}