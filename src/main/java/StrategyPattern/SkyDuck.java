package StrategyPattern;

import StrategyPattern.FlyAlgorithm.FlyHigh;
import StrategyPattern.QuackAlgorithm.QuackLoud;

public class SkyDuck extends Duck {
    public SkyDuck() {
        this.quack = new QuackLoud();
        this.fly = new FlyHigh();
    }
}
