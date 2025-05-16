package review;

public class ex22 {
    Tien menhGia;
    public ex22(Tien menhGia) {
        this.menhGia = menhGia;
    }
    public void moTa() {
        System.out.print("Tờ tiền này là: ");
        switch (menhGia) {
            case mot_nghin:
                System.out.println("1.000 đồng. Rất nhỏ, ít thấy.");
                break;
            case hai_nghin:
            case nam_nghin:
                System.out.println("2.000 hoặc 5.000 đồng. Thường dùng khi mua hàng nhỏ lẻ.");
                break;
            case muoi_nghin:
            case hai_muoi_nghin:
                System.out.println("10.000 hoặc 20.000 đồng. Phổ biến trong thanh toán hàng ngày.");
                break;
            case nam_muoi_nghin:
            default:
                System.out.println("50.000 đồng. Giá trị trung bình, thường dùng.");
        }
    }

    public static void main(String[] args) {
        ex22 to1 = new ex22(Tien.mot_nghin);
        ex22 to2 = new ex22(Tien.nam_nghin);
        ex22 to3 = new ex22(Tien.hai_muoi_nghin);
        ex22 to4 = new ex22(Tien.nam_muoi_nghin);
        to1.moTa();
        to2.moTa();
        to3.moTa();
        to4.moTa();
    }
}


