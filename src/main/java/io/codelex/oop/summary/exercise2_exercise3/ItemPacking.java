package io.codelex.oop.summary.exercise2_exercise3;

import java.math.BigDecimal;

public class ItemPacking implements Service {
    static final String name = "Item packing";
    static final BigDecimal price = new BigDecimal(5);


    @Override
    public String name() {
        return name;
    }

    @Override
    public BigDecimal price() {
        return price;
    }

    @Override
    public String fullInfo() {
        return name + ", " + price + " EUR";
    }
}
