package coe.java.demos.c5.part1;

class KKUStudent {
    // instance variable
    String name;
    double gpa;
    // class variable or static variable
    final static String UNI_NAME = "Khon Kaen University";
    static int numStudents = 0;

    KKUStudent() {
        numStudents++;
    }

    KKUStudent(String name) {
        this.name = name;
        numStudents++;
    }

    // instance method
    public void setGPA(double newGPA) {
        gpa = newGPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    // static method
    public static String getUniName() {
        return UNI_NAME;
    }

    public String toString() {
        return "Student's name is " + name +
        " and has GPA as " + gpa;
    }
}
