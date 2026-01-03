package com.brajesh.solid.srp_fix_with_ocp.FactoryPattern.AbstractFactoryDesignPattern;

public class AbstractFactoryTest {

    static void main() {
        CarFactory hondaCarFactory = FactoryProducer.getCarFactory(FactoryType.HONDA_CAR_FACTORY);
        Car brio = hondaCarFactory.createCar(CarType.BRIO);
        brio.drive();
        Car city = hondaCarFactory.createCar(CarType.CITY);
        city.drive();
        CarFactory hyudaiCarFactory = FactoryProducer.getCarFactory(FactoryType.HYUNDAI_CAR_FACTORY);
        Car i10 = hyudaiCarFactory.createCar(CarType.I10);
        i10.drive();
        Car i20 = hyudaiCarFactory.createCar(CarType.I20);
        i20.drive();
    }
}
