package gs.serving.web.content.main;

import java.io.Serializable;
import java.time.LocalDate;

import com.example.servingwebcontent.Sach;

public class PhieuMuon implements Serializable {
    private String maPhieu;
    private String tenDocGia;
    private Sach sach;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    public PhieuMuon(String maPhieu, String tenDocGia, Sach sach) {
        this.maPhieu = maPhieu;
        this.tenDocGia = tenDocGia;
        this.sach = sach;
        this.ngayMuon = LocalDate.now();
        this.ngayTra = ngayMuon.plusDays(7); 
    }

    public void inPhieu() {
        System.out.println("===== PHIEU MUON SACH =====");
        System.out.println("Ma phieu: " + maPhieu);
        System.out.println("Ten doc gia: " + tenDocGia);
        sach.hienThiThongTin();
        System.out.println("Ngay muon: " + ngayMuon);
        System.out.println("Ngay tra: " + ngayTra);
    }

    @Override
    public String toString() {
        return "Ma phieu: " + maPhieu + "\n" +
               "Ten doc gia: " + tenDocGia + "\n" +
               "Sach: " + sach.getTenSach() + "\n" +
               "Ngay muon: " + ngayMuon + "\n" +
               "Ngay tra: " + ngayTra + "\n";
    }
}
