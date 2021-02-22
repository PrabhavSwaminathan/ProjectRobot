/**
 * The main class driver class
 * @author Prabhav Swaminathan
 * @version 22.02.2021
 */
package com.company;

public class Main {
    //String variable to store the input file
    private String input;
    //Integer variable to store minimum distance travelled by Robot
    private int distance;
    //Object of class Moves
    Moves moves = new Moves();

    public static void main(String[] args) {
        //Object of Main class
        Main main = new Main();
        //Calling the game method
        main.game();
    }
    /**
     * Default Constructor for objects of class Ship
     */
    public Main(){
        input = "";
        distance = 0;
    }
    /**
     * Parameterized Constructor for objects of class Ship
     * @param input - To add the input moves of the robot
     * @param distance - To store the min distance to be travelled by the robot
     */
    public Main(String input, int distance){
        this.input = input;
        this.distance = distance;
    }

    /**
     * To move move robot forward, i.e, in the positive y axis direction
     */
    public void game(){
        //Robot moves input
        input = "F1,R1,B2,L1,B3";
        //Splitting the string and adding the robot moves to an array using the delimiter ','
        String[] array = input.split(",", -1);
        //Looping each move and passing it to the final position class
        for (String s : array) {
            finalPosition(s);
        }
        System.out.println("Input: "+input);
        System.out.println("The minimum amount of distance to get back to the starting point :"+distance);
    }

    /**
     * To check the finalPosition of the robot based on input string
     * @param in - Input for robot moves
     * @return distance - Minimum Distance required by Robot to come back to initial position
     */
    public int finalPosition(String in){
        String dir;
        String dist;
        int distInt;
        //dir has the direction of the robot {F - Forward, B - Backward, R - Right, L - Left}
        dir = in.substring(0,1);
        //dist has the distance to be traveled by robot in that move
        dist = in.substring(1);

        //try catch block to handle the number format exception in case the dist variable is not an integer
        try {
            //Converting the String dist {distance variable to an integer variable}
            distInt = Integer.parseInt(dist);
            //Switch block to pass the move to the appropriate method
            switch (dir) {
                case "F" -> moves.moveForward(distInt);
                case "B" -> moves.moveBackward(distInt);
                case "R" -> moves.moveRight(distInt);
                case "L" -> moves.moveLeft(distInt);
            }
        }catch (NumberFormatException exception){
            System.out.println(exception);
        }
        //Minimum distance travelled by Robot to return to initial position
        distance = Math.abs(moves.coordinates.getX())+Math.abs(moves.coordinates.getY());
        return distance;
    }
}
