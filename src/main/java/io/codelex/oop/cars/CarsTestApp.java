package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class CarsTestApp {


    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("Ford Performance Vehicle", LocalDate.of(2003, 04, 13), "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Hyundai Motors", LocalDate.of(1997, 11, 01), "South Korea");
        Manufacturer manufacturer3 = new Manufacturer("BMW Group", LocalDate.of(1967, 07, 29), "Germany");

        Car car1 = new Car("BMW", "X5", new BigDecimal(50.000), LocalDate.of(2020, 11, 15), List.of(manufacturer3), Engine.S6);
        Car car2 = new Car("Hyundai", "Tucson", new BigDecimal(23.000), LocalDate.of(2017, 03, 01), List.of(manufacturer1, manufacturer3), Engine.V12);
        Car car3 = new Car("Ford", "Focus", new BigDecimal(8.000), LocalDate.of(2004, 12, 01), List.of(manufacturer2, manufacturer1, manufacturer3), Engine.V6);
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

        CarService carService = new CarService();
        System.out.println("Adding cars to list");
        carService.addCarToList(car1);
        carService.addCarToList(car2);
        carService.addCarToList(car3);
        carService.showAllListOfCars();
        System.out.println();
        System.out.println();
        System.out.println("Removing car2 from list");
        carService.removeCarFromList(car2);
        carService.showAllListOfCars();
        System.out.println();
        System.out.println("Is there cars manufactured by :Ford Performance Vehicle ?? ");

        for (Car car : carService.getCarsByManufacturer("Ford Performance Vehicle")
        ) {
            System.out.print(car);

        }
        System.out.println();
        System.out.println("Checking is there car2 in list?");
        System.out.println(carService.isCarInList(car2));
        System.out.println();
        System.out.println("Checking is there car3 in list?");
        System.out.println(carService.isCarInList(car3));
        System.out.println();
        System.out.println("Is there cars manufactured by BMW Group before 2001 year ? ");
        for (Car car : carService.getCarsManufacturedByManufacturerWithEstablishmentYear(manufacturer3, "<", LocalDate.of(2001, 12, 12))) {
            System.out.println(car);
        }
        System.out.println();
        System.out.println("Is there cars with 3 manufactures ?");
        for (Car car : carService.getCarsWithAtLeastThreeManufacturers()) {
            System.out.print(car);
        }

        System.out.println("Not sorted list of cars");
        carService.showAllListOfCars();
        System.out.println();
        System.out.println("Sorted list of cars");
        for (Car car : carService.getCarsSorted()) {
            System.out.println(car);
        }
        System.out.println();
        System.out.println("Cheapest car is:");
        carService.showCheapestCar();
        System.out.println();
        System.out.println("Most expensive car is :");
        carService.showTheMostExpensiveCar();
    }


}
