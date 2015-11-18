
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		int answer2 = JOptionPane.showConfirmDialog(null, "Is it a vacation day");
		if (answer == 1) {
			if (answer2 == 1) {
				JOptionPane.showMessageDialog(null, "then go surf trestles");
			} else {
				JOptionPane.showMessageDialog(null, "then wake up");

			    }

		}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print “get up lazybones!” If it is a
		 * weekday, and we are on vacation, print “sleep in”.
		 */
	}
}
