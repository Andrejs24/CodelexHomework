package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number and I will tell whether it`s happy or not : ");
        int input = scanner.nextInt();
        boolean isHappy = true;
        char[] arrayOfInputs = (String.valueOf(input)).toCharArray();
        int result = 0;
        for (char number : arrayOfInputs) {
            result += (int) Math.pow((Character.getNumericValue(number)), 2);

        }
        System.out.println(result % 2 == 1 ? isHappy : !isHappy);
    }
}
