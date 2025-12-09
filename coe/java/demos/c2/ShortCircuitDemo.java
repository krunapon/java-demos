package coe.java.demos.c2;

public class ShortCircuitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 3;
		boolean c = (a > 2) && (++b > 3);
		System.out.println(a + " " + b + " " + c);
		a = 2;
		b = 3;
		boolean d = (a > 2) || (++b > 3);
		System.out.println(a + " " + b + " " + d);
		a = 2;
		b = 3;
		c = (++b > 3) && (a > 2);
		System.out.println(a + " " + b + " " + c);
		a = 2;
		b = 3;
		d = (++b > 3) || (++a > 2);
		System.out.println(a + " " + b + " " + d);
		
	}

}
