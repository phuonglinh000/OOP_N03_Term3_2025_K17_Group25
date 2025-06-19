package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class PhieuMuonController {

    @GetMapping("/phieu-muon")
    public String hienThiPhieu(Model model) {
        
        String maPhieu = "01";
        String tenDocGia = "Linh";
        String tenSach = "Java";
        LocalDate ngayMuon = LocalDate.now();
        LocalDate ngayTra = ngayMuon.plusDays(7);

        
        model.addAttribute("maPhieu", maPhieu);
        model.addAttribute("tenDocGia", tenDocGia);
        model.addAttribute("tenSach", tenSach);
        model.addAttribute("ngayMuon", ngayMuon);
        model.addAttribute("ngayTra", ngayTra);

        return "phieu-muon"; 
    }
}
