import java.util.Scanner;

public class DataTypes {

  public static void main(Scanner in, boolean badInput) {
     
    System.out.println("Type \"Data Types\" to show the built in data types in the Java language.");
    String dataTypeInput = in.nextLine();
    String dataType = "Data Types";
    // System.out.println(dataTypeInput);
    while (badInput) {
      if (dataTypeInput.equals(dataType)) {
        System.out.println(
            "Byte-A number that can only be represented if it is 8 digits long or less, cannot be fractional.");
        System.out.println(
            "Short-A number that can only be represented if it is 16 digits long or less, cannot be fractional.");
        System.out.println(
            "Int-A number that can only be represented if it is 32 digits long or less, cannot be fractional. \nThis data type is the most used for representing numbers in Java.");
        System.out.println(
            "Long-A number that can only be represented if it is 64 digits long or less, cannot be fractional.");
        System.out.println("Char-Represents a single letter.");
        System.out.println(
            "Float-Should be used when trying to store a number in scientific notation. It saves memory.");
        System.out.println(
            "Double-A number that can be used to represent a fraction/decimal. Can be nonfractional as well, it just wastes memory.");
        System.out.println("Boolean-Only two possible values: True and False.");
        badInput = false;
      } else {
        System.out.println("You must have typed something wrong. Please try again.");
        dataTypeInput = in.nextLine();
      }
    }
  }
}
