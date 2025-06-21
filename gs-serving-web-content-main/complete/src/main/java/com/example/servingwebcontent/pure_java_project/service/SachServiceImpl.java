package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.Sach;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SachServiceImpl implements SachService {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public List<Sach> getAll() {
        return danhSach;
    }

    @Override
    public void addSach(Sach sach) {
        danhSach.add(sach);
    }

    @Override
    public List<Sach> searchByKeyword(String keyword) {
        return danhSach.stream()
                .filter(s -> s.getTen().toLowerCase().contains(keyword.toLowerCase()) ||
                             s.getTacGia().toLowerCase().contains(keyword.toLowerCase()) ||
                             s.getTheLoai().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}