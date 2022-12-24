package com.example.finalproject.model;

public class Voucher {
    private String title; //tên voucher
    private int voucherImg; //id của ảnh
    private int status; //trạng thái voucher
    private String expiredDate; //ngày hết hạn
    private int qty; //số lượng voucher

    public Voucher(String title, int voucherImg, int status, String expiredDate, int qty) {
        this.title = title;
        this.voucherImg = voucherImg;
        this.status = status;
        this.expiredDate = expiredDate;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVoucherImg() {
        return voucherImg;
    }

    public void setVoucherImg(int voucherImg) {
        this.voucherImg = voucherImg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
