package Examples.FactoryMethod;

public class Restaurant {
    public static void main(String[] args) {
        DishFactory pizzaFactory = new PizzaFactory();
        Dish pizza = pizzaFactory.createDish();
        pizza.prepare();
        pizza.cook();
        pizza.serve();

        DishFactory burgerFactory = new BurgerFactory();
        Dish burger = burgerFactory.createDish();
        burger.prepare();
        burger.cook();
        burger.serve();

        DishFactory pastaFactory = new PastaFactory();
        Dish pasta = pastaFactory.createDish();
        pasta.prepare();
        pasta.cook();
        pasta.serve();
    }
}
