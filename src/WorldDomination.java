import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String Answer = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if(Answer.equals("yes")){
	JOptionPane.showMessageDialog(null, "kthx rule world things ;) hav fun m8 ;)");
}else{
	JOptionPane.showMessageDialog(null, "Dishes");
}


	}
}

