import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Two Dimensional\" for an example of a two dimensional array.");
		String dimenIn = in.nextLine();
		String dimen = "Two Dimensional";
		while(badInput) {
			if(dimenIn.equals(dimen)) {
				System.out.println("We are going to declare a two dimensional array that has 3 rows and 2 columns.");
				int dimension[][] = {{1,2},{3,4},{5,6}};
				System.out.println("We are going to print the values at each index in this array.");
				System.out.println("First Row, First Column: " + dimension[0][0]);
				System.out.println("First Row, Second Column: " + dimension[0][1]);
				System.out.println("Second Row, First Column: " + dimension[1][0]);
				System.out.println("Second Row, Second Column: " + dimension[1][1]);
				System.out.println("Thrid Row, First Column: " + dimension[2][0]);
				System.out.println("Third Row, Second Column: " + dimension[2][1]);
				badInput = false;
			}else {
				System.out.println("You must have typed something wrong. Please try again.");
				dimenIn = in.nextLine();
			}
		}
	}

}
