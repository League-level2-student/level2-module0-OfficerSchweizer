package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];

		for (int i = 0; i < 5; i++) {
			Robot asdf = new Robot();
			asdf.moveTo(i * 200 + 50, 500);
		}

		Random rand = new Random();

		for (Robot robot : robots) {
			int a = rand.nextInt(50);

		}

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
