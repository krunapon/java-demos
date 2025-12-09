package coe.java.demos.c5;

class Circle2 {
	// instance variable
	// not a class variable
	private double radius;
	// define a constructor that accepts no parameter
	Circle2() {
		radius = 1.0; // default value of radius
	}
	// define a constructor that accepts a radius
	Circle2(double r) {
		radius = r;
	}
	
	Circle2(double v1, double v2) {
		radius = (v1 + v2)/2;
	}
	// Find the area of this circle
	public double findArea() {
		return radius * radius * Math.PI;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newR) {
		radius = newR;
	}
}
public class TestCircle {
	public static void main(String[] args) {
		Circle2 c = new Circle2();  // using default constructor
		c.setRadius(3);
		System.out.println(c.getRadius());
		Circle2 c2 = new Circle2(3.0);  // radius = 3.0
		Circle2 c3 = new Circle2(2.0, 4.0);
		System.out.println("The area of the circle " + " of radius "
				+ c.getRadius() + " is " + c.findArea());
		System.out.println(c2.getRadius() + " " +
				c3.getRadius());
	}
}
