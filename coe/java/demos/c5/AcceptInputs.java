package coe.java.demos.c5;
import java.util.Scanner;
public class AcceptInputs {
	private static void acceptNameAge() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = scanner.next();
		System.out.println("");
		System.out.print("Enter your age:");
		int age = scanner.nextInt();
		System.out.println("");
		System.out.println(name + " is " +
				age + " years old.");
	}
	public static void main(String[] args) {
		acceptNameAge();
	}

}
