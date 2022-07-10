package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Medicine_Id;
    private String Medicine_Name;
    private Integer Stock;
    private double CostPrice;
    private double SellingPrice;
    private double Profit;

    public Integer getMedicine_Id() {
        return Medicine_Id;
    }

    public void setMedicine_Id(Integer medicine_Id) {
        Medicine_Id = medicine_Id;
    }

    public String getMedicine_Name() {
        return Medicine_Name;
    }

    public void setMedicine_Name(String medicine_Name) {
        Medicine_Name = medicine_Name;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    public double getCostPrice() {
        return CostPrice;
    }

    public void setCostPrice(double costPrice) {
        CostPrice = costPrice;
    }

    public double getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        SellingPrice = sellingPrice;
    }

    public double getProfit() {
        return Profit;
    }

    public void setProfit(double profit) {
        Profit = profit;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "Medicine_Id=" + Medicine_Id +
                ", Medicine_Name='" + Medicine_Name + '\'' +
                ", Stock=" + Stock +
                ", CostPrice=" + CostPrice +
                ", SellingPrice=" + SellingPrice +
                ", Profit=" + Profit +
                '}';
    }
}

