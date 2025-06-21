package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.PhieuMuon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhieuMuonServiceImpl implements PhieuMuonService {
    private List<PhieuMuon> danhSachPhieu = new ArrayList<>();

    @Override
    public void addPhieuMuon(PhieuMuon phieu) {
        danhSachPhieu.add(phieu);
    }

    @Override
    public List<PhieuMuon> getAll() {
        return danhSachPhieu;
    }
}
