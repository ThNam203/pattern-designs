package DecoratePattern.Toppings;

import DecoratePattern.Drink;

public class Chocolate extends ToppingDecorator {
    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", chocolate";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.49;
    }
}
