package coe.java.demos.c7;

import java.util.Vector;
public class VectorDemo {
	public static void main(String args[]) {
		Vector<String> al = new Vector<String>();
		al.add("C");
		al.add("A");
		al.add("E");
		al.addElement("A2");
		System.out.println("Size of al after additions: " +
				al.size());
		//	 display the array list
		System.out.println("Contents of al: " + al);
		//	 Remove elements from the array list
		al.remove("E");
		String s = al.elementAt(2);
		System.out.println("Contents of al: " + al);
		System.out.println("s is " + s);
	}
}
