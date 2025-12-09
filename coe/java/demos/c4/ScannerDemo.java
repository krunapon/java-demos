import java.util.*;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomValue = random.nextInt();
        String value = input.next();
        input.close();
        System.out.println("You type " + value + " random value is " + randomValue);
    }
}