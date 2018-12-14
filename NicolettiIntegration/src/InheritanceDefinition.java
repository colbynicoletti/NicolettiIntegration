import java.util.Scanner;

/**This class describes inheritance and its benefits.
 * @author Colby Nicoletti
 *
 */
public class InheritanceDefinition {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Inheritance\" for a definition and benefits of it.");
		String inherInput = in.nextLine();
		String inher = "Inheritance";
		while(badInput) {
			if(inherInput.equals(inher)) {
				System.out.println("Inheritance is when a new class is derived from an already existing class.");
				System.out.println("Benefits include:");
				System.out.println("1) Not having to rewrite duplicate code.");
				System.out.println("2) Able to reuse it for multiple subclasses.");
				System.out.println("3) Helps keep some data private so the subclasses can not access/touch it.");
				badInput = false;
			}else {
				 System.out.println("You must have typed something wrong. Please try again.");
				 inherInput = in.nextLine();
			}
		}

	}

}
