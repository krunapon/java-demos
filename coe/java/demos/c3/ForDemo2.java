package coe.java.demos.c3;

public class ForDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float sum = 0;
		// Keep adding 0.1 to sum
		for (double i = 0.1; i <= 1.0; i = i + 0.1) {
			System.out.println("The current sum is " + sum);
			System.out.println(" i = " + i);
			sum += i;
		}

	}

}
