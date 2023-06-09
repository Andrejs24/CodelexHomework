package io.codelex.polymorphism.practice.exercise1;

public class Mercedes implements Car, Boost {

    private Integer currentSpeed = 0;
    private final String name = "Mercedes";


    public String getName() {
        return name;
    }

    @Override
    public void speedUp() {
        currentSpeed += 12;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 12;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("RRRRRRRRRR......");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed += 45;
    }
}
