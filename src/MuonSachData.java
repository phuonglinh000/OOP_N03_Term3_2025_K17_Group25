import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class MuonSachData {
    public static List<MuonSach> danhSachMuon = new ArrayList<>();

    public static void saveMuonSachToFile(String path) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(danhSachMuon);
            System.out.println("Lưu file thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi khi lưu file: " + e.getMessage());
        }
    }

    public static void thongBaoSachSapTra(String hoTen) {
        LocalDate today = LocalDate.now();
        boolean found = false;
        for (MuonSach m : danhSachMuon) {
            if (m.getHoTen().equalsIgnoreCase(hoTen)) {
                long daysLeft = ChronoUnit.DAYS.between(today, m.getNgayHetHan());
                if (daysLeft <= 3 && daysLeft >= 0) {
                    if (!found) {
                        System.out.println("Danh sách sách gần đến hạn trả của thành viên " + hoTen + ":");
                        found = true;
                    }
                    System.out.println(m);
                    System.out.println("Còn " + daysLeft + " ngày đến hạn\n");
                }
            }
        }
        if (!found) {
            System.out.println("Không có sách nào sắp đến hạn trả cho bạn đọc " + hoTen);
        }
    }
}