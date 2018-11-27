import java.util.Scanner;

public class PolymorphismExample {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Polymorphism\" for an example of it.");
		String polyInput = in.nextLine();
		String poly = "Polymorphism";
		while(badInput) {
			if(polyInput.equals(poly)) {
				System.out.println("I have made 2 classes, a parent class and a child class.");
				System.out.println("The parent class is called \"Animal\".");
				System.out.println("The child class is called \"Cat\".");
				System.out.println("When I call this \"Animal.noise()\" the output is:");
				Animal.noise();
				System.out.println("Next, when I call the child class \"Cat.noise()\" the output is:");
				Cat.noise();
				badInput = false;
			}else {
				 System.out.println("You must have typed something wrong. Please try again.");
				 polyInput = in.nextLine();
			}
		}
	}

}

	class Animal {
		public static void noise() {
			System.out.println("An animal is making a noise in the distance.");
		}
}
	
	class Cat extends Animal{
		public static void noise() {
			System.out.println("Meow.");
		}
	}