
// Copyright Wintriss Technical Schools 2013
import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			// 3. ask the user what color they would like the tortoise to draw
			String colorRed = JOptionPane.showInputDialog("What red do you want the tortoise to draw with? Type with numbers.");
			String colorGreen = JOptionPane.showInputDialog("What green do you want the tortoise to draw with? Type with numbers.");
			String colorBlue = JOptionPane.showInputDialog("What blue do you want the tortoise to draw with? Type with numbers.");
			// 4. use an if/else statement to set the pen color that the user requested

			int newColorRed = Integer.parseInt(colorRed);
			int newColorGreen = Integer.parseInt(colorGreen);
			int newColorBlue = Integer.parseInt(colorBlue);

			Tortoise.setPenColor(new Color(newColorRed, newColorGreen, newColorBlue));

			// 5. if the user doesn’t enter anything, choose a random color

			// int red = ((int) (Math.random() * 255));
			// int green = ((int) (Math.random() * 255));
			// int blue = ((int) (Math.random() * 255));
			// Tortoise.setPenColor(new Color(red, green, blue));

			// 6. put a loop around your code so that you keep asking the user for more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);
			// 1. make the tortoise draw a shape (this will take more than one line of code)
			Tortoise.penDown();
			Tortoise.setSpeed(10);
			Tortoise.move(50);
			Tortoise.turn(120);
			Tortoise.move(50);
			Tortoise.turn(120);
			Tortoise.move(50);
			Tortoise.turn(720);
		}
	}
}
