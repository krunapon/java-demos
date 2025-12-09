package coe.java.demos.c7.collection;
import java.util.*;
public class NumbersSorter {
	public static void main(String[] args) {
		// need to use a collection class 
		// to store numbers 
		ArrayList<Double> numbers = new ArrayList<Double>();
		// create object to read numbers from
		// whatever the user types
		Scanner in = new Scanner(System.in);
		// as long as the user types and does not finish yet
		while (in.hasNext()) {
			// save the number in variable 'd'
			double d = in.nextDouble();
			// add the number into the list
			numbers.add(d);
		}
		System.out.println(numbers);
		// Convert the ArrayList to the array of objects
		Object[] n = numbers.toArray();
		// function sort accepts only object[] o, 
		// int[] i, double[] d
		// It does not accept ArrayList
		Arrays.sort(n); 
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+ " ");
		}
	}
}
