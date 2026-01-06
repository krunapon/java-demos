package saikaew.kanda.exercises;

public class KKUStudent {
    protected String name;
    protected double GPA;
    protected static int numStudents;
    protected static String uniName = "Khon Kaen University";

    public KKUStudent() {
        numStudents++;
    }

    public KKUStudent(String n) {
        name = n;
        numStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double g) {
        GPA = g;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public static String getUniName() {
        return uniName;
    }
}