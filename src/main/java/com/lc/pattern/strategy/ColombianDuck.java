package com.lc.pattern.strategy;

public class ColombianDuck extends Duck {

   public ColombianDuck() {
      super();
      this.quackBehavior = new Quack();
      this.flyBehavior = new FlyNoWay();
   }

   @Override
   public void display() {
      System.out.println("I'm a Colombian Duck");
   }

}
