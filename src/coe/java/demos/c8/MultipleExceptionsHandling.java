package coe.java.demos.c8;

public class MultipleExceptionsHandling {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			System.out.println(4/i);
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.err.println("Please provide a number");
		} catch (ArithmeticException e2) {
			System.err.println("Please provide a non-zero number");
		} catch (NumberFormatException e3) {
			System.err.println("Please enter only a numeric input");
		}
	}
}
