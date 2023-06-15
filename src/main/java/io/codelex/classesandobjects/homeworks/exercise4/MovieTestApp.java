package io.codelex.classesandobjects.homeworks.exercise4;

public class MovieTestApp {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Eon Productions");
        Movie[] movies = {movie1, movie2, movie3};
        Movie[] pgMovies = Movie.getPG(movies);


        for (Movie movie : pgMovies) {
            System.out.println(movie.getTitle() + " (" + movie.getStudio() + ")");
        }
    }
}
