package io.codelex.oop.summary.generics;

public class Combiner {

    //Fix this method so it can receive two any kind of objects
    //Test the functionality

    public static <E, T> String combineTwoItems(E first, T second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

}
