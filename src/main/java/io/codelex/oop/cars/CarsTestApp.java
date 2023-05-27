package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CarsTestApp {


    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("Ford Performance Vehicle", LocalDate.of(2003, 04, 13), "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Hyundai Motors", LocalDate.of(1997, 11, 01), "South Korea");
        Manufacturer manufacturer3 = new Manufacturer("BMW Group", LocalDate.of(1967, 07, 29), "Germany");

        Car car1 = new Car("BMW", "X5", new BigDecimal(50.000), LocalDate.of(2020, 11, 15), manufacturer3, Engine.S6);
        Car car2 = new Car("Hyundai", "Tucson", new BigDecimal(23.000), LocalDate.of(2017, 03, 01), manufacturer2, Engine.V12);
        Car car3 = new Car("Ford", "Focus", new BigDecimal(8.000), LocalDate.of(2004, 12, 01), manufacturer1, Engine.V6);
        System.out.println("Cars -----");
        System.out.println(car1);
        System.out.println();
        System.out.println(car2);
        System.out.println();
        System.out.println(car3);
        System.out.println();
        System.out.println(car1.equals(car2));
        System.out.println();
        System.out.println(car2.equals(car3));


    }
}
