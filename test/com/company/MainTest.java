package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
    }

    @Test
    public void game() {
    }

    /**
     * To test the finalPosition() method
     */
    @Test
    public void finalPosition() {
        Main main = new Main();
        assertEquals(10,main.finalPosition("F10"));
    }
}