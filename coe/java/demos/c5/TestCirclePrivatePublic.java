package coe.java.demos.c5;

class Circle {
	private double radius = 2;
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
}
public class TestCirclePrivatePublic {
	public static void main(String[] args) {
		Circle c1, c2;
		c1 = new Circle();
		c2 = new Circle();
		// TODO Auto-generated method stub
		c1.setRadius(4);
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
	}

}
