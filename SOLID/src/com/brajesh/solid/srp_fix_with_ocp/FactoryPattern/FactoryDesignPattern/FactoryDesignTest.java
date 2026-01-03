package com.brajesh.solid.srp_fix_with_ocp.FactoryPattern.FactoryDesignPattern;

public class FactoryDesignTest {

    static void main(String[] args) {

        AnimalType animalType = AnimalType.valueOf(args[0].toUpperCase());
        AnimalFactory   animalFactory= new AnimalFactory();
       Animal animal= animalFactory.createAnimal(animalType);
       animal.eat();
    }
}
