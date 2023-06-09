package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car {
    private Integer currentSpeed = 0;
    private final String name = "BMW";


    public String getName() {
        return name;
    }

    public void speedUp() {
        currentSpeed += 12;
    }

    public void slowDown() {
        currentSpeed += 12;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
