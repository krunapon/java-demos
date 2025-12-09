package coe.java.demos.c7;

public class DimArrays2 {
	public static void main(String[] args) {
		int[][] a = {{1, 0, 12, -1}, {7, -3, 2, 5}, {-5, -2, 2, -9}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
