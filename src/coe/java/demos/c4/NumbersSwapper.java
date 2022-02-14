package coe.java.demos.c4;

public class NumbersSwapper {
	static int m = 2; // memory address 2020
	static int n = 3; // memory address 2024
	static void swap(int m, int n) { // m = 4004, n = 4008
		System.out.println("Inside swap method");
		System.out.println("Before swapping m is " + m + " n is " + n);
		// Swapping m with n
		int temp = m;
		m = n;
		n = temp;
		System.out.println("After swapping m is " +
				m + " n is " + n); // m = 4004, n = 4008
	}

	public static void main(String[] args) {
		System.out.println("Before invoking the swap method: m is " + m + " n is " + n);
		swap(m, n); 
		System.out.println("After invoking the swap method: m is  " + m + " n is " + n); // 2020, 2024

	}
}
