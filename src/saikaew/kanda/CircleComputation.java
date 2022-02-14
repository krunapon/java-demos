package saikaew.kanda;
public class CircleComputation {
	public static void main(String[] args) {
		// double radius = 3;
		if (args.length != 1) {
			System.out.println("CircleComputation <radius>");
			System.exit(0);
		}
		double radius = Double.parseDouble(args[0]);
		double area = Math.PI * Math.pow(radius, 2.0);
		double circumference = 2 * Math.PI * radius;
		System.out.println("Circle with radius " + 
			String.format("%.2f", radius) + 
		 	" has the area as " + 
		 	String.format("%.2f", area) + 
		 	" and the circumference as " + 
		 	String.format("%.2f",circumference));
	}
}