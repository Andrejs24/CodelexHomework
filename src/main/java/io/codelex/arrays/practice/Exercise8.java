package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {

    public static final String[] ARRAY_OF_WORDS = {"practise", "banana", "codelex", "encapsulation", "polymorphism", "multithreading"};
    public static final int NUMBER_OF_ATTEMPTS = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        StringBuilder misses = new StringBuilder();
        int indexOfWordNeedToGuess = random.nextInt(6);
        String wordNeedToGuess = ARRAY_OF_WORDS[indexOfWordNeedToGuess];
        char[] guessedLetters = new char[wordNeedToGuess.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Word: " + String.valueOf(guessedLetters));
            System.out.println();
            System.out.println("Misses:" + misses);
            System.out.print("Guess: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            boolean foundMatch = false;
            for (int i = 0; i < wordNeedToGuess.length(); i++) {
                if (wordNeedToGuess.charAt(i) == guess) {
                    guessedLetters[i] = guess;
                    foundMatch = true;
                }
            }

            if (!foundMatch) {
                misses.append(guess);
                attempts++;
            }

            if (String.valueOf(guessedLetters).equals(wordNeedToGuess)) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("Word:" + wordNeedToGuess);
                System.out.println();
                System.out.println("Misses:" + misses);
                System.out.println("YOU GOT IT!");
                break;
            }

            if (attempts >= NUMBER_OF_ATTEMPTS) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("Word:" + wordNeedToGuess);
                System.out.println();
                System.out.println("Misses:" + misses);
                System.out.println("GAME OVER!");
                break;
            }
        }

        System.out.print("Play \"again\" or \"quit\"? ");
        String choice = scanner.nextLine();
        if (choice.equals("again")) {
            main(null);
        } else {
            System.out.println("Goodbye!");
        }
    }


    public static char[] createHiddenWord(char[] hiddenWord) {
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '_';
        }
        return hiddenWord;
    }
}





