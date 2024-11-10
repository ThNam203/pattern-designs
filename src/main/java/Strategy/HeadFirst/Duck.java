package Strategy.HeadFirst;

import Strategy.HeadFirst.FlyAlgorithm.Fly;
import Strategy.HeadFirst.FlyAlgorithm.FlyNoWay;
import Strategy.HeadFirst.QuackAlgorithm.Quack;
import Strategy.HeadFirst.QuackAlgorithm.QuackNoWay;

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
