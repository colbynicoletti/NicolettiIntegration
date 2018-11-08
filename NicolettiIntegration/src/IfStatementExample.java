import java.util.Scanner;

public class IfStatementExample {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"If\" for an example of an If and an If-Else statement.");
    String iffInput = in.nextLine();
    String iff = "If";
    while (badInput) {
      if (iffInput.equals(iff)) {
        System.out.println(
            "Scrolling through the code of my program, I already have enough If and If-Else statement.");
        System.out.println("I wont be showing one as an example.");
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        iffInput = in.nextLine();
      }
    }

  }

}
