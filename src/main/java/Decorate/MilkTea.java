package Decorate;

public class MilkTea extends Drink {
    public MilkTea() {
        this.name = "Milk tea";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
