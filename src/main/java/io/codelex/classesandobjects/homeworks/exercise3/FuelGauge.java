package io.codelex.classesandobjects.homeworks.exercise3;

public class FuelGauge {
    private int litres;

    public int incrementFuel() {
        if (litres < 70) {
            litres++;
        }
        return litres;
    }

    public int decrementFuel() {
        if (litres > 0) {
            litres--;
        }
        return litres;
    }

    public int getLitres() {
        return litres;
    }

    public FuelGauge() {
        this.litres = 0;
    }


}
