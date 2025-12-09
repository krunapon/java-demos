package coe.java.demos.c5;

public class StringBufferDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// take a long time because
		// you create many objects
		// and the program also need to
		// copy the content of the objects
		String str = "Hello";
		// create another object
		// copy the content in the string
		str = str +  " World";
		System.out.println(str);
		// create only one object
		// take much shorter time
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello");
		buffer.append(" World");
		System.out.println(buffer);
		System.out.println(buffer.toString());

	}

}
