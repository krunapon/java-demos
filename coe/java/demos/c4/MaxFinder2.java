package coe.java.demos.c4;

public class MaxFinder2 {
	public static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
	public static void main(String[] args) {
		int i = 5; 
		int j = 2;
		int k = max(i,j);
		
		System.out.print("The maximum between ");
		System.out.print(i);
		System.out.println(i + " " + j + " "  + " is " + k);
	}

}
