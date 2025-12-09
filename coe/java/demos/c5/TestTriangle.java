package coe.java.demos.c5;

class Triangle {
	double width;
	double height;
	// default constructor 
	Triangle() {
		
	}
	Triangle(double w, double h) {
		width = w;
		height = h;
	}
}
public class TestTriangle {
	public static void main(String[] args) {
		Triangle t; // declare the variable
		// create the object
		t = new Triangle();
		int i = 2;
		t.width = 2;
		double w = 2, h = 3;
		// w and h are initialized as you
		// create the object
		Triangle t2 = new Triangle(w, h);
	}
}
