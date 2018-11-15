import java.util.Scanner;

public class WhileExample {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
	    System.out.println("Type \"While\" for an explanation of a while loop.");
	    String inWhileInput = in.nextLine();
	    String inWhile = "While";
	    while (badInput) {
	    	if (inWhileInput.equals(inWhile)) {
	    		System.out.println("For most classes I have made, there is a while loop inside of it.");
	    		System.out.println("A little information on while loops:");
	    		System.out.println("1) While loops are condition controlled.");
	    		System.out.println("2) While loops should be used when the number of times the loop should be repeated is unknown.");
	    		System.out.println("3) There must be something inside of the loop in order to get out of it. If you don't, you get an infinite loop.");
	    		badInput = false;
	    	} else {
	    		  System.out.println("You must have typed something wrong. Please try again.");
			        inWhileInput = in.nextLine();
	    	}
	    }

	}

}
