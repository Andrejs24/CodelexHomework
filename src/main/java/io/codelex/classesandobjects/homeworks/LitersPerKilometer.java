package io.codelex.classesandobjects.homeworks;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double startKilometers;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();
        Car car1 = new Car(startKilometers);
        System.out.println("Enter current odometer reading : ");
        int mileage = scan.nextInt();
        System.out.println("Enter number of liters filled :");
        double liters = scan.nextDouble();
        car1.fillUp(mileage, liters);
        System.out.println("Kilometers per liter are " + car1.calculateConsumption());
        informUser(car1);
        System.out.println();
        System.out.println("--------------------------------");

        System.out.print("Enter first reading for second car : ");
        startKilometers = scan.nextDouble();
        Car car2 = new Car(startKilometers);
        System.out.println("Enter current odometer reading : ");
        mileage = scan.nextInt();
        System.out.println("Enter number of liters filled :");
        liters = scan.nextDouble();
        car2.fillUp(mileage, liters);
        System.out.println("Kilometers per liter are " + car2.calculateConsumption());
        informUser(car2);


    }


    public static void informUser(Car car) {
        if (car.gasHog()) {
            System.out.println("This car is a gas hog");
        } else if (car.economyCar()) {
            System.out.println("This car is economy");
        } else System.out.println("Your car is nether gas neither economy");

    }

}
