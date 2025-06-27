package com.example.servingwebcontent.pure_java_project.controller;

import com.example.servingwebcontent.pure_java_project.model.NguoiDung;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/quan-ly")
public class QuanLyController {

    private List<NguoiDung> dsNguoiDung = new ArrayList<>();

    public QuanLyController() {
        dsNguoiDung.add(new NguoiDung(1, "Nguyễn Văn A"));
        dsNguoiDung.add(new NguoiDung(2, "Trần Thị B"));
    }

    @GetMapping("/nguoi-dung")
    public String hienThiDanhSach(Model model) {
        model.addAttribute("dsNguoiDung", dsNguoiDung);
        return "nguoi-dung";
    }
}
