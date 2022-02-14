package coe.java.demos.c2;

public class RecComputation {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Please enter width and height");
			System.exit(1);
		}
	
		double width = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		double area = width * height;
		double circum = 2 * width + 2 * height;
		System.out.println("The area with width " + width
				+ " height " + height + " has area " + area
				+ " and circumference " + circum);
	}
}
