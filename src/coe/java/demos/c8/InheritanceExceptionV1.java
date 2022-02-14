package coe.java.demos.c8;
import java.io.*;
public class InheritanceExceptionV1 {
	public static void main(String[] args) {
		try {
			OverrideException o1 = new OverrideException();
			o1.myMethods();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
class Parent {
	   public void myMethods() 
	   	throws FileNotFoundException { }
}
// OverrideException is the subclass of Parent
class OverrideException extends Parent {
	// Overrides method myMethods and throw exception
	// that is the same or more specific (subclass)
	// than the thrown exception in its superclass
	   public void myMethods() throws 
	   				FileNotFoundException {
	        new FileInputStream("temp.txt");
	   }
}


