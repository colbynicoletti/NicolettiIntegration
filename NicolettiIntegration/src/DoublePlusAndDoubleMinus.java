import java.util.Scanner;

/**
 * This class goes over what ++ and -- mean.
 * Also, having the ++ or -- before or after a variable means something different.
 * That was went over throughout this class.
 * @author Colby Nicoletti
 *
 */
public class DoublePlusAndDoubleMinus {

	public static void main(Scanner in, boolean badInput) {
		 badInput = true;
		    System.out.println("Type \"++\" for an example of that function along with \"--\".");
		    String plusInput = in.nextLine();
		    String plus = "++";
		    while (badInput) {
		    int number1 = 0;
		      if (plusInput.equals(plus)) {
		        System.out.println(
		            "The \"++\" is used to increment a value by one and the \"--\" is used to make a value decrease by one.");
		        System.out.println("We are going to use \"++\" first.");
		        System.out.println("Enter a whole number:");
		        try {
		        number1 = in.nextInt();
		        }catch(Exception e) {
		        	System.out.println("Please use an integer.");
		        	in.nextLine();
		        	number1 = in.nextInt();
		        }
		        System.out.println("Here we are going to display the number you entered + 1:");
		        System.out.println(++number1);
		        System.out.println("We are going to use \"--\" next.");
		        System.out.println("Enter a whole number:");
		        try {
		        number1 = in.nextInt();
		        }catch(Exception e) {
		        	System.out.println("Please use an integer.");
		        	in.nextLine();
		        	number1 = in.nextInt();
		        }
		        System.out.println("Here we are going to display the number you entered - 1:");
		        System.out.println(--number1);
		        badInput = false;
		      } else {
		        System.out.println("You must have typed something wrong. Please try again.");
		        plusInput = in.nextLine();
		      }
		    }

	}

}
