package coe.java.demos.c5;

interface Drawable {
	public void draw();
}

interface Fillable {
	public void fill();
}

public class Line implements Drawable, Fillable {
	public void draw() {
		System.out.println("=== drawing a line ====");
	}

	public void fill() {
		System.out.println("=== Filling a line ====");
	}

	public static void main(String[] args) {
		Line l = new Line();
		l.draw();
		l.fill();
	}
}*/
