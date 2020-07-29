package com.example.da;

import com.example.entity.bank;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankDao {

    private String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/t1808a1_sem4?serverTimezone=UTC";
    private String jdbcUsername="root";
    private String jdbcPassWord="";


    private static final String SELECT_ALL_BANK = "SELECT * FROM bank";


    public BankDao(){}

    protected Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassWord);
        return connection;
    }

    public List<bank> selectAllBank() throws SQLException, ClassNotFoundException {
        List<bank> banks = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BANK);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            int id = rs.getInt("id");
            String getStockName = rs.getString("getStockName");
            double getStockPrice = rs.getDouble("getStockPrice");
            banks.add(new bank(id,getStockName,getStockPrice));
        }
        return banks;
    }

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        BankDao userDAO = new BankDao();
//        List<bank> users = userDAO.selectAllBank();
//        if(users!=null){
//            System.out.println("get ");
//        }
//        else {System.out.println("pass ");}
//    }
}
