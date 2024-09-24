package Decorate;

public class Espresso extends Drink {
    public Espresso() {
        this.name = "Espresso";
    }

    @Override
    public double cost() {
        return 1.09;
    }
}
