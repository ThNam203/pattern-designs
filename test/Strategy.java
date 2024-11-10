import Strategy.HeadFirst.FlyAlgorithm.FlyHigh;
import Strategy.HeadFirst.FlyAlgorithm.FlyNoWay;
import Strategy.HeadFirst.GrassDuck;
import Strategy.HeadFirst.QuackAlgorithm.QuackLoud;
import Strategy.HeadFirst.QuackAlgorithm.QuackNoWay;
import Strategy.HeadFirst.SkyDuck;
import Strategy.HeadFirst.WoodenDuck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Strategy {
    @Test
    public void testGrassDuck() {
        GrassDuck grassDuck = new GrassDuck();
        FlyNoWay flyNoWay = new FlyNoWay();
        QuackLoud quackLoud = new QuackLoud();

        Assertions.assertEquals(grassDuck.performFly(), flyNoWay.perform());
        Assertions.assertEquals(grassDuck.performQuack(), quackLoud.perform());
    }
    @Test
    public void testWoodenDuck() {
        WoodenDuck woodenDuck = new WoodenDuck();
        FlyNoWay flyNoWay = new FlyNoWay();
        QuackNoWay quackNoWay = new QuackNoWay();

        Assertions.assertEquals(woodenDuck.performFly(), flyNoWay.perform());
        Assertions.assertEquals(woodenDuck.performQuack(), quackNoWay.perform());
    }

    @Test
    public void testSkyDuck() {
        SkyDuck skyDuck = new SkyDuck();
        FlyHigh flyHigh = new FlyHigh();
        QuackLoud quackLoud = new QuackLoud();

        Assertions.assertEquals(skyDuck.performFly(), flyHigh.perform());
        Assertions.assertEquals(skyDuck.performQuack(), quackLoud.perform());
    }
}
