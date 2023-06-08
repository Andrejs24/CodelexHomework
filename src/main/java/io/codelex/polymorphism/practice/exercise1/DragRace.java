package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        Opel opel = new Opel();
        Mercedes mercedes = new Mercedes();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();
        Audi audi = new Audi();
        List<Car> cars = new ArrayList<>();
        cars.add(opel);
        cars.add(lexus);
        cars.add(bmw);
        cars.add(mercedes);
        cars.add(tesla);
        cars.add(audi);

        fastestCar(cars);
    }

    public static <E extends Car> void fastestCar(List<E> cars) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < cars.size(); j++) {
                Car car = cars.get(j);

                if (i == 2 && car instanceof Boost) {
                    Boost boostableCar = (Boost) car;
                    boostableCar.useNitrousOxideEngine();
                }

            }
        }
        Car fastestCar = Collections.max(cars, Comparator.comparing(Car::showCurrentSpeed));
        System.out.println("Fastest car: " + fastestCar.getName() + " with speed " + fastestCar.showCurrentSpeed());
    }
}

