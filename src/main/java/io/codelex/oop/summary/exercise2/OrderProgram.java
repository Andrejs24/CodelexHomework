package io.codelex.oop.summary.exercise2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {

        Item food = new FoodItem("Potato", new BigDecimal(13.30), LocalDate.of(2023, 03, 14));
        Item electronicsItem = new ElectronicsItem("Play Station 4", new BigDecimal(500.99), 100);
        Item houseItem = new HouseholdItem("Table", new BigDecimal(299.75), "Brown");

        Order itemOrder = new Order();

        itemOrder.add(food);
        itemOrder.add(electronicsItem);
        itemOrder.add(houseItem);

        Invoice invoice = new Invoice(itemOrder, "INV154");

        System.out.println(invoice.invoiceText());

        invoice.send();
        System.out.println();
        System.out.println(invoice.invoiceText());

    }
}
