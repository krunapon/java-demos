package coe.java.demos.c2;

//package coe.java.demos.c2;
public class BooleanOpsDemo {
	public static void main(String[] args) {
		int a = 2, b = 3;
		boolean c = (a > 2) && (++b > 3); 
		// False && Whatever = False, so (++b > 3) is not evaluated
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		a = 3;
		b = 3;
		boolean d = (a > 2) || (++b > 3);
		// True || Whatever = True, so (++b > 3) is not evaluated
		System.out.println("a = " + a + " b = " + b + " d = " + d);
	}
}