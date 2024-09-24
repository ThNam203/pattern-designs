package Decorate;

public class IceCream extends Drink {
    public IceCream() {
        this.name = "Ice cream";
    }

    @Override
    public double cost() {
        return 1.29;
    }
}
