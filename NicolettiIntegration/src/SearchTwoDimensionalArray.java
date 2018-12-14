import java.util.Scanner;

/**
 * This class was supposed to go over finding the coordinates for a number in a two dimensional array.
 * I couldn't figure it out so it's unfinished.
 * @author Colby Nicoletti
 *
 */
public class SearchTwoDimensionalArray {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Search\" for an example of searching through a 2 dimensional array.");
		String searchIn = in.nextLine();
		String search = "Search";
		while(badInput) {
			if(searchIn.equals(search)) {
				System.out.println("We are going to create a 3x3 two-dimensional array.");
				int search1[][] = {{1,2,3},{4,5,6},{7,8,9}};
				System.out.println("The array starts with 1 and ends with 9, it looks like a keypad on a phone.");
				System.out.println("We are now going to search for a few numbers and print the coordinates.");
				System.out.println("Type a number 1-9 to find the coordinates of it.");
				int num = in.nextInt();
				for(int i = 0; i < search1[0].length; i++) {
					if(num == search1[0][0]) {
						System.out.println(i);
						
					}
				}
				badInput = false;
			}else{
				System.out.println("You must have typed something wrong. Please try again.");
				searchIn = in.nextLine();
			}
		}

	}

}
