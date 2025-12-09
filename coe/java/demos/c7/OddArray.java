package coe.java.demos.c7;
public class OddArray {
    final static int SIZE = 5;
    public static void main(String[] args) {
        int odds[] = new int[SIZE];
        int j = 0;
        int numArgs = args.length;

        if (numArgs == 0) {
            System.out.println("Usage: OddArray <integer 1> <integer 2> ...");
            System.exit(0);
        }

        for (int i = 0; i < numArgs; i++) {
            int readInt = Integer.parseInt(args[i]);
            if (readInt % 2 == 1) {
                odds[j++] = readInt;
            }
        }
        
        if (j == 0) {
            System.out.print("There is no odd integer");
        } else {
            for (int i = 0; i < j; i++) {
                System.out.print(odds[i] + " ");
            }
        }
    }
}