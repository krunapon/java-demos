package coe.java.demos.c3;

public class NestedForLoop2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j=2; j <= 4; j+= 2) {
					System.out.print((i*j) + " ");
			}
			System.out.println();
		}

	}

}
