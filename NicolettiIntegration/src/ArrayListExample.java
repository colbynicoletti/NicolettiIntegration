import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class goes over the differences between an array list and a normal array.
 * It shows users that you can add and remove elements from an array list.
 * While using a normal array, you can't change the size of it.
 * @author Colby Nicoletti
 *
 */
public class ArrayListExample {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Array List\" for an example of an array list.");
		String arrayListIn = in.nextLine();
		String arrayList = "Array List";
		while(badInput) {
			if(arrayListIn.equals(arrayList)) {
				System.out.println("We will make an array list called \"names\", they allow us to add and remove things in it in a simple way.");
				ArrayList<String> names = new ArrayList<String>();
				System.out.println("Now, you need to add names into the Array List. Please type a name below:");
				names.add(in.nextLine());
				System.out.println("Let's do just one more, type it below:");
				names.add(in.nextLine());
				System.out.println("The names you typed into to the Array List are: " + names.get(0) + " & " + names.get(1) + ".");
				System.out.println("Now, we are going to remove the first name with \"names.remove(0);\".");
				names.remove(0);
				System.out.println("If we print the Array List one more time, you will see that your first name you entered is no longer there.");
				System.out.println(names.get(0));
				badInput = false;
			}else {
				System.out.println("You must have typed something wrong. Please try again.");
				arrayListIn = in.nextLine();
			}
		}
		
	}

}
