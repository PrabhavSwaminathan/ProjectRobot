package com.company;

public class Main {
    Moves moves = new Moves();
    public static void main(String[] args) {
        Main main = new Main();
        main.game();
    }
    public void game(){
        moves.moveForward(5);
        moves.moveLeft(7);
        moves.moveBackward(8);
        moves.moveForward(2);
        moves.moveRight(9);
        System.out.println(moves.coordinates.getX());
        System.out.println(moves.coordinates.getY());
    }
}
