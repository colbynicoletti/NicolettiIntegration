import java.util.Scanner;

public class JavaSubstring {


		public static void substr() {
			Scanner in = new Scanner(System.in);
	        System.out.println("Enter a one word string:");
	        String S = in.next();
	        System.out.println("Enter a value that symbolizes the start of your substring:");
	        int start = in.nextInt();
	        System.out.println("Enter a value that symbolizes the end of your substring:");
	        int end = in.nextInt();
	        System.out.println(S.substring(start,end));
	      
		}
}
