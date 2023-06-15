package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> arrayList = new ArrayList<>();
        for (String value : array) {
            arrayList.add(value);
        }
        System.out.println(arrayList);

        //todo - replace array with a HashSet and print out the results

        Set<String> arrayAsHashSet = new HashSet<>();
        for (String value : array) {
            arrayAsHashSet.add(value);
        }
        System.out.println(arrayAsHashSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> arrayAsMap = new HashMap<>();
        for (String value : array) {
            if (value.equals("Audi") || value.equals("BMW") || value.equals("Mercedes") || value.equals("VolksWagen")) {
                arrayAsMap.put("Germany", value);
            } else if (value.equals("Honda")) {
                arrayAsMap.put("Japan", value);
            } else if (value.equals("Tesla")) {
                arrayAsMap.put("USA", value);
            } else System.out.println("No origination for such value");

        }
        System.out.println(arrayAsMap);


    }
}
