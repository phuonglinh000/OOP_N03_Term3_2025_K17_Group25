package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.PhieuMuon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhieuMuonService {

    private final List<PhieuMuon> danhSachChoXacNhan = new ArrayList<>();

    public void themPhieu(PhieuMuon phieuMuon) {
        danhSachChoXacNhan.add(phieuMuon);
    }

    public List<PhieuMuon> layTatCa() {
        return new ArrayList<>(danhSachChoXacNhan);
    }
}