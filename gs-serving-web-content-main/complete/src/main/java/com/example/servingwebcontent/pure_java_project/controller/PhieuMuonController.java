package com.example.servingwebcontent.pure_java_project.controller;

import com.example.servingwebcontent.pure_java_project.model.NguoiDung;
import com.example.servingwebcontent.pure_java_project.model.PhieuMuon;
import com.example.servingwebcontent.pure_java_project.model.Sach;
import com.example.servingwebcontent.pure_java_project.service.PhieuMuonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/muon-sach")
public class PhieuMuonController {

    private final List<NguoiDung> dsNguoiDung = new ArrayList<>();
    private final List<Sach> dsSach = new ArrayList<>();
    private final PhieuMuonService phieuMuonService;

    public PhieuMuonController(PhieuMuonService phieuMuonService) {
        this.phieuMuonService = phieuMuonService;

        // Khởi tạo dữ liệu mẫu người dùng và sách
        dsNguoiDung.add(new NguoiDung(1, "Nguyễn Văn A"));
        dsNguoiDung.add(new NguoiDung(2, "Trần Thị B"));

        dsSach.add(new Sach(1, "Lập Trình Java"));
        dsSach.add(new Sach(2, "Cấu Trúc Dữ Liệu"));
    }

    // Điều hướng mặc định về tạo phiếu cho người dùng có ID = 1
    @GetMapping
    public String chuyenHuongMacDinh() {
        return "redirect:/muon-sach/tao?idNguoiDung=1";
    }

    // Hiển thị form tạo phiếu mượn
    @GetMapping("/tao")
    public String hienThiForm(@RequestParam(defaultValue = "1") int idNguoiDung, Model model) {
        NguoiDung nguoiDung = dsNguoiDung.stream()
                .filter(nd -> nd.getId() == idNguoiDung)
                .findFirst()
                .orElse(null);

        if (nguoiDung == null) {
            model.addAttribute("error", "Không tìm thấy người dùng.");
            return "error";
        }

        PhieuMuon pm = new PhieuMuon();
        pm.setNguoiDung(nguoiDung);

        model.addAttribute("phieuMuon", pm);
        model.addAttribute("dsSach", dsSach);
        return "muon-sach"; // HTML form tạo phiếu mượn
    }

    // Gửi phiếu mượn vào hàng chờ xác nhận
    @PostMapping
    public String luuPhieu(@ModelAttribute PhieuMuon phieuMuon) {
        // Tìm sách từ ID đã chọn
        Sach sach = dsSach.stream()
                .filter(s -> s.getId() == phieuMuon.getSach().getId())
                .findFirst()
                .orElse(null);

        if (sach != null) {
            phieuMuon.setSach(sach);
            phieuMuonService.themPhieu(phieuMuon); // Đưa vào hàng chờ
        }

        return "redirect:/"; // Trở về trang chính sau khi gửi phiếu
    }
}