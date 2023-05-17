package io.codelex.classesandobjects.homeworks.exercise3;

public class CarSimulateApp {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(fuelGauge);

        for (int i = 0; i < 70; i++) {
            fuelGauge.incrementFuel();
        }
        while (fuelGauge.getLitres() > 0) {
            System.out.println("Mileage: " + odometer.getMileage() + " km");
            System.out.println("Fuel: " + fuelGauge.getLitres() + " liters");
            System.out.println();

            odometer.incrementKilometers();
        }
    }
}

