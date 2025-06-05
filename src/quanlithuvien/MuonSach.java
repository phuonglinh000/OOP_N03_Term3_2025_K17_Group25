package quanlithuvien;

public class MuonSach {
    private String maSach;
    private String maThanhVien;
    private String ngayMuon;
    private String ngayHetHan;

    public MuonSach(String maSach, String maThanhVien, String ngayMuon, String ngayHetHan) {
        this.maSach = maSach;
        this.maThanhVien = maThanhVien;
        this.ngayMuon = ngayMuon;
        this.ngayHetHan = ngayHetHan;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getMaThanhVien() {
        return maThanhVien;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return "Ma sach: " + maSach + ", Ma thanh vien: " + maThanhVien
            + ", Ngay muon: " + ngayMuon + ", Ngay het han: " + ngayHetHan;
    }
}