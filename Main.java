import java.util.Scanner;
/**
 * This program is meant to calculate the factorial of a positive integer that is entered by the user
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user to enter a positive integer
    System.out.println("Please enter an integer to calculate the factorial of");
    int integer = input.nextInt();

    int answer = 1;

    for(int count = 1; count <= integer; count ++){
      answer = answer * count;
    }
    System.out.print(integer + "! " + "= " + answer);
  }
}
