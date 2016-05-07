
public class BeiberFever {

	public static void main(String[] args) {
		boolean ohOrNo = true;
		int count = 0;
		int bbyCount = 1;
		int verseCount = 1;
		for(count = 0; count < 3; count++){
		for (verseCount = 1; verseCount < 5; verseCount++) {
			if(ohOrNo == true) {
				ohOrNo = false;
			}else{
				ohOrNo = true;
			}
			for (bbyCount = 1; bbyCount < 4; bbyCount++) {

				System.out.println("baby");
			}
			if (ohOrNo == true) {
				System.out.println("oh");
			}
			if (ohOrNo == false) {
				System.out.println("maybe idk");
			}

		}
		System.out.println("thought you'd always be mine");
	}

}
}