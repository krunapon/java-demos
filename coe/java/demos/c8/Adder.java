package coe.java.demos.c8;
/**
 * Implement Adder that is robust
 * %java Adder 
 * => Please provide two arguments
 * %java Adder a b
 * => Please provide two numbers
 * %java Adder 2 3
 * => 2 + 3 = 5
 * @author kanda
 *
 */
public class Adder {
	public static void main(String[] args) {
		try {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double ans = a + b;
			System.out.println(a + " + " + b + " = " + ans);
		} catch (ArrayIndexOutOfBoundsException ex1) {
			System.err.println("Please provide two arguments");
		} catch (NumberFormatException ex2) {
			System.err.println("Please provide two numbers");
		} finally {
			System.out.println("Thanks for trying our program");
		}
	}
}
