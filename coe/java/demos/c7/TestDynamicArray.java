package coe.java.demos.c7;

public class TestDynamicArray {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("TestDynamicArray <size>");
			System.exit(1);
		}
		DynamicArrayOfInt numbers = new DynamicArrayOfInt();
		int size = Integer.parseInt(args[0]);
		// put 0, 0 => put 0 at index 0
		// put 1, 2 => put 2 at index 1
		// put 2, 4 => put 4 at index 2
		for (int i = 0; i < size; i++) {
			numbers.put(i, i*2);
		}
		System.out.println("Displaying the array");
		for (int i = 0; i < size; i++) {
			System.out.print(numbers.get(i) + " ");
		}
	}
}
