package coe.java.demos.c3;

public class ElseDangling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = -1, y = -1;
		if (x > 0) {
			if (y > 0)
				System.out.println("First");
		} else {
			System.out.println("Second");
		}
		System.out.println("Third");
	}

}
