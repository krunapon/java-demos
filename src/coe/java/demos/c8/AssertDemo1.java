package coe.java.demos.c8;

public class AssertDemo1 {
	public static void main(String[] args) {
		int a, b = 0;
		a = 2;
		b = 0;
		// we want to make sure that b is not zero
		// if b is zero or if (b!= 0) is false,
		// then there will be the message "The divider cannot be zero"
		assert(b != 0):"The divider cannot be zero";
		System.out.println(a + "/" + b + " = " + a/b);
	}
}
