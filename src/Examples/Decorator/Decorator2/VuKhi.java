package Examples.Decorator.Decorator2;

public class VuKhi extends LinhDecorator {
    private final String vuKhi;

    public VuKhi(Linh linh, String vuKhi) {
        super(linh);
        this.vuKhi = vuKhi;
    }

    @Override
    public String getItem() {
        return super.getItem() + "\nVũ khí: " + vuKhi;
    }
}
