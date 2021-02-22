package com.company;

public class Coordinates {
    private int x;
    private int y;

    /**
     * Default Constructor for objects of class Coordinates
     */
    public Coordinates(){
        x=0;
        y=0;
    }

    /**
     * Parameterized Constructor for objects of class Ship
     * @param x - X Coordinate of the position of the robot
     * @param y - Y Coordinate of the position of the robot
     */
    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * To get X Coordinate of the position of the robot
     * @return x returns the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * To get Y Coordinate of the position of the robot
     * @return y returns the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of x coordinate
     * @param x Value of x coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the value of y coordinate
     * @param y Value of y coordinate
     */
    public void setY(int y) {
        this.y = y;
    }
}
