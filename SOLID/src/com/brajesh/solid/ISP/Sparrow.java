package com.brajesh.solid.ISP;

public class Sparrow implements Bird ,FlyingBird{
    @Override
    public void eat() {
        System.out.println("Sparrow is able to eat");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is able to eat and fly but can not swim");
    }
}
