package io.codelex.arithmetic.HomeworkTasks;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Let`s check your BMI!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please your weight in kilograms");
        double weight = scanner.nextDouble();
        System.out.println("Now enter your height in meters ");
        double height = scanner.nextDouble();
        double personalBMI=calculateBMI(weight,height);
        if(personalBMI>18.5&&personalBMI<25){
            System.out.println("Perfect ! You have optimal weight.");
        }
        else if (personalBMI>25){
            System.out.println("Unfortunately you have overweight");
        }
        else if (personalBMI<18.5){
            System.out.println("Unfortunately you have underweight");
        }
    }
    public static double calculateBMI(double weight, double height){
        double weightInPounds = weight*2.20462;
        double heightInInches = height*39.3701;
        double result = weightInPounds * 703 / (heightInInches*heightInInches);
        return result;
    }
}
