package com.example.demo.servlets;

import com.example.demo.controllers.User;
import com.example.demo.daos.UserDao;
import com.example.demo.service.UserValidator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UserPageServlet", value = "/UserPageServlet")
public class UserPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("mail");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String password = request.getParameter("password");
        String repeatedPassword = request.getParameter("reppassword");
        String profession = request.getParameter("profession");

        try {
            if(UserValidator.usernameTaken(username)){
                request.setAttribute("updateStatus", "uname taken");
                request.getRequestDispatcher("user-page.jsp").forward(request, response);
                return;
            }else if(!email.isEmpty() && UserValidator.emailValidator(email)) {
                request.setAttribute("updateStatus", "invalid email");
                request.getRequestDispatcher("user-page.jsp").forward(request, response);
                return;
            }else if(UserValidator.notSamePasswords(password,repeatedPassword)){
                request.setAttribute("updateStatus", "pass mismatch");
                request.getRequestDispatcher("user-page.jsp").forward(request, response);
                return;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        User user = (User) request.getSession().getAttribute("user");

        if(!username.isEmpty()){
            user.setUsername(username);
        }
        if(!firstname.isEmpty()){
            user.setFirstName(firstname);
        }
        if(!lastname.isEmpty()){
            user.setLastName(lastname);
        }
        if(!email.isEmpty()){
            user.setMail(email);
        }
        if(!profession.isEmpty()){
            user.setProfession(profession);
        }
        if(!password.isEmpty()){
            if(password.equals(repeatedPassword)) {
                user.setPassword(password);
            }else {
                request.setAttribute("updateStatus", "not same passwords idiot");
                request.getRequestDispatcher("user-page.jsp").forward(request,response);
            }
        }

        UserDao userDao = new UserDao();
        try {
            userDao.updateUser(user);
            request.getRequestDispatcher("user-page.jsp").forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
