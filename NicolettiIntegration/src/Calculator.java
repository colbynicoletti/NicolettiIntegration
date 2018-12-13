import java.util.Scanner;

public class Calculator {

	public static void main(Scanner in, boolean badInput) {
		 badInput = true;
		    System.out.println("Type \"Calculator\" for an example of basic mathematical functions.");
		    String calcInput = in.nextLine();
		    String calc = "Calculator";
		    while (badInput) {
		    int add1 = 0;
		    int add2 = 0;
		      if (calcInput.equals(calc)) {
		        System.out.println("We are going to first be looking at \"+\".");
		        System.out.println("Enter a whole number:");
		        try {
		        add1 = in.nextInt();
		        }catch(Exception e) {
		        	System.out.println("Please use an integer.");
		        	in.nextLine();
		        	add1 = in.nextInt();
		        }
		        System.out.println("Enter another whole number:");
		        try {
		        add2 = in.nextInt();
		        }catch(Exception e) {
		        	System.out.println("Please use an integer.");
		        	in.nextLine();
		        	add2 = in.nextInt();
		        }
		        int add3 = add1 + add2;
		        System.out.println("The first number \"+\" the second number is " + add3);
		        System.out.println(
		            "Be careful though because if you use \"+\" with strings, it will concatenate.");
		        System.out.println("Next, we are going to be looking at \"-\".");
		        System.out
		            .println("I am just going to take the numbers you gave before and subtract them.");
		        int sub = add1 - add2;
		        System.out.println("The first number \"-\" the second number is " + sub);
		        System.out.println("Next, we are going to be looking at \"*\".");
		        System.out
		            .println("I am just going to take the numbers you gave before and multiply them.");
		        int mult = add1 * add2;
		        System.out.println("The first number \"*\" the second number is " + mult);
		        System.out.println("Next, we are going to be looking at \"/\".");
		        System.out.println("I am just going to take the numbers you gave before and divide them.");
		        int div = add1 / add2;
		        System.out.println("The first number \"/\" the second number is " + div);
		        System.out.println(
		            "Keep in mind for the previous example I used int to store the numbers so there is no decimal,");
		        System.out.println("Java just truncates it on us.");
		        System.out.println("Lastly, we are going to be looking at \"%\".");
		        System.out.println(
		            "I will make the numbers myself for this one. First number = 9, Second number = 4.");
		        System.out.println(
		            "This function will allow you to find the remainder of numbers, great for seeing if a number is even or odd.");
		        int mod1 = 9;
		        int mod2 = 4;
		        int mod3 = mod1 % mod2;
		        System.out.println("Since 9/4 is in between 2 and 3, there is a decimal remainder.");
		        System.out.println(
		            "The whole number answer to 9/4 = 2. The answer to 9 % 4 is 1 because 1 is the remainder.");
		        System.out.println("I will display the answer the program gave me here: " + mod3);
		        badInput = false;
		      } else {
		        System.out.println("You must have typed something wrong. Please try again.");
		        calcInput = in.nextLine();
		      }
		    }

	}

}
