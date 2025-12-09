package coe.java.demos.c2;
public class BooleanOpsDemo {
	public static void main(String[] args) {
		int a = 2, b = 3;
		boolean c = (a > 2) && (++b > 3);
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		a = 2; b = 3;
		boolean d = (a > 2) || (++b > 3);
		System.out.println("a = " + a + " b = " + b + " d = " + d);
	}
}