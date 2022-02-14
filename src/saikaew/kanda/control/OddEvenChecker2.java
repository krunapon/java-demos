public class OddEvenChecker2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Java OddEvenChecker2 <integer>");
            System.exit(0);
        }
        int number = Integer.parseInt(args[0]);
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}