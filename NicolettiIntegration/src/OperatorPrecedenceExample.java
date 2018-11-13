import java.util.Scanner;

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
