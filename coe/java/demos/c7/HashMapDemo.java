package coe.java.demos.c7;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		// HashMap is a class that implements interface Map
		Map<String,String> directory = 
			new HashMap<String,String>();
		directory.put("Abhisit", "1111");
		directory.put("Apirak", "2222");
		directory.put("Korn", "3333");
		if (directory.containsKey("Abhisit")) {
			System.out.println(directory.get("Abhisit"));
		}
		System.out.println("The map contains the following associations:");
		for ( String key : directory.keySet() ) { // "for each key in the map’s key set"
		    String value = directory.get(key);
		    System.out.println( "   (" + key + "," + value + ")" );
		}
	}
}
