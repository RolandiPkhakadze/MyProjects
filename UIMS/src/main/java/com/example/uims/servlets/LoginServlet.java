package com.example.uims.servlets;

import com.example.uims.DAOs.UserDAO;
import com.example.uims.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pid = request.getParameter("pid");
        String password = request.getParameter("password");

        UserDAO userDao = new UserDAO();
        try {
            User currUser = userDao.getUserByPersonalId(pid);
            if(currUser == null) {
                request.setAttribute("loginStatus", "wrong pid");
                request.getRequestDispatcher("index.jsp").forward(request,response);
                return;
            }
            if(!currUser.getPassword().equals(password)){
                request.setAttribute("loginStatus", "incorrect pass");
                request.getRequestDispatcher("index.jsp").forward(request,response);
                return;
            }
            request.getSession().setAttribute("user", currUser);
            request.setAttribute("user", currUser);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
