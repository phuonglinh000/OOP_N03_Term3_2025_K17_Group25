package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PhieuMuonController {

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("phieuMuon", new PhieuMuon());
        return "phieumuon-form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute PhieuMuon phieuMuon, Model model) {
        model.addAttribute("phieuMuon", phieuMuon);
        return "xemphieu";
    }
}
