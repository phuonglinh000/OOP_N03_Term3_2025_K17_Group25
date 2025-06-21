package com.example.servingwebcontent.pure_java_project.model;

import java.time.LocalDate;

public class PhieuMuon {
    private String maPhieu;
    private String tenNguoiMuon;
    private String maSach;
    private LocalDate ngayMuon;

    public PhieuMuon() {}

    public PhieuMuon(String maPhieu, String tenNguoiMuon, String maSach, LocalDate ngayMuon) {
        this.maPhieu = maPhieu;
        this.tenNguoiMuon = tenNguoiMuon;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTenNguoiMuon() {
        return tenNguoiMuon;
    }

    public void setTenNguoiMuon(String tenNguoiMuon) {
        this.tenNguoiMuon = tenNguoiMuon;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }
}