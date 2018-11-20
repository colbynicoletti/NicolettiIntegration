import java.util.Scanner;

public class SetterAndGetter {
	private static String color;
	private static String name;
	
	public SetterAndGetter() {
		name = "jbfjfnd";
	}
	
	public SetterAndGetter(String name, String color) {
		
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
