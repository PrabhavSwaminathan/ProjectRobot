"# ProjectRobot" 

How to Run the project?

Download the project and open terminal in the main folder
and type the command

java -jar ProjectRobot.jar

Assumptions
1. The Robot is assumed to be at position (0,0) of a 
2D Cartesian Plane.

2. Input is assumed to be "F1,R1,B2,L1,B3", this can be changed
to anything else. This can be done on line 44 of the
Main.java file

3. It is assumed that the project will accept correct 
input, i.e, "{Direction}{Distance" seperated by commas.

Working

1. When the main class is executed the string input is 
split and added to an array. Then each element of the array
is passed to the final position method in the main class.

2. The final position method is called where the array
element is further split into direction and distance. 
A switch block is executed and based on the direction
input is passed to one of the 4 possible moves in the
moves class. 

3. The method in the moves class performs the operation, 
i.e, moves the robot from its initial position and 
updates the x and y coordinates.

4. This whole operation is repeated for all the moves 
and finally the minimum distance required for robot to 
return to initial position is displayed.

5. This distance is simply calculated by adding the final
absolute values of x and y coordinate.
 
