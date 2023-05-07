package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age, height, weight;

        name = "Zed A. Shaw";
        age = 35;
        height = 74;
        double convertedHeight = height*2.54;
        String heightUsed = String.format("%.2f",convertedHeight);
        weight = 180;
        double convertedWeight = weight*0.453592;
        String weightUsed = String.format("%.2f",convertedWeight);

        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + heightUsed + " centimeters tall.");
        System.out.println("He's " + weightUsed + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + ".");
    }
}