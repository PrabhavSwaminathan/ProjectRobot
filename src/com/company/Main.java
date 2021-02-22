package com.company;

public class Main {
    private String input = "F1,R1,B2,L1,B3";
    Moves moves = new Moves();
    public static void main(String[] args) {
        Main main = new Main();
        main.game();
    }
    public void game(){
        int distance;
        String[] array = input.split(",", -1);
        for (String s : array) {
            checkDirectionAndDistance(s);
        }
        System.out.println("Input: "+input);
        System.out.println("The X Coordinate: "+moves.coordinates.getX());
        System.out.println("The Y Coordinate: "+moves.coordinates.getY());
        distance = Math.abs(moves.coordinates.getX())+Math.abs(moves.coordinates.getY());
        System.out.println("Distance to be covered by Robot :"+distance);
    }

    public void checkDirectionAndDistance(String input){
        String direction;
        String distance;
        direction = input.substring(0,1);
        distance = input.substring(1);
        int dist = Integer.parseInt(distance);
        switch (direction) {
            case "F" -> moves.moveForward(dist);
            case "B" -> moves.moveBackward(dist);
            case "R" -> moves.moveRight(dist);
            case "L" -> moves.moveLeft(dist);
        }
    }
}
