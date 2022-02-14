package coe.java.demos.c3;

import java.util.*;

public class SumPosIntegers {
    public static void main(String[] args) {
        int sum = 0;
        int integer = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer:");
            integer = scanner.nextInt();
            if (integer < 0) 
                continue;
            sum = sum + integer;
        } while (integer != 0);
        scanner.close();
        System.out.println("The final sum is " + sum);
    }
}
