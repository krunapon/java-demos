package coe.java.demos.c7;
import java.util.*;
public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String, String> idNames =
			new HashMap<String, String>();
		idNames.put("123", "Mana");
		idNames.put("345", "Manee");
		Set<String> ids = idNames.keySet();
		for (String i : ids) {
			System.out.println(i + " has name = " +
					idNames.get(i));
		}
	}
}
