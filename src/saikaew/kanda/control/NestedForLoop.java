public class NestedForLoop {

    /**
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j=1; j <= 3; j++) {
                System.out.print(i+j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j=1; j <= 4; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

    }
}

