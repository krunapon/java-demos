package coe.java.demos.c3;//package coe.java.demos.c3;

public class ForDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, j, k;
		for (i = 0, k = 0, j = 0; i + k < 10; i++, k++) {
			System.out.println("i = " + i + " k = " + k);
			System.out.println("j = " + j);
		}

	}

}
