package com.example.servingwebcontent.pure_java_project.model;

public class Sach {
    private String ma;         // Mã sách
    private String ten;        // Tên sách
    private String tacGia;     // Tác giả
    private String theLoai;    // Thể loại

    public Sach() {
    }

    public Sach(String ma, String ten, String tacGia, String theLoai) {
        this.ma = ma;
        this.ten = ten;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
}