package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Car {

    private String name;

    private String model;
    private BigDecimal price;

    private LocalDate dateOfManufacture;

    private List<Manufacturer> manufacturers;

    private Engine engineType;


    public Car(String name, String model, BigDecimal price, LocalDate dateOfManufacture, List<Manufacturer> manufacturers, Engine engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public Car() {

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

    public List<Manufacturer> getManufacturer() {
        return manufacturers;
    }

    public Engine getEngineType() {

        return engineType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(dateOfManufacture, car.dateOfManufacture) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, dateOfManufacture, manufacturers, engineType);
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", dateOfManufacture=" + dateOfManufacture +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }
}
