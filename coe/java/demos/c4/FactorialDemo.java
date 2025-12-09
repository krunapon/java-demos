package coe.java.demos.c4;

public class FactorialDemo {

	/**
	 * factiorial is a recursive method
	 * @param n the number to compute factorial
	 * @return the factorial value of n 
	 */
	public static long factorial(int n) {
		if (n == 0) {// stopping condition
			return 1; 
		} else {
			return n * factorial(n - 1); // call factorial recursively
		}
	}

	public static void main(String[] args) {
		int m = 3, n = 5;
		System.out.println("factorial(" + m + ") = " + factorial(m));
		System.out.println("factorial(" + n + ") = " + factorial(n));
	}
}
