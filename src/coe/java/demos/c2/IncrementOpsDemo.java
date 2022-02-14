package coe.java.demos.c2;//package coe.java.demos.c2;

public class IncrementOpsDemo {
	public static void main(String[] args) {
		int x, a, b, c, d;
		x = 1;
		a = 1 + x++;
		// a = 1 + x = 1 + 1 = 2
		// x = x + 1 = 1 + 1 = 2
		b = 1 + ++x;
		// x = x + 1 = 2 + 1 = 3
		// b = 1 + x = 1 + 3 = 4 
		c = 1 + x--;
		// c = 1 + x = 1 + 3 = 4
		// x = x - 1 = 3 - 1 = 2
		d = 1 + --x;
		// x = x - 1 = 2 - 1 = 1
		// d = 1 + x = 1 + 1 = 2 
		System.out.println(a + " " + b + " " + c + " " + d);
	}
}
