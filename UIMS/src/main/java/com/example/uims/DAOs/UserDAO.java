package com.example.uims.DAOs;

import com.example.uims.Services.UserService;
import com.example.uims.dataBaseConnection.DBConnection;
import com.example.uims.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private static final String INSERT_USER = "INSERT INTO USERS" +
            "(ID, FIRST_NAME, LAST_NAME, ADDRESS, TYPE, PASSWORD) " +
            "VALUES(?,?,?,?,?,?)";
    private static final String GET_USER_BY_PERSONAL_ID = "SELECT * FROM USERS U " +
            "WHERE ID = ?";
    Connection connection;

    public UserDAO() {
        connection = DBConnection.getConnection();
    }

    public void insertUser(User user) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(INSERT_USER);

        statement.setString(1,user.getPersonalId());
        statement.setString(2,user.getFirstName());
        statement.setString(3,user.getLastName());
        statement.setString(4,user.getAddress());
        statement.setString(5,user.getType());
        statement.setString(6,user.getPassword());

        statement.executeUpdate();

    }

    public User getUserByPersonalId(String personalId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(GET_USER_BY_PERSONAL_ID);

        statement.setString(1, String.valueOf(personalId));

        return getUserByStatement(statement);
    }


    private User getUserByStatement(PreparedStatement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery();

        if(!resultSet.next()){
            return null;
        }

        return new User(
                resultSet.getInt("user_id"),
                resultSet.getString("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                resultSet.getString("address"),
                UserService.getUserType(resultSet.getString("type")),
                resultSet.getString("password")
        );
    }

}
