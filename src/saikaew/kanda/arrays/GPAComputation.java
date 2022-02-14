public class GPAComputation {
    static double[] grades;
    static int[] units;
    public static void init() {
        grades = new double[] {4, 4, 3.5, 3, 3};
        units = new int[] {3, 3, 3, 3, 3};
    }
    public static double computeAvg(double[] grades, int[] units) {
        int numSubjects = grades.length;
        double sumPoints = 0, totalCredits = 0;
        for (int i = 0; i < numSubjects; i++) {
            sumPoints = sumPoints + grades[i] * units[i];
            totalCredits = totalCredits + units[i];
        }
        return sumPoints / totalCredits;
    }

    public static void main(String[] args) {
        init();
        double gpa = computeAvg(grades, units);
        System.out.println("GPA is " + gpa);
    }
}
