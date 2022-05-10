package classes;

import classes.prices.ChildrenPrice;
import classes.prices.NewReleasePrice;
import classes.prices.Price;
import classes.prices.RegularPrice;

public class Movie {

    private String title;
    private MoviePrice moviePrice;
    private Price price;

    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        moviePrice = MoviePrice.values()[newpriceCode];
        if (moviePrice == MoviePrice.REGULAR) {
            price = new RegularPrice();
        } else if (moviePrice == MoviePrice.NEW_RELEASE) {
            price = new NewReleasePrice();
        } else if (moviePrice == MoviePrice.CHILDRENS) {
            price = new ChildrenPrice();
        }
    }

    public String getTitle (){
        return title;
    }

    public MoviePrice getMoviePrice() {
        return moviePrice;
    }

    public double getPrice(Rental rental) {
        return price.getPrice(rental);
    }
}