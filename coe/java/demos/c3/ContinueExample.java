package coe.java.demos.c3;

public class ContinueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		int item = 0;
		while (item < 5) {
			item++;
			if (item == 2)
				continue;
			sum += item;
		}
		System.out.println("sum is " + sum);
	}

}
