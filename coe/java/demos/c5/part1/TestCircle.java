package coe.java.demos.c5.part1;

class Circle {
	// declare attributes
	private double radius; // instance variable
	private static int numOfObjects = 0; // class variable
	// a constructor that accepts no input
	Circle() {
		radius = 1.0;
		numOfObjects++;
	}
	// a constructor that accepts a double value
	Circle(double r) {
		radius = r;
		numOfObjects++;
	}
	// declare and define methods
	public double getRadius() { // getter method
		return radius;
	}
	
	public void setRadius(double newRadius) {// setter method
		radius = newRadius;
	}
	// class method
	public static int getNumOfObjects() { // class method
		return numOfObjects;
	}
	// instance method
	public double findArea() { // computes the circle area
		return (Math.PI*radius*radius);
	}

}

public class TestCircle { 
	public static void main(String[] args) {
		// declare and create object
		Circle c = new Circle();
		// set radius of the circle
		// c.setRadius(2.0);
		System.out.println("Circle radius " + c.getRadius());
		System.out.println("Now, # of objects:" +
				Circle.getNumOfObjects());
		System.out.println(c.findArea());
		// create a circle with radius 3.0
		Circle c2 = new Circle(3.0);
		System.out.println("Circle radius " + c2.getRadius());
		System.out.println("Now, # of objects:" +
				Circle.getNumOfObjects());
	}
}