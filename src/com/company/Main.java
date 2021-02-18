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
        for(int i=0;i<array.length;i++){
            checkDirectionAndDistance(array[i]);
        }

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
        switch (direction){
            case "F": moves.moveForward(dist);
                break;
            case "B": moves.moveBackward(dist);
                break;
            case "R": moves.moveRight(dist);
                break;
            case "L": moves.moveLeft(dist);
                break;
        }
    }
}
