package coe.java.demos.c5;
import java.util.Random;
public class TestRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Generate random numbers 
		// from 1 to 10
		// for five numbers
		for (int i = 0; i < 5; i++) {
			Random r = new Random();
			// r.nextInt(10) generates 0 to 9
			int n = r.nextInt(10) + 1;
			System.out.print(n + " ");
		}

	}

}
