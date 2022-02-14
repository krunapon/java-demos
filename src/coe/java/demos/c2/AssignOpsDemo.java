package coe.java.demos.c2;

public class AssignOpsDemo {
	public static void main(String[] args) {
		int a = 0;
		int b = 1; 
		if ( (a=b) == 0 ) 
			System.out.println("Hello");
		else 
			System.out.println("Bye");
		System.out.println("a = " + a + " b = " + b);
	}
}
