package coe.java.demos.c2;

public class IncrementOpsDemo {
	public static void main(String[] args) {
		int x, a, b, c, d;
		x = 1;
		a = 1 + x++;
		b = 1 + ++x;
		c = 1 + x--;
		d = 1 + --x;
		System.out.println(a + " " + b + " " + c + " " + d);
	}
}
