package io.codelex.classesandobjects.homeworks.exercise4;

public class Movie {

    private String title;
    private String studio;
    private String rating;


    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public static Movie[] getPG(Movie[] arrayOfMovies) {
        int count = 0;
        for (Movie movie : arrayOfMovies) {
            if (movie.rating.equals("PG")) {
                count++;
            }

        }
        Movie[] pgMovies = new Movie[count];
        int index = 0;
        for (Movie movie : arrayOfMovies) {
            if (movie.rating.equals("PG")) {
                pgMovies[index] = movie;
                index++;
            }
        }

        return pgMovies;
    }


    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
}
