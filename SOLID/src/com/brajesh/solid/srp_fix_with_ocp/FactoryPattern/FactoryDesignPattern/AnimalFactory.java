package com.brajesh.solid.srp_fix_with_ocp.FactoryPattern.FactoryDesignPattern;

import java.util.Map;

import java.util.function.Supplier;

import static java.util.Optional.ofNullable;

public class AnimalFactory {


    private static final Map<AnimalType, Supplier<Animal>> REGISTRY =
            Map.of(
                    AnimalType.DOG, Dog::new,
                    AnimalType.CAT, Cat::new,
                    AnimalType.FOX, Fox::new
            );

    public Animal createAnimal(AnimalType type) {
        return ofNullable(REGISTRY.get(type))
                .map(Supplier::get)
                .orElseThrow(() -> new IllegalArgumentException("Unknown animal"));
    }
}
