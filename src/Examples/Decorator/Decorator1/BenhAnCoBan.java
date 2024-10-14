package Examples.Decorator.Decorator1;

public class BenhAnCoBan implements BenhAn {
    String hoVaTen;
    String chuanDoanBanDau;
    public BenhAnCoBan(String hoVaTen, String chuanDoanBanDau) {
        this.hoVaTen = hoVaTen;
        this.chuanDoanBanDau = chuanDoanBanDau;
    }

    @Override
    public String moTa() {
        return "Benh an: \nThong tin co ban: " + this.hoVaTen + "\nChuan doan ban dau: " + this.chuanDoanBanDau + "\n";
    }
}
