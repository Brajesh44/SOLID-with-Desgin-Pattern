package com.brajesh.solid.ISP;

public class Ostrich implements Bird{
    @Override
    public void eat() {
        System.out.println("Ostrich can only eat it can not be fly and swim");
    }
}
