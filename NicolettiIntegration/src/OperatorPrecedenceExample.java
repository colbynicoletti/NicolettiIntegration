import java.util.Scanner;

/**
 * This class just tells the user than Operator Precedence is the same thing as PEMDAS.
 * @author Colby Nicoletti
 *
 */
public class OperatorPrecedenceExample {

	public static void main(Scanner in, boolean badInput) {
		  badInput = true;
		    System.out.println("Type \"Operator\" for the definition of an Operator Precedence.");
		    String opInput = in.nextLine();
		    String op = "Operator";
		    while (badInput) {
		      if (opInput.equals(op)) {
		        System.out.println("Operator Precedence-just a fancy way to say \"PEMDAS\".");
		        badInput = false;
		      } else {
		        System.out.println("You must have typed something wrong. Please try again.");
		        opInput = in.nextLine();
		      }
		    }

	}

}
