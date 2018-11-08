import java.util.Scanner;

// Colby Nicoletti
// A program that outputs the requirements for the Integration Project,
// making it easier to grade.
// Use Menu Code from Module 6 under Supplemental Resources "Logic Ch. 11 Menu"

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean badInput = true;
    
    Introduction.main();
    
    DataTypes.main(in, badInput);
    
    Boolean.main(in, badInput);
    
    Integer.main(in, badInput);

    DoubleMethod.main(in, badInput);
    
    StringMethod.main(in, badInput);
    
    VarAndScope.main(in, badInput);

    FinalMethod.main(in, badInput);
    
    StringUses.main(in, badInput);
    
    EscapeSequences.main(in, badInput);

    CastingExample.main(in, badInput);

    MethodExample.main(in, badInput);
    
    RandomExample.main(in, badInput);
    
    IfStatementExample.main(in, badInput);
    
    TernaryConstructExample.main(in, badInput);
    
    SwitchExample.main(in, badInput);

    badInput = true;
    System.out.println(
        "Type \"Compare\" for an example of a.compareTo statement and comment about what \"==\" does with objects.");
    String comInput = in.nextLine() + in.nextLine();
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

    badInput = true;
    System.out.println("Type \"++\" for an example of that function along with \"--\".");
    String plusInput = in.nextLine() + in.nextLine();
    String plus = "++";
    while (badInput) {
      if (plusInput.equals(plus)) {
        System.out.println(
            "The \"++\" is used to increment a value by one and the \"--\" is used to make a value decrease by one.");
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
        System.out.println(
            "Since I have used some of these in previous parts of my program, I will not be showing an example.");
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
        System.out.println(
            "The \"+=\" function is used to increment whatever variable is before it by whatever number is after it.");
        System.out.println("You'll see what I'm talking about now.");
        System.out.println("Enter a whole number:");
        int number2 = in.nextInt();
        System.out.println("You entered " + number2
            + ", I decided to increment it by 5, the next output will be " + number2 + " plus 5.");
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
        System.out.println(
            "I will now add the other part of the expression now to declare something to it.");
        System.out.println("That will look that this:");
        System.out.println("bool = cond1 == 2 && cond2 == 6;");
        bool = cond1 == 2 && cond2 == 6;
        System.out.println(
            "Since we made cond1 == 2, the program will display false because both expressions need to be true");
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
