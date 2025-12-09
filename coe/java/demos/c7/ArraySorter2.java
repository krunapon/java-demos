package coe.java.demos.c7;
import java.util.Arrays;
public class ArraySorter2 {
	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]+ " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a = {2, 6, 1, 3};
		display(a);
		Arrays.sort(a);
		display(a);
	}
}
