package com.example.servingwebcontent;

import java.io.Serializable;
import java.time.LocalDate;

public class PhieuMuon implements Serializable {
    private String maPhieu;
    private String tenDocGia;
    private Sach sach;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    public PhieuMuon() {
        this.ngayMuon = LocalDate.now();
        this.ngayTra = ngayMuon.plusDays(7);
    }

    public PhieuMuon(String maPhieu, String tenDocGia, Sach sach) {
        this.maPhieu = maPhieu;
        this.tenDocGia = tenDocGia;
        this.sach = sach;
        this.ngayMuon = LocalDate.now();
        this.ngayTra = ngayMuon.plusDays(7); 
    }

    public String getMaPhieu() { return maPhieu; }
    public void setMaPhieu(String maPhieu) { this.maPhieu = maPhieu; }

    public String getTenDocGia() { return tenDocGia; }
    public void setTenDocGia(String tenDocGia) { this.tenDocGia = tenDocGia; }

    public Sach getSach() { return sach; }
    public void setSach(Sach sach) { this.sach = sach; }

    public LocalDate getNgayMuon() { return ngayMuon; }
    public void setNgayMuon(LocalDate ngayMuon) { this.ngayMuon = ngayMuon; }

    public LocalDate getNgayTra() { return ngayTra; }
    public void setNgayTra(LocalDate ngayTra) { this.ngayTra = ngayTra; }

    public void inPhieu() {
        try {
            System.out.println("===== PHIEU MUON SACH =====");
            System.out.println("Ma phieu: " + maPhieu);
            System.out.println("Ten doc gia: " + tenDocGia);
            if (sach != null) sach.hienThiThongTin();
            System.out.println("Ngay muon: " + ngayMuon);
            System.out.println("Ngay tra: " + ngayTra);
        } catch (Exception e) {
            System.err.println("Lỗi khi in phiếu mượn: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Đã thực hiện xong in phiếu mượn.");
        }
    }

    @Override
    public String toString() {
        return "Ma phieu: " + maPhieu + "\n" +
               "Ten doc gia: " + tenDocGia + "\n" +
               "Sach: " + (sach != null ? sach.getTenSach() : "Chưa chọn") + "\n" +
               "Ngay muon: " + ngayMuon + "\n" +
               "Ngay tra: " + ngayTra + "\n";
    }
}
