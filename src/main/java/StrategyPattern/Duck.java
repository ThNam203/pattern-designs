package StrategyPattern;

import StrategyPattern.FlyAlgorithm.Fly;
import StrategyPattern.FlyAlgorithm.FlyNoWay;
import StrategyPattern.QuackAlgorithm.Quack;
import StrategyPattern.QuackAlgorithm.QuackNoWay;

public abstract class Duck {
   public String name;
   public Quack quack;
   public Fly fly;

   public Duck() {
      this.fly = new FlyNoWay();
      this.quack = new QuackNoWay();
   }

   public Duck(Quack q, Fly f) {
      this.fly = f;
      this.quack = q;
   }

   public String performQuack() {
      return this.quack.perform();
   }

   public String performFly() {
      return this.fly.perform();
   }
}
