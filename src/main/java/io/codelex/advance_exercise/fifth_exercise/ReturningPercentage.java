package io.codelex.advance_exercise.fifth_exercise;

import java.util.List;
import java.util.function.Predicate;

public class ReturningPercentage {

    public static <T> double partOf(List<T> items, Predicate<T> criteria) {
        long count = items.stream().filter(criteria).count();
        return (double) count / items.size();
    }

}
