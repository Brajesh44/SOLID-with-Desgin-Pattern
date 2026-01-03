package com.brajesh.solid.srp_fix_with_ocp.FactoryPattern.AbstractFactoryDesignPattern;

import java.util.Map;
import java.util.function.Supplier;

import static java.util.Optional.ofNullable;

public class HyundaiCarFactory implements CarFactory {

    private static final Map<CarType, Supplier<Car>> REGISTRY = Map.of(
            CarType.I10, I10::new,
            CarType.I20, I20::new);

    @Override
    public Car createCar(CarType carType) {
        return ofNullable(REGISTRY.get(carType))
                .map(Supplier::get)
                .orElseThrow(() -> new IllegalArgumentException("Unknown Hyundai car type:" + carType));
    }
}
