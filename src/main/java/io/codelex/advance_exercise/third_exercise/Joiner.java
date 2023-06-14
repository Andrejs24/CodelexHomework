package io.codelex.advance_exercise.third_exercise;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... element) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < element.length; i++) {
            text.append(element[i].toString()).append(separator);


        }
        return text.toString();
    }
}
