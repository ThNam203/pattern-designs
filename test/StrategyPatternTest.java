import StrategyPattern.FlyAlgorithm.FlyHigh;
import StrategyPattern.FlyAlgorithm.FlyNoWay;
import StrategyPattern.GrassDuck;
import StrategyPattern.QuackAlgorithm.Quack;
import StrategyPattern.QuackAlgorithm.QuackLoud;
import StrategyPattern.QuackAlgorithm.QuackNoWay;
import StrategyPattern.SkyDuck;
import StrategyPattern.WoodenDuck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrategyPatternTest {
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
