package _02_code_flow._4_flaming_ninja_star;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 200;		//the size of the black part of the star
		int flameSize = 130;		//the length of the flaming arms
		
		// Make a new robot, and set it's pen down.
		Robot code=new Robot();
		code.setRandomPenColor();
		code.penDown();
		// Set the robot speed to 100
		code.setSpeed(100);
		// Set the robot window size to 800 x 800
code.setWindowSize(800, 800);
		//  COUNT. Make another int variable to count how many times the loop has repeated
		//         Set its start value to zero.
		int count=0;
	       //  LOOP. Start a while loop to repeat all of the code below ONE time (we will change this later)
		while(count < 25) {
			   // TURN RIGHT     Turn the robot 1/8 of a circle (hint: 360 degrees will turn a full circle)
		code.turn(45);
			   // MOVE           Move the robot 64 pixels
			code.move(64);
			   // TURN LEFT      Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			code.turn(-40);
			   // DRAW FLAME     Move the robot the distance in the variable flameSize
			code.setRandomPenColor();
			code.move(flameSize);
				//               Turn the robot 170 degrees
			code.turn(170);
				//               Move the robot the distance in the variable flameSize (again)
			code.move(flameSize);
			   // TURN RIGHT     Turn the robot 64 degrees to the right
			code.turn(64);
				// MOVE         Move the robot the distance in the variable baseSize
			code.setRandomPenColor();
			code.move(baseSize);
				//  INCREASE COUNT. Increase the count by 1
			count = count +1;
		}
		//  End the while loop here
		
		// TEST   Run the program. Check that your shape is the same as the first picture in the recipe. 
		//        This is one arm of the ninja star.
		
		// COLOR  Change the Robot's pen color so that the flame is a different color to the rest of the star.
		//        Run the program again. Check the second picture in the recipe.
		code.setRandomPenColor();
		// LOOP   When you have one arm looking right, change your loop to repeat 25 times and run the program.
		
	}
}
