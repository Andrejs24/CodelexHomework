package io.codelex.oop.cars;

public enum Engine {

    V12("V12"),
    V8("V8"),
    V6("V6"),
    S6("S6"),
    S4("S4"),
    S3("S3");

    private String name;

    Engine(String name) {
        this.name = name;
    }
}
