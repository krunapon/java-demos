package coe.java.demos.c4;

import java.util.Scanner;

public class SumRecursive {
    public static int sumInt(int n) {
        if (n == 1)
            return 1;
        else
            return n + sumInt(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer:");
        int n = sc.nextInt();
        int sumResult = sumInt(n);
        System.out.println("The sum recursive of " + n + " is " + sumResult);
    }
}
