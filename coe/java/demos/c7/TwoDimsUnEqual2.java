package coe.java.demos.c7;

public class TwoDimsUnEqual2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{7,8,9,4}, {1,2}};
		int[] sumByRows = new int[a.length];
		int[] sumByCols = new int[4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		// sum for each row
		System.out.println("Sum By Rows");
		for (int i = 0; i < a.length; i++) {
			sumByRows[i] = 0;
			for (int j = 0; j < a[i].length; j++) {
				sumByRows[i] += a[i][j];
			}
			System.out.println(sumByRows[i]);
		}
		// sum for each col
		int maxCols = 0;
		for (int i = 0; i < a.length; i++) {
			if (maxCols < a[i].length)
				maxCols = a[i].length;
		}
		// find the sum of each column
		System.out.println("Sum per column");
		int[] sumCols = new int[maxCols];
		for (int i = 0; i < maxCols; i++) {
			sumCols[i] = 0;
			for (int j = 0; j < a.length; j++) {
				 if (i < a[j].length)
					 sumCols[i] += a[j][i];
			}
			System.out.print(sumCols[i] + " ");
		}
	}

}
