package com.agksoft.scanner;

import java.text.DecimalFormat;

public class Item {
    //this is model class
    private String UPC;
    private Double sellingPrice;
    private Double cost;
    private Integer department;
    private Double priceGroup;
    private String description;
    private Double CRV; //provider
    private Integer UPCType;

    public Item(String UPC, Double sellingPrice, Double cost, Integer department, Double priceGroup, String description, Double CRV, Integer UPCType) {
        this.UPC = UPC;
        this.sellingPrice = sellingPrice;
        this.cost = cost;
        this.department = department;
        this.priceGroup = priceGroup;
        this.description = description;
        this.CRV = CRV;
        this.UPCType = UPCType;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Double getPriceGroup() {
        return priceGroup;
    }

    public void setPriceGroup(Double priceGroup) {
        this.priceGroup = priceGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCRV() {
        return CRV;
    }

    public void setCRV(Double CRV) {
        this.CRV = CRV;
    }

    public Integer getUPCType() {
        return UPCType;
    }

    public void setUPCType(Integer UPCType) {
        this.UPCType = UPCType;
    }

    @Override
    public String toString() {
        return "Item{" +
                "UPC='" + UPC + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", cost=" + cost +
                ", department=" + department +
                ", priceGroup=" + priceGroup +
                ", description='" + description + '\'' +
                ", CRV=" + CRV +
                ", UPCType=" + UPCType +
                '}';
    }
}
