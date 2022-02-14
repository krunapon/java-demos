import java.util.Scanner;

/**
 * This program is to check whether a number entered by a user is odd or even
 * @author Kanda Saikaew
 * @version 1.0
 */
public class OddEvenChecker {
    static Scanner scanner = new Scanner(System.in);

    /**
     * This method is the main method
     * @param args program arguments
     */
    public static void main(String[] args) {
        // scanner is a local variable
        // use if statement to check whether the
        // variable num is odd or even
        System.out.print("Enter a positive number:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
