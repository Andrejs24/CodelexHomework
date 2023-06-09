package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseSixMainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tiger, Mouse, Zebra, Cat");
        System.out.println();
        System.out.println("Enter which animal you want to feed : ");
        String animalType = input.nextLine();
        List<Animal> animals = new ArrayList<>();
        Animal animal;
        while (!animalType.equals("End")) {
            switch (animalType) {
                case "Tiger" -> {
                    animal = new Tiger("Tigerek", "Cat", 65.90, 0, "Asia");
                    animal.makeSound();
                    System.out.println("Choose food : Meat or Vegetables?");
                    String food = input.nextLine();
                    if (food.equals("Meat")) {
                        System.out.println("Enter please how many meat you want to give to tiger :");
                        int quantity = input.nextInt();
                        Meat meat = new Meat(quantity);
                        animal.eat(meat);
                        animal.setFoodEaten(quantity);
                    } else if (food.equals("Vegetables")) {
                        Vegetable vegetable = new Vegetable(0);
                        animal.eat(vegetable);
                    } else System.out.println("There is no such food type");
                    animals.add(animal);
                }
                case "Cat" -> {
                    animal = new Cat("Kitty", "Cat", 6.78, 0, "Home", "Brit");
                    animal.makeSound();
                    System.out.println("Choose food : Meat or Vegetables?");
                    String food = input.nextLine();
                    if (food.equals("Meat")) {
                        System.out.println("Enter please how many meat you want to give to cat :");
                        int quantity = input.nextInt();
                        Meat meat = new Meat(quantity);
                        animal.eat(meat);
                        animal.setFoodEaten(quantity);
                    } else if (food.equals("Vegetables")) {
                        System.out.println("Enter please how many vegetables you want to give to  cat :");
                        int quantity = input.nextInt();
                        Vegetable vegetable = new Vegetable(quantity);
                        animal.eat(vegetable);
                        animal.setFoodEaten(quantity);
                    } else System.out.println("There is no such food type");
                    animals.add(animal);

                }
                case "Mouse" -> {
                    animal = new Mouse("Mikcey", "Rodent", 0.30, 0, "Basements");
                    animal.makeSound();
                    System.out.println("Choose food : Meat or Vegetables?");
                    String food = input.nextLine();
                    if (food.equals("Meat")) {
                        Meat meat = new Meat(0);
                        animal.eat(meat);
                    } else if (food.equals("Vegetables")) {
                        System.out.println("Enter please how many vegetables you want to give to  mouse :");
                        int quantity = input.nextInt();
                        Vegetable vegetable = new Vegetable(quantity);
                        animal.eat(vegetable);
                        animal.setFoodEaten(quantity);
                    } else System.out.println("There is no such food type");
                    animals.add(animal);
                }
                case "Zebra" -> {
                    animal = new Zebra("Alex", "Equus", 130.00, 0, "Africa");
                    animal.makeSound();
                    System.out.println("Choose food : Meat or Vegetables?");
                    String food = input.nextLine();
                    if (food.equals("Meat")) {
                        Meat meat = new Meat(0);
                        animal.eat(meat);
                    } else if (food.equals("Vegetables")) {
                        System.out.println("Enter please how many vegetables you want to give to  zebra :");
                        int quantity = input.nextInt();
                        Vegetable vegetable = new Vegetable(quantity);
                        animal.eat(vegetable);
                        animal.setFoodEaten(quantity);
                    } else System.out.println("There is no such food type");
                    animals.add(animal);
                }
                default ->
                        throw new IllegalArgumentException("Invalid animal type. Choose from this list : Tiger, Mouse, Zebra, Cat");

            }

            System.out.println("Enter which animal you want to feed : ");
            String empty = input.nextLine();
            animalType = input.nextLine();

        }
        System.out.println(animals);


    }


}
