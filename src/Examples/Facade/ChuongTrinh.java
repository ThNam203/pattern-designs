package Examples.Facade;

public class ChuongTrinh {
    public static void main(String[] args) {
        DonHangFacade donHangFacade = new DonHangFacade();
        donHangFacade.datHang("Laptop", "Thẻ tín dụng");
        System.out.println("\n");
        donHangFacade.datHang("Điện thoại", "Ví điện tử");
    }
}
