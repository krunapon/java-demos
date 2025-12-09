package coe.java.demos.c7.collection;
import java.util.*;
public class SetDemo1 {
	public static void main(String[] args) {
		// Cannot do this because Set is an interface
		//Set s = new Set(); 
		// Did not specify the data type of items
		// in the collection s
		// HashSet s = new HashSet();
		HashSet<String> s = new HashSet<String>();
		s.add("Manee");
		s.add("Mana");
		s.add("Manee");
		System.out.println(s);
	}
}
