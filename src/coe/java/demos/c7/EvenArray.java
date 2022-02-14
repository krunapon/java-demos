package coe.java.demos.c7;

public class EvenArray {
    public static void main(String[] args) {
        final int MAX_NUM = 10;
        int[] evenIntegers = new int[MAX_NUM];
        int j  = 0;
        int numArgs = args.length;
        for (int i = 0; i < numArgs; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0) {
                evenIntegers[j] = num;
                j++;
            }
        }
        System.out.println("Only even integers are:");
        for (int i = 0; i < j; i++) {
            System.out.print(evenIntegers[i] + " ");
        }
    }
}
