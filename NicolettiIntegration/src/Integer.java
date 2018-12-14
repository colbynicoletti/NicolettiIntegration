import java.util.Scanner;

/**
 * This program demonstrates integers.
 * It asks for user input for 2 integers and then adds them together.
 * @author Colby Nicoletti
 *
 */
public class Integer {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Integer\" for an example.");
    String integerInput = in.nextLine();
    // System.out.println(integerInput);
    String integer = "Integer";
    while (badInput) {
      if (integerInput.equals(integer)) {
    	  int num1;
    	  int num2;
    	try {
        System.out.println("Type a whole number:");
        num1 = in.nextInt();
    	} catch (Exception e) {
    		System.out.println("Requires an integer, try again:");
    		in.nextLine();
    		num1 = in.nextInt();
    	} 
    	try {
        System.out.println("Type another whole number:");
        num2 = in.nextInt();
    	}catch(Exception e) {
    		System.out.println("Requires an integer, try again:");
    		in.nextLine();
    		num2 = in.nextInt();
    	}
        int total = num1 + num2;
        System.out.println("The total is " + total + ".");
        System.out
            .println("This was an example of storing two integers of which numbers you decided");
        System.out.println("and then they were added together and the total was outputted.");
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        integerInput = in.nextLine();
      }
    }

  }

}
