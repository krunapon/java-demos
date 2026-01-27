package saikaew.kanda.exercises.oop.comparators;

public class DmeEnStudent extends Student {
     public DmeEnStudent(String name, String favoriteCourse) {
        this.name = name;
        this.favoriteCourse = favoriteCourse;
    }
    @Override
    public String getFavoriteCourse() {
        return favoriteCourse;
    }
}
