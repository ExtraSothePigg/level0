// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		int overall = 0;
		
	
		int n = getNickels();
		int d = getDimes();
		int q = getQuarters();
		
		overall = n + d + q; 
		overall = overall / 100;
		//joptionpane dot show message dialogue parenthesis open null comma quotation mark i am bored quotation mark parenthesis close semicolon
		
		
		JOptionPane.showMessageDialog(null, "You have "+overall+" cents.");
	}
	static int getNickels(){
		String nickelString = JOptionPane.showInputDialog("How many nickels you have do.");
		int nickelCount = Integer.parseInt(nickelString);
		nickelCount = nickelCount * 5;
		return nickelCount;
	}
	static int getDimes(){
		String dimeString = JOptionPane.showInputDialog("How many dimes have do you!");
		int dimeCount = Integer.parseInt(dimeString);
		dimeCount = dimeCount * 10;
		return dimeCount;
	}
	static int getQuarters(){
		String quarterString = JOptionPane.showInputDialog("Many how quarters you do have?");
		int quarterCount = Integer.parseInt(quarterString);
		quarterCount = quarterCount * 25;
		return quarterCount;
	} 

}

