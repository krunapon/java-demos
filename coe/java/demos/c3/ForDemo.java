package coe.java.demos.c3;

public class ForDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float sum = 0;
		// int i, j;
		for (float i = 0.1f; i <= 1.0f; i = i+ 0.1f) {
			System.out.println("i = " + i + " The current sum is " + sum);
			sum += i;
		}
		/*for (i = 0, j = 0; i + j < 10; i++, j++) {
			System.out.println("i = " + i + " j = " + j);
		}*/

	}

}
