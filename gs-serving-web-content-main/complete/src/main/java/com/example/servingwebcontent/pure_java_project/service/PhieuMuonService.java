package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.PhieuMuon;

import java.util.List;

public interface PhieuMuonService {
    void addPhieuMuon(PhieuMuon phieu);
    List<PhieuMuon> getAll();
}
