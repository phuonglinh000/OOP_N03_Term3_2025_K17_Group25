// package com.example.servingwebcontent.pure_java_project.controller;

// import com.example.servingwebcontent.pure_java_project.model.PhieuMuon;
// // import com.example.servingwebcontent.pure_java_project.model.NguoiDung;  // ❌ xoá dòng này

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;

// import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;


// @Controller
// @RequestMapping("/quan-ly")
// public class QuanLyController {

//     private final PhieuMuonService phieuMuonService;

//     public QuanLyController(PhieuMuonService phieuMuonService) {
//         this.phieuMuonService = phieuMuonService;
//     }

//     // ✅ Hiển thị tất cả phiếu mượn
//     @GetMapping("/phieu-muon")
//     public String hienThiTatCaPhieu(Model model) {
//         model.addAttribute("dsPhieu", phieuMuonService.layTatCa());
//         return "quan-ly-phieu";  // Giao diện hiển thị danh sách phiếu mượn
//     }

//     // ✅ Xoá phiếu mượn theo chỉ số
//     @PostMapping("/xoa")
//     public String xoaPhieu(@RequestParam int index) {
//         phieuMuonService.xoaPhieu(index);
//         return "redirect:/quan-ly/phieu-muon";
//     }

//     // ✅ Cập nhật trạng thái trả sách
//     @PostMapping("/cap-nhat")
//     public String capNhatTrangThai(@RequestParam int index,
//                                    @RequestParam boolean daTra) {
//         phieuMuonService.capNhatTrangThai(index, daTra);
//         return "redirect:/quan-ly/phieu-muon";
//     }
// }