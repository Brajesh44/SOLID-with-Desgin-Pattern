package com.brajesh.solid.srp_fix_with_ocp.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public double cost() {
        return 50;
    }
}
