package coe.java.demos.c3;

public class SimpleCalculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.err.println("Usage:SimpleCalculator / <n1> <n2 != 0>");
			System.exit(1);
		}
		String op = args[0];
		double d1 = Double.parseDouble(args[1]);
		double d2 = Double.parseDouble(args[2]);
		if (op.equals("/") && d2 == 0) {
			System.err.println("Cannot divide by zero");
			System.exit(1);
		}
		double result = d1/d2;
		System.out.println(d1 + "/" + d2 + " = " + result);
	}
}
