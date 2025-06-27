package com.example.servingwebcontent.pure_java_project.controller;

import com.example.servingwebcontent.pure_java_project.model.NguoiDung;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/nguoi-dung")
public class NguoiDungController {

    private final List<NguoiDung> danhSachNguoiDung = new ArrayList<>();

    
    public NguoiDungController() {
        danhSachNguoiDung.add(new NguoiDung(1, "Nguyễn Văn A"));
        danhSachNguoiDung.add(new NguoiDung(2, "Trần Thị B"));
    }

    
    @GetMapping
    public String hienThiDanhSach(Model model) {
        model.addAttribute("dsNguoiDung", danhSachNguoiDung);
        return "nguoi-dung"; // Giao diện nguoi-dung.html
    }

    
    @GetMapping("/xoa/{id}")
    public String xoaNguoiDung(@PathVariable int id) {
        danhSachNguoiDung.removeIf(nd -> nd.getId() == id);
        return "redirect:/nguoi-dung";
    }
}
