package io.codelex.enums.homeworks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern inputPattern = Pattern.compile("[sqrp]");
        System.out.println("Let us begin...");
        System.out.println("Rock-Paper-Scissor\n" +
                "   Your turn (Enter s for scissor, p for paper, r for rock, q to quit): ");

        String input = scanner.nextLine().trim().toLowerCase();
        while (!input.equals("q"))
            if (input.matches(String.valueOf(inputPattern))) {
                if (input.equals("q")) {
                    System.out.println("Thanks for game!");

                } else {
                    switch (input) {
                        case "s" -> RockPaperScissor.SCISSOR.beats(RockPaperScissor.randomChoise());
                        case "r" -> RockPaperScissor.ROCK.beats(RockPaperScissor.randomChoise());
                        case "p" -> RockPaperScissor.PAPER.beats(RockPaperScissor.randomChoise());


                    }
                    System.out.println("Rock-Paper-Scissor\n" +
                            "   Your turn (Enter s for scissor, p for paper, r for rock, q to quit): ");
                    input = scanner.nextLine().trim().toLowerCase();


                }


            } else System.out.println("Wrong input...");

    }


}

