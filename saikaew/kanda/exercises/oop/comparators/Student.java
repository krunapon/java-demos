package saikaew.kanda.exercises.oop.comparators;

abstract public class Student {
    protected String name;
    protected String favoriteCourse;
    abstract public String getFavoriteCourse();
    public String toString() {
        return "[" + name + " => favorite course=" + favoriteCourse + "]";
    }
}