package tests;

import classes.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;
    private String name;

    @BeforeEach
    void setup() {
        name = randomString();
        customer = new Customer(name);
    }

    @Test
    void testGetName() {
        assertEquals(name, customer.getName());
    }

    @Test
    void testStatement() {
        assertTrue(customer.statement().startsWith("Rental Record for " + name));
        assertTrue(customer.statement().endsWith("frequent renter points"));
    }

    private String randomString() {

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<15; i++) {
            result.append(s.getBytes()[(int) (Math.random() * s.length())]);
        }
        return result.toString();
    }
}