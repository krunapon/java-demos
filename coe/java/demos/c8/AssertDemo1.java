package coe.java.demos.c8;

public class AssertDemo1 {
	public static void main(String[] args) {
		int a, b = 0;
		a = 2;
		b = 1;
		assert (b != 0) : "The divider cannot be zero";
		System.out.println(a + "/" + b + " = " + a / b);
	}
}
