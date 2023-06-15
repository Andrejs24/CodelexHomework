package io.codelex.arrays.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise1 {

    //TODO: Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {

        int[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };


        // fixme
        System.out.print("Original numeric array : ");
        for (int number : myArray1) {
            System.out.print(number + " ");
        }
        System.out.println();
        Arrays.sort(myArray1);
        System.out.print("Sorted numeric array : ");
        for (int number : myArray1) {
            System.out.print(number + " ");

        }
        System.out.println();
        System.out.println();
        System.out.print("Original string array : ");
        for (String word : myArray2) {
            System.out.print(word + " ");
        }
        System.out.println();
        Arrays.sort(myArray2);
        System.out.print("Sorted string array : ");
        for (String word : myArray2) {
            System.out.print(word + " ");
        }
    }


}

