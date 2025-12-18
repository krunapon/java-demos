package saikaew.kanda.exercises;

public class ArrayListDemo {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("These fruits has been added to the list:");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        if (list.contains("Banana")) {
            System.out.println("The list contains Banana.");
        } else {
            System.out.println("The list does not contain Banana.");
        }
        if (list.contains("Orange")) {
            System.out.println("The list contains Orange.");
        } else {
            System.out.println("The list does not contain Orange.");
        }
    }
}
