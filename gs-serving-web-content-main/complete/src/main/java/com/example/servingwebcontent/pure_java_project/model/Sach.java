package com.example.servingwebcontent.pure_java_project.model;

public class Sach {

    /* ===== Thuộc tính ===== */
    private int id;
    private String tenSach;
    private String tacGia;
    private boolean daMuon = false;

    /* ===== Constructors ===== */

    // Constructor rỗng – Spring / Jackson / Thymeleaf cần
    public Sach() {}

    // Constructor đầy đủ 3 tham số
    public Sach(int id, String tenSach, String tacGia) {
        this.id = id;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.daMuon = false;
    }

    /* ===== Getters & Setters ===== */

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public boolean isDaMuon() {
        return daMuon;
    }
    public void setDaMuon(boolean daMuon) {
        this.daMuon = daMuon;
    }
}