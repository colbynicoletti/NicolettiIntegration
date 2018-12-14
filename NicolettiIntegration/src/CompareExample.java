import java.util.Scanner;

/**
 * This class goes over the .compareTo method.
 * I used it to see which word was first in alphabetical order.
 * Next, I needed to describe what == meant.
 * @author Colby Nicoletti
 *
 */
public class CompareExample {

	public static void main(Scanner in, boolean badInput) {
		 badInput = true;
		    System.out.println(
		        "Type \"Compare\" for an example of a.compareTo statement and comment about what \"==\" does with objects.");
		    String comInput = in.nextLine();
		    String com = "Compare";
		    while (badInput) {
		      if (comInput.equals(com)) {
		        System.out.println(
		            "I am supposed to use .compareTo and .equals right now but since I have consistently been using");
		        System.out.println(".equals, I will just be showing .compareTo");
		        System.out.println("I am going to make a string and assign it \"apple\".");
		        String comp1 = "apple";
		        System.out.println("I am going to make another string and assign it \"orange\".");
		        String comp2 = "orange";
		        System.out.println(
		            "Now I will use the .compareTo method to see how far the first letters of each word are from each other.");
		        int comp3 = comp1.compareTo(comp2);
		        System.out.println(
		            "Since apple is first in alphabetical order, a " + comp3 + " has been displayed");
		        System.out
		            .println("to tell us that the letter \"o\" is 14 letters down from the letter \"a\".");
		        System.out.println(
		            "The \"==\" doesn't work with objects because of how objects are stored but it works fine with integers and booleans.");
		        System.out
		            .println("Also, \"==\" means that it compares the memory locations of the objects.");
		        badInput = false;
		      } else {
		        System.out.println("You must have typed something wrong. Please try again.");
		        comInput = in.nextLine();
		      }
		    }

	}

}
