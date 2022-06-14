package com.example.T2009M1_ThiWCD.model;

import com.example.T2009M1_ThiWCD.entity.Phone;

import java.util.List;

public interface PhoneModel {
    boolean save(Phone phone);
    boolean update(int id, Phone phone);
    boolean delete(int id);
    Phone findById(int id);
    List<Phone> findAll();
}
