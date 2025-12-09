package coe.java.demos.c2;
public class CircleComputation {
	public static void main(String[] args) {
		double radius = 4;
		double area = Math.PI*Math.pow(radius,2.0);
		double circumference = 2*Math.PI*radius;
		System.out.println("Circle with radius " + radius + " has the area as " + area + " and the circumference as " + circumference);
	}
}
