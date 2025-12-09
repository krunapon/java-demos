package coe.java.demos.c5.part1;

public abstract class Shape {
    private String color;
    public void setColor(String newColor) {
     color = newColor;
    }
    public String getColor() {
     return color;
    }
    abstract public void redraw();
}

class Triangle extends Shape {
	private float width, height;
	// method definition - implement method
	public void redraw() {
		System.out.println("Drawing a triangle");
	}
	public void setHeight(float h) {
		height = h;
	}
}

class Test2 {
	public static void main(String[] args) {
		// Cannot create the object in type Shape
		// Because Shape is an abstract class
		// In real world, we cannot draw a shape
		// But we can draw a triangle, a circle, ...
		// Shape s1 = new Shape();
		// Triangle is a subclass of Shape
		Shape s = new Triangle(); 
		((Triangle) s).setHeight(4);
	}
}