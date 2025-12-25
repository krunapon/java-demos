package saikaew.kanda.exercises;

public class EvenArray {
    static int MAX_EVEN_NUMBERS = 10;
    static int[] evenNumbers = new int[MAX_EVEN_NUMBERS];

    public static void display(int[] arr, int numElements) {
        for (int i = 0; i < numElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int addEvenInts(int[] arr, String[] args) {
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0 && index < MAX_EVEN_NUMBERS) {
                arr[index] = num;
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int numEven = addEvenInts(evenNumbers, args);
        System.out.println("Only even integers are:");
        display(evenNumbers, numEven);
    }
}
