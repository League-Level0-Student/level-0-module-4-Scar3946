package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Testscores {

	public static void main(String[] args) {
		
	String testscore =JOptionPane.showInputDialog("what is your test score?")	;
	double score = Double.parseDouble(testscore);
		
	if (score > 75 && score <= 100){
		JOptionPane.showMessageDialog(null," good job ");
	}	
		
	if (score < 75)	{
		JOptionPane.showMessageDialog(null, "maybe study harder next time");
	}
		
		
		
		
		
		
		
	}
}
