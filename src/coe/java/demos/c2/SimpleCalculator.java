package coe.java.demos.c2;

public class SimpleCalculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.err.println("Usage:SimpleCalculator (+|-) <int1> <int2>");
			System.exit(1);
		}

		int result = 0;
		String op = args[0];
		int operand1 = Integer.parseInt(args[1]);
		int operand2 = Integer.parseInt(args[2]);
		if (op.equals("+")) {
			result = operand1 + operand2;
		} else if (op.equals("-")) {
			result = operand1 - operand2;
		} else {
			System.out.println("Unknown operation");
			System.exit(0);
		}
		System.out.println(operand1 + " " + op + " " + operand2 + " = "
				+ result);
	}
}
