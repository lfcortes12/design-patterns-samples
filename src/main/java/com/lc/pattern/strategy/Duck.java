package com.lc.pattern.strategy;

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
