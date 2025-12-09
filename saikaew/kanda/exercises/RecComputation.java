package saikaew.kanda.exercises;
public class RecComputation {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("java RecComputation <width> <height>");
            System.exit(0);
        } 
        double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double circumference = 2 * (width + height);
        double area = width * height; 
        System.out.println("The circumference of a rectangle with width = " +
        width + " height = " + height + " is " + circumference + " area is " +
        area);
    }
}