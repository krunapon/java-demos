import java.util.*;

public class GradesSorter {
    private static double[][] grades;
    private static final int NUM_COURSES = 5;
    private static final int NUM_SEMESTERS = 2;
    public static void insertionSort(double[] a) {
        int itemsSorted;
        for (itemsSorted = 1; itemsSorted < a.length; itemsSorted++) {
            double tmp = a[itemsSorted];
            int loc = itemsSorted - 1;
            while (loc >= 0 && a[loc] > tmp) {
                a[loc + 1] = a[loc];
                loc = loc - 1;
            }
            a[loc + 1] = tmp;
        }
    }
    public static void main(String[] args) {
        grades = new double[NUM_SEMESTERS][NUM_COURSES];
        Scanner readIn = new Scanner(System.in);
        for (int i = 0; i < NUM_SEMESTERS; i++) {
            for (int j = 0; j < NUM_COURSES; j++) {
                grades[i][j] = readIn.nextDouble();
            }
        }
        System.out.println("Before sorting:");
        for (int i = 0; i < NUM_SEMESTERS; i++) {
            for (int j = 0; j < NUM_COURSES; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
            insertionSort(grades[i]);
        }
        System.out.println("After sorting:");
        for (int i = 0; i < NUM_SEMESTERS; i++) {
            for (int j = 0; j < NUM_COURSES; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
