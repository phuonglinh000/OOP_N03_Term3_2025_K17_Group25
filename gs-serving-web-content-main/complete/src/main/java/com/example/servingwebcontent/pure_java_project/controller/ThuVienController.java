package com.example.servingwebcontent.pure_java_project.controller;

import com.example.servingwebcontent.pure_java_project.model.Sach;
import com.example.servingwebcontent.pure_java_project.model.PhieuMuon;
import com.example.servingwebcontent.pure_java_project.service.SachService;
import com.example.servingwebcontent.pure_java_project.service.PhieuMuonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ThuVienController {

    @Autowired
    private SachService sachService;

    @Autowired
    private PhieuMuonService phieuMuonService;

    @GetMapping("/thuvien")
    public String hienThiTrang(Model model) {
        model.addAttribute("danhSachSach", sachService.getAll());
        model.addAttribute("danhSachPhieu", phieuMuonService.getAll());
        model.addAttribute("sachMoi", new Sach());
        model.addAttribute("phieuMoi", new PhieuMuon());
        return "thuvien";
    }

    @PostMapping("/thuvien/them-sach")
    public String themSach(@ModelAttribute("sachMoi") Sach sach) {
        sachService.addSach(sach);
        return "redirect:/thuvien";
    }

    @PostMapping("/thuvien/tim-sach")
    public String timSach(@RequestParam("tuKhoa") String tuKhoa, Model model) {
        model.addAttribute("danhSachSach", sachService.searchByKeyword(tuKhoa));
        model.addAttribute("danhSachPhieu", phieuMuonService.getAll());
        model.addAttribute("sachMoi", new Sach());
        model.addAttribute("phieuMoi", new PhieuMuon());
        return "thuvien";
    }

    @PostMapping("/thuvien/tao-phieu")
    public String taoPhieu(@ModelAttribute("phieuMoi") PhieuMuon phieu) {
        phieuMuonService.addPhieuMuon(phieu);
        return "redirect:/thuvien";
    }
}