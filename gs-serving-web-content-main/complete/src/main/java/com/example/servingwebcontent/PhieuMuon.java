package com.example.servingwebcontent;

import java.time.LocalDate;

public class PhieuMuon {
    private String maPhieu;
    private String tenDocGia;
    private String tenSach;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    public PhieuMuon(String maPhieu, String tenDocGia, String tenSach) {
        this.maPhieu = maPhieu;
        this.tenDocGia = tenDocGia;
        this.tenSach = tenSach;
        this.ngayMuon = LocalDate.now();
        this.ngayTra = this.ngayMuon.plusDays(7);
    }

   
    public String getMaPhieu() { return maPhieu; }
    public String getTenDocGia() { return tenDocGia; }
    public String getTenSach() { return tenSach; }
    public LocalDate getNgayMuon() { return ngayMuon; }
    public LocalDate getNgayTra() { return ngayTra; }
}
