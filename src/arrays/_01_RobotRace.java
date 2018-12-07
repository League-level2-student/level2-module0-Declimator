package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
Robot x[]= new Robot[5];
		// 3. use a for loop to initialize the robots.
for(int i = 0;i<x.length;i++) {
	x[i] = new Robot("mini");
}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
for(int i = 0;i<x.length;i++) {
	x[i].setSpeed(100);
	x[i].penDown();
	x[i].moveTo(20*i +50, 250);
}
boolean isOver = false;
boolean firstTurn = false;
boolean first = false;
boolean second = false;
boolean third = false;
boolean fourth = false;
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
int count = 1;
int o = 250;
int slowest = 0;
while(firstTurn == false) {
for(int i = 0;i<x.length;i++) {
	int z = new Random().nextInt(50)+1;
	x[i].move(z);
	if(x[i].getY()<=20*i) {
		x[i].turn(90);
		if(count==1) {
			first=true;
			i=10;
		}
		else if(count==2) {
			second=true;
			i=11;
		}
		else if(count==3) {
			third=true;
			i=12;
		}
		else if (count==4) {
			fourth=true;
			i=13;
		}
		count++;
	}
	if(o<x[i].getY()) {
		o=x[i].getX();
		slowest = i;
	}
	if(o<=20*slowest) {
		firstTurn = true;
	}
	if(x[i].getY()>=249) {
		i++;
		JOptionPane.showMessageDialog(null, "Robot " + i + " has won!");
		isOver = true;
	}
}
}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
