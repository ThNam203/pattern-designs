package Examples.Decorator.Decorator2;

public class KyNang extends LinhDecorator {
    private final String kyNang;

    public KyNang(Linh linh, String kyNang) {
        super(linh);
        this.kyNang = kyNang;
    }

    @Override
    public String getItem() {
        return super.getItem() + "\nKỹ năng: " + kyNang;
    }
}
