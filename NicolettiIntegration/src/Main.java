import java.util.Scanner;

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
	        
	        badInput = true; 
	        System.out.println("Type \"If\" for an example of an If and an If-Else statement.");
	        String iffInput = in.nextLine();
	        String iff = "If";
	        while (badInput) {
	        	if (iffInput.equals(iff)) {
	        		System.out.println("Scrolling through the code of my program, I already have enough If and If-Else statement.");
	        		System.out.println("I wont be showing one as an example.");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		iffInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"Ternary\" for an example of a ternary construct.");
	        String ternInput = in.nextLine();
	        String tern = "Ternary";
	        while (badInput) {
	        	if (ternInput.equals((tern))) {
	        		System.out.println("Type a whole number:");
	        		int a = in.nextInt();
	        		System.out.println("Type another whole number:");
	        		int b = in.nextInt();
	        		int minValue = (a < b) ? a : b;
	        		System.out.println("Out of the 2 numbers you picked, I am able to tell you that the smaller number is " + minValue);
	        		badInput = false; 
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		ternInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true; 
	        System.out.println("Type \"Switch\" for an example of a switch statement.");
	        String switInput = in.nextLine() + in.nextLine();
	        String swit = "Switch";
	        while (badInput) {
	        	if (switInput.equals(swit)) {
	        		System.out.println("Type a whole number between 1 and 7.");
	        		int day = in.nextInt();
	                String dayString;
	                switch (day) {
	                    case 1:  dayString = "Sunday";
	                             break;
	                    case 2:  dayString = "Monday";
	                             break;
	                    case 3:  dayString = "Tuesday";
	                             break;
	                    case 4:  dayString = "Wednesday";
	                             break;
	                    case 5:  dayString = "Thursday";
	                             break;
	                    case 6:  dayString = "Friday";
	                             break;
	                    case 7:  dayString = "Saturday";
	                             break;
	                	default: dayString = "Invalid day";
	                             break;
	                }
	                System.out.println("What number you pick corresponds to what day gets printed. I used a switch statement for this.");
	                System.out.println("The number you picked was " + day + " and the day that corrensponds is " + dayString);
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		switInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"Compare\" for an example of a.compareTo statement and comment about what \"==\" does with objects.");
	        String comInput = in.nextLine() + in.nextLine();
	        String com = "Compare";
	        while (badInput) {
	        	if (comInput.equals(com)) {
	        		System.out.println("I am supposed to use .compareTo and .equals right now but since I have consistently been using");
	        		System.out.println(".equals, I will just be showing .compareTo");
	        		System.out.println("I am going to make a string and assign it \"apple\".");
	        		String comp1 = "apple";
	        		System.out.println("I am going to make another string and assign it \"orange\".");
	        		String comp2 = "orange";
	        		System.out.println("Now I will use the .compareTo method to see how far the first letters of each word are from each other.");
	        		int comp3 = comp1.compareTo(comp2);
	        		System.out.println("Since apple is first in alphabetical order, a " + comp3 + " has been displayed");
	        		System.out.println("to tell us that the letter \"o\" is 14 letters down from the letter \"a\".");
	        		System.out.println("The == doesn't work with Strings because of how strings are stored but it works fine with integers and booleans.");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		comInput = in.nextLine();
	        	} 
	        }
	        
	        badInput = true;
	        System.out.println("Type \"Calculator\" for an example of basic mathematical functions.");
	        String calcInput = in.nextLine();
	        String calc = "Calculator";
	        while (badInput) {
	        	if (calcInput.equals(calc)) {
	        		System.out.println("We are going to first be looking at \"+\".");
	        		System.out.println("Enter a whole number:");
	        		int add1 = in.nextInt();
	        		System.out.println("Enter another whole number:");
	        		int add2 = in.nextInt();
	        		int add3 = add1 + add2; 
	        		System.out.println("The first number \"+\" the second number is " + add3);
	        		System.out.println("Be careful though because if you use \"+\" with strings, it will concatenate.");
	        		System.out.println("Next, we are going to be looking at \"-\".");
	        		System.out.println("I am just going to take the numbers you gave before and subtract them.");
	        		int sub = add1 - add2;
	        		System.out.println("The first number \"-\" the second number is " + sub);
	        		System.out.println("Next, we are going to be looking at \"*\".");
	        		System.out.println("I am just going to take the numbers you gave before and multiply them.");
	        		int mult = add1 * add2;
	        		System.out.println("The first number \"*\" the second number is " + mult);
	        		System.out.println("Next, we are going to be looking at \"/\".");
	        		System.out.println("I am just going to take the numbers you gave before and divide them.");
	        		int div = add1 / add2; 
	        		System.out.println("The first number \"/\" the second number is " + div);
	        		System.out.println("Keep in mind for the previous example I used int to store the numbers so there is no decimal,");
	        		System.out.println("Java just truncates it on us.");
	        		System.out.println("Lastly, we are going to be looking at \"%\".");
	        		System.out.println("I will make the numbers myself for this one. First number = 9, Second number = 4.");
	        		System.out.println("This function will allow you to find the remainder of numbers, great for seeing if a number is even or odd.");
	        		int mod1 = 9;
	        		int mod2 = 4;
	        		int mod3 = mod1 % mod2;
	        		System.out.println("Since 9/4 is in between 2 and 3, there is a decimal remainder.");
	        		System.out.println("The whole number answer to 9/4 = 2. The answer to 9 % 4 is 1 because 1 is the remainder.");
	        		System.out.println("I will display the answer the program gave me here: " + mod3);
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		calcInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"++\" for an example of that function along with \"--\".");
	        String plusInput = in.nextLine() + in.nextLine();
	        String plus = "++";
	        while(badInput) {
	        	if (plusInput.equals(plus)) {
	        		System.out.println("The \"++\" is used to increment a value by one and the \"--\" is used to make a value decrease by one.");
	        		System.out.println("We are going to use \"++\" first.");
	        		System.out.println("Enter a whole number:");
	        		int number1 = in.nextInt();
	        		System.out.println("Here we are going to display the number you entered + 1:");
	        		System.out.println(++number1);
	        		System.out.println("We are going to use \"--\" next.");
	        		System.out.println("Enter a whole number:");
	        		number1 = in.nextInt();
	        		System.out.println("Here we are going to display the number you entered - 1:");
	        		System.out.println(--number1);
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		plusInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"Relational\" for an example of Relational Operators.");
	        String relInput = in.nextLine() + in.nextLine();
	        String rel = "Relational";
	        while (badInput) {
	        	if (relInput.equals(rel)) {
	        		System.out.println("Relational Operators include \"<, >, <=, >=, ==, and !=\".");
	        		System.out.println("Since I have used some of these in previous parts of my program, I will not be showing an example.");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		relInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"+=\" for an example of \"+=\".");
	        String pluseqInput = in.nextLine();
	        String pluseq = "+=";
	        while (badInput) {
	        	if (pluseqInput.equals(pluseq)) {
	        		System.out.println("The \"+=\" function is used to increment whatever variable is before it by whatever number is after it.");
	        		System.out.println("You'll see what I'm talking about now.");
	        		System.out.println("Enter a whole number:");
	        		int number2 = in.nextInt();
	        		System.out.println("You entered " + number2 + ", I decided to increment it by 5, the next output will be " + number2 + " plus 5.");
	        		number2 += 5;
	        		System.out.println("Your new number is " + number2);
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		pluseqInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Type \"Conditional\" for an example of a Conditional Operator.");
	        String conInput = in.nextLine() + in.nextLine();
	        String con = "Conditional";
	        while (badInput) {
	        	if (conInput.equals(con)) {
	        		System.out.println("The two main conditional operators are \"&&\" which means \"and\" and");
	        		System.out.println("\"||\" which means \"or\".");
	        		System.out.println("They are useful in If statements.");
	        		System.out.println("For example, I have made two variables called cond1 and cond2.");
	        		System.out.println("I am going to assign cond1 = 3 and cond2 = 6.");
	        		int cond1 = 3;
	        		int cond2 = 6;
	        		System.out.println("Now, I am going to declare a boolean called \"bool\".");
	        		System.out.println("It will look like this:");
	        		System.out.println("boolean bool;");
	        		boolean bool;
	        		System.out.println("I will now add the other part of the expression now to declare something to it.");
	        		System.out.println("That will look that this:");
	        		System.out.println("bool = cond1 == 2 && cond2 == 6;");
	        		bool = cond1 == 2 && cond2 == 6;
	        		System.out.println("Since we made cond1 == 2, the program will display false because both expressions need to be true");
	        		System.out.println("in order to make the program display true.");
	        		System.out.println("Here is the actual output of the program: " + bool);
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		conInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true; 
	        System.out.println("Type \"Operator\" for the definition of an Operator Precedence.");
	        String opInput = in.nextLine();
	        String op = "Operator";
	        while (badInput) {
	        	if (opInput.equals(op)) {
	        		System.out.println("Operator Precedence-just a fancy way to say \"PEMDAS\".");
	        		badInput = false;
	        	} else {
	        		System.out.println("You must have typed something wrong. Please try again.");
	        		opInput = in.nextLine();
	        	}
	        }
	        
	        badInput = true;
	        System.out.println("Thank you for going through my walkthrough! I hope you enjoyed!");
	        System.out.println("More coming soon!");
	        in.close(); 
	        }  
		}
		
