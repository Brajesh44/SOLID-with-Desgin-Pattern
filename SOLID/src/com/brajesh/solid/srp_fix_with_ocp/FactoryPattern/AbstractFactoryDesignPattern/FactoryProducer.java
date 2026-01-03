package com.brajesh.solid.srp_fix_with_ocp.FactoryPattern.AbstractFactoryDesignPattern;

import java.util.Map;
import java.util.function.Supplier;

import static java.util.Optional.ofNullable;

public class FactoryProducer {

    private static final Map<FactoryType, Supplier<CarFactory>> REGISTRY = Map.of(

            FactoryType.HONDA_CAR_FACTORY, HondaCarFactory::new,
            FactoryType.HYUNDAI_CAR_FACTORY, HyundaiCarFactory::new
    );

    public static CarFactory getCarFactory(FactoryType factoryType) {
        return ofNullable(REGISTRY.get(factoryType))
                .map(Supplier::get)
                .orElseThrow(() -> new IllegalArgumentException("Illegal factory found :" + factoryType));
    }
}
