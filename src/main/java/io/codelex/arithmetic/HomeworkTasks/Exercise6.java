package io.codelex.arithmetic.HomeworkTasks;

//Write a program called CozaLozaWoza which prints the numbers 1 to 110,
// 11 numbers per line. The program shall print "Coza" in place of the numbers which are multiples of 3,
// "Loza" for multiples of 5, "Woza" for multiples of 7,
// "CozaLoza" for multiples of 3 and 5, and so on.

public class Exercise6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 110; i++) {
            boolean divideBy3 = (i % 3 == 0);
            boolean divideBy5 = (i % 5 == 0);
            boolean divideBy7 = (i % 7 == 0);


            if (divideBy3 && divideBy5 && divideBy7) {
                System.out.print("CozaLozaWoza ");
            } else if (divideBy3 && divideBy5) {
                System.out.print("CozaLoza ");
            } else if (divideBy3 && divideBy7) {
                System.out.print("CozaWoza ");
            } else if (divideBy5 && divideBy7) {
                System.out.print("LozaWoza ");
            } else if (divideBy3) {
                System.out.print("Coza ");
            } else if (divideBy5) {
                System.out.print("Loza ");
            } else if (divideBy7) {
                System.out.print("Woza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
        }
    }


}
