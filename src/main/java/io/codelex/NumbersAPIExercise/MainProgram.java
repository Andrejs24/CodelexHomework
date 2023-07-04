package io.codelex.NumbersAPIExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        List<Question> questionsList = new ArrayList<>();
        List<Answer> answers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            questionsList.add(new Question());
            answers.add(new Answer(questionsList.get(i)));
        }

        Scanner scanner = new Scanner(System.in);
        int points = 0;
        for (int i = 0; i <= questionsList.size() - 1; i++) {
            System.out.println("Question : " + (i + 1) + " of 20");
            System.out.println(questionsList.get(i).generateQuestion());
            System.out.println("Choose the answer:");
            System.out.println("1. " + answers.get(i).getAnswer());
            System.out.println("2. " + answers.get(i).getVariationForAnswer());
            System.out.println("3. " + answers.get(i).getVariationForAnswer());
            String input = scanner.nextLine();
            if (answers.get(i).isAnswerTrue(input)) {
                System.out.println("That's right!");
                points++;

            } else if (!answers.get(i).isAnswerTrue(input)) {
                System.out.println("Sorry that's not correct answer");
                System.out.println(answers.get(i).toString());
                break;
            }


        }

        System.out.println("Game over! Points earned : " + points);


    }

}
