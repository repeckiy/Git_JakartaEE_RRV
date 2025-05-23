package com.auction.controller;

import com.auction.model.Lot;
import com.auction.model.User;
import com.auction.services.BidService;
import com.auction.services.LotService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * ЄДИНИЙ сервлет-контролер для роботи з одним лотом:
 *   – GET  /lot?id=...                 → сторінка лоту
 *   – GET  /lot?action=create          → форма створення
 *   – POST /lot  (action=create)       → створити
 *   – POST /lot  (action=start/stop)   → керування аукціоном
 *   – POST /lot  (action=bid)          → зробити ставку
 *   – POST /lot  (action=delete)       → видалити
 */
@WebServlet(name = "LotServlet", urlPatterns = {"/lot"})
public class LotServlet extends HttpServlet {

    @EJB private LotService lotService;
    @EJB private BidService bidService;

    /*----------------------------------------------------------  GET  */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        /* 1. Авторизація ------------------------------------------------- */
        HttpSession session = req.getSession(false);
        User currentUser = (session != null) ? (User) session.getAttribute("user") : null;
        if (currentUser == null) {                 // не ввійшов → на логін
            resp.sendRedirect(req.getContextPath() + "/login");
            return;
        }

        /* 2. Розбір параметрів ------------------------------------------- */
        String action = req.getParameter("action");    // create | null
        String lotId  = req.getParameter("id");        // UUID або null

        /* 3. Форма створення --------------------------------------------- */
        if ("create".equals(action)) {
            req.getRequestDispatcher("/jsp/create-lot.jsp").forward(req, resp);
            return;
        }

        /* 4. Деталі конкретного лоту ------------------------------------- */
        if (lotId != null) {
            Lot lot = lotService.getLot(lotId);
            if (lot != null) {
                req.setAttribute("lot", lot);
                req.getRequestDispatcher("/jsp/lot-details.jsp").forward(req, resp);
                return;
            }
        }

        /* 5. Все інше → список лотів ------------------------------------- */
        resp.sendRedirect(req.getContextPath() + "/lots");
    }

    /*----------------------------------------------------------  POST  */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        /* Авторизація */
        HttpSession session = req.getSession(false);
        User currentUser = (session != null) ? (User) session.getAttribute("user") : null;
        if (currentUser == null) {
            resp.sendRedirect(req.getContextPath() + "/login");
            return;
        }

        /* Основні параметри */
        String action = req.getParameter("action");        // create | bid | start | stop | delete
        String lotId  = req.getParameter("id");            // при create – null

        try {
            switch (action) {
                /* ---------- створення нового лоту ---------- */
                case "create" -> createLot(req, resp, currentUser);

                /* ---------- зробити ставку ---------- */
                case "bid"    -> placeBid(req, resp, currentUser, lotId);

                /* ---------- керування аукціоном ---------- */
                case "start"  -> { lotService.startAuction(lotId, currentUser.getId());
                                   resp.sendRedirect(url(req, "/lot?id=" + lotId)); }

                case "stop"   -> { lotService.stopAuction(lotId,  currentUser.getId());
                                   resp.sendRedirect(url(req, "/lot?id=" + lotId)); }

                /* ---------- видалити ---------- */
                case "delete" -> { lotService.deleteLot(lotId,    currentUser.getId());
                                   resp.sendRedirect(url(req, "/lots")); }
                default       -> resp.sendRedirect(url(req, "/error.jsp"));
            }
        } catch (Exception ex) {          // наприклад SecurityException
            req.setAttribute("error", ex.getMessage());
            req.getRequestDispatcher("/jsp/error.jsp").forward(req, resp);
        }
    }

    /*================================================= HELPERS ==========*/
    /** Створення лоту  */
    private void createLot(HttpServletRequest req, HttpServletResponse resp, User user)
            throws IOException, ServletException {

        String title   = req.getParameter("title");
        String descr   = req.getParameter("description");
        String priceSt = req.getParameter("startPrice");

        try {
            BigDecimal start = new BigDecimal(priceSt);
            Lot lot = lotService.createLot(title, descr, start, user.getId());
            resp.sendRedirect(url(req, "/lot?id=" + lot.getId()));
        } catch (NumberFormatException ex) {
            req.setAttribute("error", "Invalid price");
            req.getRequestDispatcher("/jsp/create-lot.jsp").forward(req, resp);
        }
    }

    /** Ставка */
    private void placeBid(HttpServletRequest req, HttpServletResponse resp,
                          User user, String lotId) throws IOException {

        String bidSt = req.getParameter("bidAmount");   // поле в JSP
        try {
            BigDecimal amount = new BigDecimal(bidSt);
            if (!bidService.placeBid(user.getId(), lotId, amount)) {
                resp.sendRedirect(url(req, "/lot?id="+lotId+"&error=Bid+too+low+or+inactive"));
            } else {
                resp.sendRedirect(url(req, "/lot?id="+lotId));
            }
        } catch (NumberFormatException ex) {
            resp.sendRedirect(url(req, "/lot?id="+lotId+"&error=Bad+number"));
        }
    }

    /** prepend context-path */
    private String url(HttpServletRequest req, String path) {
        return req.getContextPath() + path;
    }
}