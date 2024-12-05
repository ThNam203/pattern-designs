import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactory {
    @Test
    public void testNormalCarFactory() {
        CarFactory factory = CarFactoryMaker.getFactory(CarTypes.NormalCar);
        Assertions.assertInstanceOf(NormalCarFactory.class, factory);
    }

    @Test
    public void testLuxuryCarFactory() {
        CarFactory factory = CarFactoryMaker.getFactory(CarTypes.LuxuryCar);
        Assertions.assertInstanceOf(LuxuryCarFactory.class, factory);
    }

    @Test
    public void testOutputs() {
        CarFactory normalCarFactory = CarFactoryMaker.getFactory(CarTypes.NormalCar);
        Car normalCar = normalCarFactory.createCar();
        Assertions.assertEquals(normalCar.getName(), CarNames.NORMAL_CAR);

        CarFactory luxuryCarFactory = CarFactoryMaker.getFactory(CarTypes.LuxuryCar);
        Car luxuryCar = luxuryCarFactory.createCar();
        Assertions.assertEquals(luxuryCar.getName(), CarNames.LUXURY_CAR);
    }
}
