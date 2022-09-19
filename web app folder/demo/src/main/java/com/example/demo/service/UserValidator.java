package com.example.demo.service;

import com.example.demo.daos.UserDao;

import java.sql.SQLException;

public class UserValidator {

    public static boolean usernameTaken(String username) throws SQLException {
        UserDao userDao = new UserDao();
        return userDao.getUserDataByUsernameOrMail(username) != null;
    }

    public static boolean emailTaken(String email) throws SQLException {
        UserDao userDao = new UserDao();
        return userDao.getUserDataByUsernameOrMail(email) != null;
    }

    public static boolean notSamePasswords(String password, String repeatedPassword){
        return !password.equals(repeatedPassword);
    }

    public static boolean validEmail(String email){
        return email.contains("@");
    }

    public static boolean emailValidator(String email) throws SQLException {
        return emailTaken(email) || !validEmail(email);
    }

}
