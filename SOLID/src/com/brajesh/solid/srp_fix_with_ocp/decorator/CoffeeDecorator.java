package com.brajesh.solid.srp_fix_with_ocp.decorator;

public abstract  class CoffeeDecorator  implements Coffee{
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
