package io.codelex.typesandvariables.Homeworks;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Please enter several numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("The sum of your numbers is " + calculateTheSum(a,b,c));
    }
    public static int calculateTheSum(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
}
