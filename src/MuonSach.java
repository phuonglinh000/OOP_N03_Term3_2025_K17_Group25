//package src;

import java.io.Serializable;
import java.time.LocalDate;

public class MuonSach implements Serializable {
   private String maSach;
   private String maThanhVien;
   private LocalDate ngayMuon;
   private LocalDate ngayHetHan;

   public MuonSach(String var1, String var2) {
      this.maSach = var1;
      this.maThanhVien = var2;
      this.ngayMuon = LocalDate.now();
      this.ngayHetHan = this.ngayMuon.plusDays(15);
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

   @Override
   public String toString() {
      return "Ma thanh vien: " + this.maThanhVien + " | Ma sach: " + this.maSach + " | Ngay cho muon: " + this.ngayMuon + " | Ngay het han: " + this.ngayHetHan;
   }

   public static void test(){

   }
}

