package io.codelex.polymorphism.practice.exercise6;

import java.util.Objects;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private Integer foodEaten;

    public Animal(String animalName, String animalType, double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Double.compare(animal.animalWeight, animalWeight) == 0 && Objects.equals(animalName, animal.animalName) && Objects.equals(animalType, animal.animalType) && Objects.equals(foodEaten, animal.foodEaten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, animalType, animalWeight, foodEaten);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalWeight=" + animalWeight +
                ", foodEaten=" + foodEaten +
                '}';
    }
}
