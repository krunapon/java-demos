public class Exercise1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage:Exercise1 (*|/) <double1> <double>2");
            System.exit(1);
        }
        double result = 0;
        String operator = args[0];
        double operand1 = Double.parseDouble(args[1]);
        double operand2 = Double.parseDouble(args[2]);
        if (operator.equals("*")) {
            result = operand1 * operand2;
        } else if (operator.equals("/")) {
            if (operand2 != 0) {
                result = operand1 / operand2;
            } else {
                System.err.println("Cannot divide by zero");
                System.exit(1);
            }
        } else {
            System.out.println("Unknown operator");
        }
        System.out.println(operand1 + " " + operator + " " + operand2 + " = "
                + result);
    }
}
