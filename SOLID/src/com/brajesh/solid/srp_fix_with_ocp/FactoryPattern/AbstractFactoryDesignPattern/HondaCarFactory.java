package com.brajesh.solid.srp_fix_with_ocp.FactoryPattern.AbstractFactoryDesignPattern;

import java.util.Map;
import java.util.function.Supplier;

import static java.util.Optional.ofNullable;

public class HondaCarFactory implements CarFactory {

    private static final Map<CarType, Supplier<Car>> REGISTRY =
            Map.of(
                    CarType.BRIO, Brio::new,
                    CarType.CITY, City::new
            );

    @Override
    public Car createCar(CarType carType) {
        return ofNullable(REGISTRY.get(carType))
                .map(Supplier::get)
                .orElseThrow(() -> new IllegalArgumentException("Unknown Honda car type: " + carType));
    }


}
