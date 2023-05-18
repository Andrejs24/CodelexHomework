package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class Video {
    private String title;
    private boolean flag;
    private List<Double> userRating;

    public Video(String title) {
        this.title = title;
        this.flag = false;
        this.userRating = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public boolean isFlag() {
        return flag;
    }

    public boolean checkOut() {
        if (!isFlag()) {
            flag = true;
            System.out.println(title + " Checked out.");
        } else
            System.out.println(title + " Already checked out.");
        return flag;
    }

    public void returnVideo() {
        if (isFlag()) {
            flag = false;
            System.out.println(title + " Is returned.");
        } else {
            System.out.println(title + " Not checked out.");
        }
    }

    public void receiveRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            userRating.add(rating);
            System.out.println("Rating received for video " + title + ": " + rating);
        } else {
            System.out.println("Invalid rating. Please provide a rating between 0 and 5.");
        }
    }

    public double getAverageRating() {

        if (userRating.isEmpty()) {
            return 0.0;
        } else {
            double totalRatingScore = 0;
            for (double rating : userRating) {
                totalRatingScore += rating;
            }
            return totalRatingScore / userRating.size();
        }
    }

}





