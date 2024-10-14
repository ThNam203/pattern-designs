package Examples.Decorator.Decorator1;

public class KeDonThuoc extends BenhAnDecorator {
    public KeDonThuoc(BenhAn benhAn) {
        super(benhAn);
    }

    @Override
    public String moTa() {
        return super.moTa() + "Benh nhan duoc ke don thuoc.\n";
    }
}
