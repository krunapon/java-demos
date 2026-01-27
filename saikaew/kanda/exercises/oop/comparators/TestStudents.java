package saikaew.kanda.exercises.oop.comparators;
import java.util.*;

class FavoriteCourseComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getFavoriteCourse().compareTo(s2.getFavoriteCourse());
    }
}
public class TestStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new CoeEnStudent("Manee", "Interaction Design"));
        students.add(new DmeEnStudent("Mana", "Advanced Computer Programming"));
        students.add(new CoeEnStudent("Piti", "Linear Circuit Analysis"));
        System.out.println(students);
        Collections.sort(students, new FavoriteCourseComparator());
        System.out.println(students);
    }
}
