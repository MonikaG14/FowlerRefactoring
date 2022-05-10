package classes;

import java.lang.*;

public class Program {

    public static void main(String args[]) {
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie movie1 = new Movie("movie1", 1);
        Movie movie2 = new Movie("movie2", 2);
        Rental rental1 = new Rental(movie1, 10);
        Rental rental2 = new Rental(movie2, 5);
        Customer customer1 = new Customer("joe");
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        System.out.println("Let's get the Statement");
        result = customer1.statement();
        System.out.println(result);
    }
}


