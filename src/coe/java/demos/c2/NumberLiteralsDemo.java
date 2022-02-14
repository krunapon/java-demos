package coe.java.demos.c2;

public class NumberLiteralsDemo {
	public static void main(String[] args) {
		int i = 34;
		long l = 100000l;
		float f = 100.2f;
		double d = 100.2d;
		int octal = 035; // 3 * 8^1 + 5 * 8^ = (3 * 8) + 5 = 29
		int hex = 0xa2;   // a * 16^1 + 2 * 16^0 = (10* 16) + 2 = 162
		System.out.println(i + " " + l + " " + f);
		System.out.println(d + " " + octal + " " + hex);
	}
}
