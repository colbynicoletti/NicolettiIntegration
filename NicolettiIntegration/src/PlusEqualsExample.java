import java.util.Scanner;

public class PlusEqualsExample {

	public static void main(Scanner in, boolean badInput) {
		 badInput = true;
		    System.out.println("Type \"+=\" for an example of \"+=\".");
		    String pluseqInput = in.nextLine();
		    String pluseq = "+=";
		    while (badInput) {
		      if (pluseqInput.equals(pluseq)) {
		        System.out.println(
		            "The \"+=\" function is used to increment whatever variable is before it by whatever number is after it.");
		        System.out.println("You'll see what I'm talking about now.");
		        System.out.println("Enter a whole number:");
		        int number2 = in.nextInt();
		        System.out.println("You entered " + number2
		            + ", I decided to increment it by 5, the next output will be " + number2 + " plus 5.");
		        number2 += 5;
		        System.out.println("Your new number is " + number2);
		        badInput = false;
		      } else {
		        System.out.println("You must have typed something wrong. Please try again.");
		        pluseqInput = in.nextLine();
		      }
		    }

	}

}
