package com.lc.pattern.strategy;

public class MiniDuckSimulator {

   public static void main(String[] args) {
      Duck mallardDuck = new MallardDuck();

      mallardDuck.performFly();
      mallardDuck.performQuack();
      mallardDuck.display();

      System.out.println(" ---------- ");

      Duck colombianDuck = new ColombianDuck();

      colombianDuck.performFly();
      colombianDuck.performQuack();
      colombianDuck.display();
   }

}
