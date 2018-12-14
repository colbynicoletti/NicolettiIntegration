import java.util.Scanner;

/**
 * This class goes over a one dimensional array.
 * It shows the user how to iterate through a loop and other benefits of arrays.
 * @author Colby Nicoletti
 *
 */
public class ArrayExamples {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Array\" for examples of an Array.");
		String arrayIn = in.nextLine();
		String arrayy = "Array";
		while(badInput) {
			if(arrayIn.equals(arrayy)) {
				System.out.println("We are going to declare a one-dimensional array.");
				int array1[] = {1,2,3,4,5,6,7,8,9,10};
				System.out.println("Our array has the integers from 1-10 stored in it.");
				System.out.println("We are now going to find the smallest value in that array.");
				int small = array1[0];
				for (int i = 0; i<array1.length; i++) {
					if (array1[i] < small) {
						small = array1[i];
					}
				}
				System.out.println("The smallest number in the array is " + small + ".");
				System.out.println("Next, we are going to get the sum of all of the values in the same array.");
				int sum = 0;
				for (int i = 0; i<array1.length;i++) {
					sum += array1[i];
				}
				System.out.println("The sum of the array is " + sum + ".");
				System.out.println("Finally, we are going to find the index value for a number in our array.");
				System.out.println("Pick a number from 1-10.");
				int pick = in.nextInt();
				for (int i = 0; i<array1.length; i++) {
					if(pick == array1[i]) {
						System.out.println("The index number of " + pick + " is " + (array1[i]-1) + ".");
					}
				}
				badInput = false;
			}else {
				 System.out.println("You must have typed something wrong. Please try again.");
				 arrayIn = in.nextLine();
			}
		}
	}

}
