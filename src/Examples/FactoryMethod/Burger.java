package Examples.FactoryMethod;

public class Burger implements Dish {
    @Override
    public void prepare() {
        System.out.println("Preparing burger buns and patties.");
    }

    @Override
    public void cook() {
        System.out.println("Grilling the burger patties.");
    }

    @Override
    public void serve() {
        System.out.println("Serving burger with fries.");
    }
}
