package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Rawwwwwww");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Tiger is happy now");
        } else System.out.println(super.getAnimalType() + " are not eating that type of food!");
    }

}
