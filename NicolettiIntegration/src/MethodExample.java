import java.util.Scanner;

/**
 * This class goes over methods, how to call them and what parameters are.
 * @author Colby Nicoletti
 *
 */
public class MethodExample {

  public static void main(Scanner in, boolean badInput) {
    badInput = true;
    System.out.println("Type \"Method\" for an example of a method.");
    String methodInput = in.nextLine();
    String method = "Method";
    while (badInput) {
      if (methodInput.equals(method)) {
        System.out.println("The code below is an example of calling a method:");
        System.out.println("JavaSubstring.substr();");
        System.out.println("Below this line is the start of the method called.");
        JavaSubstring.substr();
        System.out.println("The method call is \"JavaSubstring.substr();\".");
        System.out.println(
            "The method arguements would normally go inside of the parentheses of the method call.");
        System.out.println("For this example, we don't have any arguements.");
        System.out.println("The method header would look like:");
        System.out.println("\"public class JavaSubstring{}\"");
        System.out.println(
            "The method parameters would be on this line in the parentheses but for this example we don't have any specific parameters.");
        System.out.println("\"public static void substr(The parameters go inside here!)\"");
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        methodInput = in.nextLine();
      }
    }
    
  }

}
