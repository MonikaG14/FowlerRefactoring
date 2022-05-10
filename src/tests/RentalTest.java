package tests;

import classes.Movie;
import classes.Rental;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RentalTest {

    private Rental testRental;
    private Movie testMovieRegular = new Movie("Movietitle", 0);

    @BeforeEach
    public void setUp() {
        testRental = new Rental(testMovieRegular, 2);
    }
    @Test
    public void getDaysRented() {
        assertEquals(2, testRental.getDaysRented());
    }

    @Test
    public void getMovie() {
        assertEquals(testMovieRegular, testRental.getMovie());
    }

    @Test
    public void getAmountFor() {
        assertEquals(2, testRental.getAmountFor(), 0.0);
    }
}