import java.util.Scanner;

/**
 * This class gives the user an example of how the final keyword works.
 * @author Colby Nicoletti
 *
 */
public class FinalMethod {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Final\" for a definition ans example.");
    String finInput = in.nextLine();
    String fin = "Final";
    while (badInput) {
      if (finInput.equals(fin)) {
        final int NUM5 = 5;
        System.out.println("I have given the variable \"NUM5\" a value of " + NUM5);
        System.out
            .println("Since \"NUM5\" is a final, I won't be able to change it no matter what.");
        System.out
            .println("If I were to try to change the value of \"NUM5\" I would get an error.");
        System.out.println(
            "Final-A keyword that makes whatever you assign it to unchangeable, unless you change it directly in the code.");
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        finInput = in.nextLine();
      }
    }
  }
}
