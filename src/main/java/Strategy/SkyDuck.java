package Strategy;

import Strategy.FlyAlgorithm.FlyHigh;
import Strategy.QuackAlgorithm.QuackLoud;

public class SkyDuck extends Duck {
    public SkyDuck() {
        this.quack = new QuackLoud();
        this.fly = new FlyHigh();
    }
}
