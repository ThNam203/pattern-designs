package Examples.Facade;

public class KiemTraTonKho {
    public boolean kiemTraSanPham(String sanPham) {
        // Giả sử sản phẩm luôn có sẵn trong kho
        System.out.println("Kiểm tra tồn kho: " + sanPham + " có sẵn.");
        return true;
    }
}
