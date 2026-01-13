package saikaew.kanda.exercises.oop.advanced;

public class ComEnStudent extends Student {
    public ComEnStudent(String n) {
        name = n;
    }

    public void writePrograms() {
        System.out.println(name + " writes programs in Python and Java");
    }
}
