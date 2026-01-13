package saikaew.kanda.exercises.oop.advanced;

public class DmeEnStudent extends Student {
    public DmeEnStudent(String n) {
        name = n;
    }

    public void writePrograms() {
        System.out.println(name + " writes programs in Python and C#");
    }
}
