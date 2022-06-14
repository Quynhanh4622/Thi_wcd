package com.example.T2009M1_ThiWCD.model;

import com.example.T2009M1_ThiWCD.constant.SqlConstant;
import com.example.T2009M1_ThiWCD.entity.Phone;
import com.example.T2009M1_ThiWCD.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySqlPhone implements PhoneModel {
    @Override
    public boolean save(Phone phone) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PHONE_INSERT);
            preparedStatement.setString(1, phone.getName());
            if (phone.getDeletedAt() != null) {
                preparedStatement.setString(10, phone.getDeletedAt().toString());
            } else {
                preparedStatement.setString(10, null);
            }
            preparedStatement.setInt(11, phone.getCreatedBy());
            preparedStatement.setInt(12, phone.getUpdatedBy());
            preparedStatement.setInt(13, phone.getDeletedBy());
            preparedStatement.setInt(14, phone.getProductStatus().getValue());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean update(int id, Phone phone) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Phone findById(int id) {
        return null;
    }

    @Override
    public List<Phone> findAll() {
        return null;
    }
}
