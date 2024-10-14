package Examples.Decorator.Decorator1;

public class ChuongTrinh {
    public static void main(String[] args) {
        BenhAn benhAn = new BenhAnCoBan("Hoo Lee Sheet", "Roi loan tam than");
        benhAn = new KeDonThuoc(benhAn);
        benhAn = new LieuPhapVatLy(benhAn);
        benhAn = new XetNghiemYKhoa(benhAn);
        System.out.println(benhAn.moTa());
    }
}

