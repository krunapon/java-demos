package coe.java.demos.c4.coe.java.demos.c4;
/**
 * This program is to illustrate the use of Java doc
 * @author Kanda Saikaew
 * @version 1.0, 14/1/2022
 *
 */
public class JavadocDemo {

	/**
	 * This method adds two integers
	 * @param m is the first integer  
	 * @param n is the second integer
	 * @return the addition of two given integers
	 */
	public static int add(int m, int n) {
		int result = m +n;
		return result;
	}

	/**
	 * This method subs two integers
	 * @param a is the first integer
	 * @param b is the second integer
	 * @return the subtraction of b from a 
	 */
	public static int sub(int a, int b) {
		return a - b;
	}
	/**
	 * The main method of the program
	 * @param args Program arguments
	 */
	public static void main(String[] args) {
		System.out.println("A very simple program with Javadoc");

	}
}
