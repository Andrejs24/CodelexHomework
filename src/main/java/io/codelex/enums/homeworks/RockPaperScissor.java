package io.codelex.enums.homeworks;

import java.util.Random;

public enum RockPaperScissor {

    ROCK("Rock", "Breaks", "Scissors"),
    PAPER("Paper", "Wrap", "Rock"),
    SCISSOR("Scissors", "Cut", "Paper");

    String name;
    String action;
    String strongerThan;

    private static final Random random = new Random();

    RockPaperScissor(String name, String action, String strongerThan) {
        this.name = name;
        this.action = action;
        this.strongerThan = strongerThan;


    }

    public void beats(RockPaperScissor input) {
        if (this == PAPER && input == ROCK) {
            System.out.println("I won!");
            System.out.println("Paper " + RockPaperScissor.PAPER.action + " rock.");
        } else if (this == ROCK && input == SCISSOR) {
            System.out.println("I won!");
            System.out.println("Rock " + RockPaperScissor.ROCK.action + " scissor.");
        } else if (this == SCISSOR && input == PAPER) {
            System.out.println("I won!");
            System.out.println("Scissor " + RockPaperScissor.SCISSOR.action + " paper.");
        } else if (this == input) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("You won");
        }
    }

    public static RockPaperScissor randomChoise() {
        RockPaperScissor[] choise = values();
        return choise[random.nextInt(choise.length)];
    }


}

