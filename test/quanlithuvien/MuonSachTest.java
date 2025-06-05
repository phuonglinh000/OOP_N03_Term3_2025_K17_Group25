package quanlithuvien;

public class MuonSachTest {
    public static void main(String[] args) {
        MuonSach muon = new MuonSach("S001", "TV001", "2025-05-30", "2025-06-14");

        System.out.println(muon);

        muon.setNgayHetHan("2025-06-21");

        System.out.println("========== Sau khi gia hạn ==========");
        System.out.println(muon);
    }
}