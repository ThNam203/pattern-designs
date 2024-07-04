package DecoratePattern.Toppings;

import DecoratePattern.Drink;

public class Pearl extends ToppingDecorator {
    public Pearl(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", pearl";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.19;
    }
}
