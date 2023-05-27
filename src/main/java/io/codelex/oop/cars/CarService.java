package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CarService {

    private List<Car> listOfCars;

    public CarService() {
        listOfCars = new ArrayList<>();
    }


    public List<Car> getListOfCars() {
        return listOfCars;
    }


    public void addCarToList(Car car) {
        listOfCars.add(car);
    }

    public void removeCarFromList(Car car) {
        if (listOfCars.contains(car)) {
            listOfCars.remove(car);
            System.out.println("Car is removed from service");
        } else {
            System.out.println("There is no such car in service.");
        }

    }

    public void showAllListOfCars() {
        for (Car car : listOfCars) {
            System.out.print(car);
        }
    }

    public void showCarsWithSpecificEngine(Engine engine) {
        for (Car car : listOfCars) {
            if (car.getEngineType().name().equals(engine.name())) {
                System.out.print(car);
            }

        }
    }

    public void showCarsProducedSpecificYear(LocalDate date) {
        for (Car car : listOfCars) {
            if ((car.getDateOfManufacture()).isBefore(date)) {
                System.out.print(car);
            }

        }
    }

    public void showTheMostExpensiveCar() {
        Car mostExpensiveCar = new Car(new BigDecimal(0));
        for (Car car : listOfCars) {
            if (car.getPrice().compareTo(mostExpensiveCar.getPrice()) == 1) {
                mostExpensiveCar = car;
            }

        }
        System.out.println(mostExpensiveCar);
    }

    public void showCheapestCar() {
        Car cheapestCar = listOfCars.get(0);
        for (Car car : listOfCars) {
            if (car.getPrice().compareTo(cheapestCar.getPrice()) == -1) {
                cheapestCar = car;
            }

        }
        System.out.println(cheapestCar);
    }

    public List<Car> getCarsWithAtLeastThreeManufacturers() {
        List<Car> result = new ArrayList<>();

        for (Car car : listOfCars) {
            if (car.getManufacturer().size() >= 3) {
                result.add(car);
            }
        }

        return result;
    }

    public List<Car> getCarsSorted() {
        List<Car> sortedCars = listOfCars;
        System.out.println("Choose please which way you want to sort list : ascending/descending?");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        switch (choice) {
            case "ascending" -> sortedCars.sort(Comparator.comparing(Car::getPrice));
            case "descending" -> sortedCars.sort(Comparator.comparing(Car::getPrice).reversed());
            default -> throw new IllegalArgumentException("Wrong input!");
        }

        return sortedCars;
    }

    public boolean isCarInList(Car car) {
        return listOfCars.contains(car);
    }

    public List<Car> getCarsByManufacturer(String manufacturerName) {
        List<Car> carsByManufacturer = new ArrayList<>();
        for (Car car : listOfCars) {
            for (Manufacturer manufacturer : car.getManufacturer()) {
                if (manufacturer.getName().equalsIgnoreCase(manufacturerName)) {
                    carsByManufacturer.add(car);
                    break;
                }
            }
        }
        return carsByManufacturer;
    }


    public List<Car> getCarsManufacturedByManufacturerWithEstablishmentYear(Manufacturer manufacturer, String operator, LocalDate year) {
        List<Car> result = new ArrayList<>();

        for (Car car : listOfCars) {
            for (Manufacturer carManufacturer : car.getManufacturer()) {
                if (carManufacturer.equals(manufacturer)) {
                    switch (operator) {
                        case "<" -> {
                            if (carManufacturer.getYearOfEstablishment().isBefore(year)) {
                                result.add(car);
                            }
                        }
                        case ">" -> {
                            if (carManufacturer.getYearOfEstablishment().isAfter(year)) {
                                result.add(car);
                            }
                        }
                        case "<=" -> {
                            if (carManufacturer.getYearOfEstablishment().isBefore(year) || carManufacturer.getYearOfEstablishment().equals(year)) {
                                result.add(car);
                            }
                        }

                        case ">=" -> {
                            if (carManufacturer.getYearOfEstablishment().isAfter(year) || carManufacturer.getYearOfEstablishment().equals(year)) {
                                result.add(car);
                            }
                        }
                        case "=" -> {
                            if (carManufacturer.getYearOfEstablishment().equals(year)) {
                                result.add(car);
                            }
                        }
                        case "!=" -> {
                            if (carManufacturer.getYearOfEstablishment() != year) {
                                result.add(car);
                            }
                        }
                    }
                    break;
                }
            }
        }

        return result;

    }
}
