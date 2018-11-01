import java.util.Scanner;

public class VarAndScope {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Variable and Scope\" for definitions.");
    String varInput = in.nextLine();
    String var = "Variable and Scope";
    while (badInput) {
      if (varInput.equals(var)) {
        System.out.println(
            "Variable-A place holder for a data type, to make it easier to be called upon.");
        System.out.println(
            "Scope-Means that the variables are only accessible in the method where they're declared.");
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        varInput = in.nextLine();
      }
    }
  }
}
