public class FibbonacciSequence {
	public static void main(String[] args){
		
		System.out.println("0");
		int present = 0;
		int past = 0;
		int actualPast = 1;
		for(int i = 0; i < 100; i++){
			present = past + actualPast;
			System.out.println(present);
			actualPast = past;
			past = present;
		}
	}
}