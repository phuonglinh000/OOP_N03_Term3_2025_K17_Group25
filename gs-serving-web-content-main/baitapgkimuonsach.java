public class baitapgkimuonsach {
    private String maSach;
    private String maThanhVien;
    private String ngayMuon;
    private String ngayHetHan;

    public baitapgkimuonsach(String maSach, String maThanhVien, String ngayMuon, String ngayHetHan) {
        try {
            if (maSach == null || maThanhVien == null || ngayMuon == null || ngayHetHan == null) {
                throw new IllegalArgumentException("Không được để trống các thông tin mượn sách.");
            }

            this.maSach = maSach;
            this.maThanhVien = maThanhVien;
            this.ngayMuon = ngayMuon;
            this.ngayHetHan = ngayHetHan;
        } catch (Exception e) {
            System.out.println(" Lỗi khi khởi tạo: " + e.getMessage());
        } finally {
            System.out.println(" Đã khởi tạo đối tượng baitapgkimuonsach.");
        }
    }

    public String getMaSach() {
        return maSach;
    }

    public String getMaThanhVien() {
        return maThanhVien;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        try {
            if (ngayHetHan == null || ngayHetHan.isEmpty()) {
                throw new IllegalArgumentException("Ngày hết hạn không hợp lệ.");
            }
            this.ngayHetHan = ngayHetHan;
        } catch (Exception e) {
            System.out.println(" Lỗi khi cập nhật ngày hết hạn: " + e.getMessage());
        } finally {
            System.out.println(" Gọi setNgayHetHan xong.");
        }
    }

    @Override
    public String toString() {
        try {
            return "Mã sách: " + maSach + ", Mã thành viên: " + maThanhVien
                    + ", Ngày mượn: " + ngayMuon + ", Ngày hết hạn: " + ngayHetHan;
        } catch (Exception e) {
            return " Lỗi khi tạo chuỗi thông tin: " + e.getMessage();
        } finally {
            System.out.println(" Gọi toString thành công.");
        }
    }
}
