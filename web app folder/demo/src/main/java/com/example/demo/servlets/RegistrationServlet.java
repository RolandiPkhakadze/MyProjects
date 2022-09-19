package com.example.demo.servlets;

import com.example.demo.controllers.User;
import com.example.demo.daos.UserDao;
import com.example.demo.service.UserValidator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "RegistrationServlet", value = "/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String mail = request.getParameter("mail");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String password = request.getParameter("password");
        String repeatedPassword = request.getParameter("reppassword");
        String profession = request.getParameter("profession");



        try {
            if(UserValidator.usernameTaken(username)){
                request.setAttribute("status", "uname taken");
                request.getRequestDispatcher("registration.jsp").forward(request, response);
                return;
            }else if(UserValidator.emailTaken(mail) || !UserValidator.validEmail(mail)) {
                request.setAttribute("status", "invalid email");
                request.getRequestDispatcher("registration.jsp").forward(request, response);
                return;
            }else if(UserValidator.notSamePasswords(password,repeatedPassword)){
                request.setAttribute("status", "pass mismatch");
                request.getRequestDispatcher("registration.jsp").forward(request, response);
                return;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        try {
            UserDao userDao = new UserDao();
            User newUser = new User(username,firstname,lastname,password,mail,profession);
            userDao.addUser(newUser);
            request.getSession().setAttribute("user", newUser);
            request.getRequestDispatcher("user-page.jsp").forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
