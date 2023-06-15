package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise7 {

    public static char[][] field = {{'.', '.', '.'}, {'.', '.', '.'}, {'.', '.', '.'}

    };
    public static final char EMPTY = '.';
    public static final int FIELD_SIZE = 3;
    public static boolean gameOver = false;
    public static char playerOneSymbol = 'X';
    public static char playerTwoSymbol = 'O';

    public static void main(String[] args) {
        char currentPlayer = playerOneSymbol;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let`s play Tic-Tac-Toe !");
        showField();
        while (!gameOver) {
            System.out.println("Enter row use chose :");
            int row = scanner.nextInt() - 1;
            System.out.println("Enter column you chose");
            int column = scanner.nextInt() - 1;
            if (isValidMove(row, column)) {
                playersTurn(row, column, currentPlayer);

                if (isWinningMove(row, column)) {
                    gameOver = true;
                    System.out.println("Player " + currentPlayer + " wins!");
                } else if (isBoardFull()) {
                    gameOver = true;
                    System.out.println("It's a tie!");
                } else {
                    currentPlayer = (currentPlayer == playerOneSymbol) ? playerTwoSymbol : playerOneSymbol;
                }
            } else {
                System.out.println("Invalid move! Please try again.");
            }
            showField();
        }


        System.out.println("Game over.");

    }


    public static void showField() {
        System.out.println(field[0][0] + " " + field[0][1] + " " + field[0][2]);
        System.out.println(field[1][0] + " " + field[1][1] + " " + field[1][2]);
        System.out.println(field[2][0] + " " + field[2][1] + " " + field[2][2]);
    }

    public static char[][] playersTurn(int row, int column, char player) {
        field[row][column] = player;
        return field;

    }

    public static boolean isValidMove(int row, int column) {
        if (row >= 0 && row < FIELD_SIZE && column >= 0 && column < FIELD_SIZE && field[row][column] == EMPTY) {
            return true;

        } else return false;
    }

    public static boolean isWinningMove(int row, int column) {
        char symbol = field[row][column];

        if (field[row][0] == symbol && field[row][1] == symbol && field[row][2] == symbol) {
            return true;
        }

        if (field[0][column] == symbol && field[1][column] == symbol && field[2][column] == symbol) {
            return true;
        }

        if (row == column) {
            if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol) {
                return true;
            }
        }

        if (row + column == 2) {
            if (field[0][2] == symbol && field[1][1] == symbol && field[2][0] == symbol) {
                return true;
            }
        }

        return false;
    }

    public static boolean isBoardFull() {
        for (int row = 0; row < FIELD_SIZE; row++) {
            for (int column = 0; column < FIELD_SIZE; column++) {
                if (field[row][column] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}


