package Examples.FactoryMethod;

public class Pizza implements Dish {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza dough and toppings.");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pizza in the oven.");
    }

    @Override
    public void serve() {
        System.out.println("Serving pizza on a plate.");
    }
}
