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

        // Dữ liệu mẫu
        dsNguoiDung.add(new NguoiDung(1, "Nguyễn Văn A"));
        dsNguoiDung.add(new NguoiDung(2, "Trần Thị B"));
    }

    // Điều hướng mặc định
    @GetMapping
    public String chuyenHuongMacDinh() {
        return "redirect:/muon-sach/tao?idNguoiDung=1";
    }

    // Hiển thị form và danh sách
    @GetMapping("/tao")
    public String hienThiForm(@RequestParam(defaultValue = "1") int idNguoiDung,
                              Model model) {

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
        model.addAttribute("dsPhieu", phieuMuonService.layTatCa());

        return "phieu-muon";
    }

    // Xử lý lưu phiếu — Trả về view trực tiếp để tránh lỗi redirect 404
    @PostMapping("/them")
    public String luuPhieu(@ModelAttribute("phieuMuon") PhieuMuon phieuMuon,
                           Model model) {

        // Lưu phiếu mượn
        phieuMuonService.themPhieu(phieuMuon);

        // Lấy lại người dùng từ danh sách
        NguoiDung nguoiDung = dsNguoiDung.stream()
                                         .filter(nd -> nd.getId() == phieuMuon.getNguoiDung().getId())
                                         .findFirst()
                                         .orElse(null);

        if (nguoiDung == null) {
            model.addAttribute("error", "Không tìm thấy người dùng.");
            return "error";
        }

        // Tạo mới object để làm sạch form
        PhieuMuon pmMoi = new PhieuMuon();
        pmMoi.setNguoiDung(nguoiDung);

        model.addAttribute("phieuMuon", pmMoi);
        model.addAttribute("dsPhieu", phieuMuonService.layTatCa());

        return "phieu-muon"; // ⚠️ KHÔNG redirect để không bị lỗi 404
    }
}