package io.codelex.classesandobjects.homeworks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
    }


    BigDecimal calculateConsumption() {
        double kilometersRide = endKilometers - startKilometers;
        double resultDouble = (liters / kilometersRide) * 100;
        BigDecimal result = new BigDecimal(resultDouble).setScale(2, RoundingMode.HALF_UP);
        return result;
    }

    boolean gasHog() {
        if (calculateConsumption().compareTo(new BigDecimal(15)) == 1 || calculateConsumption().compareTo(new BigDecimal(15)) == 0) {
            return true;


        } else return false;


    }

    boolean economyCar() {
        if (calculateConsumption().compareTo(new BigDecimal(5)) == -1 || calculateConsumption().compareTo(new BigDecimal(15)) == 0) {
            return true;

        } else return false;


    }

    public void fillUp(int mileages, double liters) {
        this.endKilometers = mileages;
        this.liters = liters;

    }

}
