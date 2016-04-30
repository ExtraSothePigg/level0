	import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;
public class ObedTortoise {
	
	public static void main(String[] args){
		int newColorRed;
		int newColorGreen;
		int newColorBlue;
		
		String colorRed = JOptionPane.showInputDialog("What red value do you want the tortoise to draw with? Type with numbers.");
		String colorGreen = JOptionPane.showInputDialog("What green value do you want the tortoise to draw with? Type with numbers.");
		String colorBlue = JOptionPane.showInputDialog("What blue value do you want the tortoise to draw with? Type with numbers.");
		
		
		newColorGreen = Integer.parseInt(colorGreen);
		newColorBlue = Integer.parseInt(colorBlue);
		newColorRed = Integer.parseInt(colorRed);
		Tortoise.setPenColor(new Color(newColorRed, newColorGreen, newColorBlue));
		
		String shape = JOptionPane.showInputDialog("What do you want the turtleoise to draw?");
			
		if(shape.equals("Square")){
			Tortoise.setSpeed(10);
			Tortoise.move(50);
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(90);
			Tortoise.move(50);
		}
		if(shape.equals("Triangle")){
			
			Tortoise.setSpeed(10);
			Tortoise.move(50);
			Tortoise.turn(120);
			Tortoise.move(50);
			Tortoise.turn(120);
			Tortoise.move(50);
			Tortoise.turn(120);
			Tortoise.move(50);
		}
		if(shape.equals("Circle")){
			
			
			for(int circleAmount = 1; circleAmount < 181; circleAmount++){
				Tortoise.setSpeed(10);
				Tortoise.move(10);
				Tortoise.turn(5);
			}
		}
	
	}
	static void drawSquare(){
		
	}
	static void drawTriangle(){
		
	}

		
	}
