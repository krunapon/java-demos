package coe.java.demos.c5;

public class Bye {  // declare as default
	// private int n; // an instance variable
	static int n;  // a variable that is declared as default
	// a class in the same package can use it
	public static void main(String[] args) {
		System.out.println("Bye");
		n = 2;
	}
}

class Hello {
	public static void main(String[] args) {
		System.out.println("Hello");
		Bye bye = new Bye();
		Bye.n = 2;
	}
}
// Cannot have more than one public class
class GoodMorning { 
	
}