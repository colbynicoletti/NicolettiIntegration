import java.util.Scanner;

public class BreakAndContinue {

	public static void main(Scanner in, boolean badInput) {
			badInput = true;
			System.out.println("Type \"Break\" for an example of a Break statement.");
			String breakInput = in.nextLine();
			String breakk = "Break";
			int breakIn = 0;
			while (badInput) {
				if(breakInput.equals(breakk)) {
					System.out.println("Break is used to get yourself out of a loop so you don't need to wait for the loop to end.");
					System.out.println("We are going to start our loop at 1.");
					System.out.println("We are going to make our loop count to 10.");
					System.out.println("You're going to decide when the loop breaks.");
					System.out.println("Choose an integer between 1 and 10:");
					breakIn = in.nextInt();
					if(breakIn <= 10 && breakIn >= 1) {
					for (int i = 1; i <= 10; i++) {
						if(i == breakIn) {
							 break;
						}
						System.out.println(i);
					}
					}else {
						System.out.println("Wrong input, type an integer between 1 and 10.");
						breakIn = in.nextInt();
					}
					System.out.println("As you can see, the last digit that was displayed was " + (breakIn-1));
					System.out.println("This is because you typed " + breakIn + " for a break value.");
					badInput = false;
				} else {
					System.out.println("You must have typed something wrong. Please try again.");
					breakInput = in.nextLine();
				}	
				
	}
			badInput = true;
			System.out.println("Now, let's look at an example of a continue statement.");
			System.out.println("Type \"Continue\" to see an example of a Continue statement.");
			String conInput = in.nextLine() + in.nextLine();
			String con = "Continue";
			while(badInput) {
				if (conInput.equals(con)) {
					System.out.println("Continue is used to \"skip\" the iteration of a loop.");
					System.out.println("We are going to use the same example we used before.");
					System.out.println("Type an integer in between 1 and 10");
					int conIn = in.nextInt();
					System.out.println("The loop will not display " + conIn + " because the continue statement skipped it.");
					if(conIn <= 10 && conIn >= 1) {
					for (int i =1; i <=10; i++) {
						if(i == conIn) {
							continue;
						}
						System.out.println(i);
					}
					}else {
						System.out.println("Wrong input, type an integer between 1 and 10.");
						conIn = in.nextInt();
					}
					badInput = false;
				}else{
					System.out.println("You must have typed something wrong. Please try again.");
					conInput = in.nextLine();
				}
			}
			
}
	
}
