package miw.mook.mick; 

public class MultiplyDivide {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.err.println("Usage:MultiplyDivide (*|/) <double1> <dobule2>");
			System.exit(1);
		}
		double result = 0;
		String operator = args[0];
		double op1 = Double.parseDouble(args[1]);
		double op2 = Double.parseDouble(args[2]);
		if (operator.equals("*")) {
			result = op1 * op2;
		} else if (operator.equals("/")) {
			if (op2 == 0) {
				System.out.println("The divisor cannot be zero");
				System.exit(0);
			}
			result = op1 / op2;
		} else {
			System.out.println("Unknown operation");
			System.exit(0);
		}
		System.out.println(op1 + " " + operator + " " +  op2 + " = " + result);
	}
}		
