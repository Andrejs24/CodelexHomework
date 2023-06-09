package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        List<Sound> sounds = new ArrayList<>();
        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        Firework firework = new Firework();

        sounds.add(parrot);
        sounds.add(radio);
        sounds.add(firework);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < sounds.size(); j++) {
                Sound sound = sounds.get(j);
                sound.playSound();

            }
        }


    }
}
