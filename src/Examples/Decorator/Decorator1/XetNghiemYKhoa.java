package Examples.Decorator.Decorator1;

public class XetNghiemYKhoa extends BenhAnDecorator {
    public XetNghiemYKhoa(BenhAn benhAn) {
        super(benhAn);
    }

    @Override
    public String moTa() {
        return super.moTa() + "Benh nhan duoc xet nghiem y khoa.\n";
    }
}
