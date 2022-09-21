package com.example.uims.DAOs;

import com.example.uims.dataBaseConnection.DBConnection;
import com.example.uims.model.Conviction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConvictionsDAO {

    private final Connection connection;

    private static final String SELECT_CONVICTIONS_OF_USER = "SELECT * FROM convictions " +
            "JOIN users WHERE users.user_id = convictions.user_id AND users.id = ?";

    public ConvictionsDAO(){
        this.connection = DBConnection.getConnection();
    }

    public List<Conviction> getAllUserConvictions(String pid) throws SQLException {
        List<Conviction> convictions = new ArrayList<>();

        PreparedStatement statement = connection.prepareStatement(SELECT_CONVICTIONS_OF_USER);

        statement.setString(1, pid);

        ResultSet rs = statement.executeQuery();

        while(rs.next()){
            convictions.add(getConvictionFromResultSet(rs));
        }
        return convictions;
    }

    private Conviction getConvictionFromResultSet(ResultSet rs) throws SQLException {
        return  new Conviction(
                rs.getInt("CONVICTION_ID"),
                rs.getString("DESCRIPTION"),
                rs.getInt("USER_ID")
        );
    }

}
