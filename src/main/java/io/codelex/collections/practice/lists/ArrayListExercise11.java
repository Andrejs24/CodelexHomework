package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> elements = new ArrayList<>();
        System.out.println(elements);
        //TODO: Add 10 values to list
        for (int i = 0; i < 10; i++) {
            elements.add(i, "Element" + i);

        }
        System.out.println();
        System.out.println(elements);
        //TODO: Add new value at 5th position
        elements.add(4, "New Value");
        System.out.println();
        System.out.println(elements);
        //TODO: Change value at last position (Calculate last position programmatically)
        System.out.println();
        elements.remove(elements.size() - 1);
        System.out.println(elements);
        System.out.println();
        elements.add(elements.size(), "Changed value");
        System.out.println(elements);
        //TODO: Sort your list in alphabetical order
        Collections.sort(elements);
        System.out.println();
        System.out.println(elements);
        //TODO: Check if your list contains "Foobar" element
        if (elements.contains("Foobar")) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
            //TODO: Print each element of list using loop
        }
        
        for (String element : elements) {
            System.out.print(element + " ");
        }

    }

}
