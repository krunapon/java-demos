package coe.java.demos.c7;
import java.util.Arrays;
public class TwoDimArrays {
	public static void display(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] a = new int[3][];
		a[0] = new int[4];
		a[1] = new int[2];
		a[2] = new int[3]; 
		a[0][0] = 1;
		a[0][1] = 8;
		a[0][2] = 7;
		a[0][3] = 6;
		a[1][0] = 5;
		a[1][1] = 3;
		a[2][0] = 3;
		a[2][1] = 2;
		a[2][2] = 6;
		display(a);
		Arrays.sort(a[0]);
		Arrays.sort(a[1]);
		Arrays.sort(a[2]);
		display(a);
		Arrays.fill(a[2], 3);
		System.out.println(Arrays.binarySearch(a[1],5));
		display(a);
	}
}
