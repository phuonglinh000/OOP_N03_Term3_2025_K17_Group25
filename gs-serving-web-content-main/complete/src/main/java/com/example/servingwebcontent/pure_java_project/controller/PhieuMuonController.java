package com.example.servingwebcontent.pure_java_project.controller;

import com.example.servingwebcontent.pure_java_project.model.NguoiDung;
import com.example.servingwebcontent.pure_java_project.model.PhieuMuon;

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
    private final PhieuMuonService phieuMuonService;

    public PhieuMuonController(PhieuMuonService phieuMuonService) {
        this.phieuMuonService = phieuMuonService;

        // Khởi tạo dữ liệu mẫu
        dsNguoiDung.add(new NguoiDung(1, "Nguyễn Văn A"));
        dsNguoiDung.add(new NguoiDung(2, "Trần Thị B"));
    }

    // ➤ Trang mặc định sẽ điều hướng đến form tạo
    @GetMapping
    public String chuyenHuongMacDinh() {
        return "redirect:/muon-sach/tao?idNguoiDung=1";
    }

    // ➤ Hiển thị form tạo phiếu mượn
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
        return "muon-sach"; // View form tạo phiếu mượn
    }

    // ➤ Xử lý lưu phiếu mượn (không cần @RequestParam sachId nữa)
    @PostMapping("/them")
    public String luuPhieu(@ModelAttribute("phieuMuon") PhieuMuon phieuMuon) {
        phieuMuonService.themPhieu(phieuMuon);
        return "redirect:/muon-sach/danh-sach";
    }

    // ➤ Trang danh sách phiếu mượn
    @GetMapping("/danh-sach")
    public String hienThiDanhSach(Model model) {
        model.addAttribute("dsPhieu", phieuMuonService.layTatCa());
        return "ds-phieu-muon"; // Tên file HTML hiển thị danh sách
    }
}