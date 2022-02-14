package coe.java.demos.c7;
import java.util.Arrays;
public class TwoDimDemo2 {
	public static void main(String[] args) {
		int[][] a = new int[2][]; // 2 rows
		a[0] = new int[4]; // first row has 4 numbers
		a[1] = new int[2]; // second row has 2 numbers
		a[0][0] = 2;
		a[0][1] = 1;
		a[0][2] = 5;
		a[0][3] = 7;
		a[1][0] = 8;
		a[1][1] = 9;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		Arrays.sort(a[0]);
		Arrays.sort(a[1]);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
