package coe.java.demos.c2;
public class ConditionalOpsDemo {
	public static void main(String[] args) {
		int  n = 3;
		int next = (n % 2 == 0) ? (n / 2) : (3 * n + 1);
		System.out.println("n = " + n + " next = " + next);
		n = 2;
		next = (n % 2 == 0) ? (n / 2) : (3 * n + 1);
		System.out.println("n = " + n + " next = " + next);
	}
}
