import java.util.Scanner;

public class CastingExample {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Casting\" for an example of casting.");
    String castInput = in.nextLine();
    String cast = "Casting";
    while (badInput) {
      if (castInput.equals(cast)) {
        System.out.println(
            "Casting-taking an object of a particular data type and temporarily changing it to another data type.");
        System.out.println(
            "\"num7\" has been casted into 4.0 as a Double from 4 when it was an Integer.");
        int num6 = 4;
        Double num7 = (double) num6;
        System.out.println(num7);
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        castInput = in.nextLine();
      }
    }

  }

}
