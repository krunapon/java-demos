package coe.java.demos.c5;
class CircleA {
	private double radius;
	// constructor that accepts nothing
	CircleA() {
		radius = 1.0;
	}
	// constructor that accepts a double value
	CircleA(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	double findArea() {
		return Math.PI*radius*radius;
	}
}
public class TestCircle2 {
	public static void main(String[] args) {
		// c1 is an object in Java class CircleA
		CircleA c1 = new CircleA(); // create the object
		c1.setRadius(10);
		// create the object circle with radius 2.0
		CircleA c2 = new CircleA(2.0);
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
	}

}
