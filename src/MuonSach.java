public class MuonSach {
    private String maSach;
    private String maThanhVien;
    private LocalDate ngayMuon;
    private LocalDate ngayHetHan;
}

public MuonSach(String maSach, String maThanhVien) {
      this.maSach = maSach;
      this.maThanhVien = maThanhVien;
      this.ngayMuon = LocalDate.now();
      this.ngayHetHan = this.ngayMuon.plusDays(14L);
   }

   public String getMaSach() {
      return this.maSach;
   }

   public String getMaThanhVien() {
      return this.maThanhVien;
   }

   public LocalDate getNgayMuon() {
      return this.ngayMuon;
   }

   public LocalDate getNgayHetHan() {
      return this.ngayHetHan;
   }

   public void setNgayHetHan(LocalDate var1) {
      this.ngayHetHan = var1;
   }

   public String toString() {
      return "Ma thanh vien: " + this.maThanhVien + " | Ma sach: " + this.maSach + " | Ngay cho muon: " + this.ngayMuon + " | Ngay het han: " + this.ngayHetHan;
   }
}

