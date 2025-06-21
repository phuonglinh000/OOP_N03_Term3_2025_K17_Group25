package com.example.servingwebcontent.pure_java_project.model;

import java.time.LocalDate;

public class PhieuMuon {
    private String maSach;          // Mã sách
    private String tenNguoiMuon;    // Người mượn
    private LocalDate ngayMuon;     // Ngày mượn

    public PhieuMuon() {
    }

    public PhieuMuon(String maSach, String tenNguoiMuon, LocalDate ngayMuon) {
        this.maSach = maSach;
        this.tenNguoiMuon = tenNguoiMuon;
        this.ngayMuon = ngayMuon;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenNguoiMuon() {
        return tenNguoiMuon;
    }

    public void setTenNguoiMuon(String tenNguoiMuon) {
        this.tenNguoiMuon = tenNguoiMuon;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }
}