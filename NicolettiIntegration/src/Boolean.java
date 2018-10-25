import java.util.Scanner;

public class Boolean {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Boolean\" for an example.");
    String booleenInput = in.nextLine();
    String booleen = "Boolean";
    // System.out.println(booleenInput);
    while (badInput) {
      if (booleenInput.equals(booleen)) {
        System.out.println("True or False: Fish can swim. \nPlease Enter \"true\" or \"false\".");
        boolean bird = in.nextBoolean();
        if (bird == true) {
          System.out.println("You're Correct!");
          System.out.println(
              "The Boolean was made to test whether true or false was entered into the program.");
          badInput = false;
        } else if (bird == false) {
          System.out.println("You're wrong! Fish can definitely swim!");
          System.out.println(
              "The Boolean was made to test whether true or false was entered into the program.");
          badInput = false;
        }
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        booleenInput = in.nextLine();
      }

    }

  }

}
