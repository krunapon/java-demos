package coe.java.demos.c7;
import java.util.*;
public class ArrayListDemo {
	public static void main(String args[]) {
		//	 create an array list
		List<String> al = new ArrayList<String>();
		System.out.println("Initial size of al: " + al.size());
		//	 add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add(3, "A2"); // add "A2" at index 3
		System.out.println("Size of al after additions: " +
				al.size());
		//	 display the array list
		System.out.println("Contents of al: " + al);
		//	 Remove elements from the array list
		al.remove("E");
		System.out.println("Contents of al:" + al);
		al.remove(2); // remove the element at index 2
		System.out.println("Size of al after deletions: " +
				al.size());
		System.out.println("Contents of al: " + al);
	}
}

