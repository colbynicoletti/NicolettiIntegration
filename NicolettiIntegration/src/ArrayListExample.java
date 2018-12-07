import java.util.Scanner;

public class ArrayListExample {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Array List\" for an example of an array list.");
		String arrayListIn = in.nextLine();
		String arrayList = "Array List";
		while(badInput) {
			if(arrayListIn.equals(arrayList)) {
				
				badInput = false;
			}else {
				System.out.println("You must have typed something wrong. Please try again.");
				arrayListIn = in.nextLine();
			}
		}
		
	}

}
