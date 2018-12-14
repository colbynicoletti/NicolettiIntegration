import java.util.Scanner;

/**
 * This class shows how doubles work.
 * It asks for two doubles and then it divides the doubles and outputs the answer.
 * @author Colby Nicoletti
 *
 */
public class DoubleMethod {

 public static void main(Scanner in , boolean badInput) {
  badInput = true;
  System.out.println("Type \"Double\" for an example.");
  String doubInput = in .nextLine();
  // System.out.println(doubInput);
  String doub = "Double";
  while (badInput) {
   if (doubInput.equals(doub)) {
    double num3;
    double num4;
    try {
     System.out.println("Type a decimal number:");
     num3 = in .nextDouble();
    } catch (Exception e) {
     System.out.println("Wrong Input, requires a decimal (Double):"); in .nextLine();
     num3 = in .nextDouble();
    }
    try {
     System.out.println("Type another decimal number:");
     num4 = in .nextDouble();
    } catch (Exception e) {
     System.out.println("Wrong Input, requires a decimal (Double):"); in .nextLine();
     num4 = in .nextDouble();
    }
    double total2 = num3 / num4;
    System.out.println("The first number divided by the second number is " + total2 + ".");
    System.out.println(
     "This was an example of doubles and that when both numbers of a calculation are doubles,");
    System.out
     .println("the result will be a double as well and Java won't truncate your result.");
    badInput = false;
   } else {
    System.out.println("You must have typed something wrong. Please try again.");
    doubInput = in .nextLine();
   }
  }
 }
}