package coe.java.demos.c7;

import java.util.*;

public class HashMapDemo3 {
	public static void main(String[] args) {
		Map<String, String> students 
		= new HashMap<String, String>();
		students.put("4520", "panitan");
		students.put("4538", "padipat");
		System.out.println("Student name of id 4530 is " 
				+ students.get("4530"));

	}

}
