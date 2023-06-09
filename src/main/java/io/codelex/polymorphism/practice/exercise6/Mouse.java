package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {


    public Mouse(String animalName, String animalType, double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Pipipipi");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
        } else System.out.println(super.getAnimalType() + " are not eating that type of food!");
    }


}
