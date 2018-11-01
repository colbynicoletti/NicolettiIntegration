import java.util.Scanner;

public class DoubleMethod {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Double\" for an example.");
    String doubInput = in.nextLine() + in.nextLine();
    // System.out.println(doubInput);
    String doub = "Double";
    while (badInput) {
      if (doubInput.equals(doub)) {
        System.out.println("Type a decimal number:");
        double num3 = in.nextDouble();
        System.out.println("Type another decimal number:");
        double num4 = in.nextDouble();
        double total2 = num3 / num4;
        System.out.println("The first number divided by the second number is " + total2 + ".");
        System.out.println(
            "This was an example of doubles and that when both numbers of a calculation are doubles,");
        System.out
            .println("the result will be a double as well and Java won't truncate your result.");
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        doubInput = in.nextLine();
      }
    }


  }

}
