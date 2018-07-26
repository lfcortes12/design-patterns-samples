package com.lc.pattern.sample1;

public abstract class Duck {

   protected FlyBehavior flyBehavior;
   protected QuackBehavior quackBehavior;

   public abstract void display();

   public void performFly() {
      flyBehavior.fly();
   }

   public void performQuack() {
      quackBehavior.quack();
   }

}
