package com.company;

public class Main {
    private String input;
    private int distance;
    Moves moves = new Moves();

    public static void main(String[] args) {
        Main main = new Main();
        main.game();
    }

    public Main(){
        input = "";
        distance = 0;
    }

    public Main(String input, int distance){
        this.input = input;
        this.distance = distance;
    }

    public void game(){
        input = "F1,R1,B2,L1,B3";
        String[] array = input.split(",", -1);
        for (String s : array) {
            checkDirectionAndDistance(s);
        }
        System.out.println("Input: "+input);
        System.out.println("The X Coordinate: "+moves.coordinates.getX());
        System.out.println("The Y Coordinate: "+moves.coordinates.getY());
        System.out.println("Distance to be covered by Robot :"+distance);
    }

    public int checkDirectionAndDistance(String in){
        String dir;
        String dist;
        int distInt;
        dir = in.substring(0,1);
        dist = in.substring(1);
        try {
            distInt = Integer.parseInt(dist);
            switch (dir) {
                case "F" -> moves.moveForward(distInt);
                case "B" -> moves.moveBackward(distInt);
                case "R" -> moves.moveRight(distInt);
                case "L" -> moves.moveLeft(distInt);
            }
        }catch (NumberFormatException exception){
            System.out.println(exception);
        }
        distance = Math.abs(moves.coordinates.getX())+Math.abs(moves.coordinates.getY());
        return distance;
    }
}
