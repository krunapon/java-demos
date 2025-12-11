package saikaew.kanda.exercises;

public class SumRecursive {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive integer: ");
            n = scanner.nextInt();
            int result = sum(n);
            System.out.println("The sum recursive of " + n + " is " + result);
        } while (n > 0);
        scanner.close();
    }

    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }
}