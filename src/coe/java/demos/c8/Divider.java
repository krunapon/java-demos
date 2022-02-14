package coe.java.demos.c8;

public class Divider {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double result = a/b;
			System.out.println(a + " / " + b + " = " +
				result);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Please provide two numbers");
		} catch (NumberFormatException ne) {
			System.out.println("Please provide only number inputs");
		}
  	}

}
