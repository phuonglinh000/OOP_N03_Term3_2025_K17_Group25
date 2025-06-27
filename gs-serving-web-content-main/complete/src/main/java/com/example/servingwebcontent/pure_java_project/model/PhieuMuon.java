package com.example.servingwebcontent.pure_java_project.model;

import java.time.LocalDate;

public class PhieuMuon {

    private NguoiDung nguoiDung;
    private Sach sach;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    // ✅ Constructor mặc định (cần thiết cho Thymeleaf)
    public PhieuMuon() {
        this.nguoiDung = new NguoiDung();
        this.sach = new Sach();
    }

    // Getters và Setters
    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }
}