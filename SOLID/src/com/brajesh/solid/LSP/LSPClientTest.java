package com.brajesh.solid.LSP;

public class LSPClientTest {

    public static void makeFlyingBirdFly(FlyingBird bird){
        bird.fly();
        bird.eat();
    }

    static void main() {
        FlyingBird sparrow= new Sparrow();
        makeFlyingBirdFly(sparrow);
        Bird bird= new Ostrich();
        bird.eat();
    }
}
