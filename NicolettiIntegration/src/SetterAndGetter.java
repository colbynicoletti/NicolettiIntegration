import java.util.Scanner;

public class SetterAndGetter {
	private static String color;
	private static String name;
	
	public SetterAndGetter() {
		name = "Jack";
		color = "Blue";
	}
	
	public SetterAndGetter(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Setter\" for an example of setters and getters.");
		String setterInput = in.nextLine();
		String setter = "Setter";
		while (badInput) {
			if (setterInput.equals(setter)) {
				System.out.println("Here I will be showing an example of a setter and getter.");
				System.out.println("Setters and Getters are important for setting and getting variables easier and more efficiently.");
				System.out.println("What is your favorite color? Type it below:");
				setColor(in);
				System.out.println("Now that your favorite color is set, we will call to get it now.");
				System.out.println("Your favorite color is " + getColor());
				System.out.println("Just for more examples, we will do another setter and getter.");
				System.out.println("What is your name? Type it below:");
				setName(in);
				System.out.println("Your name is " + getName());
				badInput = false;
			}else{
				 System.out.println("You must have typed something wrong. Please try again.");
				 setterInput = in.nextLine();
			}
		}
		badInput = true;
		System.out.println("We will now use a constructor to set the fields inside our class.");
		System.out.println("Type \"Constructor\" for an example of a constructor.");
		String constructInput = in.nextLine();
		String construct = "Constructor";
		while(badInput) {
			if(constructInput.equals(construct)) {
			System.out.println("We can use the default constructor to set default values for our fields.");
			System.out.println("Or, we could also pass in our values in the parenthesis in the other constructor.");
			System.out.println("This allows for user input but if nothing is entered, the default constructor sets values automatically.");
			System.out.println("Let's go ahead and use the default constructor.");
			SetterAndGetter set1 = new SetterAndGetter();
			System.out.println("The default constructor reads as: " + name + " " + color);
			System.out.println("We will now pass in our own values for the other constructor.");
			System.out.println("Enter a name:");
			String name = in.nextLine();
			System.out.println("Enter a color:");
			String color = in.nextLine();
			System.out.println("We will now display the other constructor.");
			SetterAndGetter set2 = new SetterAndGetter(name, color);
			System.out.println("The name you chose was " + name + " and the color you chose was " + color);
			badInput = false;
		}else {
			System.out.println("You must have typed something wrong. Please try again.");
			constructInput = in.nextLine();
		}
			
		}
	}
	public static void setColor(Scanner in) {    
			color = in.nextLine();
		} 
	
	public static String getColor() {
		return color;
	}
	
	public static void setName(Scanner in) {
		name = in.nextLine();
	}
	
	public static String getName() {
		return name;
	}

}
