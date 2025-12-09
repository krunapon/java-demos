package coe.java.demos.c5;

public class WrapperClassDemo {
	private static void changeObject(Double d) {
		d = 1.0;
	}
	private static void changePrimitiveValue(double d) {
		d = 2.0;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// double is a primitive type
		// d1 is not an object
		double d1 = 3.14;
		// Double is a Java class 
		// Double is a wrapper class
		// d2 is an object
		Double d2 = 3.14;
		Double d3 = 3.14;
		System.out.println(d1);
		System.out.println("d2 = " + d2);
		changeObject(d2);
		System.out.println("After calling chageObject d2 = " + d2);
		changePrimitiveValue(d1);
		System.out.println(d1);
		System.out.println(d2);
		// equals() compare the value
		// == compare the address
		if (d2 == d3) {
			System.out.println(d2 + " = " + d3);
		} else {
			System.out.println(d2 + " != " + d3);
		} 
		Character c = 'a';
		System.out.println(Character.isDigit(c));
		System.out.println(Integer.MAX_VALUE);
		// convert from float to string
		System.out.println(Float.toString(2.1f));
		// convert from string to float
		System.out.println(Double.parseDouble("4.0") +1); 
	}

}
