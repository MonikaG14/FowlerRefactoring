package classes.prices;

import classes.Rental;

public interface Price {
    double getPrice(Rental rental);
}
