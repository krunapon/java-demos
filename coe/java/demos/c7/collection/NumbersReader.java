package coe.java.demos.c7.collection;
import java.util.*;
public class NumbersReader {
	public static void main(String[] args) {
		// create a list to store numbers
		ArrayList<Double> numbers = new ArrayList<Double>();
		// read each number and put it in a list
		Scanner in = new Scanner(System.in);  // cin in C++
		// start to read and end when
		// the user types Ctrl-D
		while (in.hasNext()) {
			try {
			// copy the value that the user types in "num"
			double num = in.nextDouble();
			// put the "num" value into the list
			numbers.add(num);
			} catch (InputMismatchException ex) {
				System.err.println("Please type a number");
				System.exit(1);
			}
		}
		// display the numbers
		System.out.println(numbers);
		// sort the numbers
		// convert the content in the ArrayList to
		// the array of object
		Object[] n = numbers.toArray();
		Arrays.sort(n);
		// display sorted numbers
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		Collections.sort(numbers);
		System.out.print(numbers);
		// Set<String> msg = new HashSet<String>();
		List<Double> nums = new LinkedList<Double>();
		// Collections.sort method accepts the argument 
		// in List but msg is not in type List.
		// msg is in type Set
		// Collections.sort(msg);
		Collections.sort(nums);
	}
}
