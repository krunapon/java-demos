package coe.java.demos.c8;

public class ExceptionDemo1V1 {
	public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println("Hello " + args[0]);	
        } else {
            System.out.println("Usage: Hello <name>");
        }
	}
}
