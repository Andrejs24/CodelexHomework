package io.codelex.advance_exercise.third_exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoinerTest {

    @Test
    public void testJoinIntegers() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String joinedString = joiner.join(1, 2, 3, 4, 5);
        assertEquals("1-2-3-4-5", joinedString);
    }

    @Test
    public void testJoinStrings() {
        Joiner<String> joiner = new Joiner<>(", ");
        String joinedString = joiner.join("Smoke", "some", "cigarettes");
        assertEquals("Smoke, some, cigarettes", joinedString);
    }

    @Test
    public void testObject() {
        Joiner<List<Double>> joiner = new Joiner<>("--");
        List<Double> firstList = new ArrayList<>();
        List<Double> secondList = new ArrayList<>();
        firstList.add(13.03);
        firstList.add(15.07);
        firstList.add(22.22);
        secondList.add(55.44);
        secondList.add(66.77);
        secondList.add(88.88);


        String joinedString = joiner.join(firstList, secondList);
        assertEquals("[13.03, 15.07, 22.22]--[55.44, 66.77, 88.88]--", joinedString);
    }

    @Test
    public void testJoinChars() {
        Joiner<Character> joiner = new Joiner<>(" | ");
        String joinedString = joiner.join('H', 'e', 'l', 'l', 'o');
        assertEquals("H | e | l | l | o", joinedString);
    }
}

//    public void
//}
