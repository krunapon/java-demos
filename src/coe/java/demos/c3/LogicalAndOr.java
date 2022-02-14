package coe.java.demos.c3;

import java.util.*;

public class LogicalAndOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a football player name:");
        String name = scanner.next();
        if (name.equals("Chanatip")) {
            System.out.println("Playing in J-League");
        } else if (name.equals("Kritsada")) {
            System.out.println("Playing in Thai League");
        } else if (name.equals("Teeratorn")) {
            System.out.println("Playing in J-League");
        } else if (name.equals("Supachoke")) {
            System.out.println("Playing in Thai League");
        }
        scanner.close();
    }
}
