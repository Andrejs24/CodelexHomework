package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static VideoStore videoStore = new VideoStore();
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                default:
                    break;
            }


        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            videoStore.addVideo(movieName);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter the movie name to rent");
        String movieName = scanner.next();
        videoStore.checkOutVideo(movieName);
    }


    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter the movie name to return");
        String movieName = scanner.next();
        videoStore.returnVideo(movieName);
    }
}
