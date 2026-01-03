package com.brajesh.solid.ISP;

public class Duck implements Bird,FlyingBird,SwimmingBird{
    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override
    public void eat() {
        System.out.println("Duck can eat");
    }
}
