import java.io.Serializable;
import java.time.LocalDate;

public class MuonSach implements Serializable {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String maThanhVien;
    private String hoTen;
    private String sdt;
    private LocalDate ngayMuon;
    private LocalDate ngayHetHan;

    public MuonSach(Book book, String maThanhVien, String hoTen, String sdt) {
        this.maSach = book.bookId;
        this.tenSach = book.title;
        this.tacGia = book.author;
        this.maThanhVien = maThanhVien;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.ngayMuon = LocalDate.now();
        this.ngayHetHan = this.ngayMuon.plusDays(15);
    }

    public String getHoTen() {
        return hoTen;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    @Override
    public String toString() {
        return "Tên sách: " + tenSach + " | Tác giả: " + tacGia +
               "\nMã TV: " + maThanhVien + " | Họ tên: " + hoTen + " | SĐT: " + sdt +
               "\nNgày mượn: " + ngayMuon + " | Hạn trả: " + ngayHetHan;
    }
}
