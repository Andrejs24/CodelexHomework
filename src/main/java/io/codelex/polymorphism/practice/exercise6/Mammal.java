package io.codelex.polymorphism.practice.exercise6;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private String livingRegion;


    public Mammal(String animalName, String animalType, double animalWeight, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
    }


    public Mammal(String animalName, String animalType, double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }


    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal mammal)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(livingRegion, mammal.livingRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingRegion);
    }

    @Override
    public String toString() {
        return super.toString() +
                "livingRegion='" + livingRegion + '\'' +
                '}';
    }
}


