package com.brajesh.solid.srp_fix_with_ocp.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
       return coffee.cost()+10;
    }
}
