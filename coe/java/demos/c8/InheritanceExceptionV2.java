package coe.java.demos.c8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InheritanceExceptionV2 {
	
}
class ParentV2 {
	  public void myMethods() throws FileNotFoundException { }
	}

class OverrideExceptionV2 extends ParentV2 {
	// Subclass tries to override its superclass method
	// with throwing exception that is more general or
	// superclass of the exception thrown in the superclass
	// method
	/*  public void myMethods() throws
	       IOException {
	       new FileInputStream("temp.txt");
	  } */
}

