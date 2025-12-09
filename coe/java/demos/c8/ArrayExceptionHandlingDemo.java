package coe.java.demos.c8;

public class ArrayExceptionHandlingDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Hello " + args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide a name");
			
		}
	}
}
