import java.util.Scanner;

public class JavaSubstring {


		public static void substr() {
			Scanner in = new Scanner(System.in);
	        System.out.println("Enter a one word string:");
	        String S = in.next();
	        int start = 0;
	        int end = 0;
	        System.out.println("Enter a value that symbolizes the start of your substring:");
	        System.out.println("Hint: It should be less than the length of the string.");
	        boolean input = true;
	        while(input){
	        try {
	        start = in.nextInt();
	        }catch(Exception e) {
	        	System.out.println("Wrong input, enter an integer.");
	        }
	        if (start > S.length()) {
	        	System.out.println("Number is too high, enter another integer.");
	        }else if(start <= S.length()){
	        	input = false;	        }
	        }
	        System.out.println("Enter a value that symbolizes the end of your substring:");
	        System.out.println("Hint: It should be less than the length of the string but greater than the last value you put in.");
	        input = true;	        
	        while(input) {
	        	try {
	    	        end = in.nextInt();
	        	}catch(Exception e) {
	        		System.out.println("Wrong input, enter an integer.");
	        	}
	        if (end > S.length()) {
	        	System.out.println("Number is too high, enter another integer.");
	        }else if(end <= S.length()) {
	        	input = false;
	        }
	        }
	        System.out.println(S.substring(start,end));
	        System.out.println("Congratulations! You made a substring!");
		}
}
