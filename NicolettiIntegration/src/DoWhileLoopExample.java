import java.util.Scanner;

public class DoWhileLoopExample {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Do While\" for an example of a Do/While loop.");
		String doWhileLoopInput = in.nextLine();
		String doWhileLoop = "Do While";
		while (badInput) {
			if (doWhileLoopInput.equals(doWhileLoop)) {
				System.out.println("Do/While loops are different than for and while loops.");
				System.out.println("Do/While loops are good for when you need to run through the loop at least once.");
				System.out.println("Enter an integer we can start from to count to ten:");
				int doLoopIn = in.nextInt();
				do {
					System.out.println("Number is: " + doLoopIn);
					doLoopIn++;
				} while (doLoopIn <= 10);
				badInput = false;
			} else {
				System.out.println("You must have typed something wrong. Please try again.");
				doWhileLoopInput = in.nextLine();
			}
		}
		
	}

}