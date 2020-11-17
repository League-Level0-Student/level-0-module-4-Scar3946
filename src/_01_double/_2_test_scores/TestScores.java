package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {

	
	public static void main(String[] args) {
	
String testscores = JOptionPane.showInputDialog(null, "what is your test score");
double score =  Double.parseDouble(testscores);
if (score == 70) {
	JOptionPane.showMessageDialog(null, "Better luck next time");
}
if (score >=80) {
	JOptionPane.showMessageDialog(null, "good job");
}
	}

}
