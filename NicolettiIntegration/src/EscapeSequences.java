import java.util.Scanner;

public class EscapeSequences {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Escape\" for an example of escape sequences in strings.");
    String escapeInput = in.nextLine();
    String escape = "Escape";
    while (badInput) {
      if (escapeInput.equals(escape)) {
        System.out.println("Escape sequences are used to do things inside of a string such as:");
        System.out.println(
            "making a new line, putting double quotes inside of double quotes, inserting a tab, etc.");
        System.out.println(
            "I use an escape sequence everytime I check for the spelling in a word for this program.");
        System.out.println("I don't think an example is necessary.");
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        escapeInput = in.nextLine();
      }
    }

  }

}
