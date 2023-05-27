package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Car {

    private String name;

    private String model;
    private BigDecimal price;

    private LocalDate dateOfManufacture;

    private Manufacturer manufacturer;

    private Engine engineType;


    public Car(String name, String model, BigDecimal price, LocalDate dateOfManufacture, Manufacturer manufacturer, Engine engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        this.manufacturer = manufacturer;
        this.engineType = engineType;
    }


    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Engine getEngineType() {
        return engineType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(dateOfManufacture, car.dateOfManufacture) && Objects.equals(manufacturer, car.manufacturer) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, dateOfManufacture, manufacturer, engineType);
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", dateOfManufacture=" + dateOfManufacture +
                ", manufacturer=" + manufacturer +
                ", engineType=" + engineType +
                '}';
    }
}
