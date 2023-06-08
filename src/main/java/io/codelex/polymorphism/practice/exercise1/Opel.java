package io.codelex.polymorphism.practice.exercise1;

public class Opel implements Car {

    private Integer currentSpeed = 0;
    private final String name = "Opel";


    public String getName() {
        return name;
    }

    @Override
    public void speedUp() {
        currentSpeed += 9;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 9;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Vivivivivi............");

    }
}
