package Examples.FactoryMethod;

public class Pasta implements Dish {
    @Override
    public void prepare() {
        System.out.println("Boiling pasta and preparing sauce.");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pasta with sauce.");
    }

    @Override
    public void serve() {
        System.out.println("Serving pasta in a bowl.");
    }
}
