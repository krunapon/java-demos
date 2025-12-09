package coe.java.demos.c8;

public class ExceptionDemo1V2 {
	public static void main(String[] args) {
        try {
            System.out.println("Hello " + args[0]);	
        } catch (Exception e) {
            System.out.println("Usage: Hello <name>");
        }
    }
}

