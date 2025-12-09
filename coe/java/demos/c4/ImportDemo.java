package coe.java.demos.c4;
// cover import java.util.Date, java.util.Random
import java.util.*;
import java.util.zip.*;
public class ImportDemo {

	/**
	 * @param args Program arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		// String is the class in package java.lang
		// that is automatically imported in Java class
		String s = "file";
		Random r = new Random();
		try {
			ZipFile zf = new ZipFile(s);
		} catch (Exception ex) {
			
		}
	}

}
