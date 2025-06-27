package com.example.servingwebcontent.pure_java_project.service;

import com.example.servingwebcontent.pure_java_project.model.PhieuMuon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhieuMuonService {

    private final List<PhieuMuon> danhSachChoXacNhan = new ArrayList<>();

    // ✅ Thêm phiếu mượn mới
    public void themPhieu(PhieuMuon phieuMuon) {
        danhSachChoXacNhan.add(phieuMuon);
    }

    // ✅ Lấy toàn bộ danh sách phiếu
    public List<PhieuMuon> layTatCa() {
        return new ArrayList<>(danhSachChoXacNhan);
    }

    // ✅ Xoá phiếu theo index
    public void xoaPhieu(int index) {
        if (index >= 0 && index < danhSachChoXacNhan.size()) {
            danhSachChoXacNhan.remove(index);
        }
    }

    // ✅ Cập nhật trạng thái đã trả (nếu vẫn cần dùng cách truyền boolean)
    public void capNhatTrangThai(int index, boolean daTra) {
        if (index >= 0 && index < danhSachChoXacNhan.size()) {
            danhSachChoXacNhan.get(index).setDaTra(daTra);
        }
    }

    // ✅ Đảo ngược trạng thái (dễ dùng hơn từ giao diện)
    public void daoNguocTrangThai(int index) {
        if (index >= 0 && index < danhSachChoXacNhan.size()) {
            PhieuMuon pm = danhSachChoXacNhan.get(index);
            pm.setDaTra(!pm.isDaTra()); // Toggle true <-> false
        }
    }

    // ✅ Lấy phiếu theo index
    public PhieuMuon layTheoIndex(int index) {
        if (index >= 0 && index < danhSachChoXacNhan.size()) {
            return danhSachChoXacNhan.get(index);
        }
        return null;
    }
}