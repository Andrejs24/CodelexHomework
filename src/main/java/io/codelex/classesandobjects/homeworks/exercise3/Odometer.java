package io.codelex.classesandobjects.homeworks.exercise3;

import java.math.BigDecimal;

public class Odometer {
    private BigDecimal mileage;
    private FuelGauge fuelGauge;

    public BigDecimal getMileage() {
        return mileage;
    }

    public Odometer(FuelGauge fuelGauge) {
        this.mileage = new BigDecimal(0);
        this.fuelGauge = fuelGauge;
    }

    public BigDecimal incrementKilometers() {
        if (mileage.compareTo(new BigDecimal(999.999)) == -1) {
            mileage = mileage.add(BigDecimal.ONE);

            if (mileage.remainder(new BigDecimal(10)).compareTo(new BigDecimal(0)) == 0) {
                fuelGauge.decrementFuel();
            }
        } else mileage = new BigDecimal(0);
        return mileage;
    }


}
