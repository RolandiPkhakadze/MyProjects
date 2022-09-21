package com.example.uims.Services;

import com.example.uims.DAOs.ConvictionsDAO;
import com.example.uims.model.Conviction;
import com.example.uims.model.User;

import java.sql.SQLException;
import java.util.List;

public class ConvictionsService {

    public static String getDescriptionText(User user) throws SQLException {
        ConvictionsDAO convictionsDao = new ConvictionsDAO();
        List<Conviction> convictions = convictionsDao.getAllUserConvictions(user.getPersonalId());
        StringBuilder result = new StringBuilder();
        result.append("\n");
        result.append(user.getFirstName()).append(" ").append(user.getLastName()).append("'s Convictions: \n");
        for(int i = 0; i < convictions.size(); i++){
            Conviction conviction = convictions.get(i);
            result.append(i + 1).append(": ").append(conviction.getDescription()).append("\n");
        }
        return result.toString();
    }
}
