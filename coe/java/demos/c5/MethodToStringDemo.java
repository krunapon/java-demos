package coe.java.demos.c5;

// class Rectangle extends Object
class Rectangle {
	protected double width;
	protected double height;

	Rectangle() {

	}

	Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	public double getArea() {
		return width * height;
	}

	public double getCircum() {
		return 2 * width + 2 * height;
	}

	// It does not have toString method
	// It uses the toString method that is
	// inherited from class Object
	public String toString() {
		return "Width = " + width + " Height = " + height;
	}
}

// Square is a subclass of Rectangle
class Square extends Rectangle {
	Square() {
		width = 2;
		height = 2;
	}

	Square(double w) {
		width = w;
		height = w;
	}

	// Class Square implements its own
	// toString method
	public String toString() {
		return "Side = " + width;
	}
}

public class MethodToStringDemo {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle();
		// call the method toString of object r
		// Object r does not have tostring method
		// Object r uses toString method of class Object
		System.out.println(r);
		Square s = new Square(3);
		// call the method toString of object s
		// object s is defined in class Square
		// Calls toString of class Square
		System.out.println(s);
	}
}
