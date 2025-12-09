package coe.java.demos.c4;
import java.util.*;
class PackageDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1;
        int high = 100;
        int randInt = random.nextInt(high - low) + low;
        System.out.print("Enter some number:");
        int number = scanner.nextInt();
        System.out.println("You enter " + number);
        System.out.println("A generated random number is " + randInt);
    }
}