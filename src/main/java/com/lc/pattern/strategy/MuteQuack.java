package com.lc.pattern.sample1;

public class MuteQuack implements QuackBehavior {

   @Override
   public void quack() {
      System.out.println("<< SILENCE >>");
   }

}
