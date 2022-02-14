package coe.java.demos.c8;

public class MultipleExceptionsHandlingV2 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			System.out.println(4 / i);
		// RuntimeException is the superclass of
		// ArithmeticException and NumberFormatException
	    // RuntimeException is more general than ArithmeticException
		// Need to put the most general exception at the last catch
		} catch (NumberFormatException ex2) {
		    System.err.println("Invalid numeric format");
		} catch (ArithmeticException ex) { 
			// to handle any other RuntimeException besides
			// ArithmeticException and NumberFormatException
			System.err.println("Need to provide a program argument");
		} catch (RuntimeException ex1) {
			System.err.println("Cannot divide by 0");
		}
	}
}
