package coe.java.demos.c2;

public class RectangleComputation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
			System.err.println("Usage: java RecComputation <width> <height>");
			System.exit(1);
		}
			float width, height, area, circumference;
		
		width = Float.parseFloat(args[0]);
		height = Float.parseFloat(args[1]);
		area = width * height;
		circumference =(width + height) * 2;
		System.out.println("The area and circumference with width " +
				width + " and height " + height + " are " + area + " " +
				circumference);
	}

}
