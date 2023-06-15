package io.codelex.arrays.practice;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] firstArray = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(100) + 1;
        }
        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = firstArray[i];

        }
        firstArray[firstArray.length - 1] = -7;


        System.out.print("Array 1 : ");
        for (int number : firstArray) {
            System.out.print(number + " ");

        }
        System.out.println();
        System.out.print("Array 2 : ");
        for (int number : secondArray) {
            System.out.print(number + " ");

        }
    }
}
