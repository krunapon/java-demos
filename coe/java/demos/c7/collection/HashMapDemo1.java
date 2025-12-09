package coe.java.demos.c7.collection;
import java.util.*;
public class HashMapDemo1 {
	public static void main(String[] args) {
		Map<Integer, String> map = 
			new HashMap<Integer,String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		System.out.println(map);
		System.out.println(map.get(2));
		map.remove(3);
		System.out.println(map);
	}
}
