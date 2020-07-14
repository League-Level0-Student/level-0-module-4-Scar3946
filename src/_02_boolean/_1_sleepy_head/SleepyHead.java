package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
      String day =  JOptionPane.showInputDialog ( "what day is it?");
		// Set the boolean isWeekend based on the value they enter
		
		
		// If it is t  he weekend, tell the user they get to sleep in.
		if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			JOptionPane.showMessageDialog(null, "you get to sleep in");
			 isWeekend = true;
		}
		// If it is not the weekend, tell them to get out of bed and go to school
 if (day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("tuesday") || 
		 day.equalsIgnoreCase("wensday") || day.equalsIgnoreCase("thursday") 
		 || day.equalsIgnoreCase("friday")
    		  )  {
			JOptionPane.showMessageDialog(null,"get out of bed and go to school");
			isWeekend = false ;
		}
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
String percentage =JOptionPane.showInputDialog("what percentage did you score on your last exam? ");
		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if (percentage > 70 ) { passedExam = true;
		// If the user passed the exam, congratulate them
		JOptionPane.showMessageDialog(null, "good job");
		// otherwise, wish them better luck next time.
if (percentage < 70) {
	JOptionPane.showMessageDialog(null, "better luck next time");
}
}
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true
boolean gameIsOver = true;
		}
		// Tell the user "game is over" 
		
		JOptionPane .showMessageDialog(null, "game is over");
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog("what color do you want to draw with?");
	if (color = "Red") { isRed = true;}
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog("what shape do you want to draw");
		if (shape = "Square" ) {isSquare = true ;}
// ARE YOU THERE?	
// SAVE YOUR CODE TO GITHUB AND SIGN OUT WHEN YOU ARE DONE!
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		if  color = 

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
