package io.codelex.polymorphism.practice.exercise6;

import java.util.Objects;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Myau myau");

    }

    @Override
    public void eat(Food food) {
        System.out.println();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return super.toString() + "{CatBreed = '" + breed + '\'' +
                '}';
    }
}
