package Examples.FactoryMethod;

public class BurgerFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Burger();
    }
}
