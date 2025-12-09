package coe.java.demos.c5;
class Circle3 {  // declare class Circle3 as default
	private double radius;
	Circle3(double r) { // a constructor
		radius = r;
	}
	Circle3() { // a constructor
		radius = 1.0;
	}
	Circle3(double r1, double r2) { // a constructor
		radius = (r1 + r2)/2;
	}
	public double getRadius() {
		return radius;
	}
	public double findArea() {
		return Math.pow(radius, 2)*Math.PI;
	}
}
public class TestCircleWithConstructors {
	// declare class as public
	public static void main(String[] args) {
		Circle3 c1 = new Circle3(5.0);
		System.out.println("The area of the circle" +
				c1.getRadius() + " is " + c1.findArea());
		Circle3 c2 = new Circle3();
		System.out.println("The area of the circle" +
				c2.getRadius() + " is " +
				c2.findArea());
		Circle3 c3 = new Circle3(2, 4); // want radius = (2+4)/2 = 3
		System.out.println(c3.getRadius());
	}

}
