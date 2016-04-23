	import org.teachingextensions.logo.Tortoise;
public class ObedTortoise {
	//We are going to make an obedient tortoise that will obey our commands to draw shapes. Please note that this is not a recipe, but a list step-by-step instructions.



	//1. Make a new class, create a main method, and show the tortoise.
	public static void main(String[] args){
	
	//2. Have the Tortoise draw a square.
		drawSquare();
	//3. Extract this code into a drawSquare() method.

	//4. Have the Tortoise draw a triangle.
		drawTriangle();
	//5. Extract this code into a drawTriangle() method.

	//6. Have the Tortoise draw a circle.
		drawCircle();
	//7. Extract this code into a drawCircle() method.

	//8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.

	//9. Ask the user which color they want. Color the the shape depending on their answer.
	}
	static void drawSquare(){
		Tortoise.setSpeed(10);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(50);
	}
	static void drawTriangle(){
		Tortoise.setSpeed(10);
		Tortoise.move(50);
		Tortoise.turn(120);
		Tortoise.move(50);
		Tortoise.turn(120);
		Tortoise.move(50);
		Tortoise.turn(120);
		Tortoise.move(50);
	}
	static void drawCircle(){
		for(int circleAmount = 1; circleAmount < 181; circleAmount++){
			Tortoise.move(10);
			Tortoise.turn(5);
		}
	}
}