package coe.java.demos.c4;

import java.util.*;
/**
 * This program SumRecursive accepts a positive integer from what the user types and then
 * computes the sum values from 1 to that integer
 * 
 * @author Manee Jaidee
 * @since Jan 14, 2022
 * @version 1.0
 */
public class SumRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, sumValue = 0;
        do {
            System.out.print("Enter a positive integer:");
            n = scanner.nextInt();
            sumValue = getSum(n);
            System.out.println("The sum recursive of " + n + " is " + sumValue);
        } while (sumValue > 0);
        scanner.close();
    }

    /**
     * This method getSum computes the sum value from 1 to n
     * 
     * @param n is an integer
     * 
     * @return the sum from 1 to n
     */
    public static int getSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + getSum(n-1);
        }
    }
}
