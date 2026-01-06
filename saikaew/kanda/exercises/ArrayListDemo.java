package saikaew.kanda.exercises;
<<<<<<< HEAD

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
=======
import java.util.ArrayList;
public class ArrayListDemo {


    public static void main(String[] args) {


        static int x;

        






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
>>>>>>> 71097b21691e4692348a4c8e74c1318c8f8babab
