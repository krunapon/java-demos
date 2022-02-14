package coe.java.demos.c8;
import java.util.*;
public class ExceptionDemo4 {
	public static void main(String[] args) {
		int a, b;
		try {
			ExceptionDemo4 ex1 = new ExceptionDemo4();
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			b = in.nextInt();
			ex1.method1(a,b);
		} catch (ArithmeticException ae) {
			System.err.println("Cannot divide by 0");
		} catch (InputMismatchException ime) {
			System.err.println("Please enter integers");
		}
	}
	public void method1(int a, int b) throws ArithmeticException {
		method2(a,b);
	}
	public static void method2(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a/b);
		}
	}
}

