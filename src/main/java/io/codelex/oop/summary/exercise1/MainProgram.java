package io.codelex.oop.summary.exercise1;

public class MainProgram {
    public static void main(String[] args) {
        LazyBox<Integer> box = new LazyBox<>(MainProgram::calculate);

        Integer contest = box.get();
        Integer contest2 = box.get();

        System.out.println(contest);
        System.out.println(contest2);
    }

    public static Integer calculate() {
        return 200;
    }
}
