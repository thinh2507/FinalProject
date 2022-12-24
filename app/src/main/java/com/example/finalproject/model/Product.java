package com.example.finalproject.model;

public class Product {
    private String prodName;
    private int prodPrice;
    private int prodImg;

    public Product(String prodName, int prodPrice, int prodImg) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodImg = prodImg;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdImg() {
        return prodImg;
    }

    public void setProdImg(int prodImg) {
        this.prodImg = prodImg;
    }
}
