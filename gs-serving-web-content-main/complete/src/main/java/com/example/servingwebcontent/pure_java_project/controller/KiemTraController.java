// package com.example.servingwebcontent;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;

// import java.util.ArrayList;
// import java.util.List;

// @Controller
// public class KiemTraController {

//     @GetMapping("/kiemtra")
//     public String hienForm() {
//         return "kiemtra_form"; 
//     }

//     @PostMapping("/kiemtra")
//     public String xuLyForm(@RequestParam String hoTen, Model model) {

//         List<String> ketQua = new ArrayList<>();
//         boolean found = false;

//         try {
//             for (MuonSach m : MuonSachData.danhSachMuon) {
//                 if (m.getHoTen().equalsIgnoreCase(hoTen)) {
//                     long daysLeft = java.time.temporal.ChronoUnit.DAYS.between(
//                         java.time.LocalDate.now(), m.getNgayHetHan());
//                     if (daysLeft <= 3 && daysLeft >= 0) {
//                         found = true;
//                         ketQua.add(
//                             "<strong>" + m.toString().replace("\n", "<br>") + "</strong><br>" +
//                             "<span style='color:red;'>Còn " + daysLeft + " ngày đến hạn</span><br>"
//                         );
//                     }
//                 }
//             }
//         } catch (Exception e) {
//             ketQua.clear();
//             ketQua.add("<span style='color:red;'>Lỗi khi kiểm tra: " + e.getMessage() + "</span>");
//             found = false;
//         } finally {
//             System.out.println(">> Kiểm tra sách đến hạn đã hoàn tất cho: " + hoTen);
//         }

//         model.addAttribute("hoTen", hoTen);
//         model.addAttribute("ketQua", ketQua);
//         model.addAttribute("found", found);

//         return "kiemtra"; 
//     }
// }

