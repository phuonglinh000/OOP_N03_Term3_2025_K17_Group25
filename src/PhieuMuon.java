import java.util.Scanner;

public class PhieuMuon {

    public static MuonSach nhapVaInPhieuMuon(BookList bookList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách muốn mượn: ");
        String maSach = sc.nextLine();

        Book sachMuon = null;
        for (Book b : bookList.books) {
            if (b.bookId.equalsIgnoreCase(maSach)) {
                sachMuon = b;
                break;
            }
        }

        if (sachMuon == null) {
            System.out.println("❌ Không tìm thấy sách có mã này!");
            return null;
        }

        System.out.print("Nhập mã thành viên: ");
        String maTV = sc.nextLine();
        System.out.print("Nhập họ tên thành viên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String sdt = sc.nextLine();

        MuonSach muon = new MuonSach(sachMuon, maTV, hoTen, sdt);

        System.out.println("== Thông tin phiếu mượn ==");
        System.out.println(muon);

        return muon;
    }
}
