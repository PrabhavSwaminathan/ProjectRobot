package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesTest {

    @Test
    public void getX() {
        Coordinates coordinates = new Coordinates(7,4);
        assertEquals(7,coordinates.getX());
    }

    @Test
    public void getY() {
        Coordinates coordinates = new Coordinates(7,4);
        assertEquals(4,coordinates.getY());
    }

    @Test
    public void setX() {
        Coordinates coordinates = new Coordinates(6,9);
        coordinates.setX(8);
        assertEquals(8,coordinates.getX());
    }

    @Test
    public void setY() {
        Coordinates coordinates = new Coordinates(6,9);
        coordinates.setY(2);
        assertEquals(2,coordinates.getY());
    }
}