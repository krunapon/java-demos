package coe.java.demos.c3;

public class NestedForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 4; j < 8; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
	}

}
