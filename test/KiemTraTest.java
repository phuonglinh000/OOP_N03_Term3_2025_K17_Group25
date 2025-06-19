import java.util.Scanner;

public class KiemTraTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên thành viên cần kiểm tra sách đến hạn: ");
        String hoTen = sc.nextLine();

        System.out.println("\n== Kiểm tra sách sắp đến hạn trả ==");
        KiemTra.kiemTraSachDenHan(hoTen);
    }
}