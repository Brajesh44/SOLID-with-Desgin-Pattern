package com.brajesh.solid.ISP;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ISPClientDemo {
    public static void processBird(Bird bird) {

//        Stream.of(bird)
//                .peek(Bird::eat)
//                .filter(FlyingBird.class::isInstance)
//                .map(FlyingBird.class::cast)
//                .peek(FlyingBird::fly)
//                .filter(SwimmingBird.class::isInstance)
//                .map(SwimmingBird.class::cast)
//                .forEach(SwimmingBird::swim);

//        Map<Class<?>, Consumer<Bird>> actions = Map.of(
//                Bird.class, Bird::eat,
//                FlyingBird.class, b -> ((FlyingBird) b).fly(),
//                SwimmingBird.class, b -> ((SwimmingBird) b).swim()
//        );
//
//        actions.forEach((type, action) -> {
//            if (type.isInstance(bird)) {
//                action.accept(bird);
//            }
//        });

        bird.eat();

        if (bird instanceof FlyingBird) {
            ((FlyingBird) bird).fly();
        }

        if (bird instanceof SwimmingBird) {
            ((SwimmingBird) bird).swim();
        }



    }



    static void main() {

        Bird duck = new Duck();
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();
        processBird(duck);
        System.out.println("****   Sparrow   ****");

        processBird(sparrow);

        System.out.println("****   Ostrich   ****");
        processBird(ostrich);

//        Bird ostrich= new Ostrich();
//        eatOnly(ostrich);
//        FlyingBird sparrow = new Sparrow();
//        eatAndFly(sparrow);
    }

}
