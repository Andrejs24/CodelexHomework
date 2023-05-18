package io.codelex.classesandobjects.homeworks;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "male");
        Dog dog2 = new Dog("Rocky", "male");
        Dog dog3 = new Dog("Sparky", "male");
        Dog dog4 = new Dog("Buster", "male");
        Dog dog5 = new Dog("Sam", "male");
        Dog dog6 = new Dog("Lady", "female");
        Dog dog7 = new Dog("Molly", "female");
        Dog dog8 = new Dog("Coco", "female");


        dog1.setFatherName(dog2);
        dog1.setMotherName(dog6);
        dog8.setFatherName(dog4);
        dog8.setMotherName(dog7);
        dog2.setFatherName(dog5);
        dog2.setMotherName(dog7);
        dog4.setFatherName(dog3);
        dog4.setMotherName(dog6);


        dog8.getFatherName();
        System.out.println(dog8);
        System.out.println(dog3);


    }
}
