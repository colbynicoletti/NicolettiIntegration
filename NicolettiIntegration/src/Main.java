import java.util.Scanner;
import java.util.Random;

//Colby Nicoletti
//A program that outputs the requirements for the Integration Project,
//making it easier to grade.
//Use Menu Code from Module 6 under Supplemental Resources "Logic Ch. 11 Menu"
 
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
	        			 System.out.println("The Boolean was made to test whether true or false was entered into the program.");
	        			badInput = false;
	        		} else if (bird == false) {
	        			System.out.println("You're wrong! Fish can definitely swim!");
	        			 System.out.println("The Boolean was made to test whether true or false was entered into the program.");
	        			badInput = false;
	        		}
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		booleenInput = in.nextLine();
	        	}
	        			
	        }
	        //System.out.println("Here");
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
	        		 System.out.println("This was an example of storing two integers of which numbers you decided");
	     	        System.out.println("and then they were added together and the total was outputted.");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		integerInput = in.nextLine();
	        	}
	        }
	     
	        badInput = true;
	        System.out.println("Type \"Double\" for an example.");
	        String doubInput = in.nextLine() + in.nextLine();
	        //System.out.println(doubInput);
	        String doub = "Double";
	        while (badInput) {
	        	if (doubInput.equals(doub)) {
	        		System.out.println("Type a decimal number:");
	        		double num3 = in.nextDouble();
	        		System.out.println("Type another decimal number:");
	        		double num4 = in.nextDouble();
	        		double total2 = num3 / num4;
	        		System.out.println("The first number divided by the second number is " + total2 + ".");
	        		System.out.println("This was an example of doubles and that when both numbers of a calculation are doubles,");
	        		System.out.println("the result will be a double as well and Java won't truncate your result.");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		doubInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"String\" for an example.");
	        String strInput = in.nextLine() + in.nextLine();
	        String str = "String";
	        while (badInput) {
	        	if (strInput.equals(str)) {
	        		System.out.println("We have been using Strings to make sure that you are typing the correct thing");
	        		System.out.println("before more information comes out at you.");
	        		System.out.println("I don't think an example is necessary.");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		strInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"Variable and Scope\" for definitions.");
	        String varInput = in.nextLine();
	        String var = "Variable and Scope";
	        while (badInput) {
	        	if (varInput.equals(var)) {
	        		System.out.println("Variable-A place holder for a data type, to make it easier to be called upon.");
	        		System.out.println("Scope-Means that the variables are only accessible in the method where they're declared.");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		varInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"Final\" for a definition ans example.");
	        String finInput = in.nextLine();
	        String fin = "Final";
	        while (badInput) {
	        	if (finInput.equals(fin)) {
	        		final int NUM5 = 5;
	        		System.out.println("I have given the variable \"NUM5\" a value of " + NUM5);
	        		System.out.println("Since \"NUM5\" is a final, I won't be able to change it no matter what.");
	        		System.out.println("If I were to try to change the value of \"NUM5\" I would get an error.");
	        		System.out.println("Final-A keyword that makes whatever you assign it to unchangeable, unless you change it directly in the code.");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		finInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"String\" for an example of 3 different methods within the string class.");
	        strInput = in.nextLine();
	        str = "String";
	        while (badInput) {
	        	if (strInput.equals(str)) {
	        		System.out.println("Method One:");
	        		System.out.println(".equals-This method is one that has been allowing me to make sure you have been typing the correct words in this program,");
	        		System.out.println("No example needed.");
	        		System.out.println("Method Two:");
	        		System.out.println(".length- gives you the length of a string in how many characters it has.");
	        		System.out.println("Type a word:");
	        		String word1 = in.nextLine();
	        		System.out.println("Your word is " + word1.length() + " characters long.");
	        		System.out.println("Method Three:");
	        		System.out.println(".substring-Allows you to cut a string at a specific index of the string.");
	        		System.out.println("Type a word that is at least 5 letters long:");
	        		word1 = in.nextLine();
	        		System.out.println("I decided to cut your word after the 4th letter:");
	        		System.out.println(word1.substring(0,4));
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		strInput = in.nextLine();
	        	}
	        	
	        }
	        
	        badInput = true; 
	        System.out.println("Type \"Escape\" for an example of escape sequences in strings.");
	        String escapeInput= in.nextLine();
	        String escape = "Escape";
	        while (badInput) {
	        	if (escapeInput.equals(escape)) {
	        		System.out.println("Escape sequences are used to do things inside of a string such as:");
	        		System.out.println("making a new line, putting double quotes inside of double quotes, inserting a tab, etc.");
	        		System.out.println("I use an escape sequence everytime I check for the spelling in a word for this program.");
	        		System.out.println("I don't think an example is necessary.");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		escapeInput = in.nextLine();
	        	}
	        } 
	        
	        badInput = true;
	        System.out.println("Type \"Casting\" for an example of casting.");
	        String castInput = in.nextLine();
	        String cast = "Casting";
	        while (badInput) {
	        	if (castInput.equals(cast)) {
	        		System.out.println("Casting-taking an object of a particular data type and temporarily changing it to another data type.");
	        		System.out.println("\"num7\" has been casted into 4.0 as a Double from 4 when it was an Integer.");
	        		int num6 = 4;
	        		Double num7 = (double) num6;
	        		System.out.println(num7);
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		castInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"Method\" for an example of a method.");
	        String methodInput = in.nextLine();
	        String method = "Method";
	        while(badInput) {
	        	if (methodInput.equals(method)) {
	        		System.out.println("The code below is an example of calling a method:");
	        		System.out.println("JavaSubstring.substr();");
	        		System.out.println("Below this line is the start of the method called.");
	        		JavaSubstring.substr();
	        		System.out.println("The method call is \"JavaSubstring.substr();\".");
	        		System.out.println("The method arguements would normally go inside of the parentheses of the method call.");
	        		System.out.println("For this example, we don't have any arguements.");
	        		System.out.println("The method header would look like:");
	        		System.out.println("\"public class JavaSubstring{}\"");
	        		System.out.println("The method parameters would be on this line in the parentheses but for this example we don't have any specific parameters.");
	        		System.out.println("\"public static void substr(The parameters go inside here!)\"");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		methodInput = in.nextLine();
	        	}
	        }
	        
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
	        
	        
	        
	        in.close(); 
		}   
	}
		
