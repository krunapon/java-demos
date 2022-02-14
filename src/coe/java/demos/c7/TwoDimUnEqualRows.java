package coe.java.demos.c7;

public class TwoDimUnEqualRows {
	public static void main(String args[]) {
		int x[][] = new int[3][];
		x[0] = new int[4]; // the first row has 4 columns
		x[1] = new int[2]; // the second row has 2 columns
		x[2] = new int[3]; // the third row has 3 columsn
		
		// x.length is the number of rows
		for(int i=0; i<x.length; i++) {
			//x[i].length is the number of columns
			// in the current row
			for(int j=0; j<x[i].length; j++) {
				x[i][j] = (i+j)*2;
		    }
		}
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j] + " ");
		    }
			System.out.println();
		}
	}
}


