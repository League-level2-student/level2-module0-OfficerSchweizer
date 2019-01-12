package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	public static void main(String[] args) {
		Robot[] robots = new Robot[3];

		for (int i = 0; i < 3; i++) {
			Robot.setWindowSize(1500, 1000);
			robots[i] = new Robot();
			robots[i].setAngle(90);
			robots[i].setSpeed(10);
			robots[i].moveTo(200, i * 100 + 50);
		}

		Random rand = new Random();
		boolean keepGoing = true;

		while (keepGoing = true) {

			for (Robot robot : robots) {
				if (robot.getY() <= 0) {
					keepGoing = false;
					System.out.println("This robot wins the race!");
					break;
				}

				int a = rand.nextInt(50);
				robot.move(a);

			}

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
