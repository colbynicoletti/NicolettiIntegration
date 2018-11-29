import java.util.Scanner;



public class SuperAndThis {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Super\" for an example of \"super.\" and \"this.\".");
		String supInput = in.nextLine();
		String sup = "Super";
		while(badInput) {
			if(supInput.equals(sup)) {
				System.out.println("The \"super.\" method calls the variable in the parent class.");
				System.out.println("When we call \"\" we get the highscore of the Arcade class which is:");
				
				
				badInput = false;
			}else{
				System.out.println("You must have typed something wrong. Please try again.");
				supInput = in.nextLine();
			}
		}

	}

}
