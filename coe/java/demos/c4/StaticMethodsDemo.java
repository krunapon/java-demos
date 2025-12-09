package coe.java.demos.c4;

public class StaticMethodsDemo {
	// static method
	static void hello() {
		System.out.println("Hello");
	}
	void bye() {
		System.out.println("Bye");
	}
	public void main(String[] args) {
		hello();
		// static method cannot call
		// non-static method
		bye();
	}
}
