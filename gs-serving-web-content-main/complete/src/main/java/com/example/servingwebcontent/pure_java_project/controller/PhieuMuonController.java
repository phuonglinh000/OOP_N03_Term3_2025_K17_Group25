package com.example.servingwebcontent.pure_java_project.controller;

import com.example.servingwebcontent.pure_java_project.model.Sach;
import com.example.servingwebcontent.pure_java_project.model.PhieuMuon;
import com.example.servingwebcontent.pure_java_project.service.SachService;
import com.example.servingwebcontent.pure_java_project.service.PhieuMuonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PhieuMuonController {

    @Autowired
    private SachService sachService;

    @Autowired
    private PhieuMuonService phieuMuonService;

    // Trang hiển thị danh sách sách và tìm kiếm sách
    @GetMapping("/sach")
    public String hienThiDanhSachSach(@RequestParam(required = false) String keyword, Model model) {
        List<Sach> danhSach;
        if (keyword != null && !keyword.isEmpty()) {
            danhSach = sachService.timKiemSach(keyword);
        } else {
            danhSach = sachService.layTatCaSach();
        }
        model.addAttribute("danhSachSach", danhSach);
        return "sach"; // tên file .html trong templates
    }

    // Thêm sách mới
    @PostMapping("/sach/add")
    public String themSach(@ModelAttribute Sach sach) {
        sachService.themSach(sach);
        return "redirect:/sach";
    }

    // Tạo phiếu mượn sách
    @PostMapping("/phieumuon/add")
    public String taoPhieuMuon(@ModelAttribute PhieuMuon phieuMuon) {
        phieuMuonService.taoPhieu(phieuMuon);
        return "redirect:/phieumuon";
    }

    // Hiển thị danh sách phiếu mượn
    @GetMapping("/phieumuon")
    public String hienThiPhieuMuon(Model model) {
        model.addAttribute("dsPhieu", phieuMuonService.layTatCaPhieu());
        return "phieumuon";
    }
}