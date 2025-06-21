package com.example.servingwebcontent;

import java.io.Serializable;

public class Sach implements Serializable {
    private static final long serialVersionUID = 1L;

    private String maSach;
    private String tenSach;
    private String tacGia;
    private double gia;
    private String trangThai;
    private String phienBan;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tacGia, double gia, String trangThai, String phienBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
        this.trangThai = trangThai;
        this.phienBan = phienBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getPhienBan() {
        return phienBan;
    }

    public void setPhienBan(String phienBan) {
        this.phienBan = phienBan;
    }

    public boolean isAvailable() {
        return "Co san".equalsIgnoreCase(trangThai);
    }

    public void hienThiThongTin() {
        System.out.println("----- THÔNG TIN SÁCH -----");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Giá: " + gia);
        System.out.println("Trạng thái: " + trangThai);
        System.out.println("Phiên bản: " + phienBan);
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", gia=" + gia +
                ", trangThai='" + trangThai + '\'' +
                ", phienBan='" + phienBan + '\'' +
                '}';
    }
}
