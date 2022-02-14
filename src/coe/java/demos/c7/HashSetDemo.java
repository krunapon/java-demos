package coe.java.demos.c7;
import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Java");
		s.add("PHP");
		s.add("C++");
		System.out.print("The size of this set is " +
				s.size());
		System.out.println(" The contents are " + s);
		System.out.println("Removing PHP ");
		s.remove("PHP");
		s.add("Python");
		System.out.print("The size of this set is " +
				s.size());
		System.out.println(" The contents are " + s);
		// s.add("C#");
		// Want to check whether s contains C#
		if (s.contains("C#")) {
			System.out.println(s + " has C#");
		} else {
			System.out.println(s + " does not have C#");
		}
	}
}
