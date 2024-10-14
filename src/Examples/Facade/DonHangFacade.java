package Examples.Facade;

public class DonHangFacade {
    private final KiemTraTonKho kiemTraTonKho;
    private final XuLyThanhToan xuLyThanhToan;
    private final VanChuyen vanChuyen;

    public DonHangFacade() {
        this.kiemTraTonKho = new KiemTraTonKho();
        this.xuLyThanhToan = new XuLyThanhToan();
        this.vanChuyen = new VanChuyen();
    }

    public void datHang(String sanPham, String hinhThucThanhToan) {
        System.out.println("Bắt đầu quá trình đặt hàng...");

        if (kiemTraTonKho.kiemTraSanPham(sanPham)) {
            if (xuLyThanhToan.thanhToan(hinhThucThanhToan)) {
                vanChuyen.sapXepVanChuyen(sanPham);
                System.out.println("Đặt hàng thành công!");
            } else {
                System.out.println("Thanh toán thất bại!");
            }
        } else {
            System.out.println("Sản phẩm không có sẵn trong kho.");
        }
    }
}
