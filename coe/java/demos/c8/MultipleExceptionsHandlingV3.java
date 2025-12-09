package coe.java.demos.c8;

public class MultipleExceptionsHandlingV3 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			System.out.println(4 / i);
		} catch (RuntimeException ex) {
			System.err.println("Need to provide a program argument");
		// Unreachable catch block because ArithmeticException
	    // is already included in RuntimeException 
		// ArithmeticException is a subclass of RuntimeException
	/*	} catch (ArithmeticException ex) {
			System.err.println("Cannot divide by 0");
		} catch (NumberFormatException ex) {
		    System.err.println("Invalid numeric format"); */
		}
	}
}
