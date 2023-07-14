package io.codelex.advance_exercise.fifth_exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnPercentageTest {
    @Test
    public void returnPercentageOfEvenNumbers() {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        double evenPercent = ReturningPercentage.partOf(numbers, n -> n % 2 == 1);

        assertEquals(0.5, evenPercent);

    }

    @Test
    public void returnPercentageOfNames() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Peter");
        names.add("Angelina");
        names.add("Bravo");

        double percent = ReturningPercentage.partOf(names, name -> name.length() > 4);
        assertEquals(0.75, percent);

    }


    @Test
    public void returnCountOfListThatLongerThanFive() {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        List<Integer> thirdList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            firstList.add(i);
        }
        for (int i = 0; i < 10; i++) {
            secondList.add(i);
        }
        for (int i = 0; i < 2; i++) {
            thirdList.add(i);
        }
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(firstList);
        listOfLists.add(secondList);
        listOfLists.add(thirdList);

        double percent = ReturningPercentage.partOf(listOfLists, list -> list.size() > 5);

        assertEquals(0.6666666666666666, percent);

    }
}
