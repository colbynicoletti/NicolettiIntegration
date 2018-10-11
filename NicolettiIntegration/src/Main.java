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
	        System.out.println("Here I am going to show you everything I learned \nin my time in the Introduction to Programming Course.");
	        System.out.println("Type \"Data Types\" to show the built in data types in the Java language.");
	        String dataTypeInput = in.nextLine();
	        String dataType = "Data Types";
	        //System.out.println(dataTypeInput);
	        boolean badInput = true;
	        while (badInput) {
	        if (dataTypeInput.equals(dataType)) {
	          System.out.println("Byte-A number that can only be represented if it is 8 digits long or less, cannot be fractional.");
	          System.out.println("Short-A number that can only be represented if it is 16 digits long or less, cannot be fractional.");
	          System.out.println("Int-A number that can only be represented if it is 32 digits long or less, cannot be fractional. \nThis data type is the most used for representing numbers in Java.");
	          System.out.println("Long-A number that can only be represented if it is 64 digits long or less, cannot be fractional.");
	          System.out.println("Char-Represents a single letter.");
	          System.out.println("Float-Should be used when trying to store a number in scientific notation. It saves memory.");
	          System.out.println("Double-A number that can be used to represent a fraction/decimal. Can be nonfractional as well, it just wastes memory.");
	          System.out.println("Boolean-Only two possible values: True and False.");
	          badInput = false;
	        } else {
	          System.out.println("You must have typed something wrong. Please try again.");
	          dataTypeInput = in.nextLine(); 
	        }
	        }
	        badInput = true;
	        System.out.println("Type \"Boolean\" for an example.");
	        String booleenInput = in.nextLine();
	        String booleen = "Boolean";
	        //System.out.println(booleenInput);
	        while (badInput) {
	        	if (booleenInput.equals(booleen)) {
	        		System.out.println("True or False: Fish can swim. \nPlease Enter \"true\" or \"false\".");
	        		boolean bird = in.nextBoolean();
	        		if (bird == true) {
	        			System.out.println("You're Correct!");
	        			badInput = false;
	        		} else if (bird == false) {
	        			System.out.println("You're wrong! Fish can definitely swim!");
	        			badInput = false;
	        		}
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		booleenInput = in.nextLine();
	        	}
	        			
	        }
	        //System.out.println("Here");
	        System.out.println("The Boolean was made to test whether true or false was entered into the program.");
	        badInput = true;
	        System.out.println("Type \"Integer\" for an example.");
	        String integerInput = in.nextLine() + in.nextLine();
	        //System.out.println(integerInput);
	        String integer = "Integer";
	        while (badInput) {
	        	if (integerInput.equals(integer)) {
	        		System.out.println("Type a whole number:");
	        		int num1 = in.nextInt();
	        		System.out.println("Type another whole number:");
	        		int num2 = in.nextInt();
	        		int total = num1 + num2;
	        		System.out.println("The total is " + total + ".");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		integerInput = in.nextLine();
	        	}
	        }
	        System.out.println("This was an example of storing two integers of which numbers you decided");
	        System.out.println("and then they were added together and the total was outputted.");
	        badInput = true;
	        System.out.println("Type \"Double\" for an example.");
	        String doubInput = in.nextLine() + in.nextLine();
	        //System.out.println(doubInput);
	        String doub = "Double";
	        while (badInput) {
	        	if (doubInput.equals(doub)) {
	        		System.out.println("Hello");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		doubInput = in.nextLine();
	        	}
	        }
	        
	        
	        in.close(); 
		}   
	}
		
