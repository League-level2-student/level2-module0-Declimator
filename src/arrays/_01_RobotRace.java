package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot x[] = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < x.length; i++) {
			x[i] = new Robot("mini");
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < x.length; i++) {
			x[i].setSpeed(300);
			x[i].penDown();
			x[i].moveTo(20 * i + 50, 250);
		}
		boolean isOver = false;
		boolean firstTurn = false;
		boolean secondTurn = false;
		boolean thirdTurn = false;
		boolean fourthTurn = false;
		boolean pass = false;
		int number[] = { 0, 0, 0, 0, 0 };

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		int count = 0;
		int o = 0;
		int slowest = 0;
		while (firstTurn == false) {
			for (int i = 0; i < x.length; i++) {
				int z = new Random().nextInt(50) + 1;
				x[i].move(z);

				if (x[i].getY() <= 100 + 10 * i) {
					if (number[i] == i) {

					} else {
						count++;
					}
					number[i] = i;
					x[i].setAngle(90);
					x[i].setPenColor(255, 0, 0);
					System.out.println(count);
					if (count == 4) {
						firstTurn = true;
					}
				}

			}

		}
		count = 0;
		int secondnumber[] = { 0, 0, 0, 0, 0 };
		while (firstTurn == true && secondTurn == false) {

			for (int i = 0; i < x.length; i++) {
				int z = new Random().nextInt(50) + 1;
				x[i].move(z);

				if (x[i].getX() >= 800 - 10 * i) {

					if (secondnumber[i] == i) {

					} else {
						count++;
					}
					secondnumber[i] = i;
					x[i].setAngle(180);
					x[i].setPenColor(0, 255, 0);
					System.out.println(count);
					if (count == 4) {
						secondTurn = true;
					}

				}

			}

		}
		count = 0;
		int thirdnumber[] = { 0, 0, 0, 0, 0 };
		while (firstTurn == true && secondTurn == true && thirdTurn == false) {
			for (int i = 0; i < x.length; i++) {
				int z = new Random().nextInt(50) + 1;
				x[i].move(z);

				if (x[i].getY() <= 500 - 10 * i) {
					if (thirdnumber[i] == i) {

					} else {
						count++;
					}
					thirdnumber[i] = i;
					x[i].setAngle(270);
					x[i].setPenColor(0, 0, 255);
					System.out.println(count);
					if (count == 4) {
						thirdTurn = true;
					}
				}

			}

		}
		/*
		 * if (fourthTurn = true) { for (int i = 0; i < x.length; i++) { if (x[i].getY()
		 * >= 250) { i++; JOptionPane.showMessageDialog(null, "Robot " + i +
		 * " has won!"); isOver = true; } } }
		 */
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
