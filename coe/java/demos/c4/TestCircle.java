package coe.java.demos.c4;

class Circle {
	double radius;
	double findArea() {
		return Math.PI*Math.pow(radius,2);
	}
}
public class TestCircle {
	public static void main(String[] args) {
		// just declare an object c1 which is
		// in class Circle
		Circle c1;
		// create an object c1
		c1 = new Circle();
		c1.radius = 10;
		if (c1 != null) {
			System.out.println(c1);
			System.out.println(c1.radius);
			System.out.println(c1.findArea());
		} else {
			System.out.println("c1 points to no object");
		}
	}

}
