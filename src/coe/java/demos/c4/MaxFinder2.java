package coe.java.demos.c4;//package coe.java.demos.c4;

public class MaxFinder2 {
	public static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
	public static double max(double a, double b) {
		double c = a > b? a : b;
		return c;
	}
	public static void main(String[] args) {
		int i = 5; 
		int j = 2;
		double a = 2.2;
		double b = 3.3;
		int k = max(i,j);
		double c = max(a, b);
		System.out.print("The maximum between ");
		System.out.println(i + " " + j + " "  + " is " + k);
		System.out.print("The maximum between ");
		System.out.println(a + " " + b + " "  + " is " + c);
	}

}
