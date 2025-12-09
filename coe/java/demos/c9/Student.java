import java.io.*;
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    double GPA;
    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}