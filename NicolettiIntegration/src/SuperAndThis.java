import java.util.Scanner;

class Arcade {
	int highScore = 100;
}

class Pinball extends Arcade {
	int highScore = 185;
	
	public void superScore() {
		System.out.println(super.highScore);
	}
	
	public void score() {
		System.out.println(highScore);
	}
}


public class SuperAndThis {

	public static void main(Scanner in, boolean badInput) {
		badInput = true;
		System.out.println("Type \"Super\" for an example of .super and .this.");
		String supInput = in.nextLine();
		String sup = "Super";
		while(badInput) {
			if(supInput.equals(sup)) {
				System.out.println("The \".super\" method calls the variable in the parent class.");
				System.out.println("When we call \"Pinball.superScore\" we get the highscore of the Arcade class which is:");
				//Pinball.superScore();
				
				badInput = false;
			}else {
				System.out.println("You must have typed something wrong. Please try again.");
				supInput = in.nextLine();
			}
		}

	}

}
