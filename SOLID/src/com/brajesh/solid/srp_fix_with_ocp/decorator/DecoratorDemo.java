package com.brajesh.solid.srp_fix_with_ocp.decorator;

public class DecoratorDemo {

    static void main() {
       Coffee coffee= new SugarDecorator(new MilkDecorator(new SimpleCoffee()));

        System.out.println(coffee.cost());

    }


}
