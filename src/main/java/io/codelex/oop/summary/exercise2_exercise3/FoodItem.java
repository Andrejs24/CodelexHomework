package io.codelex.oop.summary.exercise2_exercise3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FoodItem extends AbstractItem {

    LocalDate bestBefore;

    public FoodItem(String name, BigDecimal price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + " best before: " + bestBefore;
    }


}
