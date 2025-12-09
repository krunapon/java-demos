package coe.java.demos.c3;

public class WhileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * int i = 0;
		 * while (i != 0) {
		 * System.out.println(i++);
		 * }
		 */
		int i = 0;
		System.out.print("=== Calling do ... while ===\n");
		do {
			System.out.println(i++);
		} while (i != 0);

	}
}
