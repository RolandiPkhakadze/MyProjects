package com.example.uims.servlets;

import com.example.uims.Services.UserService;
import com.example.uims.enums.Type;
import com.example.uims.model.User;
import com.example.uims.utilities.Hasher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

@WebServlet(name = "RegistrationServlet", value = "/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pid = request.getParameter("pid");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String address = request.getParameter("address");
        String password = request.getParameter("password");
        String repPassword = request.getParameter("repPassword");

        try {
            if(!UserService.isValidPersonalIdOrAlreadyUsed(pid)){
                request.setAttribute("registrationStatus", "invalid pid");
                request.getRequestDispatcher("registration.jsp").forward(request,response);
                return;
            }
            if(!UserService.passwordsMatch(password, repPassword)){
                request.setAttribute("registrationStatus", "password mismatch");
                request.getRequestDispatcher("registration.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            password = Hasher.hashString(password);
            User user = new User(pid, firstname, lastname, address, Type.NORMAL, password);
            UserService.addUser(user);
        } catch (SQLException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

}
