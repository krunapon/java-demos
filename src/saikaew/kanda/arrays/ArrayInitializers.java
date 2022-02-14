public class ArrayInitializers {
    static int[] myPhone = {0, 8, 9, 1, 2, 3, 4, 5, 6, 7};
    public static double findAvg(int[] numbers) {
        int sum = 0;
        double avg = 0;
        int count = numbers.length;
        for (int i = 0; i < count; i++) {
            sum = sum + numbers[i];
        }
        avg = sum / count;
        return avg;
    }
    public static void main(String[] args) {
        for (int i = 0; i < myPhone.length; i++) {
            System.out.print(myPhone[i] + " ");
        }
        double avg = findAvg(myPhone);
        System.out.println("Average is " + avg);
    }
}
