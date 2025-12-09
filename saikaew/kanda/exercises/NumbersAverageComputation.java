package saikaew.kanda.exercises;

public class NumbersAverageComputation {
    public static double avg(double x, double y) {
        return (x + y) / 2.0;
    }

    public static double avg(int x, int y) {
        return (x + y) / 2.0;
    }

    public static double avg(int x, int y, int z) {
        return (x + y + z) / 3.0;
    }

    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        double i = 2.2, j = 3.3;
        System.out.println("Average of " + a + " and " + b + " = " + avg(a, b));
        System.out.println("Average of " + a + ", " + b + " and " + c + " = " + avg(a, b, c));
        System.out.println("Average of " + i + " and " + j + " = " + avg(i, j));

    }

}
