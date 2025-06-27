package com.example.servingwebcontent.pure_java_project.model;

public class Sach {
    private int id;
    private String tenSach;
    private String tacGia;
    private boolean daMuon = false;

    // ✅ Constructor mặc định (cần cho Thymeleaf binding)
    public Sach() {
    }

    // ✅ Constructor đầy đủ
    public Sach(int id, String tenSach) {
        this.id = id;
        this.tenSach = tenSach;
        this.daMuon = false;
    }

    // Getters và Setters
    public int getId() {
        return id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public boolean isDaMuon() {
        return daMuon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setDaMuon(boolean daMuon) {
        this.daMuon = daMuon;
    }
}
