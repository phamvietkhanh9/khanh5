package com.example.entity;

public class bank {
    private int id;
    private String getStockName;
    private double getStockPrice;

    private bank(){}

    public bank(String getStockName, double getStockPrice){
        this.getStockName = getStockName;
        this.getStockPrice = getStockPrice;

    }

    public bank(int id, String getStockName, double getStockPrice){
        this.id = id;
        this.getStockName= getStockName;
        this.getStockPrice= getStockPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGetStockName() {
        return getStockName;
    }

    public void setGetStockName(String getStockName) {
        this.getStockName = getStockName;
    }

    public double getGetStockPrice() {
        return getStockPrice;
    }

    public void setGetStockPrice(double getStockPrice) {
        this.getStockPrice = getStockPrice;
    }
}
