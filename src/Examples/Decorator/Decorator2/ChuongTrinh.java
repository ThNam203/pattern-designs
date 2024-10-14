package Examples.Decorator.Decorator2;

public class ChuongTrinh {
    public static void main(String[] args) {
        Linh linh = new LinhCoBan();

        linh = new VuKhi(linh, "Súng Beryl 3x");
        linh = new VuKhi(linh, "Áo giáp 3");

        linh = new KyNang(linh, "Bắn súng");
        linh = new KyNang(linh, "Chữa trị");

        linh = new QuanHam(linh, "Thiếu úy");

        System.out.println(linh.getItem());
    }
}

