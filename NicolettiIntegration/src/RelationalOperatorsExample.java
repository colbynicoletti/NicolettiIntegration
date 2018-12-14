import java.util.Scanner;

/**
 * This class goes over relational operators.
 * I decided to not put an example into this class.
 * I have relational operators all over this program.
 * @author Colby Nicoletti
 *
 */
public class RelationalOperatorsExample {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
	    System.out.println("Type \"Relational\" for an example of Relational Operators.");
	    String relInput = in.nextLine();
	    String rel = "Relational";
	    while (badInput) {
	      if (relInput.equals(rel)) {
	        System.out.println("Relational Operators include \"<, >, <=, >=, ==, and !=\".");
	        System.out.println(
	            "Since I have used some of these in previous parts of my program, I will not be showing an example.");
	        badInput = false;
	      } else {
				System.out.println("You must have typed something wrong. Please try again.");
	        relInput = in.nextLine();
	      }
	    }
	}
}
	

