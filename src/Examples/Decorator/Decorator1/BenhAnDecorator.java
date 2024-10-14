package Examples.Decorator.Decorator1;

public abstract class BenhAnDecorator implements BenhAn {
    protected BenhAn benhAn;

    public BenhAnDecorator(BenhAn benhAn) {
        this.benhAn = benhAn;
    }

    @Override
    public String moTa() {
        return benhAn.moTa();
    }
}
