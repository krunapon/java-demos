import java.util.*;
import java.lang.*;

class Student2 {
    int rollno;
    String name, address;

    // Constructor
    public Student2(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString() {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class SortByRoll implements Comparator<Student2> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student2 a, Student2 b) {
        return a.rollno - b.rollno;
    }
}

class SortByName implements Comparator<Student2> {
    // Used for sorting in ascending order of
    // name
    public int compare(Student2 a, Student2 b) {
        return a.name.compareTo(b.name);
    }
}

class SortByAddress implements Comparator<Student2> {
    public int compare(Student2 a, Student2 b) {
        return a.address.compareTo(b.address);
    }
}
class SortbyNameThenAddress implements Comparator<Student2> {
    public int compare(Student2 a, Student2 b) {
        int nameCompare = new SortByName().compare(a, b);
        int addrCompare = new SortByAddress().compare(a, b);

        // 2-level comparison using if-else block
        if (nameCompare == 0) {
            return ((addrCompare == 0) ? nameCompare : addrCompare);
        } else {
            return nameCompare;
        }
    }
}

// Driver class
class TestSortingStudents {
    public static void main(String[] args) {
        ArrayList<Student2> ar = new ArrayList<Student2>();
        ar.add(new Student2(111, "bbbb", "london"));
        ar.add(new Student2(131, "aaaa", "nyc"));
        ar.add(new Student2(121, "cccc", "jaipur"));
        ar.add(new Student2(141, "aaaa", "ann arbor"));

        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortByRoll());

        System.out.println("\nSorted by rollno");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortByName());

        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortbyNameThenAddress());

        System.out.println("\nSorted by name then address");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}

