package tests;

import classes.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    private Movie movie;
    private String name;
    private int pieceCode;

    @BeforeEach
    void setup() {
        this.name = randomString();
        this.pieceCode = (int) (Math.random() * 3);
        this.movie = new Movie(name, pieceCode);
    }

    @Test
    void getTitle() {
        assertEquals(name, movie.getTitle());
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