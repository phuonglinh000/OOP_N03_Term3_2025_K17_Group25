import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Controller
public class KiemTraController {

    @GetMapping("/kiemtra")
    public String hienForm() {
        return "kiemtra_form"; // form nhập họ tên
    }

    @PostMapping("/kiemtra")
    public String xuLyKiemTra(@RequestParam("hoTen") String hoTen, Model model) {
        List<MuonSach> danhSach = MuonSachData.danhSachMuon; // danh sách mượn đã có
        List<String> ketQua = new ArrayList<>();
        boolean found = false;

        try {
            LocalDate today = LocalDate.now();

            for (MuonSach m : danhSach) {
                if (m.getHoTen().equalsIgnoreCase(hoTen)) {
                    long daysLeft = ChronoUnit.DAYS.between(today, m.getNgayHetHan());
                    if (daysLeft <= 3 && daysLeft >= 0) {
                        found = true;
                        ketQua.add("Tên sách: " + m.toString() + "<br>Còn " + daysLeft + " ngày đến hạn trả<br><br>");
                    }
                }
            }

        } catch (Exception e) {
            model.addAttribute("error", "Lỗi: " + e.getMessage());
        } finally {
            System.out.println("Đã kiểm tra sách đến hạn cho " + hoTen);
        }

        model.addAttribute("ketQua", ketQua);
        model.addAttribute("hoTen", hoTen);
        model.addAttribute("found", found);

        return "ketqua_kiemtra";
    }
}
