import java.util.*;

class Person {}

class Student extends Person {}

class Teacher extends Person {}
public class List1 {

    public static void printPerson(Person p) {

    }
    public static void printList(List l) {
        System.out.println(l.toString());
    }
    public static void main(String[] args) {
        List l1 = new ArrayList();
        List l2 = new LinkedList();
        Student s = new Student();
        Person t = new Teacher();
        printList(l1);
        printList(l2);
        printPerson(s);
        printPerson(t);
    }
}