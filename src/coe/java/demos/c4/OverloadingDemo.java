package coe.java.demos.c4;

public class OverloadingDemo {

	// Find the max between two int values
	static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
	
	static int max(int num1, double num2) {
		if (num1 > num2)
			return num1;
		else
			return (int) num2;
	}

	static int max(int num) {
		return num;
	}
	// Find the max between two double values
	static double max(double num1, double num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	// Find the max among three double values
	static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}

	public static void main(String[] args) {
		int m = 2, n = 3;
		double a = 2.2, b = 3.3, c = 4.4;
		System.out.println("Max of " + m + " " + n + " is " +
				max(m,n));
		System.out.println("Max of " + a + " " + b + " is " +
				max(a,b));
		System.out.println("Max of " + a + " " + b + " " + c + 
				" is " + max(a,b,c));
		
	}

}
