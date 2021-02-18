package com.company;

public class Main {
    Coordinates coordinates = new Coordinates();
    public static void main(String[] args) {
        Main main = new Main();
        main.game();
    }
    public void game(){
        coordinates.setX(2);
        coordinates.setY(9);
        System.out.println(coordinates.getX());
        System.out.println(coordinates.getY());
    }
}
