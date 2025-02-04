/*  Design a Movie class with attributes such as movieTitle, genre, duration, and 
rating. How would you create methods to view the movieTitle of all the movies? */
public class Q3 {
    public static class Movie {
        String movieTitle;
        String genre;
        int duration;
        double rating;

        Movie(String movieTitle, String genre, int duration, double rating) {
            this.movieTitle = movieTitle;
            this.genre = genre;
            this.duration = duration;
            this.rating = rating;}

        // Method to display only the movie title
        void displayTitle() {
            System.out.println("Movie title is: " + movieTitle);
        }}

    public static void main(String[] args) {
       
        Movie[] movies = {
            new Movie("Inception", "Sci-Fi", 180, 8.5),
            new Movie("Salt", "War", 120, 9.0)
        };


        System.out.println("List of Movies:");
        for (Movie movie : movies) {
            movie.displayTitle();
        }
    }
}