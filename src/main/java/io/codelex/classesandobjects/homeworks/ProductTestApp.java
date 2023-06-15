package io.codelex.classesandobjects.homeworks;

import java.math.BigDecimal;


//"Logitech mouse", 70.00 EUR, 14 units
//"iPhone 5s", 999.99 EUR, 3 units
//"Epson EB-U05", 440.46 EUR, 1 units
public class ProductTestApp {
    public static void main(String[] args) {
        Product firstProduct = new Product(new BigDecimal(70), 14, "Logitech mouse");
        Product secondProduct = new Product(new BigDecimal(999.99), 3, "iPhone 5s");
        Product thirdProduct = new Product(new BigDecimal(440.46), 1, "Epson EB-U05");
        System.out.println("List of products :");
        firstProduct.printProduct();
        secondProduct.printProduct();
        thirdProduct.printProduct();
        System.out.println("--------------------------------");
        firstProduct.setAmount(22);
        secondProduct.setPrice(new BigDecimal(1234.00));
        System.out.println("Changed list of products :");

        firstProduct.printProduct();
        secondProduct.printProduct();
    }
}
