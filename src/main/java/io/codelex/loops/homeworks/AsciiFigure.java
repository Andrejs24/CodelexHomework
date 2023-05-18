package io.codelex.loops.homeworks;

public class AsciiFigure {
    public static void main(String[] args) {
        int size = 7;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < (size - i - 1) * 4; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < i * 8; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (size - i - 1) * 4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}

