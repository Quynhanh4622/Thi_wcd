package com.example.T2009M1_ThiWCD.controller;

import com.example.T2009M1_ThiWCD.model.MySqlPhone;
import com.example.T2009M1_ThiWCD.model.PhoneModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreatePhoneServlet extends HttpServlet {
    private PhoneModel phoneModel;

    @Override
    public void init() throws ServletException {
        phoneModel = new MySqlPhone();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addphone.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
