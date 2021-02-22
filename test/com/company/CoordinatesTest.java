package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesTest {
    /**
     * To test the getX() method
     */
    @Test
    public void getX() {
        Coordinates coordinates = new Coordinates(7,4);
        assertEquals(7,coordinates.getX());
    }

    /**
     * To test the getY() method
     */
    @Test
    public void getY() {
        Coordinates coordinates = new Coordinates(7,4);
        assertEquals(4,coordinates.getY());
    }

    /**
     * To test the setX() method
     */
    @Test
    public void setX() {
        Coordinates coordinates = new Coordinates(6,9);
        coordinates.setX(8);
        assertEquals(8,coordinates.getX());
    }

    /**
     * To test the setY() method
     */
    @Test
    public void setY() {
        Coordinates coordinates = new Coordinates(6,9);
        coordinates.setY(2);
        assertEquals(2,coordinates.getY());
    }
}