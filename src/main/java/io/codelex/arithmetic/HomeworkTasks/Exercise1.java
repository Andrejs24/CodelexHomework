package io.codelex.arithmetic.HomeworkTasks;


//Write a Java program to accept two integers
// and return true if the either one is 15 or if their sum or difference is 15.


import java.util.Scanner;


public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Enter your number please");
        Scanner num1 = new Scanner(System.in);
        int firstNumber = num1.nextInt();

        System.out.println("Thank you. Now enter you second number please");
        Scanner num2 = new Scanner(System.in);
        int secondNumber = num2.nextInt();
        isFifteen(firstNumber,secondNumber);
    }


    public static void isFifteen(int a, int b) {
        boolean result;
        if (a + b == 15) {
            result = true;
        } else if (a - b == 15) {
            result = true;
        } else if (a == 15) {
            result = true;
        } else if (b == 15) {
            result =true;
        } else result = false;
        System.out.println(result);
    }


}
