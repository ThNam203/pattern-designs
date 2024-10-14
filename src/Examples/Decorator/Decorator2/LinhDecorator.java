package Examples.Decorator.Decorator2;

public abstract class LinhDecorator implements Linh {
    protected Linh linh;

    public LinhDecorator(Linh linh) {
        this.linh = linh;
    }

    @Override
    public String getItem() {
        return linh.getItem();
    }
}
