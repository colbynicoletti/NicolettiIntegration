import java.util.Scanner;

public class SwitchExample {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Switch\" for an example of a switch statement.");
    String switInput = in.nextLine();
    String swit = "Switch";
    while (badInput) {
      if (switInput.equals(swit)) {
        System.out.println("Type a whole number between 1 and 7.");
        int day = 0;
        try {
        day = in.nextInt();
        }catch(Exception e) {
        	System.out.println("Please enter an integer.");
        	in.nextLine();
        	day = in.nextInt();
        }
        String dayString;
        switch (day) {
          case 1:
            dayString = "Sunday";
            break;
          case 2:
            dayString = "Monday";
            break;
          case 3:
            dayString = "Tuesday";
            break;
          case 4:
            dayString = "Wednesday";
            break;
          case 5:
            dayString = "Thursday";
            break;
          case 6:
            dayString = "Friday";
            break;
          case 7:
            dayString = "Saturday";
            break;
          default:
            dayString = "Invalid day";
            break;
        }
        System.out.println(
            "What number you pick corresponds to what day gets printed. I used a switch statement for this.");
        System.out.println(
            "The number you picked was " + day + " and the day that corrensponds is " + dayString);
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        switInput = in.nextLine();
      }
    }

  }

}
