import javax.swing.JOptionPane;

public class RiddleMeThis {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String Answer1 = JOptionPane.showInputDialog("How many questions are on this riddle quiz?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(Answer1.equals("4")){
	JOptionPane.showMessageDialog(null, "NICE ONE CORRECTOREEYESGOODJOB");
	score = score + 1;
		// 5. Otherwise, say "wrong" and tell them the answer

}else{
	JOptionPane.showMessageDialog(null, "WRONG THERE ARE $ QUESTIONS");
	JOptionPane.showMessageDialog(null, "NEXT");
}
		// 6. Add some more riddles
String Answer2 = JOptionPane.showInputDialog("What is my name?");
if(Answer2.equals("mac")){
	JOptionPane.showMessageDialog(null, "ITHINKITSPRETTYGOOD");
	score = score + 1;
}else{
	JOptionPane.showMessageDialog(null, "YOU FAILURE. WHAT DO YOU THINK I AM, A PC?");
}

String Answer3 = JOptionPane.showInputDialog("How do you easily learn to Drive on this computer?");
if(Answer3.equals("press the easy button")){
	JOptionPane.showMessageDialog(null, "Wow.");
score = score + 1;
}else{
	JOptionPane.showMessageDialog(null, "ur bad at this");
}
String Answer4 = JOptionPane.showInputDialog("How many questions have you gotten right?");

int Answer45 = Integer.parseInt(Answer4);
if(Answer45 == score + 1){
	JOptionPane.showMessageDialog(null, "Good one.");
	score = score + 1;
}else{
	JOptionPane.showMessageDialog(null, "Failure.");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "You got "+score+" out of 20 questions correct. How sad.");
	}
}

