package coe.java.demos.c7;

import java.util.*;

public class GradesSorter {
    static final int MAX_SEMESTERS = 3;
    static final int MAX_COURSES = 5;
    static float[][] grades = new float[MAX_SEMESTERS][MAX_COURSES];
    public static void main(String[] args) {
        readGrades();
        sortGrades();
        displayGrades();
    }

    public static void readGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter grades:");
        for (int i = 0; i < MAX_SEMESTERS; i++) {
            for (int j = 0; j < MAX_COURSES; j++) {
                grades[i][j] = scanner.nextFloat();
            }
        }
        scanner.close();
    }

    public static void sortGrades() {
        for (int i = 0; i < MAX_SEMESTERS; i++) {
            Arrays.sort(grades[i]);
        }
    }

    public static void displayGrades() {
        System.out.println("Sorted grades for three semesters are:");
        for (int i = 0; i < MAX_SEMESTERS; i++) {
            for (int j = 0; j < MAX_COURSES; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
