public class NumberPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4; j++) {
                int number = (i - 1) * 4 + j;
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
