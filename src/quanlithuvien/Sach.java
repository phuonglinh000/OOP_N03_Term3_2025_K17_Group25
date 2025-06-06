package quanlithuvien;

import java.io.Serializable;

class Sach implements Serializable {
    private static final long serialVersionUID = 1L;
    private String maSach;
    private String tacGia;
    private String tenSach;
    private double gia;
    private String viTriKeSach;
    private String trangThai;
    private String phienBan;
    private boolean Available;

    public Sach(String maSach, String tacGia, String tenSach, double gia, String viTriKeSach, String trangThai, String phienBan) {
        this.maSach = maSach;
        this.tacGia = tacGia;
        this.tenSach = tenSach;
        this.gia = gia;
        this.viTriKeSach = viTriKeSach;
        this.trangThai = trangThai;
        this.phienBan = phienBan;
    }
    public String getMaSach() {
        return maSach;
    }
    public String getTenSach() {
        return tenSach;
    }
    public String getTacGia() {
        return tacGia;
    }
    public double getGia() {
        return gia;
    }
    public String getViTriKeSach() {
        return viTriKeSach;
    }
    public String getTrangThai() {
        return trangThai;
    }
    public String getphienBan() {
        return phienBan;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void setViTriKeSach(String viTriKeSach) {
        this.viTriKeSach = viTriKeSach;
    }
    
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    public void setPhienBan(String phienBan) {
        this.phienBan = phienBan;
    }

    public void setAvailable (boolean TF) {
        this.Available = TF;
    }

    public boolean isAvailable () {
        return trangThai.equals("Co san");
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Gia: " + gia);
        System.out.println("Vi tri ke sach: " + viTriKeSach);
        System.out.println("Trang thai: " + trangThai);
        System.out.println("Phien ban: " + phienBan);
    }
}