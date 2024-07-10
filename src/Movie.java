public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private double rating;
    private int ratingCount;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = 1.5;
        this.ratingCount = 1;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return ratingCount > 0 ? rating / ratingCount : 0.0;
    }

    public void addRating(double newRating) {
        this.rating += newRating;
        this.ratingCount++;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Director: " + director + ", Release Year: " + releaseYear + ", Rating: " + getRating();
    }
}

