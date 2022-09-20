package com.example.uims.Services;

import com.example.uims.DAOs.UserDAO;
import com.example.uims.enums.Type;
import com.example.uims.model.User;

import java.sql.SQLException;

public class UserService {
    private static final String PERSONAL_ID_SAMPLE = "0123456789";

    private static boolean isValidPersonalId(String pid) {
        if(pid.length() != 11) return false;
        //check if personal id contains any char expect nums
        for(char ch : pid.toCharArray()){
            if(!PERSONAL_ID_SAMPLE.contains(ch+"")) return false;
        }

        return true;
    }

    private static boolean notYetUsedPersonalId(String pid) throws SQLException {
        UserDAO userDao = new UserDAO();
        return userDao.getUserByPersonalId(pid) == null;
    }

    public static boolean isValidPersonalIdOrAlreadyUsed(String pid) throws SQLException {
        return notYetUsedPersonalId(pid) && isValidPersonalId(pid);
    }

    public static boolean passwordsMatch(String password, String repPassword){
        return password.equals(repPassword);
    }

    public static Type getUserType(String type){
        if(type.equals("normal")) return Type.NORMAL;
        return Type.ADMIN;
    }

    public static void addUser(User user) throws SQLException {
        UserDAO userDao = new UserDAO();
        userDao.insertUser(user);
    }
}
