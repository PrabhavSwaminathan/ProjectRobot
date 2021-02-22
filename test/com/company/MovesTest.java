package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovesTest {

    @Test
    public void moveForward() {
        Moves moves = new Moves();
        moves.moveForward(4);
        assertEquals(4,moves.coordinates.getY());
    }

    @Test
    public void moveBackward() {
        Moves moves = new Moves();
        moves.moveBackward(4);
        assertEquals(-4,moves.coordinates.getY());
    }

    @Test
    public void moveLeft() {
        Moves moves = new Moves();
        moves.moveLeft(4);
        assertEquals(-4,moves.coordinates.getX());
    }

    @Test
    public void moveRight() {
        Moves moves = new Moves();
        moves.moveRight(4);
        assertEquals(4,moves.coordinates.getX());
    }
}