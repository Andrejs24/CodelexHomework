package io.codelex.arithmetic.HomeworkTasks;

public class Exercise3 {

    public static void main(String[] args) {
        int sum = 0;
        int average;
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        average=sum/100;
        System.out.println("The sum of " + lowerBound+ " to " + upperBound + " is " + sum);
        System.out.printf("The average is " + average);
    }
}
