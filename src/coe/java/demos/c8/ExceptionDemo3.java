package coe.java.demos.c8;
import java.util.*;
public class ExceptionDemo3 {
	public static void main(String[] args) {
		int a, b;
		try {
			ExceptionDemo3 ex1 = new ExceptionDemo3();
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			b = in.nextInt();
			ex1.method1(a,b);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
	}
	public void method1(int a, int b) throws ArithmeticException {
		method2(a,b);
	}
	public static void method2(int a, int b) throws ArithmeticException {
			double result = a/b;
			System.out.println(a + "/" + b + " = " + result);
	}
}

