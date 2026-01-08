package saikaew.kanda.exercises.oop;

import java.util.*;

public class TestEnKKUStudents {
    public static void main(String[] args) {
        ArrayList<EnKKUStudent> students = new ArrayList<EnKKUStudent>();

        students.add(new COEStudent());
        students.add(new DMEStudent());
        for (EnKKUStudent student : students) {
            student.register();
        }
    }
}
