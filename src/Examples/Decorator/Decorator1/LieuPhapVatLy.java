package Examples.Decorator.Decorator1;

public class LieuPhapVatLy extends BenhAnDecorator {
    public LieuPhapVatLy(BenhAn benhAn) {
        super(benhAn);
    }

    @Override
    public String moTa() {
        return super.moTa() + "Benh nhan su dung lieu phap vat ly.\n";
    }
}
