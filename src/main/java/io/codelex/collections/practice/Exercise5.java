package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number and I will tell whether it`s happy or not : ");
        int input = scanner.nextInt();
        boolean isHappy = true;
        char[] arrayOfInputs = (String.valueOf(input)).toCharArray();
        int result = 0;
        List<Integer> listOfValuesAlreadyExist = new ArrayList<>();
        while (result != 1 || result != input) {

            for (char number : arrayOfInputs) {
                result += (int) Math.pow((Character.getNumericValue(number)), 2);

            }
            if (result == 1) {
                break;
            } else if (result == input) {
                isHappy = false;
                break;
            } else if (listOfValuesAlreadyExist.contains(result)) {
                isHappy = false;
                break;
            } else
                System.out.println(listOfValuesAlreadyExist.size());
            listOfValuesAlreadyExist.add(listOfValuesAlreadyExist.size(), result);
            System.out.println(listOfValuesAlreadyExist.size());
            System.out.println(listOfValuesAlreadyExist);
            arrayOfInputs = (String.valueOf(result)).toCharArray();
            result = 0;
        }


        System.out.println(isHappy ? "Number is happy!" : "Number is not happy.");
    }
}


