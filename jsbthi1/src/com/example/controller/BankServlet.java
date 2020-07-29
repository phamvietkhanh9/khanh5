package com.example.controller;

import com.example.da.BankDao;
import com.example.entity.bank;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;
import java.sql.SQLException;
import java.util.List;


@WebServlet("/")
public class BankServlet extends javax.servlet.http.HttpServlet {

    private BankDao bankDao;

    @Override
    public void init() throws  SecurityException{
        bankDao = new BankDao();
    }


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String action = request.getContextPath();
        try {
            switch (action) {
                default:
                    listBanks(request,response);
                    break;
            }
        }catch (SQLException|ClassNotFoundException ex){
            throw new ServletException(ex);
        }

    }


    private void listBanks(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, ServletException, IOException {
        List<bank> listBank = bankDao.selectAllBank();
        request.setAttribute("listBank",listBank);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request,response);
    }


}
