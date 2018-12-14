import java.util.Scanner;

/**
 * This class goes over how method overloading works to our advantage.
 * It also shows you how to do it in an example.
 * @author Colby Nicoletti
 *
 */
public class OverloadingMethods {
	
	public void overloader(char c) {
		System.out.println(c);
	}
	
	public void overloader(char c, int number) {
		System.out.println(c + " " + number);
	}
	
	static OverloadingMethods method = new OverloadingMethods();
	
	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Overload\" for an example of overloading a method.");
		String overInput = in.nextLine();
		String over = "Overload";
		while(badInput) {
			if(overInput.equals(over)) {
				System.out.println("Overloading is kind of the same thing as a constructor in a sense.");
				System.out.println("When you overload a method you declare the same method name but just change the parameters.");
				System.out.println("At the top of the code, we have 2 methods named \"overloader\".");
				System.out.println("These methods have different parameters.");
				System.out.println("One of them has a char as a data type and the other has a char and an int.");
				System.out.println("When this line of code (method.overloader('a');) is run, the program will know to use the method with only char as the data type.");
				System.out.println("When the same line of code is run with ('a' , 30) in the parameters the program will know to use the other method.");
				System.out.println("Here I will show you now, we are going to run the line of code listed 2 lines above.");
				method.overloader('a');
				System.out.println("When we put the '30' in the parameter as well, look and see what happens in the line below.");
				method.overloader('a',30);
				System.out.println("Both a and 30 were outputted in the console because we have a method to do so for us.");
				badInput = false;
			}else {
				 System.out.println("You must have typed something wrong. Please try again.");
				 overInput = in.nextLine();
			}
		}

	}

}
