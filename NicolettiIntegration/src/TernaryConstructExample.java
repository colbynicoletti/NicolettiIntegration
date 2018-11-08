import java.util.Scanner;

public class TernaryConstructExample {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Ternary\" for an example of a ternary construct.");
    String ternInput = in.nextLine();
    String tern = "Ternary";
    while (badInput) {
      if (ternInput.equals((tern))) {
        System.out.println("Type a whole number:");
        int a = in.nextInt();
        System.out.println("Type another whole number:");
        int b = in.nextInt();
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
