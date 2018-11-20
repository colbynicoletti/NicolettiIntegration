import java.util.Scanner;

public class PolymorphismExample {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Polymorphism\" for an example of it.");
		String polyInput = in.nextLine();
		String poly = "Polymorphism";
		while(badInput) {
			if(polyInput.equals(poly)) {
				
				badInput = false;
			}else {
				 System.out.println("You must have typed something wrong. Please try again.");
				 polyInput = in.nextLine();
			}
		}
	}

}
