package com.company;

public class Moves {
    Coordinates coordinates = new Coordinates();

    public void moveForward(int num){
        coordinates.setY(coordinates.getY()+num);
    }
    public void moveBackward(int num){
        coordinates.setY(coordinates.getY()-num);
    }
    public void moveLeft(int num){
        coordinates.setX(coordinates.getX()-num);
    }
    public void moveRight(int num){
        coordinates.setX(coordinates.getX()+num);
    }
}
