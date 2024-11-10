package Strategy.HeadFirst;

import Strategy.HeadFirst.FlyAlgorithm.FlyHigh;
import Strategy.HeadFirst.QuackAlgorithm.QuackLoud;

public class SkyDuck extends Duck {
    public SkyDuck() {
        this.quack = new QuackLoud();
        this.fly = new FlyHigh();
    }
}
