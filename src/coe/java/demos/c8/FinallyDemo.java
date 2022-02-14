package coe.java.demos.c8;
public class FinallyDemo {
	public static void main(String args[]) {
		try {
			System.out.println("Hello");
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("There is no argument");
		} finally {
			System.out.println("Finish running the program");
		}
	}
}
