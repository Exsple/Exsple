package Exercises.Movie;

public class MoviesList {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Mulholland Drive";
        one.genre = "Triller";
        one.rating = 7;
        Movie two = new Movie();
        two.title = "Interstellar";
        two.genre = "Sci-Fi";
        two.rating = 8;
        two.playIt();
    }
}
