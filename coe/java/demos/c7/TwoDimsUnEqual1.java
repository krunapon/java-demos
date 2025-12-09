package coe.java.demos.c7;

public class TwoDimsUnEqual1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3}, {4,5}, {6,7,8,9}, {10}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		// find the sum of each row
		System.out.println("Sum per row");
		int[] sum = new int[4];
		for (int i = 0; i < a.length; i++) {
			sum[i] = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum[i] += a[i][j];
			}
			System.out.print(sum[i] + " ");
		}
		System.out.println();
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
