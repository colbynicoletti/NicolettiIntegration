import java.util.Scanner;

public class RandomExample {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Random\" for an example of a random number generator.");
    String randomInput = in.nextLine();
    String random = "Random";
    while (badInput) {
      if (randomInput.equals(random)) {
        System.out.println("Let's pick a random number.");
        double rando = Math.random();
        System.out.println("It seems that, " + rando + " is our number!");
        System.out.println("Is that random, or what?");
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        randomInput = in.nextLine();
      }
    }


  }

}
