package com.example.servingwebcontent.pure_java_project.model;

public class NguoiDung {
    private int id;
    private String ten;

    // ✅ Constructor mặc định (cho Thymeleaf form binding)
    public NguoiDung() {
    }

    // ✅ Constructor đầy đủ
    public NguoiDung(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
