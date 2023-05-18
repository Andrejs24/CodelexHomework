package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private List<Video> inventory;


    public void addVideo(String title) {
        Video video = new Video(title);
        inventory.add(video);
        System.out.println("Video added: " + title);
    }


    public void checkOutVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                video.checkOut();
                return;
            }
        }
        System.out.println("Video not found: " + title);
    }

    public void returnVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                video.returnVideo();
                return;
            }
        }
        System.out.println("Video not found: " + title);
    }

    public void receiveRating(String title, double rating) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                video.receiveRating(rating);
                return;
            }
        }
        System.out.println("Video not found: " + title);
    }

    public void listInventory() {
        System.out.println("Video Inventory:");
        for (Video video : inventory) {
            System.out.println("Title: " + video.getTitle() +
                    ", Average Rating: " + video.getAverageRating() +
                    ", Checked Out: " + video.checkOut());
        }
    }


    public VideoStore() {
        this.inventory = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "VideoStore{" +
                "inventory=" + inventory +
                '}';
    }
}
