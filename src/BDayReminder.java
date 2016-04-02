
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BDayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String Bdayperson = JOptionPane.showInputDialog("Who's birthday do you want: Mom, dad, or you?");
		// 3. Print out what the user typed
		System.out.println(Bdayperson);
		// 4. if user asked for "mom"
		if (Bdayperson.equals("mom")) {
			JOptionPane.showMessageDialog(null, "Mom's birthday is " + momsBirthday + ".");
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		else if (Bdayperson.equals("dad")) {
			JOptionPane.showMessageDialog(null, "Dad's birthday is " + dadsBirthday + ".");
		}
		// print dad's birthday
		// 6. if user asked for your name
		else if (Bdayperson.equals("me")) {
			JOptionPane.showMessageDialog(null, "How do you not remember? Do you have a problem?");
			JOptionPane.showMessageDialog(null, "...");
			JOptionPane.showMessageDialog(null, "It's " + myBirthday + ".");
		} else {
			JOptionPane.showMessageDialog(null, "I dunno.");
		}

		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
	}
}
