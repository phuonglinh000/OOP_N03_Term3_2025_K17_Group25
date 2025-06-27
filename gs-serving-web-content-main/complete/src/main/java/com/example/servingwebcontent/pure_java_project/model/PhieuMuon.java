package com.example.servingwebcontent.pure_java_project.model;

import java.time.LocalDate;

public class PhieuMuon {

    private NguoiDung nguoiDung;
    private Sach sach;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;
    private boolean daTra; // ✅ Trạng thái đã trả (true) hoặc chưa trả (false)

    // ✅ Constructor mặc định – Cần thiết cho Thymeleaf form binding
    public PhieuMuon() {
        this.nguoiDung = new NguoiDung();
        this.sach = new Sach();
        this.daTra = false; // Mặc định là chưa trả
    }

    // ======= Getters & Setters =======

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

    public boolean isDaTra() {
        return daTra;
    }

    public void setDaTra(boolean daTra) {
        this.daTra = daTra;
    }
}