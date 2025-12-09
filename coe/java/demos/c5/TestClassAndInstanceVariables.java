package coe.java.demos.c5;

class Circle4 {
	private double radius;
	private static int numCircles = 0;

	// constructor
	public Circle4() {
		radius = 1.0;
		numCircles++;
	}

	// construct a circle with a specified radius
	public Circle4(double r) {
		radius = r;
		numCircles++;
	}

	public static int getNumCircles() {
		return numCircles;
	}

	public double getRadius() {
		return radius;
	}
}

public class TestClassAndInstanceVariables {
	public static void main(String[] args) {
		// this object is created
		// using constructor Circle4()
		Circle4 c1 = new Circle4();
		System.out.println("c1:");
		printCircle(c1);
		// this object is created
		// using constructor Circle4(double r)
		Circle4 c2 = new Circle4(4.0);
		System.out.println("c2:");
		printCircle(c2);
	}

	public static void printCircle(Circle4 c) {
		System.out.println("radius(" + c.getRadius()
				+ ") while number of circles is " +
				Circle4.getNumCircles());
	}

}
