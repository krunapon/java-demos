package coe.java.demos.c5;
import coe.java.demos.c5.part1.Person;
public class ThaiPerson extends
 coe.java.demos.c5.part1.Person {
	public static void main(String[] args) {
		// declare variable tp is in class ThaiPerson
		Person tp1;
		tp1 = new Person();
		Person tp2 = new Person("Somchai");
		tp1.setName("Somkiat");
		tp1.greeting();
		tp2.greeting();
	}
}
