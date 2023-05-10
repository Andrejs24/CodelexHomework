package io.codelex.arithmetic.HomeworkTasks;

public class Exercise7 {

    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;


        System.out.println("The object's position after " + fallingTime + " seconds is " + gravityCalculator(gravity, fallingTime, initialVelocity, initialPosition) + " m.");
    }

    public static double gravityCalculator(double gravity, double fallingTime, double initialVelocity, double initialPosition) {
        double result = 0.5 * (gravity * (fallingTime * fallingTime)) + initialVelocity * fallingTime + initialPosition;
        return result;
    }
}
