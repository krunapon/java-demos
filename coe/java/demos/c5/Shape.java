package coe.java.demos.c5;

public abstract class Shape {
	private String color;

	public void setColor(String newColor) {
		color = newColor;
	}

	public String getColor() {
		return color;
	}

	public abstract void redraw();

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Triangle();
		shapes[1] = new RoundRectangle();
		shapes[2] = new Oval();
		shapes[3] = new Oval();
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].redraw();
		}
	}
}

/*
 * class Triangle extends Shape { private float height, width; }
 */

class Triangle extends Shape {
	private float height, width;

	public void redraw() {
		System.out.println("I'm a triangle");
	}
}

class Oval extends Shape {
	public void redraw() {
		System.out.println("I'm an oval");
	}
}

class RoundRectangle extends Shape {
	public void redraw() {
		System.out.println("I'm a round rectangle");
	}
}

// Rectangle3 is a subclass of abstract
// class Shape
class Rectangle3 extends Shape {
	// abstract class Shape has
	// abstract method redraw
	// that the subclass of class Shape
	// needs to define
	public void redraw() {

	}
}

class Triangle2 extends Shape {
	private float height, width;

	public void redraw() {

	}
}
