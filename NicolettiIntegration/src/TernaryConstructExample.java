import java.util.Scanner;

/**
 * This class goes over Ternary Constructs.
 * More specifically, 2 numbers are asks to be entered by the user.
 * The program deciphers the smaller of the two numbers.
 * @author Colby Nicoletti
 *
 */
public class TernaryConstructExample {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Ternary\" for an example of a ternary construct.");
    String ternInput = in.nextLine();
    String tern = "Ternary";
    while (badInput) {
    	int a = 0;
    	int b = 0;
      if (ternInput.equals((tern))) {
    	 try {
        System.out.println("Type a whole number:");
        a = in.nextInt();
    	 }catch(Exception e) {
    		 System.out.println("You must've typed something wrong, type an integer.");
    		 in.nextLine();
    		 a = in.nextInt();
    	 }
    	 try {
        System.out.println("Type another whole number:");
        b = in.nextInt();
    	 }catch(Exception e) {
    		 System.out.println("You must've typed something wrong, type an integer.");
    		 in.nextLine();
    		 a = in.nextInt();
    	 }
        int minValue = (a < b) ? a : b;
        System.out.println(
            "Out of the 2 numbers you picked, I am able to tell you that the smaller number is "
                + minValue);
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        ternInput = in.nextLine();
      }
    }

  }

}
