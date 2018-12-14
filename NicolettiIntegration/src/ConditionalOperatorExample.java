import java.util.Scanner;

/**
 * This class goes over conditional operators.
 * These include && and ||.
 * It explains how they're useful in programming.
 * @author Colby Nicoletti
 *
 */
public class ConditionalOperatorExample {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
	    System.out.println("Type \"Conditional\" for an example of a Conditional Operator.");
	    String conInput = in.nextLine();
	    String con = "Conditional";
	    while (badInput) {
	      if (conInput.equals(con)) {
	        System.out.println("The two main conditional operators are \"&&\" which means \"and\" and");
	        System.out.println("\"||\" which means \"or\".");
	        System.out.println("They are useful in If statements.");
	        System.out.println("For example, I have made two variables called cond1 and cond2.");
	        System.out.println("I am going to assign cond1 = 3 and cond2 = 6.");
	        int cond1 = 3;
	        int cond2 = 6;
	        System.out.println("Now, I am going to declare a boolean called \"bool\".");
	        System.out.println("It will look like this:");
	        System.out.println("boolean bool;");
	        boolean bool;
	        System.out.println(
	            "I will now add the other part of the expression now to declare something to it.");
	        System.out.println("That will look that this:");
	        System.out.println("bool = cond1 == 2 && cond2 == 6;");
	        bool = cond1 == 2 && cond2 == 6;
	        System.out.println(
	            "Since we made cond1 == 2, the program will display false because both expressions need to be true");
	        System.out.println("in order to make the program display true.");
	        System.out.println("Here is the actual output of the program: " + bool);
	        badInput = false;
	      } else {
	        System.out.println("You must have typed something wrong. Please try again.");
	        conInput = in.nextLine();
	      }
	    }

	}

}
