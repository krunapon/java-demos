package coe.java.demos.c5;
import java.util.Scanner;                                                                           
public class ScannerDemo {  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// create the array to store numbers 
		// that you type
		final int NUM = 3;
		int i = 0;
		double[] nums = new double[NUM];
		// check whether there is a number
		// that a user types
		while (sc.hasNextDouble()) {
			// gets the number that the user types
			nums[i] = sc.nextDouble();
			i++;
		}
		int numDoubles = i;
		for (i = 0; i < numDoubles; i++) {
			System.out.print(nums[i] + " ");
		}
		while (sc.hasNext()) {
			System.out.print(sc.next());
		}
	}
}

