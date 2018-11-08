import java.util.Scanner;

public class StringUses {

  public static void main(Scanner in, boolean badInput) {
    
    badInput = true;
    System.out
        .println("Type \"String\" for an example of 3 different methods within the string class.");
   String strInput = in.nextLine();
    String str = "String";
    while (badInput) {
      if (strInput.equals(str)) {
        System.out.println("Method One:");
        System.out.println(
            ".equals-This method is one that has been allowing me to make sure you have been typing the correct words in this program,");
        System.out.println("No example needed.");
        System.out.println("Method Two:");
        System.out
            .println(".length- gives you the length of a string in how many characters it has.");
        System.out.println("Type a word:");
        String word1 = in.nextLine();
        System.out.println("Your word is " + word1.length() + " characters long.");
        System.out.println("Method Three:");
        System.out
            .println(".substring-Allows you to cut a string at a specific index of the string.");
        System.out.println("Type a word that is at least 5 letters long:");
        word1 = in.nextLine();
        System.out.println("I decided to cut your word after the 4th letter:");
        System.out.println(word1.substring(0, 4));
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        strInput = in.nextLine();
      }

    }

  }

}
