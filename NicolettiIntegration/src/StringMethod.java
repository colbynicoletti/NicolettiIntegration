import java.util.Scanner;

public class StringMethod {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"String\" for an example.");
    String strInput = in.nextLine();
    String str = "String";
    while (badInput) {
      if (strInput.equals(str)) {
        System.out.println(
            "We have been using Strings to make sure that you are typing the correct thing");
        System.out.println("before more information comes out at you.");
        System.out.println("I don't think an example is necessary.");
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        strInput = in.nextLine();
      }
    }
  }
}
