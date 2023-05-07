package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven,seatsInACar;
        double carpoolCapacity, averagePassengersPerCar;

        cars = 100;
        seatsInACar = 4;
        drivers = 30;
        passengers = 90;
        carsNotDriven = cars - drivers;
        carsDriven = drivers;
        carpoolCapacity = carsDriven * seatsInACar;
        String formattedCarpoolCapacity = String.format("%.2f",carpoolCapacity);
        averagePassengersPerCar = cars/passengers;
        String formattedAveragePassengersPerCar = String.format("%.2f",averagePassengersPerCar);

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + formattedCarpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + formattedAveragePassengersPerCar+ " in each car.");
    }
}