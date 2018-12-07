import java.util.Scanner;

public class EnhancedForLoop {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Enhanced\" for an example of an enhanced for loop.");
		String enhanceIn = in.nextLine();
		String enhance = "Enhanced";
		while(badInput) {
			if(enhanceIn.equals(enhance)) {
				System.out.println("The enhanced for loop is the same thing as a regular for loop.");
				System.out.println("It simply makes things simpler when going through an array.");
				System.out.println("An array that has values in increments of 5 starting at 5 and going to 30 was made.");
				System.out.println("Below, the whole array is printed as follows:");
				int fives[] = {5,10,15,20,25,30};
				for (int show: fives) {
					System.out.println(show);
				}
				badInput = false;
			}else {
				 System.out.println("You must have typed something wrong. Please try again.");
				 enhanceIn = in.nextLine();
			}
		}
	}

}
