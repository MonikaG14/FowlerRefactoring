package classes.prices;

import classes.Rental;

public class NewReleasePrice implements Price{

    @Override
    public double getPrice(Rental rental) {
        return (double) (rental.getDaysRented() * 3);
    }
}
