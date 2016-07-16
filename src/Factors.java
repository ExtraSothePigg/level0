import javax.swing.JOptionPane;

public class Factors {
	public static void main(String[] args) {
		String askNumber = JOptionPane.showInputDialog("What do you want factor");
		int number = Integer.parseInt(askNumber);
		int forNum = number + 1;
		for (int i = 1; i < forNum; i++) {
			factor(number, i);
		}

	}

	static void factor(int big, int lil) {
		if (big % lil == 0) {
			System.out.println(lil + " is a factor of " + big);
		}
	}
}
