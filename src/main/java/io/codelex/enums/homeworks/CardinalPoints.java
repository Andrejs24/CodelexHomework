package io.codelex.enums.homeworks;

public enum CardinalPoints {
    NORTH("up", "North"),
    SOUTH("down", "South"),
    WEST("right", "West"),
    EAST("left", "East");

    String direction;
    String name;

    CardinalPoints(String direction, String name) {
        this.direction = direction;
        this.name = name;
    }
}
