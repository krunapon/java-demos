package coe.java.demos.c5;

class Person {
	String name;
}

public class ObjectReferencesDemo {
	static void method1(int z) {
		z = 42; // z is at memory address 3333
		System.out.println("z = " + z);
	}

	static void method2(Person p) {
		p.name = "Chanapat"; // p is at memory 4444
		System.out.println("p.name = " + p.name);
	}

	public static void main(String[] args) {
		int x = 17; // x is at memory address 2222
		method1(x);
		System.out.println(x); // x is at memory address 2222
		Person p = new Person(); // p is an object at memory 4444
		p.name = "Ta";
		method2(p);
		System.out.println(p.name);
	}
}
