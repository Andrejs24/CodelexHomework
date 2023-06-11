package io.codelex.oop.summary.exercise2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public abstract class AbstractItem implements Item {

    private String name;
    private BigDecimal price;

    public AbstractItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String name() {
        return name;
    }

    @Override
    public BigDecimal price() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String fullInfo() {
        return name + "," + price.setScale(2, RoundingMode.HALF_UP) + " EUR,";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractItem that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }


}
