import java.util.Scanner;

public class DoublePlusAndDoubleMinus {

	public static void main(Scanner in, boolean badInput) {
		 badInput = true;
		    System.out.println("Type \"++\" for an example of that function along with \"--\".");
		    String plusInput = in.nextLine() + in.nextLine();
		    String plus = "++";
		    while (badInput) {
		      if (plusInput.equals(plus)) {
		        System.out.println(
		            "The \"++\" is used to increment a value by one and the \"--\" is used to make a value decrease by one.");
		        System.out.println("We are going to use \"++\" first.");
		        System.out.println("Enter a whole number:");
		        int number1 = in.nextInt();
		        System.out.println("Here we are going to display the number you entered + 1:");
		        System.out.println(++number1);
		        System.out.println("We are going to use \"--\" next.");
		        System.out.println("Enter a whole number:");
		        number1 = in.nextInt();
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
