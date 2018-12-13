import java.util.Scanner;

public class ForExample {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"For\" for an example of a for loop.");
		String forLoopInput = in.nextLine();
		String forLoop = "For";
		while (badInput) {
			int loopInteger = 0;
			if (forLoopInput.equals(forLoop)) {
				System.out.println("A for loop is count controlled.");
				System.out.println("Let's make a loop that counts from 1 to your input.");
				System.out.println("Please enter an integer between 2 and 10.");
				loopInteger = in.nextInt();
				for (int i=1; i<=loopInteger; i++) {
					System.out.println(i);
				}
				System.out.println("Since you entered " + loopInteger + " we started from there and added one in a loop until we got to "+ loopInteger);
				badInput = false;
		} else {
			System.out.println("You must have typed something wrong. Please try again.");
			forLoopInput = in.nextLine();
		}
		
	}

	}
}
