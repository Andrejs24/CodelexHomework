package io.codelex.oop.summary.exercise2_exercise3;

import java.math.BigDecimal;

public class ElectronicsItem extends AbstractItem {

    private int power;

    public ElectronicsItem(String name, BigDecimal price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + "power: " + power + "W";
    }
}
