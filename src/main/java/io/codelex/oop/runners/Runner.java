package io.codelex.oop.runners;

public enum Runner {

    BEGINNER(20, 60),
    INTERMEDIATE(60, 180),
    ADVANCED(180, 360);

    Runner(int minimumTimeInMinutes, int maximumTimeInMinutes) {
        this.minimumTimeInMinutes = minimumTimeInMinutes;
        this.maximumTimeInMinutes = maximumTimeInMinutes;
    }

    int minimumTimeInMinutes;
    int maximumTimeInMinutes;

    static Runner getFitnessLevel(int time) {
        if (time >= 20 && time <= 60) {
            return BEGINNER;
        } else if (time > 60 && time <= 180) {
            return INTERMEDIATE;
        } else if (time > 180 && time <= 360) {
            return ADVANCED;
        } else return null;

    }
}
