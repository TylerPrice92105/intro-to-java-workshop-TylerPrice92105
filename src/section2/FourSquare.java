package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot r2d2= new Robot();
	void go() {
		//1.create a new Robot
		
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

		//7.change the pen color to random
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method 
		r2d2.penDown();
        r2d2.setSpeed(100);		
		r2d2.move(200);
		r2d2.turn(90);
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



