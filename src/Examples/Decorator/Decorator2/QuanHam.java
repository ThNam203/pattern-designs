package Examples.Decorator.Decorator2;

public class QuanHam extends LinhDecorator {
    private final String quanHam;

    public QuanHam(Linh linh, String quanHam) {
        super(linh);
        this.quanHam = quanHam;
    }

    @Override
    public String getItem() {
        return super.getItem() + "\nQuân hàm: " + quanHam;
    }
}
