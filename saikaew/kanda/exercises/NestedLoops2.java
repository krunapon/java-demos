/**
 * 2 4 8
 * 6 12 24
 * 10 20 40
 */

package saikaew.kanda.exercises;

public class NestedLoops2 {
    public static void main(String[] args) {
        /*
         * for (int i = 2; i <= 10; i += 4) {
         * int x = i;
         * for (int j = 1; j <= 3; j++) {
         * System.out.print(x + " ");
         * x = x * 2;
         * }
         * System.out.println();
         * }
         */
        for (int i = 2; i <= 10; i += 4) {
            for (int j = 1; j <= 4; j = j * 2) {
                System.out.print(i * j + " ");

            }
            System.out.println();
        }
    }

}
