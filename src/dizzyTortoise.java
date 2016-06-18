import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class dizzyTortoise {

	public static void main(String[] args) {
		/*
		 * 1. Use the dance method to make the Tortoise spin.
		 * 
		 * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		 * that number of times.
		 */
		String danceCountString = JOptionPane.showInputDialog("How many times do you want the tortoise to spin? (from 1-10)");
		
		int danceCount = Integer.parseInt(danceCountString);
		
		
		dance(danceCount);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}