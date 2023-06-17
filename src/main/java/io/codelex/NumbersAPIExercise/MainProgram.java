package io.codelex.NumbersAPIExercise;

import java.util.*;

public class MainProgram {
    public static void main(String[] args) {

        List<Question> questionsList = new ArrayList<>();
        List<Answer> answers = new ArrayList<>();
        Map<Question, Answer> listOfQuestionsAndAnswersForGame = new HashMap<>();

        for (int i = 0; i < 20; i++) {
            questionsList.add(new Question());
            answers.add(new Answer(questionsList.get(i)));
        }
//        for (int i = 0; i < questionsList.size(); i++) {
//            listOfQuestionsAndAnswersForGame.put(questionsList.get(i), answers.get(i));
//        }
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

        System.out.println(" Game over! Points earned : " + points);


    }

}


//        System.out.println(questionsList.get(5));
//        System.out.println(answers.get(5).getAnswer());
//        System.out.println(answers.get(5).getVariationForAnswer());
//        System.out.println(answers.get(5).getVariationForAnswer());
//        System.out.println(answers.get(5).getVariationForAnswer());
//        System.out.println(answers.get(5));
//
//        System.out.println(questionsList);
//        System.out.println("================");
//        System.out.println(answers);
//        System.out.println("================");
//        System.out.println(listOfQuestionsAndAnswersForGame);