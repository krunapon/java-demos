package coe.java.demos.c3;//package coe.java.demos.c3;

public class BreakExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		int item = 0;
		while (item < 5) {
		    System.out.println("Current sum is " 
		    		+ sum);
		    item++;
		    sum += item; // sum = sum + item
		    if (sum >= 6)
		         break; // get out of loop
		}
	}
}
