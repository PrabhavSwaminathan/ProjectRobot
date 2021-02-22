package com.company;

public class Moves {
    //Object of class Coordinate
    Coordinates coordinates = new Coordinates();

    /**
     * To move move robot forward, i.e, in the positive y axis direction
     */
    public void moveForward(int num){
        coordinates.setY(coordinates.getY()+num);
    }

    /**
     * To move move robot backward, i.e, in the negative y axis direction
     */
    public void moveBackward(int num){
        coordinates.setY(coordinates.getY()-num);
    }

    /**
     * To move move robot left, i.e, in the negative x axis direction
     */
    public void moveLeft(int num){
        coordinates.setX(coordinates.getX()-num);
    }

    /**
     * To move move robot right, i.e, in the positive x axis direction
     */
    public void moveRight(int num){
        coordinates.setX(coordinates.getX()+num);
    }
}
