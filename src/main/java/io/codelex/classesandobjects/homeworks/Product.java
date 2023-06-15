package io.codelex.classesandobjects.homeworks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private BigDecimal price;
    private int amount;
    private String name;

    public Product(BigDecimal price, int amount, String name) {
        this.price = price.setScale(2, RoundingMode.HALF_UP);
        this.amount = amount;
        this.name = name;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", amount " + amount);
    }

    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    public void setPrice(BigDecimal price) {
        this.price = price.setScale(2, RoundingMode.HALF_UP);
    }
}
