package com.lc.pattern.sample1;

public class MallardDuck extends Duck {

   public MallardDuck() {
      super();
      this.quackBehavior = new Quack();
      this.flyBehavior = new FlyWithWings();
   }

   @Override
   public void display() {
      System.out.println("I'm a Mallard Duck");
   }

}
