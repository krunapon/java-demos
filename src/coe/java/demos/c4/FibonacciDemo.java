package coe.java.demos.c4;

public class FibonacciDemo {

	static long fib(int n) {
		if ((n == 0) || (n == 1)) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args) {
		int m = 3, n = 5;
		System.out.println("fib(" + m + ") = " + fib(m));
		System.out.println("fib(" + n + ") = " + fib(n));

	}

}
