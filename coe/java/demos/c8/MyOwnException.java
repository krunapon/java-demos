package coe.java.demos.c8;

public class MyOwnException extends Exception {
	private static final long serialVersionUID
		= 1945856352339056502L;

	public MyOwnException (String s) {
		super(s);
	}
	public MyOwnException() {
		super();
	} 
}
