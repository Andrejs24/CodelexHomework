package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinerTest {

    @Test
    public void testCombineTwoItems() {

        String first = "Apple";
        Integer second = 5;
        String combined = Combiner.combineTwoItems(first, second);
        assertEquals("First item: Apple; Second item: 5", combined);

        Double third = 3.14;
        Boolean fourth = true;
        String combined2 = Combiner.combineTwoItems(third, fourth);
        assertEquals("First item: 3.14; Second item: true", combined2);

        Character fifth = 'a';
        Object six = new Object();
        String combined3 = Combiner.combineTwoItems(fifth, six);
        assertEquals("First item: a; Second item: java.lang.Object@43d7741f", combined3);
    }

}

