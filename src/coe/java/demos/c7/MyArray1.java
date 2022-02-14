package coe.java.demos.c7;

public class MyArray1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 5;
		int[] numbers = new int[SIZE];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			System.out.println(numbers[i]);
		}
		System.out.println(numbers);
	}

}
