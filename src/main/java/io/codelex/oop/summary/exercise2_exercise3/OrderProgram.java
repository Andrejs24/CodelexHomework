package io.codelex.oop.summary.exercise2_exercise3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {

        Item food = new FoodItem("Potato", new BigDecimal(13.30), LocalDate.of(2023, 11, 14));
        Item electronicsItem = new ElectronicsItem("Play Station 4", new BigDecimal(500.99), 100);
        Item houseItem = new HouseholdItem("Table", new BigDecimal(299.75), "Brown");
        ItemPacking itemPacking = new ItemPacking();

        Order itemOrder = new Order();
        Order smthOrder = new Order();

        itemOrder.add(food);
        itemOrder.add(electronicsItem);
        itemOrder.add(houseItem);
        itemOrder.add(itemPacking);

        Invoice invoice = new Invoice(itemOrder, "INV154");

        System.out.println(invoice.invoiceText());

        invoice.send();
        System.out.println();
        System.out.println(invoice.invoiceText());

        Invoice invoice1 = new Invoice(smthOrder, "INV432");

    }
}