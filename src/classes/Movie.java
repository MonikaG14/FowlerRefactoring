package classes;

public class Movie {

    private String title;
    private MoviePrice moviePrice;

    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        moviePrice = MoviePrice.values()[newpriceCode];
    }

    public String getTitle (){
        return title;
    }

    public MoviePrice getMoviePrice() {
        return moviePrice;
    }
}