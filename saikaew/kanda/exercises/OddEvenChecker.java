package saikaew.kanda.exercises;
public class OddEvenChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("java OddEvenChecker <integer>");
            System.exit(0);
        }
        int integer = Integer.parseInt(args[0]);
        if (integer % 2 == 0) {
            System.out.println(integer + " is even");
        } else {
            System.out.println(integer + " is odd");
        }
    }
}