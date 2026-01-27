package saikaew.kanda.exercises.oop.comparators;

public class CoeEnStudent extends Student {

    public CoeEnStudent(String name, String favoriteCourse) {
        this.name = name;
        this.favoriteCourse = favoriteCourse;
    }
    @Override
    public String getFavoriteCourse() {
        return favoriteCourse;
    }
}
