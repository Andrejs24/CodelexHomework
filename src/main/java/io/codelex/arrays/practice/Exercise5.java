package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise5 {

    //TODO: Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        System.out.println("Enter the element :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int indexOfElement = -1;


        // fixme
        for (int i = 0; i < myArray.length; i++) {
            if (input == myArray[i]) {
                indexOfElement = i;
                break;
            } else indexOfElement = -1;


        }
        if (indexOfElement == -1) {
            System.out.println("There is no such element in my array");
        } else System.out.println("Index position of " + input + "  is: " + indexOfElement);
    }
}


