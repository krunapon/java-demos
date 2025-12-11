package saikaew.kanda.exercises;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruitsList = new ArrayList<String>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry");
        int numFruits = fruitsList.size();
        System.out.println("These fruits has been added to the list:");
        for (int i = 0; i < numFruits; i++) {
            System.out.print(fruitsList.get(i) + " ");
        }
        for (String fruit: fruitsList) {
            System.out.print(fruit + " ");
        }
        System.out.println(fruitsList);
        System.out.println();
        if (fruitsList.contains("Banana")) {
            System.out.println("The list contains Banana");
        } else {
            System.out.println("The list does not contain Banana");
        }
         if (fruitsList.contains("Orange")) {
            System.out.println("The list contains Orange");
        } else {
            System.out.println("The list does not contain Orange");
        }
    }
}