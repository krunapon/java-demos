import java.util.Scanner;

/**
 * This program keeps getting a positive integer from a user
 * and determines whether that number is odd or even
 */
public class OddEvenCheckerV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // use if statement to check whether the
        // variable num is odd or even
        do {
            System.out.print("Enter a positive number:");
            int num = scanner.nextInt();
            if (num <= 0)
                break;
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        } while (true);
    }
}

