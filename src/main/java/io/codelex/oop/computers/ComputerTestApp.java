package io.codelex.oop.computers;

public class ComputerTestApp {
    public static void main(String[] args) {


        Laptop laptop1 = new Laptop("Processor1", "Ram1", "Graphic Card 1", "Company1", "Model1", "Battery 1");
        Laptop laptop2 = new Laptop("Processor2", "Ram2", "Graphic Card 2", "Company2", "Model2", "Battery 2");
        Laptop laptop3 = new Laptop("Processor3", "Ram3", "Graphic Card 3", "Company3", "Model3", "Battery 3");

        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);
        System.out.println();
        System.out.println(laptop1.equals(laptop2));
        System.out.println();
        System.out.println(laptop2.equals(laptop3));


    }
}
