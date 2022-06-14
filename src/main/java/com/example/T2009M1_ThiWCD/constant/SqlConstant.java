package com.example.T2009M1_ThiWCD.constant;

public class SqlConstant {
    public static final String PHONE_INSERT = "INSERT INTO phones (name, brand, description, price, createdAt, updatedAt, createdBy, updatedBy, status) " +
            "                                                   VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
}
