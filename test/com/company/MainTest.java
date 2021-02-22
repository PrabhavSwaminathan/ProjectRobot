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

    @Test
    public void checkDirectionAndDistance() {
        Main main = new Main();
        assertEquals(10,main.checkDirectionAndDistance("F10"));
    }
}