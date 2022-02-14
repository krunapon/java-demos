package coe.java.demos.c8;
public class ExceptionDemo2 {
	public static void main(String[] args) {
		ExceptionDemo2 ex1 = new ExceptionDemo2();
		ex1.method1();
	}
	public void method1()  {
		method2(); // call static method
	}
	public static void method2()  {
			try {
				System.out.println(2/0);
			} catch (ArithmeticException e) {
				System.out.println("You cannot handle a number by zero");
			}
	}

}

