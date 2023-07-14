package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodA() {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodB() {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodC() {
        try {
            int a = 12, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }


    }
}
