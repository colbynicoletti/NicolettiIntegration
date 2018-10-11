import java.util.Scanner;

//Colby Nicoletti
//A program that outputs the requirements for the Integration Project,
//making it easier to grade.
//Use Menu Code from Module 6 under Supplemental Resources "Logic Ch. 11 Menu"
/*
 * Data Types:
 * int - is a data type that represents numbers that wont be fractional.
 * double - is a data type that represents numbers that will have fractions/decimals.
 * string - is a data type that represents words that form a sentence or sometimes, don't. 
 * char - is a data type that represents one character or letter.
 * boolean - is a data type that represents a "true or false" statement.  
 * float - is a data type that represents a very large number in something like scientific notation. 
 * Any more data types that I'm missing that NEED to be on here?
 * 
 * 
 * Variable - a place holder for a data type, to make it easier to be called upon.
 * Scope - means that the variables are only accessible in the method where they're declared.
 */
public class Main {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Welcome to my Integration Project!");
	        System.out.println("Here I am going to show you everything I learned \n in my time in the Introduction to Programming Course.");
	        System.out.println("Type \"Data Types\" to show the built in data types in the Java language.");
	        String dataTypeInput = in.nextLine();
	        String dataType = "Data Types";
	        //System.out.println(dataTypeInput);
	        boolean badInput = true;
	        while (badInput) {
	        if (dataTypeInput.equals(dataType)) {
	          System.out.println("Byte-");
	          System.out.println("Short-");
	          System.out.println("Int-");
	          System.out.println("Long-");
	          System.out.println("Char-");
	          System.out.println("Float-");
	          System.out.println("Double-");
	          System.out.println("Boolean-");
	          badInput = false;
	        } else {
	          System.out.println("You must have typed something wrong. Please try again.");
	          dataTypeInput = in.nextLine(); 
	        }
	        }
	        
	        
	        in.close();
	}
}
