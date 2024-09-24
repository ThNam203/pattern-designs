import Decorate.Drink;
import Decorate.Espresso;
import Decorate.IceCream;
import Decorate.MilkTea;
import Decorate.Toppings.Chocolate;
import Decorate.Toppings.Pearl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Decorator {
    @Test
    public void testEspresso() {
        Drink espresso = new Espresso();
        espresso = new Chocolate(espresso);
        espresso = new Pearl(espresso);

        Assertions.assertEquals(espresso.getDescription(), "Espresso, chocolate, pearl");
        Assertions.assertEquals(espresso.cost(), 1.09 + 0.49 + 0.19);
    }

    @Test
    public void testIceCream() {
        Drink iceCream = new IceCream();
        iceCream = new Pearl(iceCream);

        Assertions.assertEquals(iceCream.getDescription(), "Ice cream, pearl");
        Assertions.assertEquals(iceCream.cost(), 1.29 + 0.19);
    }

    @Test
    public void testMilkTea() {
        Drink milkTea = new MilkTea();
        milkTea = new Chocolate(milkTea);

        Assertions.assertEquals(milkTea.getDescription(), "Milk tea, chocolate");
        Assertions.assertEquals(milkTea.cost(), 1.99 + 0.49);
    }
}
