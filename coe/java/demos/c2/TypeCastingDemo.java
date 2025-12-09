package coe.java.demos.c2;

public class TypeCastingDemo {
	public static void main(String[] args){
		int a = 17;
		double x;
		short b;
		x = a; 
		b = a;
		b = (short) a;
		int c = Integer.parseInt("10");
		System.out.println("x = " + x + " b = " + b + " c = " + c);
		int d = Integer.parseInt("ab");
		System.out.println(d);
	}
}
