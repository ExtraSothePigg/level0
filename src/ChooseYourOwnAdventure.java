import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args){
	JOptionPane.showMessageDialog(null, "So you're stuck in a cage.");
	JOptionPane.showMessageDialog(null, "There's a bird outside of the cage, and there's a rock.");
	String Choice1A = JOptionPane.showInputDialog("What do you want to do: 1- give the stone to the bird, or 2- throw the stone?");
	if(Choice1A.equals("1")){
		JOptionPane.showMessageDialog(null, "You give the stone to the bird. The stone eats the bird, chokes, and dies.");
		JOptionPane.showMessageDialog(null, "The stone hits the floor, pressing a button. Luck is quite clearly on your side today.");
		String Choice2A = JOptionPane.showInputDialog("Leave the cage? (p.s. it's a yes or no question)");
if(Choice2A.equals("yes")){

		}}
	else if(Choice1A.equals("2")){
		JOptionPane.showMessageDialog(null, "You miss. The bird is angry now.");
		JOptionPane.showMessageDialog(null, "Death by pecking. Game over, bud.");
	}
		
		}


	}


